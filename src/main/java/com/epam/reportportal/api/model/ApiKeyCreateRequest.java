package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

/**
 * ApiKeyCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ApiKeyCreateRequest {

  private String name;

  public ApiKeyCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters and all parameters
   */
  public ApiKeyCreateRequest(String name) {
    this.name = name;
  }

  public ApiKeyCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name for the new API key
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Unique name for the new API key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKeyCreateRequest apiKeyCreateRequest = (ApiKeyCreateRequest) o;
    return Objects.equals(this.name, apiKeyCreateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    private ApiKeyCreateRequest instance;

    public Builder() {
      this(new ApiKeyCreateRequest());
    }

    protected Builder(ApiKeyCreateRequest instance) {
      this.instance = instance;
    }

    protected Builder copyOf(ApiKeyCreateRequest value) { 
      this.instance.setName(value.name);
      return this;
    }

    public Builder name(String name) {
      this.instance.name(name);
      return this;
    }
    
    /**
    * returns a built ApiKeyCreateRequest instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ApiKeyCreateRequest build() {
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

