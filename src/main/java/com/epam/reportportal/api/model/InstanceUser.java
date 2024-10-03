package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
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
 * InstanceUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class InstanceUser {

  private Long id;

  private UUID uuid;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant updatedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant lastLoginAt;

  private String email;

  private String fullName;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstanceRoleEnum fromValue(String value) {
      for (InstanceRoleEnum b : InstanceRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AccountTypeEnum accountType = AccountTypeEnum.INTERNAL;

  private String externalId;

  private Boolean active = true;

  private UserLinksLinks links;

  private InstanceUserStats stats;

  @Valid
  private List<InstanceUserOrgDetails> organizations;

  public InstanceUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstanceUser(String email, String fullName) {
    this.email = email;
    this.fullName = fullName;
  }

  public InstanceUser id(Long id) {
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

  public InstanceUser uuid(UUID uuid) {
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

  public InstanceUser createdAt(Instant createdAt) {
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

  public InstanceUser updatedAt(Instant updatedAt) {
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

  public InstanceUser lastLoginAt(Instant lastLoginAt) {
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

  public InstanceUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User email.
   * @return email
  */
  @NotNull @Email
  @Schema(name = "email", description = "User email.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InstanceUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Display name.
   * @return fullName
  */
  @NotNull @Pattern(regexp = "^[A-Za-z0-9._\\- ]+$") @Size(min = 3, max = 60) 
  @Schema(name = "full_name", description = "Display name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public InstanceUser instanceRole(InstanceRoleEnum instanceRole) {
    this.instanceRole = instanceRole;
    return this;
  }

  /**
   * Instance account role.
   * @return instanceRole
  */
  
  @Schema(name = "instance_role", description = "Instance account role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance_role")
  public InstanceRoleEnum getInstanceRole() {
    return instanceRole;
  }

  public void setInstanceRole(InstanceRoleEnum instanceRole) {
    this.instanceRole = instanceRole;
  }

  public InstanceUser accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Indicates through which service or authentication method the user account was created.
   * @return accountType
  */
  
  @Schema(name = "account_type", description = "Indicates through which service or authentication method the user account was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public InstanceUser externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * User external identifier. Provided by external systems.
   * @return externalId
  */
  
  @Schema(name = "external_id", description = "User external identifier. Provided by external systems.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public InstanceUser active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Soft delete user attribute.
   * @return active
  */
  
  @Schema(name = "active", description = "Soft delete user attribute.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public InstanceUser links(UserLinksLinks links) {
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

  public InstanceUser stats(InstanceUserStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
  */
  @Valid 
  @Schema(name = "stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stats")
  public InstanceUserStats getStats() {
    return stats;
  }

  public void setStats(InstanceUserStats stats) {
    this.stats = stats;
  }

  public InstanceUser organizations(List<InstanceUserOrgDetails> organizations) {
    this.organizations = organizations;
    return this;
  }

  public InstanceUser addOrganizationsItem(InstanceUserOrgDetails organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

  /**
   * Get organizations
   * @return organizations
  */
  @Valid 
  @Schema(name = "organizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizations")
  public List<InstanceUserOrgDetails> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<InstanceUserOrgDetails> organizations) {
    this.organizations = organizations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceUser instanceUser = (InstanceUser) o;
    return Objects.equals(this.id, instanceUser.id) &&
        Objects.equals(this.uuid, instanceUser.uuid) &&
        Objects.equals(this.createdAt, instanceUser.createdAt) &&
        Objects.equals(this.updatedAt, instanceUser.updatedAt) &&
        Objects.equals(this.lastLoginAt, instanceUser.lastLoginAt) &&
        Objects.equals(this.email, instanceUser.email) &&
        Objects.equals(this.fullName, instanceUser.fullName) &&
        Objects.equals(this.instanceRole, instanceUser.instanceRole) &&
        Objects.equals(this.accountType, instanceUser.accountType) &&
        Objects.equals(this.externalId, instanceUser.externalId) &&
        Objects.equals(this.active, instanceUser.active) &&
        Objects.equals(this.links, instanceUser.links) &&
        Objects.equals(this.stats, instanceUser.stats) &&
        Objects.equals(this.organizations, instanceUser.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, createdAt, updatedAt, lastLoginAt, email, fullName, instanceRole, accountType, externalId, active, links, stats, organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUser {\n");
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
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
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

