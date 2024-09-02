/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.rules.validation;

import static com.epam.reportportal.rules.commons.validation.Suppliers.trimMessage;

import com.epam.reportportal.rules.commons.validation.Suppliers;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Several tests for {@link Suppliers}
 *
 * @author Andrei Varabyeu
 */
public class SuppliersTest {

  @Test
  public void testSimpleSupplier() {
    String demoString = "demo string";
    String suppliedString = Suppliers.stringSupplier(demoString).get();
    Assert.assertEquals("Initial and supplied strings are not equal", demoString, suppliedString);
  }

  @Test
  public void testFormattedSupplier() {
    String demoString = "here is {} parameter";
    String suppliedString = Suppliers.formattedSupplier(demoString, "first").get();
    Assert.assertEquals("Initial and supplied strings are not equal", "here is first parameter",
        suppliedString);
  }

  @Test
  public void checkNoParamsInMessage() {
    String demoString = "here is parameter {}";
    String suppliedString = Suppliers.formattedSupplier(demoString).get();
    Assert.assertThat("Incorrect message builder", suppliedString,
        Matchers.is("here is parameter"));
  }

  @Test
  public void checkParamsInMessage() {
    String demoString = "here is parameter {}";
    String suppliedString = Suppliers.formattedSupplier(demoString, ":hello world").get();
    Assert.assertThat("Incorrect message builder", suppliedString,
        Matchers.is("here is parameter :hello world"));
  }

  @Test
  public void trimMessageTest() {
    String errMessage = "Incorrect truncate";
    String toTrim = "hello world";

    Assert.assertEquals(errMessage, "hello worl", trimMessage(toTrim, 10));
    Assert.assertEquals(errMessage, "hello world", trimMessage(toTrim, 15));
    Assert.assertEquals(errMessage, "hello world", trimMessage(toTrim, 11));
    Assert.assertEquals(errMessage, "hello", trimMessage(toTrim, 5));
  }

  @Test
  public void trimFormattedSupplierMessageTest() {
    String demoString = "here is parameter {}";
    String suppliedString = Suppliers.formattedSupplier(demoString, () -> "param").get();
    Assert.assertThat("Incorrect message builder", suppliedString,
        Matchers.is("here is parameter param"));
  }

}