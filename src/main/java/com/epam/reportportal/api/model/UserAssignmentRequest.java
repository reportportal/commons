package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserAssignmentRequest extends UserOrgRole {

  private Long id;

  @Valid
  private List<UserProjectInfo> projects = new ArrayList<>();

  public UserAssignmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserAssignmentRequest(Long id) {
    super();
    this.id = id;
  }

  /**
   * Constructor with all args parameters
   */
  public UserAssignmentRequest(Long id, List<UserProjectInfo> projects, OrgRoleEnum orgRole) {
      super(orgRole);
      this.id = id;
      this.projects = projects;
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


  public UserAssignmentRequest orgRole(OrgRoleEnum orgRole) {
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
  
  public static class Builder extends UserOrgRole.Builder {

    private UserAssignmentRequest instance;

    public Builder() {
      this(new UserAssignmentRequest());
    }

    protected Builder(UserAssignmentRequest instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(UserAssignmentRequest value) { 
      super.copyOf(instance);
      this.instance.setId(value.id);
      this.instance.setProjects(value.projects);
      return this;
    }

    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    public Builder projects(List<UserProjectInfo> projects) {
      this.instance.projects(projects);
      return this;
    }
    
    @Override
    public Builder orgRole(OrgRoleEnum orgRole) {
      this.instance.orgRole(orgRole);
      return this;
    }
    
    /**
    * returns a built UserAssignmentRequest instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserAssignmentRequest build() {
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

