package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * OrgIdUsersBody
 */
@Validated



public class OrgIdUsersBody extends OrganizationUserDefinition  {
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

  @JsonProperty("items")
  @Valid
  private List<UserProjectInfo> items = null;

  public OrgIdUsersBody organizationRole(OrganizationRoleEnum organizationRole) {
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

  public OrgIdUsersBody items(List<UserProjectInfo> items) {
    this.items = items;
    return this;
  }

  public OrgIdUsersBody addItemsItem(UserProjectInfo itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @Schema(description = "")
      @NotNull
    @Valid
    public List<UserProjectInfo> getItems() {
    return items;
  }

  public void setItems(List<UserProjectInfo> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgIdUsersBody orgIdUsersBody = (OrgIdUsersBody) o;
    return Objects.equals(this.organizationRole, orgIdUsersBody.organizationRole) &&
        Objects.equals(this.items, orgIdUsersBody.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationRole, items, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgIdUsersBody {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
