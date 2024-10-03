package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 * General information about a project.
 */

@Schema(name = "ProjectInfo", description = "General information about a project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ProjectInfo {

  private String name;

  private String slug;

  private Long id;

  private String key;

  private Long organizationId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant updatedAt;

  private ProjectStats stats;

  public ProjectInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectInfo(String name) {
    this.name = name;
  }

  public ProjectInfo name(String name) {
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

  public ProjectInfo slug(String slug) {
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

  public ProjectInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Project internal identifier.
   * minimum: 0
   * @return id
  */
  @Min(0L) 
  @Schema(name = "id", description = "Project internal identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProjectInfo key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Unique identifying part of a project in an instance. Generated from an organization slug and project slug.
   * @return key
  */
  
  @Schema(name = "key", description = "Unique identifying part of a project in an instance. Generated from an organization slug and project slug.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProjectInfo organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Organization ID to which the project belongs.
   * minimum: 0
   * @return organizationId
  */
  @Min(0L) 
  @Schema(name = "organization_id", description = "Organization ID to which the project belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization_id")
  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public ProjectInfo createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when project was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", description = "Timestamp when project was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectInfo updatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when project was last updated.
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", description = "Timestamp when project was last updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ProjectInfo stats(ProjectStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
  */
  @Valid 
  @Schema(name = "stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stats")
  public ProjectStats getStats() {
    return stats;
  }

  public void setStats(ProjectStats stats) {
    this.stats = stats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInfo projectInfo = (ProjectInfo) o;
    return Objects.equals(this.name, projectInfo.name) &&
        Objects.equals(this.slug, projectInfo.slug) &&
        Objects.equals(this.id, projectInfo.id) &&
        Objects.equals(this.key, projectInfo.key) &&
        Objects.equals(this.organizationId, projectInfo.organizationId) &&
        Objects.equals(this.createdAt, projectInfo.createdAt) &&
        Objects.equals(this.updatedAt, projectInfo.updatedAt) &&
        Objects.equals(this.stats, projectInfo.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, id, key, organizationId, createdAt, updatedAt, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

