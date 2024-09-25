package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

/**
 * General information about a project.
 */
@Schema(description = "General information about a project.")
@Validated



public class Project   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("organization_id")
  private Long organizationId = null;

  @JsonProperty("created_at")
  private Instant createdAt = null;

  @JsonProperty("updated_at")
  private Instant updatedAt = null;

  @JsonProperty("stats")
  private ProjectStats stats = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("slug")
  private String slug = null;

  public Project id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Project internal identifier.
   * minimum: 0
   * @return id
   **/
  @Schema(description = "Project internal identifier.")
      @NotNull

  @Min(0L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Project key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Unique identifying part of a project in an instance. Generated from an organization slug and project slug.
   * @return key
   **/
  @Schema(description = "Unique identifying part of a project in an instance. Generated from an organization slug and project slug.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Project organizationId(Long organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Organization ID to which the project belongs.
   * minimum: 0
   * @return organizationId
   **/
  @Schema(description = "Organization ID to which the project belongs.")
      @NotNull

  @Min(0L)  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }

  public Project createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when project was created.
   * @return createdAt
   **/
  @Schema(description = "Timestamp when project was created.")
      @NotNull

    @Valid
    public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Project updatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when project was last updated.
   * @return updatedAt
   **/
  @Schema(description = "Timestamp when project was last updated.")
      @NotNull

    @Valid
    public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Project stats(ProjectStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProjectStats getStats() {
    return stats;
  }

  public void setStats(ProjectStats stats) {
    this.stats = stats;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display project name.
   * @return name
   **/
  @Schema(required = true, description = "Display project name.")
      @NotNull

  @Pattern(regexp="^[A-Za-z0-9._\\- ]+$") @Size(min=3,max=60)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
   **/
  @Schema(description = "")
  
  @Pattern(regexp="^[a-z0-9]+(?:-[a-z0-9]+)*$") @Size(min=3,max=60)   public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.key, project.key) &&
        Objects.equals(this.organizationId, project.organizationId) &&
        Objects.equals(this.createdAt, project.createdAt) &&
        Objects.equals(this.updatedAt, project.updatedAt) &&
        Objects.equals(this.stats, project.stats) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.slug, project.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, organizationId, createdAt, updatedAt, stats, name, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
