package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * OrganizationNotifyRuleDefinitionConditionsLaunchAttributes
 */
@Validated



public class OrganizationNotifyRuleDefinitionConditionsLaunchAttributes   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public OrganizationNotifyRuleDefinitionConditionsLaunchAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @Schema(description = "")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public OrganizationNotifyRuleDefinitionConditionsLaunchAttributes value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationNotifyRuleDefinitionConditionsLaunchAttributes organizationNotifyRuleDefinitionConditionsLaunchAttributes = (OrganizationNotifyRuleDefinitionConditionsLaunchAttributes) o;
    return Objects.equals(this.key, organizationNotifyRuleDefinitionConditionsLaunchAttributes.key) &&
        Objects.equals(this.value, organizationNotifyRuleDefinitionConditionsLaunchAttributes.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationNotifyRuleDefinitionConditionsLaunchAttributes {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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