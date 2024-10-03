package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * SearchCriteriaRQ
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchCriteriaRQ {

  private Integer offset = 0;

  private Integer limit = 300;

  private String sort;

  /**
   * To indicate sorting direction. Ascending or Descending.
   */
  public enum OrderEnum {
    ASC("ASC"),
    
    DESC("DESC");

    private String value;

    OrderEnum(String value) {
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
    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OrderEnum order = OrderEnum.ASC;

  @Valid
  private List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria;

  public SearchCriteriaRQ offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The offset used for this page of results.
   * minimum: 0
   * @return offset
  */
  @Min(0) 
  @Schema(name = "offset", description = "The offset used for this page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public SearchCriteriaRQ limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The limit used for this page of results. This will be the same as the limit query parameter unless it exceeded the maximum value allowed for this API endpoint.
   * minimum: 0
   * maximum: 1000
   * @return limit
  */
  @Min(0) @Max(1000) 
  @Schema(name = "limit", description = "The limit used for this page of results. This will be the same as the limit query parameter unless it exceeded the maximum value allowed for this API endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SearchCriteriaRQ sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Field to define the sort field.
   * @return sort
  */
  
  @Schema(name = "sort", description = "Field to define the sort field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public SearchCriteriaRQ order(OrderEnum order) {
    this.order = order;
    return this;
  }

  /**
   * To indicate sorting direction. Ascending or Descending.
   * @return order
  */
  
  @Schema(name = "order", description = "To indicate sorting direction. Ascending or Descending.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }

  public SearchCriteriaRQ searchCriteria(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria) {
    this.searchCriteria = searchCriteria;
    return this;
  }

  public SearchCriteriaRQ addSearchCriteriaItem(SearchCriteriaSearchCriteriaInner searchCriteriaItem) {
    if (this.searchCriteria == null) {
      this.searchCriteria = new ArrayList<>();
    }
    this.searchCriteria.add(searchCriteriaItem);
    return this;
  }

  /**
   * Get searchCriteria
   * @return searchCriteria
  */
  @Valid 
  @Schema(name = "search_criteria", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_criteria")
  public List<@Valid SearchCriteriaSearchCriteriaInner> getSearchCriteria() {
    return searchCriteria;
  }

  public void setSearchCriteria(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria) {
    this.searchCriteria = searchCriteria;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteriaRQ searchCriteriaRQ = (SearchCriteriaRQ) o;
    return Objects.equals(this.offset, searchCriteriaRQ.offset) &&
        Objects.equals(this.limit, searchCriteriaRQ.limit) &&
        Objects.equals(this.sort, searchCriteriaRQ.sort) &&
        Objects.equals(this.order, searchCriteriaRQ.order) &&
        Objects.equals(this.searchCriteria, searchCriteriaRQ.searchCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, sort, order, searchCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaRQ {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    searchCriteria: ").append(toIndentedString(searchCriteria)).append("\n");
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

