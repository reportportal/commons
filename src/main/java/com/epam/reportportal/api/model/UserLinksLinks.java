package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * UserLinksLinks
 */

@JsonTypeName("UserLinks__links")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class UserLinksLinks {

  private Link self;

  private Link profilePicture;

  private Link profilePictureThumbnail;

  public UserLinksLinks() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public UserLinksLinks(Link self, Link profilePicture, Link profilePictureThumbnail) {
      this.self = self;
      this.profilePicture = profilePicture;
      this.profilePictureThumbnail = profilePictureThumbnail;
  }

  public UserLinksLinks self(Link self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
   */
  @Valid 
  @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public Link getSelf() {
    return self;
  }

  public void setSelf(Link self) {
    this.self = self;
  }

  public UserLinksLinks profilePicture(Link profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

  /**
   * Get profilePicture
   * @return profilePicture
   */
  @Valid 
  @Schema(name = "profile_picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_picture")
  public Link getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(Link profilePicture) {
    this.profilePicture = profilePicture;
  }

  public UserLinksLinks profilePictureThumbnail(Link profilePictureThumbnail) {
    this.profilePictureThumbnail = profilePictureThumbnail;
    return this;
  }

  /**
   * Get profilePictureThumbnail
   * @return profilePictureThumbnail
   */
  @Valid 
  @Schema(name = "profile_picture_thumbnail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_picture_thumbnail")
  public Link getProfilePictureThumbnail() {
    return profilePictureThumbnail;
  }

  public void setProfilePictureThumbnail(Link profilePictureThumbnail) {
    this.profilePictureThumbnail = profilePictureThumbnail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLinksLinks userLinksLinks = (UserLinksLinks) o;
    return Objects.equals(this.self, userLinksLinks.self) &&
        Objects.equals(this.profilePicture, userLinksLinks.profilePicture) &&
        Objects.equals(this.profilePictureThumbnail, userLinksLinks.profilePictureThumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, profilePicture, profilePictureThumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLinksLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    profilePictureThumbnail: ").append(toIndentedString(profilePictureThumbnail)).append("\n");
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

    private UserLinksLinks instance;

    public Builder() {
      this(new UserLinksLinks());
    }

    protected Builder(UserLinksLinks instance) {
      this.instance = instance;
    }

    protected Builder copyOf(UserLinksLinks value) { 
      this.instance.setSelf(value.self);
      this.instance.setProfilePicture(value.profilePicture);
      this.instance.setProfilePictureThumbnail(value.profilePictureThumbnail);
      return this;
    }

    public Builder self(Link self) {
      this.instance.self(self);
      return this;
    }
    
    public Builder profilePicture(Link profilePicture) {
      this.instance.profilePicture(profilePicture);
      return this;
    }
    
    public Builder profilePictureThumbnail(Link profilePictureThumbnail) {
      this.instance.profilePictureThumbnail(profilePictureThumbnail);
      return this;
    }
    
    /**
    * returns a built UserLinksLinks instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public UserLinksLinks build() {
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

