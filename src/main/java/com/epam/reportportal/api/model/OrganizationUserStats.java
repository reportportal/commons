package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * OrganizationUserStats
 */
@Validated



public class OrganizationUserStats   {
  @JsonProperty("project_stats")
  private OrganizationUserStatsProjectStats projectStats = null;

  public OrganizationUserStats projectStats(OrganizationUserStatsProjectStats projectStats) {
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
    public OrganizationUserStatsProjectStats getProjectStats() {
    return projectStats;
  }

  public void setProjectStats(OrganizationUserStatsProjectStats projectStats) {
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
    OrganizationUserStats organizationUserStats = (OrganizationUserStats) o;
    return Objects.equals(this.projectStats, organizationUserStats.projectStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserStats {\n");
    
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
