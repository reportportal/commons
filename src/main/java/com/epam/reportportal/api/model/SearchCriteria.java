package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * SearchCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchCriteria {

  @Valid
  private List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria;

  public SearchCriteria searchCriteria(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria) {
    this.searchCriteria = searchCriteria;
    return this;
  }

  public SearchCriteria addSearchCriteriaItem(SearchCriteriaSearchCriteriaInner searchCriteriaItem) {
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
    SearchCriteria searchCriteria = (SearchCriteria) o;
    return Objects.equals(this.searchCriteria, searchCriteria.searchCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteria {\n");
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

