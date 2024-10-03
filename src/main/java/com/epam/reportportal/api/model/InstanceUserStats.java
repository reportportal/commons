package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * InstanceUserStats
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InstanceUserStats {

  private InstanceUserStatsOrgStats orgStats;

  public InstanceUserStats() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InstanceUserStats(InstanceUserStatsOrgStats orgStats) {
      this.orgStats = orgStats;
  }

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
  
  public static class Builder {

    private InstanceUserStats instance;

    public Builder() {
      this(new InstanceUserStats());
    }

    protected Builder(InstanceUserStats instance) {
      this.instance = instance;
    }

    protected Builder copyOf(InstanceUserStats value) { 
      this.instance.setOrgStats(value.orgStats);
      return this;
    }

    public Builder orgStats(InstanceUserStatsOrgStats orgStats) {
      this.instance.orgStats(orgStats);
      return this;
    }
    
    /**
    * returns a built InstanceUserStats instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public InstanceUserStats build() {
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

