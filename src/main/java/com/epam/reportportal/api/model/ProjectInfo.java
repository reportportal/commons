package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * General information about a project.
 */

@Schema(name = "ProjectInfo", description = "General information about a project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ProjectInfo extends ProjectBase {

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
    super(name);
  }

  /**
   * Constructor with all args parameters
   */
  public ProjectInfo(Long id, String key, Long organizationId, Instant createdAt, Instant updatedAt, ProjectStats stats, String name, String slug) {
      super(name, slug);
      this.id = id;
      this.key = key;
      this.organizationId = organizationId;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;
      this.stats = stats;
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


  public ProjectInfo name(String name) {
    super.name(name);
    return this;
  }

  public ProjectInfo slug(String slug) {
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
    ProjectInfo projectInfo = (ProjectInfo) o;
    return Objects.equals(this.id, projectInfo.id) &&
        Objects.equals(this.key, projectInfo.key) &&
        Objects.equals(this.organizationId, projectInfo.organizationId) &&
        Objects.equals(this.createdAt, projectInfo.createdAt) &&
        Objects.equals(this.updatedAt, projectInfo.updatedAt) &&
        Objects.equals(this.stats, projectInfo.stats) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, organizationId, createdAt, updatedAt, stats, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
  public static class Builder extends ProjectBase.Builder {

    private ProjectInfo instance;

    public Builder() {
      this(new ProjectInfo());
    }

    protected Builder(ProjectInfo instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(ProjectInfo value) { 
      super.copyOf(instance);
      this.instance.setId(value.id);
      this.instance.setKey(value.key);
      this.instance.setOrganizationId(value.organizationId);
      this.instance.setCreatedAt(value.createdAt);
      this.instance.setUpdatedAt(value.updatedAt);
      this.instance.setStats(value.stats);
      return this;
    }

    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    public Builder key(String key) {
      this.instance.key(key);
      return this;
    }
    
    public Builder organizationId(Long organizationId) {
      this.instance.organizationId(organizationId);
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
    
    public Builder stats(ProjectStats stats) {
      this.instance.stats(stats);
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
    * returns a built ProjectInfo instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ProjectInfo build() {
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

