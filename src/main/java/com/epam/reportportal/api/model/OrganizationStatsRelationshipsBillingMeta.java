package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * OrganizationStatsRelationshipsBillingMeta
 */

@JsonTypeName("OrganizationStats_relationships_billing_meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class OrganizationStatsRelationshipsBillingMeta {

  private String planName;

  private Integer storageUsage;

  public OrganizationStatsRelationshipsBillingMeta planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Plan name.
   * @return planName
  */
  
  @Schema(name = "plan_name", description = "Plan name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plan_name")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public OrganizationStatsRelationshipsBillingMeta storageUsage(Integer storageUsage) {
    this.storageUsage = storageUsage;
    return this;
  }

  /**
   * Storage usage in percents.
   * minimum: 0
   * maximum: 100
   * @return storageUsage
  */
  @Min(0) @Max(100) 
  @Schema(name = "storage_usage", description = "Storage usage in percents.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("storage_usage")
  public Integer getStorageUsage() {
    return storageUsage;
  }

  public void setStorageUsage(Integer storageUsage) {
    this.storageUsage = storageUsage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationStatsRelationshipsBillingMeta organizationStatsRelationshipsBillingMeta = (OrganizationStatsRelationshipsBillingMeta) o;
    return Objects.equals(this.planName, organizationStatsRelationshipsBillingMeta.planName) &&
        Objects.equals(this.storageUsage, organizationStatsRelationshipsBillingMeta.storageUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planName, storageUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationStatsRelationshipsBillingMeta {\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    storageUsage: ").append(toIndentedString(storageUsage)).append("\n");
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

