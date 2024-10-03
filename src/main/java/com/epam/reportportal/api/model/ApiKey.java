package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Common info of the API Key.
 */

@Schema(name = "ApiKey", description = "Common info of the API Key.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ApiKey {

  private Integer id;

  private String name;

  private Integer userId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant lastUsedAt;

  public ApiKey id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Internal identifier
   * @return id
  */
  
  @Schema(name = "id", description = "Internal identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApiKey name(String name) {
    this.name = name;
    return this;
  }

  /**
   * API Key unique name
   * @return name
  */
  
  @Schema(name = "name", description = "API Key unique name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiKey userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * API Key owner
   * @return userId
  */
  
  @Schema(name = "user_id", description = "API Key owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public ApiKey createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date time with milliseconds
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", example = "2019-07-30T06:43:40.252Z", description = "Date time with milliseconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public ApiKey lastUsedAt(Instant lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
    return this;
  }

  /**
   * Date time with milliseconds
   * @return lastUsedAt
  */
  @Valid 
  @Schema(name = "last_used_at", example = "2019-07-30T06:43:40.252Z", description = "Date time with milliseconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_used_at")
  public Instant getLastUsedAt() {
    return lastUsedAt;
  }

  public void setLastUsedAt(Instant lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiKey apiKey = (ApiKey) o;
    return Objects.equals(this.id, apiKey.id) &&
        Objects.equals(this.name, apiKey.name) &&
        Objects.equals(this.userId, apiKey.userId) &&
        Objects.equals(this.createdAt, apiKey.createdAt) &&
        Objects.equals(this.lastUsedAt, apiKey.lastUsedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userId, createdAt, lastUsedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiKey {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
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

