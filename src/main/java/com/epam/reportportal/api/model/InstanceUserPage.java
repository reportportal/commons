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
import javax.validation.constraints.Min;

/**
 * InstanceUserPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class InstanceUserPage {

  private Integer offset = 0;

  private Integer limit = 300;

  private Integer totalCount;

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

  private OrderEnum order;

  @Valid
  private List<InstanceUser> items;

  public InstanceUserPage offset(Integer offset) {
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

  public InstanceUserPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The limit used for this page of results. This will be the same as the limit query parameter unless it exceeded the maximum value allowed for this API endpoint.
   * minimum: 0
   * @return limit
  */
  @Min(0) 
  @Schema(name = "limit", description = "The limit used for this page of results. This will be the same as the limit query parameter unless it exceeded the maximum value allowed for this API endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public InstanceUserPage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * One greater than the offset of the last item in the entire collection. The total number of items in the collection may be less than total_count.
   * minimum: 0
   * @return totalCount
  */
  @Min(0) 
  @Schema(name = "total_count", description = "One greater than the offset of the last item in the entire collection. The total number of items in the collection may be less than total_count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_count")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public InstanceUserPage sort(String sort) {
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

  public InstanceUserPage order(OrderEnum order) {
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

  public InstanceUserPage items(List<InstanceUser> items) {
    this.items = items;
    return this;
  }

  public InstanceUserPage addItemsItem(InstanceUser itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<InstanceUser> getItems() {
    return items;
  }

  public void setItems(List<InstanceUser> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceUserPage instanceUserPage = (InstanceUserPage) o;
    return Objects.equals(this.offset, instanceUserPage.offset) &&
        Objects.equals(this.limit, instanceUserPage.limit) &&
        Objects.equals(this.totalCount, instanceUserPage.totalCount) &&
        Objects.equals(this.sort, instanceUserPage.sort) &&
        Objects.equals(this.order, instanceUserPage.order) &&
        Objects.equals(this.items, instanceUserPage.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, totalCount, sort, order, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUserPage {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

