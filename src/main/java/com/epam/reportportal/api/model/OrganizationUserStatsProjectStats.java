package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Statistics related to the user&#x27;s projects.
 */
@Schema(description = "Statistics related to the user's projects.")
@Validated



public class OrganizationUserStatsProjectStats   {
  @JsonProperty("total_count")
  private Integer totalCount = null;

  public OrganizationUserStatsProjectStats totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of user's projects in the organization.
   * minimum: 0
   * @return totalCount
   **/
  @Schema(description = "Total number of user's projects in the organization.")
      @NotNull

  @Min(0)  public Integer getTotalCount() {
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
    OrganizationUserStatsProjectStats organizationUserStatsProjectStats = (OrganizationUserStatsProjectStats) o;
    return Objects.equals(this.totalCount, organizationUserStatsProjectStats.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserStatsProjectStats {\n");
    
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
