package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * Information about user&#39;s project.
 */

@Schema(name = "UserProjectInfo", description = "Information about user's project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class UserProjectInfo {

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

  private Long id;

  public UserProjectInfo projectRole(ProjectRoleEnum projectRole) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProjectInfo userProjectInfo = (UserProjectInfo) o;
    return Objects.equals(this.projectRole, userProjectInfo.projectRole) &&
        Objects.equals(this.id, userProjectInfo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectRole, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProjectInfo {\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
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
}

