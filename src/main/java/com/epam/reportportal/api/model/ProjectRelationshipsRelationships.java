package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * ProjectRelationshipsRelationships
 */
@Validated



public class ProjectRelationshipsRelationships   {
  @JsonProperty("users")
  private ProjectRelationshipsRelationshipsUsers users = null;

  @JsonProperty("launches")
  private ProjectRelationshipsRelationshipsLaunches launches = null;

  @JsonProperty("billing")
  private ProjectRelationshipsRelationshipsBilling billing = null;

  public ProjectRelationshipsRelationships users(ProjectRelationshipsRelationshipsUsers users) {
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
    public ProjectRelationshipsRelationshipsUsers getUsers() {
    return users;
  }

  public void setUsers(ProjectRelationshipsRelationshipsUsers users) {
    this.users = users;
  }

  public ProjectRelationshipsRelationships launches(ProjectRelationshipsRelationshipsLaunches launches) {
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
    public ProjectRelationshipsRelationshipsLaunches getLaunches() {
    return launches;
  }

  public void setLaunches(ProjectRelationshipsRelationshipsLaunches launches) {
    this.launches = launches;
  }

  public ProjectRelationshipsRelationships billing(ProjectRelationshipsRelationshipsBilling billing) {
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
    public ProjectRelationshipsRelationshipsBilling getBilling() {
    return billing;
  }

  public void setBilling(ProjectRelationshipsRelationshipsBilling billing) {
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
    ProjectRelationshipsRelationships projectRelationshipsRelationships = (ProjectRelationshipsRelationships) o;
    return Objects.equals(this.users, projectRelationshipsRelationships.users) &&
        Objects.equals(this.launches, projectRelationshipsRelationships.launches) &&
        Objects.equals(this.billing, projectRelationshipsRelationships.billing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, launches, billing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRelationshipsRelationships {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
