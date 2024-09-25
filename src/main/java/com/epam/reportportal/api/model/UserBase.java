package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

/**
 * User&#x27;s base information.  User has a unique email address, full name, and account type.  Instance account role can be either &#x60;ADMIN&#x60; or &#x60;USER&#x60;. Only &#x60;ADMIN&#x60; users have access to change account type.
 */
@Schema(description = "User's base information.  User has a unique email address, full name, and account type.  Instance account role can be either `ADMIN` or `USER`. Only `ADMIN` users have access to change account type.")
@Validated



public class UserBase   {
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

  public UserBase email(String email) {
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

  public UserBase fullName(String fullName) {
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

  public UserBase instanceRole(InstanceRoleEnum instanceRole) {
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

  public UserBase accountType(AccountTypeEnum accountType) {
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

  public UserBase externalId(String externalId) {
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
    UserBase userBase = (UserBase) o;
    return Objects.equals(this.email, userBase.email) &&
        Objects.equals(this.fullName, userBase.fullName) &&
        Objects.equals(this.instanceRole, userBase.instanceRole) &&
        Objects.equals(this.accountType, userBase.accountType) &&
        Objects.equals(this.externalId, userBase.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullName, instanceRole, accountType, externalId);
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
