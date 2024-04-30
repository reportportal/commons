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

import com.epam.ta.reportportal.ws.reporting.SaveLogRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
@Getter
public class SaveLogRqEvent extends ApplicationEvent {

  private final String projectName;
  private final SaveLogRQ saveLogRQ;
  private final MultipartFile file;

  public SaveLogRqEvent(Object source, String projectName,
      SaveLogRQ saveLogRQ, MultipartFile file) {
    super(source);
    this.projectName = projectName;
    this.saveLogRQ = saveLogRQ;
    this.file = file;
  }
}
