package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Change user password.
 */

@Schema(name = "NewUserPassword", description = "Change user password.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class NewUserPassword {

  private String oldPassword;

  private String newPassword;

  public NewUserPassword() {
    super();
  }

  /**
   * Constructor with only required parameters and all parameters
   */
  public NewUserPassword(String oldPassword, String newPassword) {
    this.oldPassword = oldPassword;
    this.newPassword = newPassword;
  }

  public NewUserPassword oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * Old user password.
   * @return oldPassword
   */
  @NotNull 
  @Schema(name = "old_password", description = "Old user password.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("old_password")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public NewUserPassword newPassword(String newPassword) {
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
    NewUserPassword newUserPassword = (NewUserPassword) o;
    return Objects.equals(this.oldPassword, newUserPassword.oldPassword) &&
        Objects.equals(this.newPassword, newUserPassword.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserPassword {\n");
    sb.append("    oldPassword: ").append("*").append("\n");
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

    private NewUserPassword instance;

    public Builder() {
      this(new NewUserPassword());
    }

    protected Builder(NewUserPassword instance) {
      this.instance = instance;
    }

    protected Builder copyOf(NewUserPassword value) { 
      this.instance.setOldPassword(value.oldPassword);
      this.instance.setNewPassword(value.newPassword);
      return this;
    }

    public Builder oldPassword(String oldPassword) {
      this.instance.oldPassword(oldPassword);
      return this;
    }
    
    public Builder newPassword(String newPassword) {
      this.instance.newPassword(newPassword);
      return this;
    }
    
    /**
    * returns a built NewUserPassword instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public NewUserPassword build() {
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

