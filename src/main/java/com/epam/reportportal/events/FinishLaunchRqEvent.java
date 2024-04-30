/*
 * Copyright 2024 EPAM Systems
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
package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.FinishExecutionRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
@Getter
public class FinishLaunchRqEvent extends ApplicationEvent {

  private final String projectName;
  private final String launchUuid;
  private final FinishExecutionRQ finishExecutionRQ;

  public FinishLaunchRqEvent(Object source, String projectName, String launchUuid,
      FinishExecutionRQ finishExecutionRQ) {
    super(source);
    this.projectName = projectName;
    this.launchUuid = launchUuid;
    this.finishExecutionRQ = finishExecutionRQ;
  }
}
