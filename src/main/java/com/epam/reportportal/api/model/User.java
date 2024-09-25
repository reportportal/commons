package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

/**
 * Contains general information associated with a user account.
 */
@Schema(description = "Contains general information associated with a user account.")
@Validated



public class User   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("uuid")
  private UUID uuid = null;

  @JsonProperty("created_at")
  private Instant createdAt = null;

  @JsonProperty("updated_at")
  private Instant updatedAt = null;

  @JsonProperty("last_login_at")
  private Instant lastLoginAt = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("full_name")
  private String fullName = null;

  /**
   * Instance account role.
   */
  public enum InstanceRoleEnum {
    ADMINISTRATOR("ADMINISTRATOR"),
    
    USER("USER");

    private String value;

    InstanceRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstanceRoleEnum fromValue(String text) {
      for (InstanceRoleEnum b : InstanceRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("instance_role")
  private InstanceRoleEnum instanceRole = InstanceRoleEnum.USER;

  /**
   * Indicates through which service or authentication method the user account was created.
   */
  public enum AccountTypeEnum {
    INTERNAL("INTERNAL"),
    
    UPSA("UPSA"),
    
    GITHUB("GITHUB"),
    
    LDAP("LDAP"),
    
    SAML("SAML"),
    
    SCIM("SCIM");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("account_type")
  private AccountTypeEnum accountType = AccountTypeEnum.INTERNAL;

  @JsonProperty("external_id")
  private String externalId = null;

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * User internal identifier.
   * minimum: 0
   * @return id
   **/
  @Schema(description = "User internal identifier.")
      @NotNull

  @Min(0L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * User ID for external systems.
   * @return uuid
   **/
  @Schema(description = "User ID for external systems.")
      @NotNull

    @Valid
    public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public User createdAt(Instant createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When user's account was created.
   * @return createdAt
   **/
  @Schema(description = "When user's account was created.")
      @NotNull

    @Valid
    public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public User updatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When user's data was modified.
   * @return updatedAt
   **/
  @Schema(description = "When user's data was modified.")
      @NotNull

    @Valid
    public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public User lastLoginAt(Instant lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

  /**
   * When user last logged in.
   * @return lastLoginAt
   **/
  @Schema(description = "When user last logged in.")
      @NotNull

    @Valid
    public Instant getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(Instant lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User email.
   * @return email
   **/
  @Schema(required = true, description = "User email.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * User full name.
   * @return fullName
   **/
  @Schema(description = "User full name.")
      @NotNull

  @Size(max=60)   public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User instanceRole(InstanceRoleEnum instanceRole) {
    this.instanceRole = instanceRole;
    return this;
  }

  /**
   * Instance account role.
   * @return instanceRole
   **/
  @Schema(description = "Instance account role.")
      @NotNull

    public InstanceRoleEnum getInstanceRole() {
    return instanceRole;
  }

  public void setInstanceRole(InstanceRoleEnum instanceRole) {
    this.instanceRole = instanceRole;
  }

  public User accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Indicates through which service or authentication method the user account was created.
   * @return accountType
   **/
  @Schema(description = "Indicates through which service or authentication method the user account was created.")
      @NotNull

    public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public User externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * User external identifier. Provided by external systems.
   * @return externalId
   **/
  @Schema(description = "User external identifier. Provided by external systems.")
      @NotNull

    public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.uuid, user.uuid) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.updatedAt, user.updatedAt) &&
        Objects.equals(this.lastLoginAt, user.lastLoginAt) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.instanceRole, user.instanceRole) &&
        Objects.equals(this.accountType, user.accountType) &&
        Objects.equals(this.externalId, user.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, createdAt, updatedAt, lastLoginAt, email, fullName, instanceRole, accountType, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    instanceRole: ").append(toIndentedString(instanceRole)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
