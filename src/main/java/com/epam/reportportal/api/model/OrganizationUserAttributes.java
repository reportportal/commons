package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Basic information about a user in the organization.
 */
@Schema(description = "Basic information about a user in the organization.")
@Validated



public class OrganizationUserAttributes   {
  /**
   * Organization user role.
   */
  public enum OrganizationRoleEnum {
    MEMBER("MEMBER"),
    
    MANAGER("MANAGER");

    private String value;

    OrganizationRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrganizationRoleEnum fromValue(String text) {
      for (OrganizationRoleEnum b : OrganizationRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("organization_role")
  private OrganizationRoleEnum organizationRole = null;

  public OrganizationUserAttributes organizationRole(OrganizationRoleEnum organizationRole) {
    this.organizationRole = organizationRole;
    return this;
  }

  /**
   * Organization user role.
   * @return organizationRole
   **/
  @Schema(required = true, description = "Organization user role.")
      @NotNull

    public OrganizationRoleEnum getOrganizationRole() {
    return organizationRole;
  }

  public void setOrganizationRole(OrganizationRoleEnum organizationRole) {
    this.organizationRole = organizationRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUserAttributes organizationUserAttributes = (OrganizationUserAttributes) o;
    return Objects.equals(this.organizationRole, organizationUserAttributes.organizationRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserAttributes {\n");
    
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
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