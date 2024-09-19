package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Invitation
 */
@Validated



public class Invitation   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("user_id")
  private Long userId = null;

  @JsonProperty("email")
  private String email = null;

  /**
   * User invitations status.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    ACTIVATED("ACTIVATED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("created_at")
  private Instant createdAt = null;

  @JsonProperty("expires_at")
  private Instant expiresAt = null;

  public Invitation id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Invitation identifier.
   * @return id
   **/
  @Schema(description = "Invitation identifier.")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Invitation userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User identifier. For activated users only.
   * @return userId
   **/
  @Schema(description = "User identifier. For activated users only.")
      @NotNull

    public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Invitation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email.
   * @return email
   **/
  @Schema(description = "User's email.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Invitation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * User invitations status.
   * @return status
   **/
  @Schema(description = "User invitations status.")
      @NotNull

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invitation link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Link to invitation form.
   * @return link
   **/
  @Schema(description = "Link to invitation form.")
      @NotNull

    public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Invitation createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date.
   * @return createdAt
   **/
  @Schema(description = "Creation date.")
      @NotNull

    @Valid
    public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Invitation expiresAt(Instant expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Experation date.
   * @return expiresAt
   **/
  @Schema(description = "Experation date.")
      @NotNull

    @Valid
    public Instant getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Instant expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invitation invitation = (Invitation) o;
    return Objects.equals(this.id, invitation.id) &&
        Objects.equals(this.userId, invitation.userId) &&
        Objects.equals(this.email, invitation.email) &&
        Objects.equals(this.status, invitation.status) &&
        Objects.equals(this.link, invitation.link) &&
        Objects.equals(this.createdAt, invitation.createdAt) &&
        Objects.equals(this.expiresAt, invitation.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, email, status, link, createdAt, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invitation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
