package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * UserAssignmentResponse
 */

@JsonTypeName("User_Assignment_Response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserAssignmentResponse {

  private String message = "The user was added to the organization.";

  public UserAssignmentResponse() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserAssignmentResponse(String message) {
      this.message = message;
  }

  public UserAssignmentResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAssignmentResponse userAssignmentResponse = (UserAssignmentResponse) o;
    return Objects.equals(this.message, userAssignmentResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssignmentResponse {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

    private UserAssignmentResponse instance;

    public Builder() {
      this(new UserAssignmentResponse());
    }

    protected Builder(UserAssignmentResponse instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserAssignmentResponse value) { 
      this.instance.setMessage(value.message);
      return this;
    }

    public Builder message(String message) {
      this.instance.message(message);
      return this;
    }
    
    /**
    * returns a built UserAssignmentResponse instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserAssignmentResponse build() {
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

