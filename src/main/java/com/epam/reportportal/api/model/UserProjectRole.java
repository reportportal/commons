package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Information about user&#39;s project role.
 */

@Schema(name = "UserProjectRole", description = "Information about user's project role.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserProjectRole {

  /**
   * User role in the project.
   */
  public enum ProjectRoleEnum {
    EDITOR("EDITOR"),
    
    VIEWER("VIEWER");

    private String value;

    ProjectRoleEnum(String value) {
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
    public static ProjectRoleEnum fromValue(String value) {
      for (ProjectRoleEnum b : ProjectRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProjectRoleEnum projectRole = ProjectRoleEnum.VIEWER;

  public UserProjectRole() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserProjectRole(ProjectRoleEnum projectRole) {
      this.projectRole = projectRole;
  }

  public UserProjectRole projectRole(ProjectRoleEnum projectRole) {
    this.projectRole = projectRole;
    return this;
  }

  /**
   * User role in the project.
   * @return projectRole
   */
  
  @Schema(name = "project_role", description = "User role in the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_role")
  public ProjectRoleEnum getProjectRole() {
    return projectRole;
  }

  public void setProjectRole(ProjectRoleEnum projectRole) {
    this.projectRole = projectRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProjectRole userProjectRole = (UserProjectRole) o;
    return Objects.equals(this.projectRole, userProjectRole.projectRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProjectRole {\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
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

    private UserProjectRole instance;

    public Builder() {
      this(new UserProjectRole());
    }

    protected Builder(UserProjectRole instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserProjectRole value) { 
      this.instance.setProjectRole(value.projectRole);
      return this;
    }

    public Builder projectRole(ProjectRoleEnum projectRole) {
      this.instance.projectRole(projectRole);
      return this;
    }
    
    /**
    * returns a built UserProjectRole instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserProjectRole build() {
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

