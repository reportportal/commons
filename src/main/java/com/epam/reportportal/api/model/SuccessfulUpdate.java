package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * SuccessfulUpdate
 */

@JsonTypeName("Successful_update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class SuccessfulUpdate {

  private String message;

  public SuccessfulUpdate() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public SuccessfulUpdate(String message) {
      this.message = message;
  }

  public SuccessfulUpdate message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  
  @Schema(name = "message", example = "The update was completed successfully.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SuccessfulUpdate successfulUpdate = (SuccessfulUpdate) o;
    return Objects.equals(this.message, successfulUpdate.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulUpdate {\n");
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

    private SuccessfulUpdate instance;

    public Builder() {
      this(new SuccessfulUpdate());
    }

    protected Builder(SuccessfulUpdate instance) {
      this.instance = instance;
    }

    protected Builder copyOf(SuccessfulUpdate value) { 
      this.instance.setMessage(value.message);
      return this;
    }

    public Builder message(String message) {
      this.instance.message(message);
      return this;
    }
    
    /**
    * returns a built SuccessfulUpdate instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public SuccessfulUpdate build() {
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

