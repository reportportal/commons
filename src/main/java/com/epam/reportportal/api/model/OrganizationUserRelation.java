package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * A relationship object contains members that represent a relationship of the user in the organization.  Represents [JSON:API relationships object](https://jsonapi.org/format/#document-resource-object-relationships). We use only &#x60;links&#x60; and &#x60;meta&#x60; objects.
 */
@Schema(description = "A relationship object contains members that represent a relationship of the user in the organization.  Represents [JSON:API relationships object](https://jsonapi.org/format/#document-resource-object-relationships). We use only `links` and `meta` objects.")
@Validated



public class OrganizationUserRelation   {
  @JsonProperty("relationships")
  private OrganizationUserRelationRelationships relationships = null;

  public OrganizationUserRelation relationships(OrganizationUserRelationRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public OrganizationUserRelationRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(OrganizationUserRelationRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUserRelation organizationUserRelation = (OrganizationUserRelation) o;
    return Objects.equals(this.relationships, organizationUserRelation.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserRelation {\n");
    
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
