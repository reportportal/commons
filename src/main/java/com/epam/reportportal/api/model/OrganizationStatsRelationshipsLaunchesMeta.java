package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * OrganizationStatsRelationshipsLaunchesMeta
 */

@JsonTypeName("OrganizationStats_relationships_launches_meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationStatsRelationshipsLaunchesMeta {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant lastOccurredAt;

  private Integer count;

  public OrganizationStatsRelationshipsLaunchesMeta lastOccurredAt(Instant lastOccurredAt) {
    this.lastOccurredAt = lastOccurredAt;
    return this;
  }

  /**
   * Last launch occurrence date.
   * @return lastOccurredAt
  */
  @Valid 
  @Schema(name = "last_occurred_at", description = "Last launch occurrence date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_occurred_at")
  public Instant getLastOccurredAt() {
    return lastOccurredAt;
  }

  public void setLastOccurredAt(Instant lastOccurredAt) {
    this.lastOccurredAt = lastOccurredAt;
  }

  public OrganizationStatsRelationshipsLaunchesMeta count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Total count of launches in the organization. Access: Admin, Manager
   * minimum: 0
   * @return count
  */
  @Min(0) 
  @Schema(name = "count", description = "Total count of launches in the organization. Access: Admin, Manager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    OrganizationStatsRelationshipsLaunchesMeta organizationStatsRelationshipsLaunchesMeta = (OrganizationStatsRelationshipsLaunchesMeta) o;
    return Objects.equals(this.lastOccurredAt, organizationStatsRelationshipsLaunchesMeta.lastOccurredAt) &&
        Objects.equals(this.count, organizationStatsRelationshipsLaunchesMeta.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastOccurredAt, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsLaunchesMeta {\n");
    sb.append("    lastOccurredAt: ").append(toIndentedString(lastOccurredAt)).append("\n");
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

