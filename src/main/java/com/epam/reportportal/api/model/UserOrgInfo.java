package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * Information about user&#39;s organization.
 */

@Schema(name = "UserOrgInfo", description = "Information about user's organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserOrgInfo extends UserOrgRole {

  private Long id;

  public UserOrgInfo() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserOrgInfo(Long id, OrgRoleEnum orgRole) {
      super(orgRole);
      this.id = id;
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


  public UserOrgInfo orgRole(OrgRoleEnum orgRole) {
    super.orgRole(orgRole);
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
    UserOrgInfo userOrgInfo = (UserOrgInfo) o;
    return Objects.equals(this.id, userOrgInfo.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrgInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
  
  public static class Builder extends UserOrgRole.Builder {

    private UserOrgInfo instance;

    public Builder() {
      this(new UserOrgInfo());
    }

    protected Builder(UserOrgInfo instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(UserOrgInfo value) { 
      super.copyOf(instance);
      this.instance.setId(value.id);
      return this;
    }

    public Builder id(Long id) {
      this.instance.id(id);
      return this;
    }
    
    @Override
    public Builder orgRole(OrgRoleEnum orgRole) {
      this.instance.orgRole(orgRole);
      return this;
    }
    
    /**
    * returns a built UserOrgInfo instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserOrgInfo build() {
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

