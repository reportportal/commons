package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * ActivatedUserInfo
 */
@Validated



public class ActivatedUserInfo   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("user_id")
  private Long userId = null;

  @JsonProperty("email")
  private String email = null;

  public ActivatedUserInfo id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Invitation ID.
   * @return id
   **/
  @Schema(description = "Invitation ID.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ActivatedUserInfo userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Created user ID.
   * minimum: 0
   * @return userId
   **/
  @Schema(description = "Created user ID.")
      @NotNull

  @Min(0L)  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public ActivatedUserInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User email.
   * @return email
   **/
  @Schema(description = "User email.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivatedUserInfo activatedUserInfo = (ActivatedUserInfo) o;
    return Objects.equals(this.id, activatedUserInfo.id) &&
        Objects.equals(this.userId, activatedUserInfo.userId) &&
        Objects.equals(this.email, activatedUserInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivatedUserInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
