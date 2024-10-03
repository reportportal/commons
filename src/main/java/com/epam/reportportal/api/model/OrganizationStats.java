package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * General information about the organization.
 */

@Schema(name = "OrganizationStats", description = "General information about the organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationStats {

  private OrganizationStatsRelationships relationships;

  public OrganizationStats() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationStats(OrganizationStatsRelationships relationships) {
      this.relationships = relationships;
  }

  public OrganizationStats relationships(OrganizationStatsRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
   */
  @Valid 
  @Schema(name = "relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relationships")
  public OrganizationStatsRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(OrganizationStatsRelationships relationships) {
    this.relationships = relationships;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationStats organizationStats = (OrganizationStats) o;
    return Objects.equals(this.relationships, organizationStats.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStats {\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

    private OrganizationStats instance;

    public Builder() {
      this(new OrganizationStats());
    }

    protected Builder(OrganizationStats instance) {
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationStats value) { 
      this.instance.setRelationships(value.relationships);
      return this;
    }

    public Builder relationships(OrganizationStatsRelationships relationships) {
      this.instance.relationships(relationships);
      return this;
    }
    
    /**
    * returns a built OrganizationStats instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationStats build() {
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

