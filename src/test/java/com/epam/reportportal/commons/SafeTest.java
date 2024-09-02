/*
 * Copyright 2017 EPAM Systems
 *
 *
 * This file is part of EPAM Report Portal.
 * https://github.com/reportportal/commons
 *
 * Report Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Report Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Report Portal.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.epam.reportportal.commons;

import static com.epam.reportportal.commons.Safe.safe;

import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.Assert;
import org.junit.Test;

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