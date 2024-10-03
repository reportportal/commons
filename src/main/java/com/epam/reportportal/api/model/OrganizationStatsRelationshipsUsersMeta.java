package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * OrganizationStatsRelationshipsUsersMeta
 */

@JsonTypeName("OrganizationStats_relationships_users_meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationStatsRelationshipsUsersMeta {

  private Integer count;

  public OrganizationStatsRelationshipsUsersMeta count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Total count of users in the organization.
   * minimum: 0
   * @return count
  */
  @Min(0) 
  @Schema(name = "count", description = "Total count of users in the organization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OrganizationStatsRelationshipsUsersMeta organizationStatsRelationshipsUsersMeta = (OrganizationStatsRelationshipsUsersMeta) o;
    return Objects.equals(this.count, organizationStatsRelationshipsUsersMeta.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsUsersMeta {\n");
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

