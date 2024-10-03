package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Various information about an organization.
 */

@Schema(name = "OrganizationInfo", description = "Various information about an organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationInfo extends OrganizationBase {

  private OrganizationStatsRelationships relationships;

  private Long id;

  /**
   * Type for automatization purposes.  There are three types: - INTERNAL: created by API request. - PERSONAL: created for a user after the user creating. Only Enterprise edition feature. - EXTERNAL: created for external integrations.
   */
  public enum TypeEnum {
    INTERNAL("INTERNAL"),
    
    PERSONAL("PERSONAL"),
    
    EXTERNAL("EXTERNAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String externalId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant updatedAt;

  public OrganizationInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganizationInfo(String name) {
    super(name);
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationInfo(OrganizationStatsRelationships relationships, Long id, TypeEnum type, String externalId, Instant createdAt, Instant updatedAt, String name, String slug) {
      super(name, slug);
      this.relationships = relationships;
      this.id = id;
      this.type = type;
      this.externalId = externalId;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;
  }

  public OrganizationInfo relationships(OrganizationStatsRelationships relationships) {
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

  public OrganizationInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Organization ReportPortal identifier.
   * minimum: 0
   * @return id
   */
  @Min(0L) 
  @Schema(name = "id", description = "Organization ReportPortal identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrganizationInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type for automatization purposes.  There are three types: - INTERNAL: created by API request. - PERSONAL: created for a user after the user creating. Only Enterprise edition feature. - EXTERNAL: created for external integrations.
   * @return type
   */
  
  @Schema(name = "type", description = "Type for automatization purposes.  There are three types: - INTERNAL: created by API request. - PERSONAL: created for a user after the user creating. Only Enterprise edition feature. - EXTERNAL: created for external integrations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OrganizationInfo externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External organization identifier. It is created for integration.
   * @return externalId
   */
  
  @Schema(name = "external_id", description = "External organization identifier. It is created for integration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OrganizationInfo createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", description = "Creation date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public OrganizationInfo updatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last update date.
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", description = "Last update date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }


  public OrganizationInfo name(String name) {
    super.name(name);
    return this;
  }

  public OrganizationInfo slug(String slug) {
    super.slug(slug);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationInfo organizationInfo = (OrganizationInfo) o;
    return Objects.equals(this.relationships, organizationInfo.relationships) &&
        Objects.equals(this.id, organizationInfo.id) &&
        Objects.equals(this.type, organizationInfo.type) &&
        Objects.equals(this.externalId, organizationInfo.externalId) &&
        Objects.equals(this.createdAt, organizationInfo.createdAt) &&
        Objects.equals(this.updatedAt, organizationInfo.updatedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships, id, type, externalId, createdAt, updatedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
  
  public static class Builder extends OrganizationBase.Builder {

    private OrganizationInfo instance;

    public Builder() {
      this(new OrganizationInfo());
    }

    protected Builder(OrganizationInfo instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationInfo value) { 
      super.copyOf(instance);
      this.instance.setRelationships(value.relationships);
      this.instance.setId(value.id);
      this.instance.setType(value.type);
      this.instance.setExternalId(value.externalId);
      this.instance.setCreatedAt(value.createdAt);
      this.instance.setUpdatedAt(value.updatedAt);
      return this;
    }

    public Builder relationships(OrganizationStatsRelationships relationships) {
      this.instance.relationships(relationships);
      return this;
    }
    
    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    public Builder type(TypeEnum type) {
      this.instance.type(type);
      return this;
    }
    
    public Builder externalId(String externalId) {
      this.instance.externalId(externalId);
      return this;
    }
    
    public Builder createdAt(Instant createdAt) {
      this.instance.createdAt(createdAt);
      return this;
    }
    
    public Builder updatedAt(Instant updatedAt) {
      this.instance.updatedAt(updatedAt);
      return this;
    }
    
    @Override
    public Builder name(String name) {
      this.instance.name(name);
      return this;
    }
    
    @Override
    public Builder slug(String slug) {
      this.instance.slug(slug);
      return this;
    }
    
    /**
    * returns a built OrganizationInfo instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationInfo build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
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

