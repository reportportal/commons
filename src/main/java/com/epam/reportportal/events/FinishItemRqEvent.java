package com.epam.reportportal.events;

import com.epam.ta.reportportal.ws.reporting.FinishTestItemRQ;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class FinishItemRqEvent extends ApplicationEvent {

  private String projectName;
  private String itemUuid;
  private FinishTestItemRQ finishTestItemRQ;

  public FinishItemRqEvent(Object source, String projectName, String itemUuid,
      FinishTestItemRQ finishTestItemRQ) {
    super(source);
    this.projectName = projectName;
    this.itemUuid = itemUuid;
    this.finishTestItemRQ = finishTestItemRQ;
  }
}
