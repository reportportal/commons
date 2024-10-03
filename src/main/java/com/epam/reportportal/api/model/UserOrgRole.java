package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Basic information about a user in the organization.
 */

@Schema(name = "UserOrgRole", description = "Basic information about a user in the organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserOrgRole {

  /**
   * Organization user role.
   */
  public enum OrgRoleEnum {
    MEMBER("MEMBER"),
    
    MANAGER("MANAGER");

    private String value;

    OrgRoleEnum(String value) {
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
    public static OrgRoleEnum fromValue(String value) {
      for (OrgRoleEnum b : OrgRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OrgRoleEnum orgRole = OrgRoleEnum.MEMBER;

  public UserOrgRole() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserOrgRole(OrgRoleEnum orgRole) {
      this.orgRole = orgRole;
  }

  public UserOrgRole orgRole(OrgRoleEnum orgRole) {
    this.orgRole = orgRole;
    return this;
  }

  /**
   * Organization user role.
   * @return orgRole
   */
  
  @Schema(name = "org_role", description = "Organization user role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org_role")
  public OrgRoleEnum getOrgRole() {
    return orgRole;
  }

  public void setOrgRole(OrgRoleEnum orgRole) {
    this.orgRole = orgRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrgRole userOrgRole = (UserOrgRole) o;
    return Objects.equals(this.orgRole, userOrgRole.orgRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrgRole {\n");
    sb.append("    orgRole: ").append(toIndentedString(orgRole)).append("\n");
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

    private UserOrgRole instance;

    public Builder() {
      this(new UserOrgRole());
    }

    protected Builder(UserOrgRole instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserOrgRole value) { 
      this.instance.setOrgRole(value.orgRole);
      return this;
    }

    public Builder orgRole(OrgRoleEnum orgRole) {
      this.instance.orgRole(orgRole);
      return this;
    }
    
    /**
    * returns a built UserOrgRole instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserOrgRole build() {
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

