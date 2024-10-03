package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * OrganizationUserAllOfStats
 */

@JsonTypeName("OrganizationUser_allOf_stats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationUserAllOfStats {

  private OrganizationUserAllOfStatsProjectStats projectStats;

  public OrganizationUserAllOfStats() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationUserAllOfStats(OrganizationUserAllOfStatsProjectStats projectStats) {
      this.projectStats = projectStats;
  }

  public OrganizationUserAllOfStats projectStats(OrganizationUserAllOfStatsProjectStats projectStats) {
    this.projectStats = projectStats;
    return this;
  }

  /**
   * Get projectStats
   * @return projectStats
   */
  @Valid 
  @Schema(name = "project_stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_stats")
  public OrganizationUserAllOfStatsProjectStats getProjectStats() {
    return projectStats;
  }

  public void setProjectStats(OrganizationUserAllOfStatsProjectStats projectStats) {
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
    OrganizationUserAllOfStats organizationUserAllOfStats = (OrganizationUserAllOfStats) o;
    return Objects.equals(this.projectStats, organizationUserAllOfStats.projectStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserAllOfStats {\n");
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
  
  public static class Builder {

    private OrganizationUserAllOfStats instance;

    public Builder() {
      this(new OrganizationUserAllOfStats());
    }

    protected Builder(OrganizationUserAllOfStats instance) {
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationUserAllOfStats value) { 
      this.instance.setProjectStats(value.projectStats);
      return this;
    }

    public Builder projectStats(OrganizationUserAllOfStatsProjectStats projectStats) {
      this.instance.projectStats(projectStats);
      return this;
    }
    
    /**
    * returns a built OrganizationUserAllOfStats instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationUserAllOfStats build() {
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

