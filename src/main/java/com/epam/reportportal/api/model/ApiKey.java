package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Common info of the API Key.
 */
@Schema(description = "Common info of the API Key.")
@Validated



public class ApiKey   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  @JsonProperty("created_at")
  private Instant createdAt = null;

  @JsonProperty("last_used_at")
  private Instant lastUsedAt = null;

  public ApiKey id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Internal identifier
   * @return id
   **/
  @Schema(description = "Internal identifier")
      @NotNull

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
   **/
  @Schema(description = "API Key unique name")
      @NotNull

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
   **/
  @Schema(description = "API Key owner")
      @NotNull

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
   **/
  @Schema(example = "2019-07-30T06:43:40.252Z", description = "Date time with milliseconds")
      @NotNull

    @Valid
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
   **/
  @Schema(example = "2019-07-30T06:43:40.252Z", description = "Date time with milliseconds")
      @NotNull

    @Valid
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
