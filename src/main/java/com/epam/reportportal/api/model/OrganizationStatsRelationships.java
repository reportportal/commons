package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * OrganizationStatsRelationships
 */

@JsonTypeName("OrganizationStats_relationships")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationStatsRelationships {

  private OrganizationStatsRelationshipsUsers users;

  private OrganizationStatsRelationshipsProjects projects;

  private OrganizationStatsRelationshipsLaunches launches;

  private OrganizationStatsRelationshipsBilling billing;

  public OrganizationStatsRelationships users(OrganizationStatsRelationshipsUsers users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @Valid 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public OrganizationStatsRelationshipsUsers getUsers() {
    return users;
  }

  public void setUsers(OrganizationStatsRelationshipsUsers users) {
    this.users = users;
  }

  public OrganizationStatsRelationships projects(OrganizationStatsRelationshipsProjects projects) {
    this.projects = projects;
    return this;
  }

  /**
   * Get projects
   * @return projects
  */
  @Valid 
  @Schema(name = "projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public OrganizationStatsRelationshipsProjects getProjects() {
    return projects;
  }

  public void setProjects(OrganizationStatsRelationshipsProjects projects) {
    this.projects = projects;
  }

  public OrganizationStatsRelationships launches(OrganizationStatsRelationshipsLaunches launches) {
    this.launches = launches;
    return this;
  }

  /**
   * Get launches
   * @return launches
  */
  @Valid 
  @Schema(name = "launches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("launches")
  public OrganizationStatsRelationshipsLaunches getLaunches() {
    return launches;
  }

  public void setLaunches(OrganizationStatsRelationshipsLaunches launches) {
    this.launches = launches;
  }

  public OrganizationStatsRelationships billing(OrganizationStatsRelationshipsBilling billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
  */
  @Valid 
  @Schema(name = "billing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing")
  public OrganizationStatsRelationshipsBilling getBilling() {
    return billing;
  }

  public void setBilling(OrganizationStatsRelationshipsBilling billing) {
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
    OrganizationStatsRelationships organizationStatsRelationships = (OrganizationStatsRelationships) o;
    return Objects.equals(this.users, organizationStatsRelationships.users) &&
        Objects.equals(this.projects, organizationStatsRelationships.projects) &&
        Objects.equals(this.launches, organizationStatsRelationships.launches) &&
        Objects.equals(this.billing, organizationStatsRelationships.billing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, projects, launches, billing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationships {\n");
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

