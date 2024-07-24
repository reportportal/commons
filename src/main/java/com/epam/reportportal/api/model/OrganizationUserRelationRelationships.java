package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * OrganizationUserRelationRelationships
 */
@Validated



public class OrganizationUserRelationRelationships   {
  @JsonProperty("projects")
  private OrganizationUserRelationRelationshipsProjects projects = null;

  public OrganizationUserRelationRelationships projects(OrganizationUserRelationRelationshipsProjects projects) {
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
    public OrganizationUserRelationRelationshipsProjects getProjects() {
    return projects;
  }

  public void setProjects(OrganizationUserRelationRelationshipsProjects projects) {
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
    OrganizationUserRelationRelationships organizationUserRelationRelationships = (OrganizationUserRelationRelationships) o;
    return Objects.equals(this.projects, organizationUserRelationRelationships.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserRelationRelationships {\n");
    
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
