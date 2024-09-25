package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * ApiKeyCreateResponse
 */
@Validated



public class ApiKeyCreateResponse extends ApiKey  {
  @JsonProperty("api_key")
  private String apiKey = null;

  public ApiKeyCreateResponse apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The generated API key
   * @return apiKey
   **/
  @Schema(required = true, description = "The generated API key")
      @NotNull

    public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
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
}
