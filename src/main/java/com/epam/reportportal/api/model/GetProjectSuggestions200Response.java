package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * GetProjectSuggestions200Response
 */

@JsonTypeName("get_project_suggestions_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class GetProjectSuggestions200Response extends Limit {

  @Valid
  private List<String> suggestions = new ArrayList<>();

  public GetProjectSuggestions200Response() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public GetProjectSuggestions200Response(List<String> suggestions, Integer limit, Integer count) {
      super(limit, count);
      this.suggestions = suggestions;
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


  public GetProjectSuggestions200Response limit(Integer limit) {
    super.limit(limit);
    return this;
  }

  public GetProjectSuggestions200Response count(Integer count) {
    super.count(count);
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
    GetProjectSuggestions200Response getProjectSuggestions200Response = (GetProjectSuggestions200Response) o;
    return Objects.equals(this.suggestions, getProjectSuggestions200Response.suggestions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProjectSuggestions200Response {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
  public static class Builder extends Limit.Builder {

    private GetProjectSuggestions200Response instance;

    public Builder() {
      this(new GetProjectSuggestions200Response());
    }

    protected Builder(GetProjectSuggestions200Response instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(GetProjectSuggestions200Response value) { 
      super.copyOf(instance);
      this.instance.setSuggestions(value.suggestions);
      return this;
    }

    public Builder suggestions(List<String> suggestions) {
      this.instance.suggestions(suggestions);
      return this;
    }
    
    @Override
    public Builder limit(Integer limit) {
      this.instance.limit(limit);
      return this;
    }
    
    @Override
    public Builder count(Integer count) {
      this.instance.count(count);
      return this;
    }
    
    /**
    * returns a built GetProjectSuggestions200Response instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public GetProjectSuggestions200Response build() {
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

