package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * RestoreUserPassword
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class RestoreUserPassword {

  private UUID token;

  private String newPassword;

  public RestoreUserPassword() {
    super();
  }

  /**
   * Constructor with only required parameters and all parameters
   */
  public RestoreUserPassword(UUID token, String newPassword) {
    this.token = token;
    this.newPassword = newPassword;
  }

  public RestoreUserPassword token(UUID token) {
    this.token = token;
    return this;
  }

  /**
   * Token for password recovery. It's provided in email.
   * @return token
   */
  @NotNull @Valid 
  @Schema(name = "token", description = "Token for password recovery. It's provided in email.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public UUID getToken() {
    return token;
  }

  public void setToken(UUID token) {
    this.token = token;
  }

  public RestoreUserPassword newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.
   * @return newPassword
   */
  @NotNull @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).+$") @Size(min = 8, max = 256) 
  @Schema(name = "new_password", description = "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("new_password")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestoreUserPassword restoreUserPassword = (RestoreUserPassword) o;
    return Objects.equals(this.token, restoreUserPassword.token) &&
        Objects.equals(this.newPassword, restoreUserPassword.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestoreUserPassword {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

    private RestoreUserPassword instance;

    public Builder() {
      this(new RestoreUserPassword());
    }

    protected Builder(RestoreUserPassword instance) {
      this.instance = instance;
    }

    protected Builder copyOf(RestoreUserPassword value) { 
      this.instance.setToken(value.token);
      this.instance.setNewPassword(value.newPassword);
      return this;
    }

    public Builder token(UUID token) {
      this.instance.token(token);
      return this;
    }
    
    public Builder newPassword(String newPassword) {
      this.instance.newPassword(newPassword);
      return this;
    }
    
    /**
    * returns a built RestoreUserPassword instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public RestoreUserPassword build() {
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

