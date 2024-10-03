package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * Aggregated statistics about a project including user, launch, and billing information.
 */

@Schema(name = "ProjectStats", description = "Aggregated statistics about a project including user, launch, and billing information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ProjectStats {

  private ProjectStatsUserStats userStats;

  private ProjectStatsLaunchStats launchStats;

  private ProjectStatsBillingStats billingStats;

  public ProjectStats userStats(ProjectStatsUserStats userStats) {
    this.userStats = userStats;
    return this;
  }

  /**
   * Get userStats
   * @return userStats
  */
  @Valid 
  @Schema(name = "user_stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_stats")
  public ProjectStatsUserStats getUserStats() {
    return userStats;
  }

  public void setUserStats(ProjectStatsUserStats userStats) {
    this.userStats = userStats;
  }

  public ProjectStats launchStats(ProjectStatsLaunchStats launchStats) {
    this.launchStats = launchStats;
    return this;
  }

  /**
   * Get launchStats
   * @return launchStats
  */
  @Valid 
  @Schema(name = "launch_stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("launch_stats")
  public ProjectStatsLaunchStats getLaunchStats() {
    return launchStats;
  }

  public void setLaunchStats(ProjectStatsLaunchStats launchStats) {
    this.launchStats = launchStats;
  }

  public ProjectStats billingStats(ProjectStatsBillingStats billingStats) {
    this.billingStats = billingStats;
    return this;
  }

  /**
   * Get billingStats
   * @return billingStats
  */
  @Valid 
  @Schema(name = "billing_stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_stats")
  public ProjectStatsBillingStats getBillingStats() {
    return billingStats;
  }

  public void setBillingStats(ProjectStatsBillingStats billingStats) {
    this.billingStats = billingStats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStats projectStats = (ProjectStats) o;
    return Objects.equals(this.userStats, projectStats.userStats) &&
        Objects.equals(this.launchStats, projectStats.launchStats) &&
        Objects.equals(this.billingStats, projectStats.billingStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userStats, launchStats, billingStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStats {\n");
    sb.append("    userStats: ").append(toIndentedString(userStats)).append("\n");
    sb.append("    launchStats: ").append(toIndentedString(launchStats)).append("\n");
    sb.append("    billingStats: ").append(toIndentedString(billingStats)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

