package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * Information about user&#39;s organization.
 */

@Schema(name = "UserOrgInfo", description = "Information about user's organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class UserOrgInfo {

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

  private Long id;

  public UserOrgInfo orgRole(OrgRoleEnum orgRole) {
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

  public UserOrgInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Organization internal identifier.
   * minimum: 0
   * @return id
  */
  @Min(0L) 
  @Schema(name = "id", description = "Organization internal identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrgInfo userOrgInfo = (UserOrgInfo) o;
    return Objects.equals(this.orgRole, userOrgInfo.orgRole) &&
        Objects.equals(this.id, userOrgInfo.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgRole, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrgInfo {\n");
    sb.append("    orgRole: ").append(toIndentedString(orgRole)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

