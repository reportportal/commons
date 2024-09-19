package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * InvitationRequest
 */
@Validated



public class InvitationRequest   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("organizations")
  @Valid
  private List<UserOrgInfoWithProjects> organizations = null;

  public InvitationRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email for invitation.
   * @return email
   **/
  @Schema(required = true, description = "Email for invitation.")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InvitationRequest organizations(List<UserOrgInfoWithProjects> organizations) {
    this.organizations = organizations;
    return this;
  }

  public InvitationRequest addOrganizationsItem(UserOrgInfoWithProjects organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

  /**
   * Organizations to assign a user.
   * @return organizations
   **/
  @Schema(description = "Organizations to assign a user.")
      @NotNull
    @Valid
    public List<UserOrgInfoWithProjects> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<UserOrgInfoWithProjects> organizations) {
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
