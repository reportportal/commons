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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.epam.reportportal.rules.commons.ExceptionMappings;
import com.epam.reportportal.rules.commons.exception.rest.DefaultErrorResolver;
import com.epam.reportportal.rules.commons.exception.rest.ErrorResolver;
import com.epam.reportportal.rules.commons.exception.rest.RestError;
import com.epam.reportportal.rules.exception.ErrorType;
import com.epam.reportportal.rules.exception.ReportPortalException;
import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;


/**
 * Error Resolver Tests
 *
 * @author Andrei Varabyeu
 */
public class ExceptionHandlingTest {

  private static final String EXCEPTION_MESSAGE = "Some exception";

  private final ErrorResolver errorResolver = new DefaultErrorResolver(
      ExceptionMappings.DEFAULT_MAPPING);

  public static List<Object[]> getParameters() {
    return Arrays.asList(new Object[][]{
        {new ReportPortalException(EXCEPTION_MESSAGE), ErrorType.UNCLASSIFIED_REPORT_PORTAL_ERROR,
            HttpStatus.INTERNAL_SERVER_ERROR, EXCEPTION_MESSAGE},
        {new RuntimeException(EXCEPTION_MESSAGE), ErrorType.UNCLASSIFIED_ERROR,
            HttpStatus.INTERNAL_SERVER_ERROR,
            EXCEPTION_MESSAGE},
        {new HttpMessageNotReadableException(EXCEPTION_MESSAGE), ErrorType.INCORRECT_REQUEST,
            HttpStatus.BAD_REQUEST,
            EXCEPTION_MESSAGE},
        {new MissingServletRequestParameterException("test", "test"), ErrorType.INCORRECT_REQUEST,
            HttpStatus.BAD_REQUEST,
            "Incorrect Request. Required request parameter 'test' for method parameter type test is not present"}});
  }

  @ParameterizedTest
  @MethodSource("getParameters")
  public void testErrorHandlingException(Exception exception, ErrorType errorType,
      HttpStatus httpStatus, String errorMessage)
      throws IllegalArgumentException, SecurityException {
    RestError restError = errorResolver.resolveError(exception);
    validate(restError, errorType, httpStatus, errorMessage);
  }

  private void validate(RestError restError, ErrorType errorType, HttpStatus httpStatus,
      String exceptionMessage) {
    assertThat(restError.errorRS().getMessage(),
        Matchers.containsString(
            Strings.isNullOrEmpty(exceptionMessage) ? EXCEPTION_MESSAGE : exceptionMessage));
    assertEquals(errorType, restError.errorRS().getErrorType());
    assertEquals(httpStatus, restError.httpStatus());
  }

}
