package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Statistics about the project&#39;s billing information. Available only if the billing plugin is enabled.
 */

@Schema(name = "ProjectStats_billing_stats", description = "Statistics about the project's billing information. Available only if the billing plugin is enabled.")
@JsonTypeName("ProjectStats_billing_stats")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ProjectStatsBillingStats {

  private Integer storageUsage;

  public ProjectStatsBillingStats storageUsage(Integer storageUsage) {
    this.storageUsage = storageUsage;
    return this;
  }

  /**
   * The percentage of storage used by the project.
   * minimum: 0
   * maximum: 100
   * @return storageUsage
  */
  @Min(0) @Max(100) 
  @Schema(name = "storage_usage", description = "The percentage of storage used by the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectStatsBillingStats projectStatsBillingStats = (ProjectStatsBillingStats) o;
    return Objects.equals(this.storageUsage, projectStatsBillingStats.storageUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatsBillingStats {\n");
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

