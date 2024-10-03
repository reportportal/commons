package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * General information about the organization launches.
 */

@Schema(name = "OrganizationStats_relationships_launches", description = "General information about the organization launches.")
@JsonTypeName("OrganizationStats_relationships_launches")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationStatsRelationshipsLaunches {

  private OrganizationStatsRelationshipsLaunchesMeta meta;

  public OrganizationStatsRelationshipsLaunches() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationStatsRelationshipsLaunches(OrganizationStatsRelationshipsLaunchesMeta meta) {
      this.meta = meta;
  }

  public OrganizationStatsRelationshipsLaunches meta(OrganizationStatsRelationshipsLaunchesMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public OrganizationStatsRelationshipsLaunchesMeta getMeta() {
    return meta;
  }

  public void setMeta(OrganizationStatsRelationshipsLaunchesMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationStatsRelationshipsLaunches organizationStatsRelationshipsLaunches = (OrganizationStatsRelationshipsLaunches) o;
    return Objects.equals(this.meta, organizationStatsRelationshipsLaunches.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsLaunches {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

    private OrganizationStatsRelationshipsLaunches instance;

    public Builder() {
      this(new OrganizationStatsRelationshipsLaunches());
    }

    protected Builder(OrganizationStatsRelationshipsLaunches instance) {
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationStatsRelationshipsLaunches value) { 
      this.instance.setMeta(value.meta);
      return this;
    }

    public Builder meta(OrganizationStatsRelationshipsLaunchesMeta meta) {
      this.instance.meta(meta);
      return this;
    }
    
    /**
    * returns a built OrganizationStatsRelationshipsLaunches instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationStatsRelationshipsLaunches build() {
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

