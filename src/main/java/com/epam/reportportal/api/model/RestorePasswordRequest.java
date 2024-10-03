package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * RestorePasswordRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class RestorePasswordRequest {

  private String email;

  public RestorePasswordRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RestorePasswordRequest(String email) {
    this.email = email;
  }

  public RestorePasswordRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User email for password recovery.
   * @return email
  */
  @NotNull @Email
  @Schema(name = "email", description = "User email for password recovery.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestorePasswordRequest restorePasswordRequest = (RestorePasswordRequest) o;
    return Objects.equals(this.email, restorePasswordRequest.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestorePasswordRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

