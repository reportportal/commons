package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.SaveLogRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.web.multipart.MultipartFile;

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
