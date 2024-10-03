package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * InstanceUserStats
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class InstanceUserStats {

  private InstanceUserStatsOrgStats orgStats;

  public InstanceUserStats orgStats(InstanceUserStatsOrgStats orgStats) {
    this.orgStats = orgStats;
    return this;
  }

  /**
   * Get orgStats
   * @return orgStats
  */
  @Valid 
  @Schema(name = "org_stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org_stats")
  public InstanceUserStatsOrgStats getOrgStats() {
    return orgStats;
  }

  public void setOrgStats(InstanceUserStatsOrgStats orgStats) {
    this.orgStats = orgStats;
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
    return Objects.equals(this.orgStats, instanceUserStats.orgStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUserStats {\n");
    sb.append("    orgStats: ").append(toIndentedString(orgStats)).append("\n");
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

