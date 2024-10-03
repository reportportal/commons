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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Various information about an organization.
 */

@Schema(name = "OrganizationInfo", description = "Various information about an organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationInfo {

  private String name;

  private String slug;

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
    this.name = name;
  }

  public OrganizationInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name.
   * @return name
  */
  @NotNull @Pattern(regexp = "^[A-Za-z0-9._\\- ]+$") @Size(min = 3, max = 60) 
  @Schema(name = "name", description = "Display name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationInfo slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * A slug is used to identify a resource. It should be unique and contain only lowercase letters, numbers, and hyphens. It should not start or end with a hyphen.
   * @return slug
  */
  @Pattern(regexp = "^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min = 3, max = 60) 
  @Schema(name = "slug", description = "A slug is used to identify a resource. It should be unique and contain only lowercase letters, numbers, and hyphens. It should not start or end with a hyphen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationInfo organizationInfo = (OrganizationInfo) o;
    return Objects.equals(this.name, organizationInfo.name) &&
        Objects.equals(this.slug, organizationInfo.slug) &&
        Objects.equals(this.relationships, organizationInfo.relationships) &&
        Objects.equals(this.id, organizationInfo.id) &&
        Objects.equals(this.type, organizationInfo.type) &&
        Objects.equals(this.externalId, organizationInfo.externalId) &&
        Objects.equals(this.createdAt, organizationInfo.createdAt) &&
        Objects.equals(this.updatedAt, organizationInfo.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, relationships, id, type, externalId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
}

