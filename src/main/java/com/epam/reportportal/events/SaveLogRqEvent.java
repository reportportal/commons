package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.SaveLogRQ;
import org.springframework.context.ApplicationEvent;
import org.springframework.web.multipart.MultipartFile;

public class SaveLogRqEvent extends ApplicationEvent {

  private SaveLogRQ saveLogRQ;
  private MultipartFile file;

  public SaveLogRqEvent(Object source, SaveLogRQ saveLogRQ,
      MultipartFile file) {
    super(source);
    this.saveLogRQ = saveLogRQ;
    this.file = file;
  }
}
