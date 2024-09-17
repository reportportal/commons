package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Information about user&#x27;s organization.
 */
@Schema(description = "Information about user's organization.")
@Validated



public class UserOrgInfo   {
  @JsonProperty("id")
  private Long id = null;

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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrgRoleEnum fromValue(String text) {
      for (OrgRoleEnum b : OrgRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("org_role")
  private OrgRoleEnum orgRole = OrgRoleEnum.MEMBER;

  public UserOrgInfo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Organization internal identifier.
   * minimum: 0
   * @return id
   **/
  @Schema(description = "Organization internal identifier.")
      @NotNull

  @Min(0L)  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserOrgInfo orgRole(OrgRoleEnum orgRole) {
    this.orgRole = orgRole;
    return this;
  }

  /**
   * Organization user role.
   * @return orgRole
   **/
  @Schema(description = "Organization user role.")
      @NotNull

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
    UserOrgInfo userOrgInfo = (UserOrgInfo) o;
    return Objects.equals(this.id, userOrgInfo.id) &&
        Objects.equals(this.orgRole, userOrgInfo.orgRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrgInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
}
