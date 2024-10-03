package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.net.URI;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Invitation information.  Invitation status can be &#x60;PENDING&#x60; or &#x60;ACTIVATED&#x60;.
 */

@Schema(name = "Invitation", description = "Invitation information.  Invitation status can be `PENDING` or `ACTIVATED`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class Invitation {

  private UUID id;

  private Long userId;

  private String fullName;

  private String email;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private URI link;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant expiresAt;

  public Invitation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Invitation(UUID id, String email, StatusEnum status) {
    this.id = id;
    this.email = email;
    this.status = status;
  }

  /**
   * Constructor with all args parameters
   */
  public Invitation(UUID id, Long userId, String fullName, String email, StatusEnum status, URI link, Instant createdAt, Instant expiresAt) {
      this.id = id;
      this.userId = userId;
      this.fullName = fullName;
      this.email = email;
      this.status = status;
      this.link = link;
      this.createdAt = createdAt;
      this.expiresAt = expiresAt;
  }

  public Invitation id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Invitation identifier.
   * @return id
   */
  @NotNull @Valid 
  @Schema(name = "id", description = "Invitation identifier.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   * User identifier.
   * minimum: 0
   * @return userId
   */
  @Min(0L) 
  @Schema(name = "user_id", description = "User identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Invitation fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Display name.
   * @return fullName
   */
  @Pattern(regexp = "^[A-Za-z0-9._\\- ]+$") @Size(min = 3, max = 60) 
  @Schema(name = "full_name", description = "Display name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Invitation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email.
   * @return email
   */
  @NotNull @Email
  @Schema(name = "email", description = "User's email.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
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
   */
  @NotNull 
  @Schema(name = "status", description = "User invitations status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invitation link(URI link) {
    this.link = link;
    return this;
  }

  /**
   * Link to invitation form.
   * @return link
   */
  @Valid 
  @Schema(name = "link", description = "Link to invitation form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public URI getLink() {
    return link;
  }

  public void setLink(URI link) {
    this.link = link;
  }

  public Invitation createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", description = "Creation date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
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
   * Expiration date.
   * @return expiresAt
   */
  @Valid 
  @Schema(name = "expires_at", description = "Expiration date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
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
        Objects.equals(this.fullName, invitation.fullName) &&
        Objects.equals(this.email, invitation.email) &&
        Objects.equals(this.status, invitation.status) &&
        Objects.equals(this.link, invitation.link) &&
        Objects.equals(this.createdAt, invitation.createdAt) &&
        Objects.equals(this.expiresAt, invitation.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, fullName, email, status, link, createdAt, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invitation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
  
  public static class Builder {

    private Invitation instance;

    public Builder() {
      this(new Invitation());
    }

    protected Builder(Invitation instance) {
      this.instance = instance;
    }

    protected Builder copyOf(Invitation value) { 
      this.instance.setId(value.id);
      this.instance.setUserId(value.userId);
      this.instance.setFullName(value.fullName);
      this.instance.setEmail(value.email);
      this.instance.setStatus(value.status);
      this.instance.setLink(value.link);
      this.instance.setCreatedAt(value.createdAt);
      this.instance.setExpiresAt(value.expiresAt);
      return this;
    }

    public Builder id(UUID id) {
      this.instance.id(id);
      return this;
    }
    
    public Builder userId(Long userId) {
      this.instance.userId(userId);
      return this;
    }
    
    public Builder fullName(String fullName) {
      this.instance.fullName(fullName);
      return this;
    }
    
    public Builder email(String email) {
      this.instance.email(email);
      return this;
    }
    
    public Builder status(StatusEnum status) {
      this.instance.status(status);
      return this;
    }
    
    public Builder link(URI link) {
      this.instance.link(link);
      return this;
    }
    
    public Builder createdAt(Instant createdAt) {
      this.instance.createdAt(createdAt);
      return this;
    }
    
    public Builder expiresAt(Instant expiresAt) {
      this.instance.expiresAt(expiresAt);
      return this;
    }
    
    /**
    * returns a built Invitation instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Invitation build() {
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

