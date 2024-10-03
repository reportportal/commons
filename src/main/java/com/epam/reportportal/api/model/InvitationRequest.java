package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * InvitationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class InvitationRequest {

  private String email;

  @Valid
  private List<InvitationRequestOrganizationsInner> organizations;

  public InvitationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public InvitationRequest(String email) {
    this.email = email;
  }

  public InvitationRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email for invitation.
   * @return email
  */
  @NotNull @Email
  @Schema(name = "email", description = "Email for invitation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InvitationRequest organizations(List<InvitationRequestOrganizationsInner> organizations) {
    this.organizations = organizations;
    return this;
  }

  public InvitationRequest addOrganizationsItem(InvitationRequestOrganizationsInner organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

  /**
   * Organizations to assign a user.
   * @return organizations
  */
  @Valid 
  @Schema(name = "organizations", description = "Organizations to assign a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organizations")
  public List<InvitationRequestOrganizationsInner> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<InvitationRequestOrganizationsInner> organizations) {
    this.organizations = organizations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationRequest invitationRequest = (InvitationRequest) o;
    return Objects.equals(this.email, invitationRequest.email) &&
        Objects.equals(this.organizations, invitationRequest.organizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, organizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
}

