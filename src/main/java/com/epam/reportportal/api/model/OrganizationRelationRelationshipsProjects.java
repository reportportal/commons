package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * General information about the organization projects.
 */
@Schema(description = "General information about the organization projects.")
@Validated



public class OrganizationRelationRelationshipsProjects   {
  @JsonProperty("meta")
  private OrganizationRelationRelationshipsProjectsMeta meta = null;

  public OrganizationRelationRelationshipsProjects meta(OrganizationRelationRelationshipsProjectsMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationRelationRelationshipsProjectsMeta getMeta() {
    return meta;
  }

  public void setMeta(OrganizationRelationRelationshipsProjectsMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationRelationRelationshipsProjects organizationRelationRelationshipsProjects = (OrganizationRelationRelationshipsProjects) o;
    return Objects.equals(this.meta, organizationRelationRelationshipsProjects.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRelationRelationshipsProjects {\n");
    
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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