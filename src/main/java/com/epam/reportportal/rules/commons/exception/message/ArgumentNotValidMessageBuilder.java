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

package com.epam.reportportal.rules.commons.exception.message;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;

/**
 * {@link MethodArgumentNotValidException} message builder
 *
 * @author Andrei Varabyeu
 */
@Setter
@Getter
public class ArgumentNotValidMessageBuilder implements
    ExceptionMessageBuilder<MethodArgumentNotValidException> {

  private ReloadableResourceBundleMessageSource messageSource;

  public ArgumentNotValidMessageBuilder() {
  }

  public ArgumentNotValidMessageBuilder(ReloadableResourceBundleMessageSource messageSource) {
    this.messageSource = messageSource;
  }

  @Override
  public String buildMessage(MethodArgumentNotValidException e) {
    StringBuilder sb = new StringBuilder();
    for (ObjectError error : e.getBindingResult().getAllErrors()) {
      sb.append("[").append(messageSource.getMessage(error, LocaleContextHolder.getLocale()))
          .append("] ");
    }
    return sb.toString();
  }


}
