package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * InstanceUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InstanceUser extends UserInfo {

  private InstanceUserStats stats;

  @Valid
  private List<InstanceUserOrgDetails> organizations = new ArrayList<>();

  public InstanceUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InstanceUser(String email, String fullName) {
    super(email, fullName);
  }

  /**
   * Constructor with all args parameters
   */
  public InstanceUser(InstanceUserStats stats, List<InstanceUserOrgDetails> organizations, UserLinksLinks links, Long id, UUID uuid, Instant createdAt, Instant updatedAt, Instant lastLoginAt, String email, String fullName, InstanceRoleEnum instanceRole, AccountTypeEnum accountType, String externalId, Boolean active) {
      super(links, id, uuid, createdAt, updatedAt, lastLoginAt, email, fullName, instanceRole, accountType, externalId, active);
      this.stats = stats;
      this.organizations = organizations;
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


  public InstanceUser links(UserLinksLinks links) {
    super.links(links);
    return this;
  }

  public InstanceUser id(Long id) {
    super.id(id);
    return this;
  }

  public InstanceUser uuid(UUID uuid) {
    super.uuid(uuid);
    return this;
  }

  public InstanceUser createdAt(Instant createdAt) {
    super.createdAt(createdAt);
    return this;
  }

  public InstanceUser updatedAt(Instant updatedAt) {
    super.updatedAt(updatedAt);
    return this;
  }

  public InstanceUser lastLoginAt(Instant lastLoginAt) {
    super.lastLoginAt(lastLoginAt);
    return this;
  }

  public InstanceUser email(String email) {
    super.email(email);
    return this;
  }

  public InstanceUser fullName(String fullName) {
    super.fullName(fullName);
    return this;
  }

  public InstanceUser instanceRole(InstanceRoleEnum instanceRole) {
    super.instanceRole(instanceRole);
    return this;
  }

  public InstanceUser accountType(AccountTypeEnum accountType) {
    super.accountType(accountType);
    return this;
  }

  public InstanceUser externalId(String externalId) {
    super.externalId(externalId);
    return this;
  }

  public InstanceUser active(Boolean active) {
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
    InstanceUser instanceUser = (InstanceUser) o;
    return Objects.equals(this.stats, instanceUser.stats) &&
        Objects.equals(this.organizations, instanceUser.organizations) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stats, organizations, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
  public static class Builder extends UserInfo.Builder {

    private InstanceUser instance;

    public Builder() {
      this(new InstanceUser());
    }

    protected Builder(InstanceUser instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(InstanceUser value) { 
      super.copyOf(instance);
      this.instance.setStats(value.stats);
      this.instance.setOrganizations(value.organizations);
      return this;
    }

    public Builder stats(InstanceUserStats stats) {
      this.instance.stats(stats);
      return this;
    }
    
    public Builder organizations(List<InstanceUserOrgDetails> organizations) {
      this.instance.organizations(organizations);
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
    * returns a built InstanceUser instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public InstanceUser build() {
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

