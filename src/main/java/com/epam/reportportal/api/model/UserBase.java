package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * User&#39;s base information.  User has a unique email address, full name, and account type.  Instance account role can be either &#x60;ADMIN&#x60; or &#x60;USER&#x60;. Only &#x60;ADMIN&#x60; users have access to change account type.
 */

@Schema(name = "UserBase", description = "User's base information.  User has a unique email address, full name, and account type.  Instance account role can be either `ADMIN` or `USER`. Only `ADMIN` users have access to change account type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserBase {

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

  public UserBase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserBase(String email, String fullName) {
    this.email = email;
    this.fullName = fullName;
  }

  /**
   * Constructor with all args parameters
   */
  public UserBase(String email, String fullName, InstanceRoleEnum instanceRole, AccountTypeEnum accountType, String externalId, Boolean active) {
      this.email = email;
      this.fullName = fullName;
      this.instanceRole = instanceRole;
      this.accountType = accountType;
      this.externalId = externalId;
      this.active = active;
  }

  public UserBase email(String email) {
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

  public UserBase fullName(String fullName) {
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

  public UserBase instanceRole(InstanceRoleEnum instanceRole) {
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

  public UserBase accountType(AccountTypeEnum accountType) {
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

  public UserBase externalId(String externalId) {
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

  public UserBase active(Boolean active) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBase userBase = (UserBase) o;
    return Objects.equals(this.email, userBase.email) &&
        Objects.equals(this.fullName, userBase.fullName) &&
        Objects.equals(this.instanceRole, userBase.instanceRole) &&
        Objects.equals(this.accountType, userBase.accountType) &&
        Objects.equals(this.externalId, userBase.externalId) &&
        Objects.equals(this.active, userBase.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullName, instanceRole, accountType, externalId, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBase {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    instanceRole: ").append(toIndentedString(instanceRole)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

    private UserBase instance;

    public Builder() {
      this(new UserBase());
    }

    protected Builder(UserBase instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserBase value) { 
      this.instance.setEmail(value.email);
      this.instance.setFullName(value.fullName);
      this.instance.setInstanceRole(value.instanceRole);
      this.instance.setAccountType(value.accountType);
      this.instance.setExternalId(value.externalId);
      this.instance.setActive(value.active);
      return this;
    }

    public Builder email(String email) {
      this.instance.email(email);
      return this;
    }
    
    public Builder fullName(String fullName) {
      this.instance.fullName(fullName);
      return this;
    }
    
    public Builder instanceRole(InstanceRoleEnum instanceRole) {
      this.instance.instanceRole(instanceRole);
      return this;
    }
    
    public Builder accountType(AccountTypeEnum accountType) {
      this.instance.accountType(accountType);
      return this;
    }
    
    public Builder externalId(String externalId) {
      this.instance.externalId(externalId);
      return this;
    }
    
    public Builder active(Boolean active) {
      this.instance.active(active);
      return this;
    }
    
    /**
    * returns a built UserBase instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserBase build() {
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

