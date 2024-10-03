package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * ProjectBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ProjectBase {

  private String name;

  private String slug;

  public ProjectBase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectBase(String name) {
    this.name = name;
  }

  /**
   * Constructor with all args parameters
   */
  public ProjectBase(String name, String slug) {
      this.name = name;
      this.slug = slug;
  }

  public ProjectBase name(String name) {
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

  public ProjectBase slug(String slug) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBase projectBase = (ProjectBase) o;
    return Objects.equals(this.name, projectBase.name) &&
        Objects.equals(this.slug, projectBase.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBase {\n");
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
  
  public static class Builder {

    private ProjectBase instance;

    public Builder() {
      this(new ProjectBase());
    }

    protected Builder(ProjectBase instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ProjectBase value) { 
      this.instance.setName(value.name);
      this.instance.setSlug(value.slug);
      return this;
    }

    public Builder name(String name) {
      this.instance.name(name);
      return this;
    }
    
    public Builder slug(String slug) {
      this.instance.slug(slug);
      return this;
    }
    
    /**
    * returns a built ProjectBase instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ProjectBase build() {
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

