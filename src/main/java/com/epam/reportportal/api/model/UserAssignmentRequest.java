package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * UserAssignmentRequest
 */
@Validated



public class UserAssignmentRequest extends OrganizationUserBase  {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("projects")
  @Valid
  private List<UserProjectInfo> projects = null;

  public UserAssignmentRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * User's internal identifier.
   * minimum: 0
   * @return id
   **/
  @Schema(required = true, description = "User's internal identifier.")
      @NotNull

  @Min(0L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserAssignmentRequest projects(List<UserProjectInfo> projects) {
    this.projects = projects;
    return this;
  }

  public UserAssignmentRequest addProjectsItem(UserProjectInfo projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<UserProjectInfo> getProjects() {
    return projects;
  }

  public void setProjects(List<UserProjectInfo> projects) {
    this.projects = projects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAssignmentRequest userAssignmentRequest = (UserAssignmentRequest) o;
    return Objects.equals(this.id, userAssignmentRequest.id) &&
        Objects.equals(this.projects, userAssignmentRequest.projects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssignmentRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
