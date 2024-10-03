package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * General information about the organization users.
 */

@Schema(name = "OrganizationStats_relationships_users", description = "General information about the organization users.")
@JsonTypeName("OrganizationStats_relationships_users")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationStatsRelationshipsUsers {

  private OrganizationStatsRelationshipsUsersMeta meta;

  public OrganizationStatsRelationshipsUsers() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationStatsRelationshipsUsers(OrganizationStatsRelationshipsUsersMeta meta) {
      this.meta = meta;
  }

  public OrganizationStatsRelationshipsUsers meta(OrganizationStatsRelationshipsUsersMeta meta) {
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
  public OrganizationStatsRelationshipsUsersMeta getMeta() {
    return meta;
  }

  public void setMeta(OrganizationStatsRelationshipsUsersMeta meta) {
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
    OrganizationStatsRelationshipsUsers organizationStatsRelationshipsUsers = (OrganizationStatsRelationshipsUsers) o;
    return Objects.equals(this.meta, organizationStatsRelationshipsUsers.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsUsers {\n");
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

    private OrganizationStatsRelationshipsUsers instance;

    public Builder() {
      this(new OrganizationStatsRelationshipsUsers());
    }

    protected Builder(OrganizationStatsRelationshipsUsers instance) {
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationStatsRelationshipsUsers value) { 
      this.instance.setMeta(value.meta);
      return this;
    }

    public Builder meta(OrganizationStatsRelationshipsUsersMeta meta) {
      this.instance.meta(meta);
      return this;
    }
    
    /**
    * returns a built OrganizationStatsRelationshipsUsers instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationStatsRelationshipsUsers build() {
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

