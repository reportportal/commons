package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.StartTestItemRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StartRootItemRqEvent extends ApplicationEvent {

  private String projectName;
  private StartTestItemRQ startTestItemRQ;

  public StartRootItemRqEvent(Object source, String projectName,
      StartTestItemRQ startTestItemRQ) {
    super(source);
    this.projectName = projectName;
    this.startTestItemRQ = startTestItemRQ;
  }
}
