package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * User&#39;s organization details.
 */

@Schema(name = "InstanceUserOrgDetails", description = "User's organization details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InstanceUserOrgDetails extends UserOrgInfo {

  private String name;

  private String slug;

  public InstanceUserOrgDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstanceUserOrgDetails(String name) {
    super();
    this.name = name;
  }

  /**
   * Constructor with all args parameters
   */
  public InstanceUserOrgDetails(String name, String slug, Long id, OrgRoleEnum orgRole) {
      super(id, orgRole);
      this.name = name;
      this.slug = slug;
  }

  public InstanceUserOrgDetails name(String name) {
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

  public InstanceUserOrgDetails slug(String slug) {
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


  public InstanceUserOrgDetails id(Long id) {
    super.id(id);
    return this;
  }

  public InstanceUserOrgDetails orgRole(OrgRoleEnum orgRole) {
    super.orgRole(orgRole);
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
    InstanceUserOrgDetails instanceUserOrgDetails = (InstanceUserOrgDetails) o;
    return Objects.equals(this.name, instanceUserOrgDetails.name) &&
        Objects.equals(this.slug, instanceUserOrgDetails.slug) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUserOrgDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
  public static class Builder extends UserOrgInfo.Builder {

    private InstanceUserOrgDetails instance;

    public Builder() {
      this(new InstanceUserOrgDetails());
    }

    protected Builder(InstanceUserOrgDetails instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(InstanceUserOrgDetails value) { 
      super.copyOf(instance);
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
    
    @Override
    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Builder orgRole(OrgRoleEnum orgRole) {
      this.instance.orgRole(orgRole);
      return this;
    }
    
    /**
    * returns a built InstanceUserOrgDetails instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public InstanceUserOrgDetails build() {
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

