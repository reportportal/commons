package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Information about the relationships of a project.
 */
@Schema(description = "Information about the relationships of a project.")
@Validated



public class ProjectRelationships   {
  @JsonProperty("relationships")
  private ProjectRelationshipsRelationships relationships = null;

  public ProjectRelationships relationships(ProjectRelationshipsRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public ProjectRelationshipsRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ProjectRelationshipsRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRelationships projectRelationships = (ProjectRelationships) o;
    return Objects.equals(this.relationships, projectRelationships.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRelationships {\n");
    
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
