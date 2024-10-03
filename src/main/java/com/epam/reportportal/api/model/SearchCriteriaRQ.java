package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * SearchCriteriaRQ
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class SearchCriteriaRQ extends OffsetRequest {

  @Valid
  private List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria = new ArrayList<>();

  public SearchCriteriaRQ() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public SearchCriteriaRQ(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria, Integer offset, Integer limit, String sort, OrderEnum order) {
      super(offset, limit, sort, order);
      this.searchCriteria = searchCriteria;
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


  public SearchCriteriaRQ offset(Integer offset) {
    super.offset(offset);
    return this;
  }

  public SearchCriteriaRQ limit(Integer limit) {
    super.limit(limit);
    return this;
  }

  public SearchCriteriaRQ sort(String sort) {
    super.sort(sort);
    return this;
  }

  public SearchCriteriaRQ order(OrderEnum order) {
    super.order(order);
    return this;
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
  
  public static class Builder extends OffsetRequest.Builder {

    private SearchCriteriaRQ instance;

    public Builder() {
      this(new SearchCriteriaRQ());
    }

    protected Builder(SearchCriteriaRQ instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(SearchCriteriaRQ value) { 
      super.copyOf(instance);
      this.instance.setSearchCriteria(value.searchCriteria);
      return this;
    }

    public Builder searchCriteria(List<@Valid SearchCriteriaSearchCriteriaInner> searchCriteria) {
      this.instance.searchCriteria(searchCriteria);
      return this;
    }
    
    @Override
    public Builder offset(Integer offset) {
      this.instance.offset(offset);
      return this;
    }
    
    @Override
    public Builder limit(Integer limit) {
      this.instance.limit(limit);
      return this;
    }
    
    @Override
    public Builder sort(String sort) {
      this.instance.sort(sort);
      return this;
    }
    
    @Override
    public Builder order(OrderEnum order) {
      this.instance.order(order);
      return this;
    }
    
    /**
    * returns a built SearchCriteriaRQ instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public SearchCriteriaRQ build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
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

