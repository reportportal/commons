package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.
 */

@Schema(name = "InvitationActivation", description = "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class InvitationActivation {

  /**
   * Change status to ACTIVATED to create a user.
   */
  public enum StatusEnum {
    ACTIVATED("ACTIVATED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String fullName;

  private String password;

  public InvitationActivation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InvitationActivation(StatusEnum status, String fullName, String password) {
    this.status = status;
    this.fullName = fullName;
    this.password = password;
  }

  public InvitationActivation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Change status to ACTIVATED to create a user.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Change status to ACTIVATED to create a user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InvitationActivation fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Display name.
   * @return fullName
  */
  @NotNull @Pattern(regexp = "^[A-Za-z0-9._\\- ]+$") @Size(min = 3, max = 60) 
  @Schema(name = "full_name", description = "Display name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("full_name")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public InvitationActivation password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.
   * @return password
  */
  @NotNull @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).+$") @Size(min = 8, max = 256) 
  @Schema(name = "password", description = "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationActivation invitationActivation = (InvitationActivation) o;
    return Objects.equals(this.status, invitationActivation.status) &&
        Objects.equals(this.fullName, invitationActivation.fullName) &&
        Objects.equals(this.password, invitationActivation.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, fullName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationActivation {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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
}

