package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Information about user&#x27;s project.
 */
@Schema(description = "Information about user's project.")
@Validated



public class UserProjectInfo   {
  @JsonProperty("id")
  private Long id = null;

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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProjectRoleEnum fromValue(String text) {
      for (ProjectRoleEnum b : ProjectRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("project_role")
  private ProjectRoleEnum projectRole = ProjectRoleEnum.VIEWER;

  public UserProjectInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Project's internal identifier.
   * minimum: 0
   * @return id
   **/
  @Schema(description = "Project's internal identifier.")
      @NotNull

  @Min(0L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserProjectInfo projectRole(ProjectRoleEnum projectRole) {
    this.projectRole = projectRole;
    return this;
  }

  /**
   * User role in the project.
   * @return projectRole
   **/
  @Schema(description = "User role in the project.")
      @NotNull

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
    UserProjectInfo userProjectInfo = (UserProjectInfo) o;
    return Objects.equals(this.id, userProjectInfo.id) &&
        Objects.equals(this.projectRole, userProjectInfo.projectRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProjectInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
}
