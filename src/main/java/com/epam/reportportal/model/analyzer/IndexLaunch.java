/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.model.analyzer;

import com.epam.reportportal.databind.LocalDateTimeSerializer;
import com.epam.reportportal.model.project.AnalyzerConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Represents launch container in index/analysis request/response.
 *
 * @author Ivan Sharamet
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IndexLaunch {

  @JsonProperty("launchId")
  private Long launchId;

  @JsonProperty("launchName")
  private String launchName;

  @JsonProperty("launchStartTime")
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  private LocalDateTime launchStartTime;

  @JsonProperty("project")
  private Long projectId;

  @JsonProperty("analyzerConfig")
  private AnalyzerConfig analyzerConfig;

  @JsonProperty("testItems")
  private List<IndexTestItem> testItems;

  @JsonProperty("clusters")
  private Map<Long, String> clusters;

  @JsonProperty("launchNumber")
  private Long launchNumber;

  @JsonProperty("previousLaunchId")
  private Long previousLaunchId;

  public IndexLaunch() {
  }

  public Long getLaunchId() {
    return launchId;
  }

  public void setLaunchId(Long launchId) {
    this.launchId = launchId;
  }

  public String getLaunchName() {
    return launchName;
  }

  public void setLaunchName(String launchName) {
    this.launchName = launchName;
  }

  public LocalDateTime getLaunchStartTime() {
    return launchStartTime;
  }

  public void setLaunchStartTime(LocalDateTime launchStartTime) {
    this.launchStartTime = launchStartTime;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public AnalyzerConfig getAnalyzerConfig() {
    return analyzerConfig;
  }

  public void setAnalyzerConfig(AnalyzerConfig analyzerConfig) {
    this.analyzerConfig = analyzerConfig;
  }

  public List<IndexTestItem> getTestItems() {
    return testItems;
  }

  public void setTestItems(List<IndexTestItem> testItems) {
    this.testItems = testItems;
  }

  public Map<Long, String> getClusters() {
    return clusters;
  }

  public void setClusters(Map<Long, String> clusters) {
    this.clusters = clusters;
  }

  public Long getLaunchNumber() {
    return launchNumber;
  }

  public void setLaunchNumber(Long launchNumber) {
    this.launchNumber = launchNumber;
  }

  public Long getPreviousLaunchId() {
    return previousLaunchId;
  }

  public void setPreviousLaunchId(Long previousLaunchId) {
    this.previousLaunchId = previousLaunchId;
  }
}
