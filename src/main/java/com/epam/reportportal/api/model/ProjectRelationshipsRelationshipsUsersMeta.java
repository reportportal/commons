package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * ProjectRelationshipsRelationshipsUsersMeta
 */
@Validated



public class ProjectRelationshipsRelationshipsUsersMeta   {
  @JsonProperty("count")
  private Integer count = null;

  public ProjectRelationshipsRelationshipsUsersMeta count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Total number of users assigned to the project.
   * minimum: 0
   * @return count
   **/
  @Schema(description = "Total number of users assigned to the project.")
      @NotNull

  @Min(0)  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRelationshipsRelationshipsUsersMeta projectRelationshipsRelationshipsUsersMeta = (ProjectRelationshipsRelationshipsUsersMeta) o;
    return Objects.equals(this.count, projectRelationshipsRelationshipsUsersMeta.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRelationshipsRelationshipsUsersMeta {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
