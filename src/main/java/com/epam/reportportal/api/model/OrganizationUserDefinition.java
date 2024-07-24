package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Base information about user in organization.
 */
@Schema(description = "Base information about user in organization.")
@Validated



public class OrganizationUserDefinition   {
  @JsonProperty("email")
  private String email = null;

  public OrganizationUserDefinition email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User email. Unique ID in an organization.
   * @return email
   **/
  @Schema(description = "User email. Unique ID in an organization.")
      @NotNull

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
    OrganizationUserDefinition organizationUserDefinition = (OrganizationUserDefinition) o;
    return Objects.equals(this.email, organizationUserDefinition.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserDefinition {\n");
    
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
