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

package com.epam.reportportal.rules.commons.exception.rest;

/**
 * Error response builder
 *
 * @author Andrei Varabyeu
 *
 */
public class ErrorResponseBuilder {

	private RestErrorDefinition definition;

	private ErrorType error;
	private String message;
	private String stackTrace;

	public ErrorResponseBuilder(RestErrorDefinition definition) {
		this.error = definition.getError();
		this.definition = definition;
	}

	public ErrorResponseBuilder setMessage(Exception ex) {
		this.message = definition.getExceptionMessage(ex);
		return this;
	}

	public ErrorResponseBuilder setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
		return this;
	}

	public ErrorRS build() {
		ErrorRS errorRS = new ErrorRS();
		errorRS.setMessage(message);
		errorRS.setStackTrace(stackTrace);
		errorRS.setErrorType(error);
		return errorRS;
	}

}