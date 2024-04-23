package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.StartTestItemRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

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
