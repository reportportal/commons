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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class SearchCriteria {

  @Valid
  private List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria = new ArrayList<>();

  public SearchCriteria() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public SearchCriteria(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria) {
      this.searchCriteria = searchCriteria;
  }

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
  
  public static class Builder {

    private SearchCriteria instance;

    public Builder() {
      this(new SearchCriteria());
    }

    protected Builder(SearchCriteria instance) {
      this.instance = instance;
    }

    protected Builder copyOf(SearchCriteria value) { 
      this.instance.setSearchCriteria(value.searchCriteria);
      return this;
    }

    public Builder searchCriteria(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria) {
      this.instance.searchCriteria(searchCriteria);
      return this;
    }
    
    /**
    * returns a built SearchCriteria instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public SearchCriteria build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field (except for the default values).
  */
  public static Builder builder() {
    return new Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public Builder toBuilder() {
    Builder builder = new Builder();
    return builder.copyOf(this);
  }

}

