package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * InvitationRequestOrganizationsInner
 */

@JsonTypeName("InvitationRequest_organizations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InvitationRequestOrganizationsInner extends UserOrgInfo {

  @Valid
  private List<UserProjectInfo> projects = new ArrayList<>();

  public InvitationRequestOrganizationsInner() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvitationRequestOrganizationsInner(List<UserProjectInfo> projects, Long id, OrgRoleEnum orgRole) {
      super(id, orgRole);
      this.projects = projects;
  }

  public InvitationRequestOrganizationsInner projects(List<UserProjectInfo> projects) {
    this.projects = projects;
    return this;
  }

  public InvitationRequestOrganizationsInner addProjectsItem(UserProjectInfo projectsItem) {
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


  public InvitationRequestOrganizationsInner id(Long id) {
    super.id(id);
    return this;
  }

  public InvitationRequestOrganizationsInner orgRole(OrgRoleEnum orgRole) {
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
    InvitationRequestOrganizationsInner invitationRequestOrganizationsInner = (InvitationRequestOrganizationsInner) o;
    return Objects.equals(this.projects, invitationRequestOrganizationsInner.projects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationRequestOrganizationsInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
  public static class Builder extends UserOrgInfo.Builder {

    private InvitationRequestOrganizationsInner instance;

    public Builder() {
      this(new InvitationRequestOrganizationsInner());
    }

    protected Builder(InvitationRequestOrganizationsInner instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(InvitationRequestOrganizationsInner value) { 
      super.copyOf(instance);
      this.instance.setProjects(value.projects);
      return this;
    }

    public Builder projects(List<UserProjectInfo> projects) {
      this.instance.projects(projects);
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
    * returns a built InvitationRequestOrganizationsInner instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public InvitationRequestOrganizationsInner build() {
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

