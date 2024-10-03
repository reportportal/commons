package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

/**
 * ApiKeyCreateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class ApiKeyCreateResponse extends ApiKey {

  private String apiKey;

  public ApiKeyCreateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiKeyCreateResponse(String apiKey) {
    super();
    this.apiKey = apiKey;
  }

  /**
   * Constructor with all args parameters
   */
  public ApiKeyCreateResponse(String apiKey, Integer id, String name, Integer userId, Instant createdAt, Instant lastUsedAt) {
      super(id, name, userId, createdAt, lastUsedAt);
      this.apiKey = apiKey;
  }

  public ApiKeyCreateResponse apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The generated API key
   * @return apiKey
   */
  @NotNull 
  @Schema(name = "api_key", description = "The generated API key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("api_key")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public ApiKeyCreateResponse id(Integer id) {
    super.id(id);
    return this;
  }

  public ApiKeyCreateResponse name(String name) {
    super.name(name);
    return this;
  }

  public ApiKeyCreateResponse userId(Integer userId) {
    super.userId(userId);
    return this;
  }

  public ApiKeyCreateResponse createdAt(Instant createdAt) {
    super.createdAt(createdAt);
    return this;
  }

  public ApiKeyCreateResponse lastUsedAt(Instant lastUsedAt) {
    super.lastUsedAt(lastUsedAt);
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
    ApiKeyCreateResponse apiKeyCreateResponse = (ApiKeyCreateResponse) o;
    return Objects.equals(this.apiKey, apiKeyCreateResponse.apiKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKeyCreateResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
  
  public static class Builder extends ApiKey.Builder {

    private ApiKeyCreateResponse instance;

    public Builder() {
      this(new ApiKeyCreateResponse());
    }

    protected Builder(ApiKeyCreateResponse instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(ApiKeyCreateResponse value) { 
      super.copyOf(instance);
      this.instance.setApiKey(value.apiKey);
      return this;
    }

    public Builder apiKey(String apiKey) {
      this.instance.apiKey(apiKey);
      return this;
    }
    
    @Override
    public Builder id(Integer id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Builder name(String name) {
      this.instance.name(name);
      return this;
    }
    
    @Override
    public Builder userId(Integer userId) {
      this.instance.userId(userId);
      return this;
    }
    
    @Override
    public Builder createdAt(Instant createdAt) {
      this.instance.createdAt(createdAt);
      return this;
    }
    
    @Override
    public Builder lastUsedAt(Instant lastUsedAt) {
      this.instance.lastUsedAt(lastUsedAt);
      return this;
    }
    
    /**
    * returns a built ApiKeyCreateResponse instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public ApiKeyCreateResponse build() {
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

