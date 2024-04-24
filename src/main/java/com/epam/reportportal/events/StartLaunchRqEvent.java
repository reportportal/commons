package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.StartLaunchRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StartLaunchRqEvent extends ApplicationEvent {

  private String projectName;
  private StartLaunchRQ startLaunchRQ;

  public StartLaunchRqEvent(Object source, String projectName, StartLaunchRQ startLaunchRQ) {
    super(source);
    this.projectName = projectName;
    this.startLaunchRQ = startLaunchRQ;
  }
}
