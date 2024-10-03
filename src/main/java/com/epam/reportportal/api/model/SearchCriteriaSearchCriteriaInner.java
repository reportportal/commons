package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * SearchCriteriaSearchCriteriaInner
 */

@JsonTypeName("SearchCriteria_search_criteria_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchCriteriaSearchCriteriaInner {

  private String filterKey;

  /**
   * operation to perform for the filter
   */
  public enum OperationEnum {
    EQ("EQ"),
    
    NE("NE"),
    
    CNT("CNT"),
    
    NON_CNT("NON_CNT"),
    
    BTW("BTW"),
    
    IN("IN");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperationEnum operation;

  private String value;

  public SearchCriteriaSearchCriteriaInner filterKey(String filterKey) {
    this.filterKey = filterKey;
    return this;
  }

  /**
   * search by field
   * @return filterKey
  */
  
  @Schema(name = "filter_key", description = "search by field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter_key")
  public String getFilterKey() {
    return filterKey;
  }

  public void setFilterKey(String filterKey) {
    this.filterKey = filterKey;
  }

  public SearchCriteriaSearchCriteriaInner operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * operation to perform for the filter
   * @return operation
  */
  
  @Schema(name = "operation", description = "operation to perform for the filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public SearchCriteriaSearchCriteriaInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * search value
   * @return value
  */
  
  @Schema(name = "value", description = "search value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
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
    SearchCriteriaSearchCriteriaInner searchCriteriaSearchCriteriaInner = (SearchCriteriaSearchCriteriaInner) o;
    return Objects.equals(this.filterKey, searchCriteriaSearchCriteriaInner.filterKey) &&
        Objects.equals(this.operation, searchCriteriaSearchCriteriaInner.operation) &&
        Objects.equals(this.value, searchCriteriaSearchCriteriaInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterKey, operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaSearchCriteriaInner {\n");
    sb.append("    filterKey: ").append(toIndentedString(filterKey)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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

