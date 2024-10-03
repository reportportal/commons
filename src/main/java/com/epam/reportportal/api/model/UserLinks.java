package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * UserLinks
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserLinks {

  private UserLinksLinks links;

  public UserLinks() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserLinks(UserLinksLinks links) {
      this.links = links;
  }

  public UserLinks links(UserLinksLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public UserLinksLinks getLinks() {
    return links;
  }

  public void setLinks(UserLinksLinks links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLinks userLinks = (UserLinks) o;
    return Objects.equals(this.links, userLinks.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLinks {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

    private UserLinks instance;

    public Builder() {
      this(new UserLinks());
    }

    protected Builder(UserLinks instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserLinks value) { 
      this.instance.setLinks(value.links);
      return this;
    }

    public Builder links(UserLinksLinks links) {
      this.instance.links(links);
      return this;
    }
    
    /**
    * returns a built UserLinks instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserLinks build() {
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

