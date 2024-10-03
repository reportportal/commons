package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * New user creation
 */

@Schema(name = "NewUserRequest", description = "New user creation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class NewUserRequest extends UserBase {

  private String password;

  public NewUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NewUserRequest(String email, String fullName) {
    super(email, fullName);
  }

  /**
   * Constructor with all args parameters
   */
  public NewUserRequest(String password, String email, String fullName, InstanceRoleEnum instanceRole, AccountTypeEnum accountType, String externalId, Boolean active) {
      super(email, fullName, instanceRole, accountType, externalId, active);
      this.password = password;
  }

  public NewUserRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.
   * @return password
   */
  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).+$") @Size(min = 8, max = 256) 
  @Schema(name = "password", description = "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public NewUserRequest email(String email) {
    super.email(email);
    return this;
  }

  public NewUserRequest fullName(String fullName) {
    super.fullName(fullName);
    return this;
  }

  public NewUserRequest instanceRole(InstanceRoleEnum instanceRole) {
    super.instanceRole(instanceRole);
    return this;
  }

  public NewUserRequest accountType(AccountTypeEnum accountType) {
    super.accountType(accountType);
    return this;
  }

  public NewUserRequest externalId(String externalId) {
    super.externalId(externalId);
    return this;
  }

  public NewUserRequest active(Boolean active) {
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
    NewUserRequest newUserRequest = (NewUserRequest) o;
    return Objects.equals(this.password, newUserRequest.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
  
  public static class Builder extends UserBase.Builder {

    private NewUserRequest instance;

    public Builder() {
      this(new NewUserRequest());
    }

    protected Builder(NewUserRequest instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(NewUserRequest value) { 
      super.copyOf(instance);
      this.instance.setPassword(value.password);
      return this;
    }

    public Builder password(String password) {
      this.instance.password(password);
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
    * returns a built NewUserRequest instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public NewUserRequest build() {
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

