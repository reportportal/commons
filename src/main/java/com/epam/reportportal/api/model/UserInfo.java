package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Contains general information associated with a user account.
 */

@Schema(name = "UserInfo", description = "Contains general information associated with a user account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserInfo extends UserBase {

  private UserLinksLinks links;

  private Long id;

  private UUID uuid;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant updatedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant lastLoginAt;

  public UserInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserInfo(String email, String fullName) {
    super(email, fullName);
  }

  /**
   * Constructor with all args parameters
   */
  public UserInfo(UserLinksLinks links, Long id, UUID uuid, Instant createdAt, Instant updatedAt, Instant lastLoginAt, String email, String fullName, InstanceRoleEnum instanceRole, AccountTypeEnum accountType, String externalId, Boolean active) {
      super(email, fullName, instanceRole, accountType, externalId, active);
      this.links = links;
      this.id = id;
      this.uuid = uuid;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;
      this.lastLoginAt = lastLoginAt;
  }

  public UserInfo links(UserLinksLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public UserLinksLinks getLinks() {
    return links;
  }

  public void setLinks(UserLinksLinks links) {
    this.links = links;
  }

  public UserInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * User internal identifier.
   * minimum: 0
   * @return id
   */
  @Min(0L) 
  @Schema(name = "id", description = "User internal identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserInfo uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * User ID for external systems.
   * @return uuid
   */
  @Valid 
  @Schema(name = "uuid", description = "User ID for external systems.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public UserInfo createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When user's account was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", description = "When user's account was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public UserInfo updatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When user's data was modified.
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", description = "When user's data was modified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserInfo lastLoginAt(Instant lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

  /**
   * When user last logged in.
   * @return lastLoginAt
   */
  @Valid 
  @Schema(name = "last_login_at", description = "When user last logged in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_login_at")
  public Instant getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(Instant lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }


  public UserInfo email(String email) {
    super.email(email);
    return this;
  }

  public UserInfo fullName(String fullName) {
    super.fullName(fullName);
    return this;
  }

  public UserInfo instanceRole(InstanceRoleEnum instanceRole) {
    super.instanceRole(instanceRole);
    return this;
  }

  public UserInfo accountType(AccountTypeEnum accountType) {
    super.accountType(accountType);
    return this;
  }

  public UserInfo externalId(String externalId) {
    super.externalId(externalId);
    return this;
  }

  public UserInfo active(Boolean active) {
    super.active(active);
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
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.links, userInfo.links) &&
        Objects.equals(this.id, userInfo.id) &&
        Objects.equals(this.uuid, userInfo.uuid) &&
        Objects.equals(this.createdAt, userInfo.createdAt) &&
        Objects.equals(this.updatedAt, userInfo.updatedAt) &&
        Objects.equals(this.lastLoginAt, userInfo.lastLoginAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, uuid, createdAt, updatedAt, lastLoginAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
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
  
  public static class Builder extends UserBase.Builder {

    private UserInfo instance;

    public Builder() {
      this(new UserInfo());
    }

    protected Builder(UserInfo instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(UserInfo value) { 
      super.copyOf(instance);
      this.instance.setLinks(value.links);
      this.instance.setId(value.id);
      this.instance.setUuid(value.uuid);
      this.instance.setCreatedAt(value.createdAt);
      this.instance.setUpdatedAt(value.updatedAt);
      this.instance.setLastLoginAt(value.lastLoginAt);
      return this;
    }

    public Builder links(UserLinksLinks links) {
      this.instance.links(links);
      return this;
    }
    
    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    public Builder uuid(UUID uuid) {
      this.instance.uuid(uuid);
      return this;
    }
    
    public Builder createdAt(Instant createdAt) {
      this.instance.createdAt(createdAt);
      return this;
    }
    
    public Builder updatedAt(Instant updatedAt) {
      this.instance.updatedAt(updatedAt);
      return this;
    }
    
    public Builder lastLoginAt(Instant lastLoginAt) {
      this.instance.lastLoginAt(lastLoginAt);
      return this;
    }
    
    @Override
    public Builder email(String email) {
      this.instance.email(email);
      return this;
    }
    
    @Override
    public Builder fullName(String fullName) {
      this.instance.fullName(fullName);
      return this;
    }
    
    @Override
    public Builder instanceRole(InstanceRoleEnum instanceRole) {
      this.instance.instanceRole(instanceRole);
      return this;
    }
    
    @Override
    public Builder accountType(AccountTypeEnum accountType) {
      this.instance.accountType(accountType);
      return this;
    }
    
    @Override
    public Builder externalId(String externalId) {
      this.instance.externalId(externalId);
      return this;
    }
    
    @Override
    public Builder active(Boolean active) {
      this.instance.active(active);
      return this;
    }
    
    /**
    * returns a built UserInfo instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserInfo build() {
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

