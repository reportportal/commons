package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * InstanceUserStats
 */
@Validated



public class InstanceUserStats   {
  @JsonProperty("org_stats")
  private InstanceUserStatsOrgStats orgStats = null;

  @JsonProperty("project_stats")
  private InstanceUserStatsProjectStats projectStats = null;

  public InstanceUserStats orgStats(InstanceUserStatsOrgStats orgStats) {
    this.orgStats = orgStats;
    return this;
  }

  /**
   * Get orgStats
   * @return orgStats
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public InstanceUserStatsOrgStats getOrgStats() {
    return orgStats;
  }

  public void setOrgStats(InstanceUserStatsOrgStats orgStats) {
    this.orgStats = orgStats;
  }

  public InstanceUserStats projectStats(InstanceUserStatsProjectStats projectStats) {
    this.projectStats = projectStats;
    return this;
  }

  /**
   * Get projectStats
   * @return projectStats
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public InstanceUserStatsProjectStats getProjectStats() {
    return projectStats;
  }

  public void setProjectStats(InstanceUserStatsProjectStats projectStats) {
    this.projectStats = projectStats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceUserStats instanceUserStats = (InstanceUserStats) o;
    return Objects.equals(this.orgStats, instanceUserStats.orgStats) &&
        Objects.equals(this.projectStats, instanceUserStats.projectStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgStats, projectStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUserStats {\n");
    
    sb.append("    orgStats: ").append(toIndentedString(orgStats)).append("\n");
    sb.append("    projectStats: ").append(toIndentedString(projectStats)).append("\n");
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
