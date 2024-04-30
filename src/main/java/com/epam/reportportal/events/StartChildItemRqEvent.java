/*
 * Copyright 2023 EPAM Systems
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
package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.StartTestItemRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
@Getter
public class StartChildItemRqEvent extends ApplicationEvent {

  private String projectName;
  private String parentUuid;
  private StartTestItemRQ startTestItemRQ;

  public StartChildItemRqEvent(Object source, String projectName, String parentUuid,
      StartTestItemRQ startTestItemRQ) {
    super(source);
    this.projectName = projectName;
    this.parentUuid = parentUuid;
    this.startTestItemRQ = startTestItemRQ;
  }
}
