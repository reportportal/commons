/*
 * Copyright 2021 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.model.launch.cluster;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterInfoResource {

  @JsonProperty(value = "id")
  private Long id;

  @JsonProperty(value = "index")
  private Long index;

  @JsonProperty(value = "launchId")
  private Long launchId;

  @JsonProperty(value = "message")
  private String message;

  @JsonProperty(value = "metadata")
  private Map<String, Object> metadata;

  @JsonProperty(value = "matchedTests")
  private Long matchedTests;

  public ClusterInfoResource() {
  }

  public ClusterInfoResource(Long id, Long index, Long launchId, String message, Long matchedTests) {
    this.id = id;
    this.index = index;
    this.launchId = launchId;
    this.message = message;
    this.matchedTests = matchedTests;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public Long getLaunchId() {
    return launchId;
  }

  public void setLaunchId(Long launchId) {
    this.launchId = launchId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public Long getMatchedTests() {
    return matchedTests;
  }

  public void setMatchedTests(Long matchedTests) {
    this.matchedTests = matchedTests;
  }
}
