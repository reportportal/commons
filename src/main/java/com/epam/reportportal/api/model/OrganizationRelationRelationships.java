package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * OrganizationRelationRelationships
 */
@Validated



public class OrganizationRelationRelationships   {
  @JsonProperty("users")
  private OrganizationRelationRelationshipsUsers users = null;

  @JsonProperty("projects")
  private OrganizationRelationRelationshipsProjects projects = null;

  @JsonProperty("launches")
  private OrganizationRelationRelationshipsLaunches launches = null;

  @JsonProperty("billing")
  private OrganizationRelationRelationshipsBilling billing = null;

  public OrganizationRelationRelationships users(OrganizationRelationRelationshipsUsers users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationRelationRelationshipsUsers getUsers() {
    return users;
  }

  public void setUsers(OrganizationRelationRelationshipsUsers users) {
    this.users = users;
  }

  public OrganizationRelationRelationships projects(OrganizationRelationRelationshipsProjects projects) {
    this.projects = projects;
    return this;
  }

  /**
   * Get projects
   * @return projects
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationRelationRelationshipsProjects getProjects() {
    return projects;
  }

  public void setProjects(OrganizationRelationRelationshipsProjects projects) {
    this.projects = projects;
  }

  public OrganizationRelationRelationships launches(OrganizationRelationRelationshipsLaunches launches) {
    this.launches = launches;
    return this;
  }

  /**
   * Get launches
   * @return launches
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationRelationRelationshipsLaunches getLaunches() {
    return launches;
  }

  public void setLaunches(OrganizationRelationRelationshipsLaunches launches) {
    this.launches = launches;
  }

  public OrganizationRelationRelationships billing(OrganizationRelationRelationshipsBilling billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationRelationRelationshipsBilling getBilling() {
    return billing;
  }

  public void setBilling(OrganizationRelationRelationshipsBilling billing) {
    this.billing = billing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationRelationRelationships organizationRelationRelationships = (OrganizationRelationRelationships) o;
    return Objects.equals(this.users, organizationRelationRelationships.users) &&
        Objects.equals(this.projects, organizationRelationRelationships.projects) &&
        Objects.equals(this.launches, organizationRelationRelationships.launches) &&
        Objects.equals(this.billing, organizationRelationRelationships.billing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, projects, launches, billing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRelationRelationships {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    launches: ").append(toIndentedString(launches)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
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
