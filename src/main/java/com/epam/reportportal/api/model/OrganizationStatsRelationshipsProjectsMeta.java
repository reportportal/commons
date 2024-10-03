package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * OrganizationStatsRelationshipsProjectsMeta
 */

@JsonTypeName("OrganizationStats_relationships_projects_meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationStatsRelationshipsProjectsMeta {

  private Integer count;

  public OrganizationStatsRelationshipsProjectsMeta count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Total count of projects in the organization.
   * minimum: 0
   * @return count
  */
  @Min(0) 
  @Schema(name = "count", description = "Total count of projects in the organization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
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
    OrganizationStatsRelationshipsProjectsMeta organizationStatsRelationshipsProjectsMeta = (OrganizationStatsRelationshipsProjectsMeta) o;
    return Objects.equals(this.count, organizationStatsRelationshipsProjectsMeta.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsProjectsMeta {\n");
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

