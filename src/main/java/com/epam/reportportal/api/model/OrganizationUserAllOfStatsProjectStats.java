package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * Statistics related to the user&#39;s projects.
 */

@Schema(name = "OrganizationUser_allOf_stats_project_stats", description = "Statistics related to the user's projects.")
@JsonTypeName("OrganizationUser_allOf_stats_project_stats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationUserAllOfStatsProjectStats {

  private Integer totalCount;

  public OrganizationUserAllOfStatsProjectStats totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of user's projects in the organization.
   * minimum: 0
   * @return totalCount
  */
  @Min(0) 
  @Schema(name = "total_count", description = "Total number of user's projects in the organization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_count")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUserAllOfStatsProjectStats organizationUserAllOfStatsProjectStats = (OrganizationUserAllOfStatsProjectStats) o;
    return Objects.equals(this.totalCount, organizationUserAllOfStatsProjectStats.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserAllOfStatsProjectStats {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

