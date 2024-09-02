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
 * OrgIdUsersBody
 */
@Validated



public class OrgIdUsersBody extends OrganizationUserBase  {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("projects")
  @Valid
  private List<UserProjectInfo> projects = null;

  public OrgIdUsersBody id(Long id) {
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

  public OrgIdUsersBody projects(List<UserProjectInfo> projects) {
    this.projects = projects;
    return this;
  }

  public OrgIdUsersBody addProjectsItem(UserProjectInfo projectsItem) {
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
    OrgIdUsersBody orgIdUsersBody = (OrgIdUsersBody) o;
    return Objects.equals(this.id, orgIdUsersBody.id) &&
        Objects.equals(this.projects, orgIdUsersBody.projects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgIdUsersBody {\n");
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
