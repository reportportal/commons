package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;
import org.springframework.data.domain.Sort;

/**
 * InvitationPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InvitationPage extends Offset {

  @Valid
  private List<@Valid Invitation> items = new ArrayList<>();

  public InvitationPage() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvitationPage(List<@Valid Invitation> items, Integer offset, Integer limit, Integer totalCount, String sort, Sort.Direction order) {
      super(offset, limit, totalCount, sort, order);
      this.items = items;
  }

  public InvitationPage items(List<@Valid Invitation> items) {
    this.items = items;
    return this;
  }

  public InvitationPage addItemsItem(Invitation itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Invitation> getItems() {
    return items;
  }

  public void setItems(List<@Valid Invitation> items) {
    this.items = items;
  }


  public InvitationPage offset(Integer offset) {
    super.offset(offset);
    return this;
  }

  public InvitationPage limit(Integer limit) {
    super.limit(limit);
    return this;
  }

  public InvitationPage totalCount(Integer totalCount) {
    super.totalCount(totalCount);
    return this;
  }

  public InvitationPage sort(String sort) {
    super.sort(sort);
    return this;
  }

  public InvitationPage order(Sort.Direction order) {
    super.order(order);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitationPage invitationPage = (InvitationPage) o;
    return Objects.equals(this.items, invitationPage.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitationPage {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
  
  public static class Builder extends Offset.Builder {

    private InvitationPage instance;

    public Builder() {
      this(new InvitationPage());
    }

    protected Builder(InvitationPage instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(InvitationPage value) { 
      super.copyOf(instance);
      this.instance.setItems(value.items);
      return this;
    }

    public Builder items(List<@Valid Invitation> items) {
      this.instance.items(items);
      return this;
    }
    
    @Override
    public Builder offset(Integer offset) {
      this.instance.offset(offset);
      return this;
    }
    
    @Override
    public Builder limit(Integer limit) {
      this.instance.limit(limit);
      return this;
    }
    
    @Override
    public Builder totalCount(Integer totalCount) {
      this.instance.totalCount(totalCount);
      return this;
    }
    
    @Override
    public Builder sort(String sort) {
      this.instance.sort(sort);
      return this;
    }
    
    @Override
    public Builder order(Sort.Direction order) {
      this.instance.order(order);
      return this;
    }
    
    /**
    * returns a built InvitationPage instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public InvitationPage build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
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

