package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * General information about the organization launches.
 */
@Schema(description = "General information about the organization launches.")
@Validated



public class OrganizationRelationRelationshipsLaunches   {
  @JsonProperty("meta")
  private OrganizationRelationRelationshipsLaunchesMeta meta = null;

  public OrganizationRelationRelationshipsLaunches meta(OrganizationRelationRelationshipsLaunchesMeta meta) {
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
    public OrganizationRelationRelationshipsLaunchesMeta getMeta() {
    return meta;
  }

  public void setMeta(OrganizationRelationRelationshipsLaunchesMeta meta) {
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
    OrganizationRelationRelationshipsLaunches organizationRelationRelationshipsLaunches = (OrganizationRelationRelationshipsLaunches) o;
    return Objects.equals(this.meta, organizationRelationRelationshipsLaunches.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationRelationRelationshipsLaunches {\n");
    
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