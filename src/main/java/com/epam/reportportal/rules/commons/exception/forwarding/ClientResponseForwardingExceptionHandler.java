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
package com.epam.reportportal.rules.commons.exception.forwarding;

import com.google.common.io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * {@link HandlerExceptionResolver} Checks of exception contains response of downstream service and
 * copies it to upstream response
 *
 * @author Andrei Varabyeu
 */
public class ClientResponseForwardingExceptionHandler implements HandlerExceptionResolver, Ordered {

  private static final Logger LOGGER = LoggerFactory.getLogger(
      ClientResponseForwardingExceptionHandler.class);

  private int order;

  @Override
  public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) {
    /* just forward upstream */
    if (ResponseForwardingException.class.isAssignableFrom(ex.getClass())) {
      ResponseForwardingException forwardingException = ((ResponseForwardingException) ex);
      try (ByteArrayInputStream dataStream = new ByteArrayInputStream(
          forwardingException.getBody())) {

        //copy status
        response.setStatus(forwardingException.getStatus().value());

        //copy headers
        response.setContentType(forwardingException.getHeaders().getContentType().toString());

        //copy body
        ByteStreams.copy(dataStream, response.getOutputStream());

        // return empty model and view to short circuit the
        // iteration and to let
        // Spring know that we've rendered the view ourselves:
        return new ModelAndView();

      } catch (IOException e) {
        LOGGER.error("Cannot forward exception", e);
        return null;
      }
    }

    return null;
  }

  @Override
  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }
}