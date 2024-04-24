package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.FinishExecutionRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

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
