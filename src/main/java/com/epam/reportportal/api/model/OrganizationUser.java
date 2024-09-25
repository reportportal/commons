package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * A comprehensive set of user information related to a user&#x27;s organization.
 */
@Schema(description = "A comprehensive set of user information related to a user's organization.")
@Validated



public class OrganizationUser extends User  {
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

  @JsonProperty("assigned_at")
  private Instant assignedAt = null;

  @JsonProperty("stats")
  private OrganizationUserStats stats = null;

  public OrganizationUser orgRole(OrgRoleEnum orgRole) {
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

  public OrganizationUser assignedAt(Instant assignedAt) {
    this.assignedAt = assignedAt;
    return this;
  }

  /**
   * A time when a user was assigned to the organization.
   * @return assignedAt
   **/
  @Schema(description = "A time when a user was assigned to the organization.")
      @NotNull

    @Valid
    public Instant getAssignedAt() {
    return assignedAt;
  }

  public void setAssignedAt(Instant assignedAt) {
    this.assignedAt = assignedAt;
  }

  public OrganizationUser stats(OrganizationUserStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationUserStats getStats() {
    return stats;
  }

  public void setStats(OrganizationUserStats stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUser organizationUser = (OrganizationUser) o;
    return Objects.equals(this.orgRole, organizationUser.orgRole) &&
        Objects.equals(this.assignedAt, organizationUser.assignedAt) &&
        Objects.equals(this.stats, organizationUser.stats) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgRole, assignedAt, stats, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    orgRole: ").append(toIndentedString(orgRole)).append("\n");
    sb.append("    assignedAt: ").append(toIndentedString(assignedAt)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
