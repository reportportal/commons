package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Statistics about launches associated with the project.
 */
@Schema(description = "Statistics about launches associated with the project.")
@Validated



public class ProjectStatsLaunchStats   {
  @JsonProperty("last_occurred_at")
  private Instant lastOccurredAt = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  public ProjectStatsLaunchStats lastOccurredAt(Instant lastOccurredAt) {
    this.lastOccurredAt = lastOccurredAt;
    return this;
  }

  /**
   * The date and time of the last launch occurred in the project.
   * @return lastOccurredAt
   **/
  @Schema(description = "The date and time of the last launch occurred in the project.")
      @NotNull

    @Valid
    public Instant getLastOccurredAt() {
    return lastOccurredAt;
  }

  public void setLastOccurredAt(Instant lastOccurredAt) {
    this.lastOccurredAt = lastOccurredAt;
  }

  public ProjectStatsLaunchStats totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of launches in the project.
   * minimum: 0
   * @return totalCount
   **/
  @Schema(description = "Total number of launches in the project.")
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
    ProjectStatsLaunchStats projectStatsLaunchStats = (ProjectStatsLaunchStats) o;
    return Objects.equals(this.lastOccurredAt, projectStatsLaunchStats.lastOccurredAt) &&
        Objects.equals(this.totalCount, projectStatsLaunchStats.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastOccurredAt, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatsLaunchStats {\n");
    
    sb.append("    lastOccurredAt: ").append(toIndentedString(lastOccurredAt)).append("\n");
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
