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
 * You can use the following attributes as a &#x60;search_criteria[*].filter_key&#x60; for filtering:  - &#x60;name&#x60; - filter by organization name. - &#x60;slug&#x60; - filter by organization slug. - &#x60;type&#x60; - filter by organization type. - &#x60;created_at&#x60; - filter by creation date. - &#x60;updated_at&#x60; - filter by last update date. - &#x60;users&#x60; - filter by the number of users. - &#x60;projects&#x60; - filter by the number of projects. - &#x60;launches&#x60; - filter by the number of launches. - &#x60;last_launch_occurred&#x60; - filter by the last launch occurrence.
 */
@Schema(description = "You can use the following attributes as a `search_criteria[*].filter_key` for filtering:  - `name` - filter by organization name. - `slug` - filter by organization slug. - `type` - filter by organization type. - `created_at` - filter by creation date. - `updated_at` - filter by last update date. - `users` - filter by the number of users. - `projects` - filter by the number of projects. - `launches` - filter by the number of launches. - `last_launch_occurred` - filter by the last launch occurrence.")
@Validated



public class OrganizationSearchCriteria   {
  @JsonProperty("sort")
  private String sort = "name";

  @JsonProperty("search_criteria")
  @Valid
  private List<OrganizationSearchCriteriaSearchCriteria> searchCriteria = null;

  public OrganizationSearchCriteria sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Field to define the sort field.
   * @return sort
   **/
  @Schema(description = "Field to define the sort field.")
      @NotNull

    public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public OrganizationSearchCriteria searchCriteria(List<OrganizationSearchCriteriaSearchCriteria> searchCriteria) {
    this.searchCriteria = searchCriteria;
    return this;
  }

  public OrganizationSearchCriteria addSearchCriteriaItem(OrganizationSearchCriteriaSearchCriteria searchCriteriaItem) {
    if (this.searchCriteria == null) {
      this.searchCriteria = new ArrayList<>();
    }
    this.searchCriteria.add(searchCriteriaItem);
    return this;
  }

  /**
   * Get searchCriteria
   * @return searchCriteria
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<OrganizationSearchCriteriaSearchCriteria> getSearchCriteria() {
    return searchCriteria;
  }

  public void setSearchCriteria(List<OrganizationSearchCriteriaSearchCriteria> searchCriteria) {
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
    OrganizationSearchCriteria organizationSearchCriteria = (OrganizationSearchCriteria) o;
    return Objects.equals(this.sort, organizationSearchCriteria.sort) &&
        Objects.equals(this.searchCriteria, organizationSearchCriteria.searchCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sort, searchCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSearchCriteria {\n");
    
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
