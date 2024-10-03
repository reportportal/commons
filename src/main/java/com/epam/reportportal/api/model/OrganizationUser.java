package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Generated;
import javax.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A comprehensive set of user information related to a user&#39;s organization.
 */

@Schema(name = "OrganizationUser", description = "A comprehensive set of user information related to a user's organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class OrganizationUser extends UserInfo {

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Instant assignedAt;

  private OrganizationUserAllOfStats stats;

  public OrganizationUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganizationUser(String email, String fullName) {
    super(email, fullName);
  }

  /**
   * Constructor with all args parameters
   */
  public OrganizationUser(OrgRoleEnum orgRole, Instant assignedAt, OrganizationUserAllOfStats stats, UserLinksLinks links, Long id, UUID uuid, Instant createdAt, Instant updatedAt, Instant lastLoginAt, String email, String fullName, InstanceRoleEnum instanceRole, AccountTypeEnum accountType, String externalId, Boolean active) {
      super(links, id, uuid, createdAt, updatedAt, lastLoginAt, email, fullName, instanceRole, accountType, externalId, active);
      this.orgRole = orgRole;
      this.assignedAt = assignedAt;
      this.stats = stats;
  }

  public OrganizationUser orgRole(OrgRoleEnum orgRole) {
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

  public OrganizationUser assignedAt(Instant assignedAt) {
    this.assignedAt = assignedAt;
    return this;
  }

  /**
   * A time when a user was assigned to the organization.
   * @return assignedAt
   */
  @Valid 
  @Schema(name = "assigned_at", description = "A time when a user was assigned to the organization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned_at")
  public Instant getAssignedAt() {
    return assignedAt;
  }

  public void setAssignedAt(Instant assignedAt) {
    this.assignedAt = assignedAt;
  }

  public OrganizationUser stats(OrganizationUserAllOfStats stats) {
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
  public OrganizationUserAllOfStats getStats() {
    return stats;
  }

  public void setStats(OrganizationUserAllOfStats stats) {
    this.stats = stats;
  }


  public OrganizationUser links(UserLinksLinks links) {
    super.links(links);
    return this;
  }

  public OrganizationUser id(Long id) {
    super.id(id);
    return this;
  }

  public OrganizationUser uuid(UUID uuid) {
    super.uuid(uuid);
    return this;
  }

  public OrganizationUser createdAt(Instant createdAt) {
    super.createdAt(createdAt);
    return this;
  }

  public OrganizationUser updatedAt(Instant updatedAt) {
    super.updatedAt(updatedAt);
    return this;
  }

  public OrganizationUser lastLoginAt(Instant lastLoginAt) {
    super.lastLoginAt(lastLoginAt);
    return this;
  }

  public OrganizationUser email(String email) {
    super.email(email);
    return this;
  }

  public OrganizationUser fullName(String fullName) {
    super.fullName(fullName);
    return this;
  }

  public OrganizationUser instanceRole(InstanceRoleEnum instanceRole) {
    super.instanceRole(instanceRole);
    return this;
  }

  public OrganizationUser accountType(AccountTypeEnum accountType) {
    super.accountType(accountType);
    return this;
  }

  public OrganizationUser externalId(String externalId) {
    super.externalId(externalId);
    return this;
  }

  public OrganizationUser active(Boolean active) {
    super.active(active);
    return this;
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
  
  public static class Builder extends UserInfo.Builder {

    private OrganizationUser instance;

    public Builder() {
      this(new OrganizationUser());
    }

    protected Builder(OrganizationUser instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(OrganizationUser value) { 
      super.copyOf(instance);
      this.instance.setOrgRole(value.orgRole);
      this.instance.setAssignedAt(value.assignedAt);
      this.instance.setStats(value.stats);
      return this;
    }

    public Builder orgRole(OrgRoleEnum orgRole) {
      this.instance.orgRole(orgRole);
      return this;
    }
    
    public Builder assignedAt(Instant assignedAt) {
      this.instance.assignedAt(assignedAt);
      return this;
    }
    
    public Builder stats(OrganizationUserAllOfStats stats) {
      this.instance.stats(stats);
      return this;
    }
    
    @Override
    public Builder links(UserLinksLinks links) {
      this.instance.links(links);
      return this;
    }
    
    @Override
    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Builder uuid(UUID uuid) {
      this.instance.uuid(uuid);
      return this;
    }
    
    @Override
    public Builder createdAt(Instant createdAt) {
      this.instance.createdAt(createdAt);
      return this;
    }
    
    @Override
    public Builder updatedAt(Instant updatedAt) {
      this.instance.updatedAt(updatedAt);
      return this;
    }
    
    @Override
    public Builder lastLoginAt(Instant lastLoginAt) {
      this.instance.lastLoginAt(lastLoginAt);
      return this;
    }
    
    @Override
    public Builder email(String email) {
      this.instance.email(email);
      return this;
    }
    
    @Override
    public Builder fullName(String fullName) {
      this.instance.fullName(fullName);
      return this;
    }
    
    @Override
    public Builder instanceRole(InstanceRoleEnum instanceRole) {
      this.instance.instanceRole(instanceRole);
      return this;
    }
    
    @Override
    public Builder accountType(AccountTypeEnum accountType) {
      this.instance.accountType(accountType);
      return this;
    }
    
    @Override
    public Builder externalId(String externalId) {
      this.instance.externalId(externalId);
      return this;
    }
    
    @Override
    public Builder active(Boolean active) {
      this.instance.active(active);
      return this;
    }
    
    /**
    * returns a built OrganizationUser instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public OrganizationUser build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
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

