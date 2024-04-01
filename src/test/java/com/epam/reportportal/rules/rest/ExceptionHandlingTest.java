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

import com.epam.reportportal.rules.commons.ExceptionMappings;
import com.epam.reportportal.rules.commons.exception.rest.DefaultErrorResolver;
import com.epam.reportportal.rules.commons.exception.rest.ErrorResolver;
import com.epam.reportportal.rules.commons.exception.rest.RestError;
import com.epam.reportportal.rules.exception.ReportPortalException;
import com.epam.ta.reportportal.ws.reporting.ErrorType;
import com.google.common.base.Strings;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/**
 * Error Resolver Tests
 *
 * @author Andrei Varabyeu
 */
@RunWith(Parameterized.class)
public class ExceptionHandlingTest {

    private static final String EXCEPTION_MESSAGE = "Some exception";

    private ErrorResolver errorResolver = new DefaultErrorResolver(ExceptionMappings.DEFAULT_MAPPING);

    private Exception exception;

    private ErrorType errorType;

    private HttpStatus httpStatus;

    private String errorMessage;

    public ExceptionHandlingTest(Exception exception, ErrorType errorType, HttpStatus httpStatus, String errorMessage) {
        this.exception = exception;
        this.errorType = errorType;
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }

    @Parameterized.Parameters(name = "{index}:{0},{1},{2}")
    public static List<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{{new ReportPortalException(EXCEPTION_MESSAGE), ErrorType.UNCLASSIFIED_REPORT_PORTAL_ERROR,
                HttpStatus.INTERNAL_SERVER_ERROR, EXCEPTION_MESSAGE},
                {new RuntimeException(EXCEPTION_MESSAGE), ErrorType.UNCLASSIFIED_ERROR, HttpStatus.INTERNAL_SERVER_ERROR,
                        EXCEPTION_MESSAGE},
                {new HttpMessageNotReadableException(EXCEPTION_MESSAGE), ErrorType.INCORRECT_REQUEST, HttpStatus.BAD_REQUEST,
                        EXCEPTION_MESSAGE},
                {new MissingServletRequestParameterException("test", "test"), ErrorType.INCORRECT_REQUEST, HttpStatus.BAD_REQUEST,
                        "Incorrect Request. Required request parameter 'test' for method parameter type test is not present"}});
    }

    @Test
    public void testErrorHandlingException()
            throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
        RestError restError = errorResolver.resolveError(exception);
        validate(restError, errorType, httpStatus, errorMessage);
    }

    private void validate(RestError restError, ErrorType errorType, HttpStatus httpStatus, String exceptionMessage) {
        Assert.assertThat(restError.getErrorRS().getMessage(),
                Matchers.containsString(Strings.isNullOrEmpty(exceptionMessage) ? EXCEPTION_MESSAGE : exceptionMessage));
        Assert.assertEquals(errorType, restError.getErrorRS().getErrorType());
        Assert.assertEquals(httpStatus, restError.getHttpStatus());
    }

}