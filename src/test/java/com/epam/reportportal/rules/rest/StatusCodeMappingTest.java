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

package com.epam.reportportal.rules.rest;

import com.epam.reportportal.rules.commons.exception.rest.StatusCodeMapping;
import com.epam.ta.reportportal.ws.reporting.ErrorType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Status Code mapping test
 *
 * @author Andrei Varabyeu
 */
public class StatusCodeMappingTest {

  @Test
  public void testMapping() {
    StringBuilder errors = new StringBuilder();
    for (ErrorType errorType : ErrorType.values()) {
      if (StatusCodeMapping.getHttpStatus(errorType).isEmpty()) {
        errors.append("Error type ").append(errorType).append(" is not mapped").append("\n");
      }
    }

    Assert.assertEquals(errors.toString(), 0, errors.length());
  }
}