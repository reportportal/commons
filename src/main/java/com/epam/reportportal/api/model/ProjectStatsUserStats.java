package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * Statistics about users assigned to the project.
 */

@Schema(name = "ProjectStats_user_stats", description = "Statistics about users assigned to the project.")
@JsonTypeName("ProjectStats_user_stats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ProjectStatsUserStats {

  private Integer totalCount;

  public ProjectStatsUserStats() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public ProjectStatsUserStats(Integer totalCount) {
      this.totalCount = totalCount;
  }

  public ProjectStatsUserStats totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total number of users assigned to the project.
   * minimum: 0
   * @return totalCount
   */
  @Min(0) 
  @Schema(name = "total_count", description = "Total number of users assigned to the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectStatsUserStats projectStatsUserStats = (ProjectStatsUserStats) o;
    return Objects.equals(this.totalCount, projectStatsUserStats.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatsUserStats {\n");
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

    private ProjectStatsUserStats instance;

    public Builder() {
      this(new ProjectStatsUserStats());
    }

    protected Builder(ProjectStatsUserStats instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ProjectStatsUserStats value) { 
      this.instance.setTotalCount(value.totalCount);
      return this;
    }

    public Builder totalCount(Integer totalCount) {
      this.instance.totalCount(totalCount);
      return this;
    }
    
    /**
    * returns a built ProjectStatsUserStats instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ProjectStatsUserStats build() {
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

