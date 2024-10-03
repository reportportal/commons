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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationStatsRelationships {

  private OrganizationStatsRelationshipsUsers users;

  private OrganizationStatsRelationshipsProjects projects;

  private OrganizationStatsRelationshipsLaunches launches;

  private OrganizationStatsRelationshipsBilling billing;

  public OrganizationStatsRelationships() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationStatsRelationships(OrganizationStatsRelationshipsUsers users, OrganizationStatsRelationshipsProjects projects, OrganizationStatsRelationshipsLaunches launches, OrganizationStatsRelationshipsBilling billing) {
      this.users = users;
      this.projects = projects;
      this.launches = launches;
      this.billing = billing;
  }

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
  
  public static class Builder {

    private OrganizationStatsRelationships instance;

    public Builder() {
      this(new OrganizationStatsRelationships());
    }

    protected Builder(OrganizationStatsRelationships instance) {
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationStatsRelationships value) { 
      this.instance.setUsers(value.users);
      this.instance.setProjects(value.projects);
      this.instance.setLaunches(value.launches);
      this.instance.setBilling(value.billing);
      return this;
    }

    public Builder users(OrganizationStatsRelationshipsUsers users) {
      this.instance.users(users);
      return this;
    }
    
    public Builder projects(OrganizationStatsRelationshipsProjects projects) {
      this.instance.projects(projects);
      return this;
    }
    
    public Builder launches(OrganizationStatsRelationshipsLaunches launches) {
      this.instance.launches(launches);
      return this;
    }
    
    public Builder billing(OrganizationStatsRelationshipsBilling billing) {
      this.instance.billing(billing);
      return this;
    }
    
    /**
    * returns a built OrganizationStatsRelationships instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationStatsRelationships build() {
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

