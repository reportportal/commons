package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * Information about user&#39;s project.
 */

@Schema(name = "UserProjectInfo", description = "Information about user's project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserProjectInfo extends UserProjectRole {

  private Long id;

  public UserProjectInfo() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserProjectInfo(Long id, ProjectRoleEnum projectRole) {
      super(projectRole);
      this.id = id;
  }

  public UserProjectInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Project's internal identifier.
   * minimum: 0
   * @return id
   */
  @Min(0L) 
  @Schema(name = "id", description = "Project's internal identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public UserProjectInfo projectRole(ProjectRoleEnum projectRole) {
    super.projectRole(projectRole);
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
    UserProjectInfo userProjectInfo = (UserProjectInfo) o;
    return Objects.equals(this.id, userProjectInfo.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProjectInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
  
  public static class Builder extends UserProjectRole.Builder {

    private UserProjectInfo instance;

    public Builder() {
      this(new UserProjectInfo());
    }

    protected Builder(UserProjectInfo instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(UserProjectInfo value) { 
      super.copyOf(instance);
      this.instance.setId(value.id);
      return this;
    }

    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Builder projectRole(ProjectRoleEnum projectRole) {
      this.instance.projectRole(projectRole);
      return this;
    }
    
    /**
    * returns a built UserProjectInfo instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserProjectInfo build() {
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

