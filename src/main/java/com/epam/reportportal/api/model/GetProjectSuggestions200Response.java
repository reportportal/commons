package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;

/**
 * GetProjectSuggestions200Response
 */

@JsonTypeName("get_project_suggestions_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class GetProjectSuggestions200Response {

  private Integer limit;

  private Integer count;

  @Valid
  private List<String> suggestions;

  public GetProjectSuggestions200Response limit(Integer limit) {
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

  public GetProjectSuggestions200Response count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of results returned in this page of results.
   * minimum: 0
   * @return count
  */
  @Min(0) 
  @Schema(name = "count", description = "The number of results returned in this page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GetProjectSuggestions200Response suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public GetProjectSuggestions200Response addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

  /**
   * List of activities suggestions for the project by type.
   * @return suggestions
  */
  
  @Schema(name = "suggestions", description = "List of activities suggestions for the project by type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestions")
  public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProjectSuggestions200Response getProjectSuggestions200Response = (GetProjectSuggestions200Response) o;
    return Objects.equals(this.limit, getProjectSuggestions200Response.limit) &&
        Objects.equals(this.count, getProjectSuggestions200Response.count) &&
        Objects.equals(this.suggestions, getProjectSuggestions200Response.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, count, suggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProjectSuggestions200Response {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

