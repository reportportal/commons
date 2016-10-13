package com.epam.reportportal.commons;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static com.epam.reportportal.commons.Safe.safe;

/**
 * Tests for {@link Safe}
 *
 * @author <a href="mailto:andrei_varabyeu@epam.com">Andrei Varabyeu</a>
 */
public class SafeTest {

	@Test
	public void testHappy() {
		AtomicBoolean result = new AtomicBoolean(false);
		safe(() -> result.set(true));
		Assert.assertTrue("Action is not executed", result.get());
	}

	@Test
	public void testNoCallback() {
		safe(() -> {
			throw new Exception("hello");
		});
		//no errors should be here
	}

	@Test
	public void testWithCallback() {
		AtomicBoolean result = new AtomicBoolean(false);

		safe(() -> {
			throw new Exception("hello");
		}, e -> result.set(true));

		Assert.assertTrue("Callback is not executed", result.get());

	}

	@Test
	public void testWithCallbackAndError() {
		AtomicBoolean result = new AtomicBoolean(false);

		try {
			safe(() -> {
				throw new Exception("hello");
			}, e -> {
				throw new RuntimeException("wraps error", e);
			});
		} catch (RuntimeException e) {
			Assert.assertEquals("Incorrect message", "wraps error", e.getMessage());
			return;
		}
		Assert.fail("Exception hasn't been thrown");

		Assert.assertTrue("Callback is not executed", result.get());

	}

}