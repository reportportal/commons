package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;

/**
 * InvitationActivation
 */
@Validated



public class InvitationActivation   {
  /**
   * Change status to ACTIVATED to create a user.
   */
  public enum StatusEnum {
    ACTIVATED("ACTIVATED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = StatusEnum.ACTIVATED;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("password")
  private String password = null;

  public InvitationActivation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Change status to ACTIVATED to create a user.
   * @return status
   **/
  @Schema(description = "Change status to ACTIVATED to create a user.")
      @NotNull

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InvitationActivation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * New email.
   * @return email
   **/
  @Schema(description = "New email.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InvitationActivation fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * User full name.
   * @return fullName
   **/
  @Schema(description = "User full name.")
      @NotNull

  @Size(max=60)   public String getFullName() {
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
   * User password. Will be ignored for `PENDING` status. Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.
   * @return password
   **/
  @Schema(required = true, description = "User password. Will be ignored for `PENDING` status. Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character.")
      @NotNull

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
        Objects.equals(this.email, invitationActivation.email) &&
        Objects.equals(this.fullName, invitationActivation.fullName) &&
        Objects.equals(this.password, invitationActivation.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, email, fullName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationActivation {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
