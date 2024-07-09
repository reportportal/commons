package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * OrganizationUsersList
 */
@Validated



public class OrganizationUsersList   {
  @JsonProperty("items")
  @Valid
  private List<OrganizationUserProfile> items = new ArrayList<>();

  public OrganizationUsersList items(List<OrganizationUserProfile> items) {
    this.items = items;
    return this;
  }

  public OrganizationUsersList addItemsItem(OrganizationUserProfile itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<OrganizationUserProfile> getItems() {
    return items;
  }

  public void setItems(List<OrganizationUserProfile> items) {
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
    OrganizationUsersList organizationUsersList = (OrganizationUsersList) o;
    return Objects.equals(this.items, organizationUsersList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUsersList {\n");
    
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
