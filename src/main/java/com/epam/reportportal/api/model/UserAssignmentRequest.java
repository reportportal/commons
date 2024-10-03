package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * UserAssignmentRequest
 */

@JsonTypeName("User_Assignment_Request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class UserAssignmentRequest {

  /**
   * Organization user role.
   */
  public enum OrgRoleEnum {
    MEMBER("MEMBER"),
    
    MANAGER("MANAGER");

    private String value;

    OrgRoleEnum(String value) {
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
    public static OrgRoleEnum fromValue(String value) {
      for (OrgRoleEnum b : OrgRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OrgRoleEnum orgRole = OrgRoleEnum.MEMBER;

  private Long id;

  @Valid
  private List<UserProjectInfo> projects;

  public UserAssignmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAssignmentRequest(Long id) {
    this.id = id;
  }

  public UserAssignmentRequest orgRole(OrgRoleEnum orgRole) {
    this.orgRole = orgRole;
    return this;
  }

  /**
   * Organization user role.
   * @return orgRole
  */
  
  @Schema(name = "org_role", description = "Organization user role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org_role")
  public OrgRoleEnum getOrgRole() {
    return orgRole;
  }

  public void setOrgRole(OrgRoleEnum orgRole) {
    this.orgRole = orgRole;
  }

  public UserAssignmentRequest id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * User's internal identifier.
   * minimum: 0
   * @return id
  */
  @NotNull @Min(0L) 
  @Schema(name = "id", description = "User's internal identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
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
  */
  @Valid 
  @Schema(name = "projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
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
    return Objects.equals(this.orgRole, userAssignmentRequest.orgRole) &&
        Objects.equals(this.id, userAssignmentRequest.id) &&
        Objects.equals(this.projects, userAssignmentRequest.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgRole, id, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssignmentRequest {\n");
    sb.append("    orgRole: ").append(toIndentedString(orgRole)).append("\n");
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

