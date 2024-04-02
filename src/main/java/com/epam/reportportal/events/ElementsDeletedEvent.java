package com.epam.reportportal.events;

import org.springframework.context.ApplicationEvent;

/**
 * @author <a href="mailto:pavel_bortnik@epam.com">Pavel Bortnik</a>
 */
public class ElementsDeletedEvent extends ApplicationEvent {

	private final Long projectId;

	private final long numberOfDeletedElements;

	public ElementsDeletedEvent(Object source, Long projectId, long numberOfDeletedElements) {
		super(source);
		this.projectId = projectId;
		this.numberOfDeletedElements = numberOfDeletedElements;
	}

	public Long getProjectId() {
		return projectId;
	}

	public long getNumberOfDeletedElements() {
		return numberOfDeletedElements;
	}
}
