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
 * SearchCriteriaRQ
 */
@Validated



public class SearchCriteriaRQ extends OffsetRequest  {
  @JsonProperty("search_criteria")
  @Valid
  private List<SearchCriteriaSearchCriteria> searchCriteria = null;

  public SearchCriteriaRQ searchCriteria(List<SearchCriteriaSearchCriteria> searchCriteria) {
    this.searchCriteria = searchCriteria;
    return this;
  }

  public SearchCriteriaRQ addSearchCriteriaItem(SearchCriteriaSearchCriteria searchCriteriaItem) {
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
    public List<SearchCriteriaSearchCriteria> getSearchCriteria() {
    return searchCriteria;
  }

  public void setSearchCriteria(List<SearchCriteriaSearchCriteria> searchCriteria) {
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
    return Objects.equals(this.searchCriteria, searchCriteriaRQ.searchCriteria) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchCriteria, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaRQ {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
