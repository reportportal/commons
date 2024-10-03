package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.net.URI;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * JSON Hypertext Application Language (HAL) model for a link.
 */

@Schema(name = "Link", description = "JSON Hypertext Application Language (HAL) model for a link.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class Link {

  private URI href;

  private String type;

  private String title;

  public Link() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Link(URI href) {
    this.href = href;
  }

  /**
   * Constructor with all args parameters
   */
  public Link(URI href, String type, String title) {
      this.href = href;
      this.type = type;
      this.title = title;
  }

  public Link href(URI href) {
    this.href = href;
    return this;
  }

  /**
   * The URI of the resource.
   * @return href
   */
  @NotNull @Valid 
  @Schema(name = "href", description = "The URI of the resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("href")
  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The media type of the resource (e.g., 'application/json' or 'image/png').
   * @return type
   */
  
  @Schema(name = "type", description = "The media type of the resource (e.g., 'application/json' or 'image/png').", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Link title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A human-readable description of the link.
   * @return title
   */
  
  @Schema(name = "title", description = "A human-readable description of the link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.type, link.type) &&
        Objects.equals(this.title, link.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, type, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

    private Link instance;

    public Builder() {
      this(new Link());
    }

    protected Builder(Link instance) {
      this.instance = instance;
    }

    protected Builder copyOf(Link value) { 
      this.instance.setHref(value.href);
      this.instance.setType(value.type);
      this.instance.setTitle(value.title);
      return this;
    }

    public Builder href(URI href) {
      this.instance.href(href);
      return this;
    }
    
    public Builder type(String type) {
      this.instance.type(type);
      return this;
    }
    
    public Builder title(String title) {
      this.instance.title(title);
      return this;
    }
    
    /**
    * returns a built Link instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Link build() {
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

