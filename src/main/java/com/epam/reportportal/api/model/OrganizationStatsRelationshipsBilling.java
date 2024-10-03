package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * General information about the organization billing. Available only if a Billing plugin is enabled.
 */

@Schema(name = "OrganizationStats_relationships_billing", description = "General information about the organization billing. Available only if a Billing plugin is enabled.")
@JsonTypeName("OrganizationStats_relationships_billing")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationStatsRelationshipsBilling {

  private OrganizationStatsRelationshipsBillingMeta meta;

  public OrganizationStatsRelationshipsBilling() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationStatsRelationshipsBilling(OrganizationStatsRelationshipsBillingMeta meta) {
      this.meta = meta;
  }

  public OrganizationStatsRelationshipsBilling meta(OrganizationStatsRelationshipsBillingMeta meta) {
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
  public OrganizationStatsRelationshipsBillingMeta getMeta() {
    return meta;
  }

  public void setMeta(OrganizationStatsRelationshipsBillingMeta meta) {
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
    OrganizationStatsRelationshipsBilling organizationStatsRelationshipsBilling = (OrganizationStatsRelationshipsBilling) o;
    return Objects.equals(this.meta, organizationStatsRelationshipsBilling.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsBilling {\n");
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

    private OrganizationStatsRelationshipsBilling instance;

    public Builder() {
      this(new OrganizationStatsRelationshipsBilling());
    }

    protected Builder(OrganizationStatsRelationshipsBilling instance) {
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationStatsRelationshipsBilling value) { 
      this.instance.setMeta(value.meta);
      return this;
    }

    public Builder meta(OrganizationStatsRelationshipsBillingMeta meta) {
      this.instance.meta(meta);
      return this;
    }
    
    /**
    * returns a built OrganizationStatsRelationshipsBilling instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationStatsRelationshipsBilling build() {
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

