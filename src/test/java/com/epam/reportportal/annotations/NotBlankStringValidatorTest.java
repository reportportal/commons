/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.annotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
public class NotBlankStringValidatorTest {

  private static Validator validator;

  @BeforeAll
  public static void init() {
    validator = Validation.buildDefaultValidatorFactory().getValidator();
  }

  @Test
  public void nullTest() {
    TestClass testClass = new TestClass();

    Set<ConstraintViolation<TestClass>> constraints = validator.validate(testClass);

    assertTrue(constraints.isEmpty());
  }

  @Test
  public void blankTest() {
    TestClass testClass = new TestClass();
    testClass.setValue("   ");

    Set<ConstraintViolation<TestClass>> constraints = validator.validate(testClass);

    assertFalse(constraints.isEmpty());
  }

  @Setter
  @Getter
  private static class TestClass {

    @NotBlankString
    private String value;

  }

}
