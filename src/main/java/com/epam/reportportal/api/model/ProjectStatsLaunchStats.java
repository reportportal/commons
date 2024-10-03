package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Statistics about launches associated with the project.
 */

@Schema(name = "ProjectStats_launch_stats", description = "Statistics about launches associated with the project.")
@JsonTypeName("ProjectStats_launch_stats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ProjectStatsLaunchStats {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant lastOccurredAt;

  private Integer totalCount;

  public ProjectStatsLaunchStats() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public ProjectStatsLaunchStats(Instant lastOccurredAt, Integer totalCount) {
      this.lastOccurredAt = lastOccurredAt;
      this.totalCount = totalCount;
  }

  public ProjectStatsLaunchStats lastOccurredAt(Instant lastOccurredAt) {
    this.lastOccurredAt = lastOccurredAt;
    return this;
  }

  /**
   * The date and time of the last launch occurred in the project.
   * @return lastOccurredAt
   */
  @Valid 
  @Schema(name = "last_occurred_at", description = "The date and time of the last launch occurred in the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_occurred_at")
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
   */
  @Min(0) 
  @Schema(name = "total_count", description = "Total number of launches in the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  
  public static class Builder {

    private ProjectStatsLaunchStats instance;

    public Builder() {
      this(new ProjectStatsLaunchStats());
    }

    protected Builder(ProjectStatsLaunchStats instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ProjectStatsLaunchStats value) { 
      this.instance.setLastOccurredAt(value.lastOccurredAt);
      this.instance.setTotalCount(value.totalCount);
      return this;
    }

    public Builder lastOccurredAt(Instant lastOccurredAt) {
      this.instance.lastOccurredAt(lastOccurredAt);
      return this;
    }
    
    public Builder totalCount(Integer totalCount) {
      this.instance.totalCount(totalCount);
      return this;
    }
    
    /**
    * returns a built ProjectStatsLaunchStats instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ProjectStatsLaunchStats build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static Builder builder() {
    return new Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Builder toBuilder() {
    Builder builder = new Builder();
    return builder.copyOf(this);
  }

}

