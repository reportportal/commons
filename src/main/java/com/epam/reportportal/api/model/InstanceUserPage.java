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
 * InstanceUserPage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class InstanceUserPage extends Offset {

  @Valid
  private List<InstanceUser> items = new ArrayList<>();

  public InstanceUserPage() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InstanceUserPage(List<InstanceUser> items, Integer offset, Integer limit, Integer totalCount, String sort, Sort.Direction order) {
      super(offset, limit, totalCount, sort, order);
      this.items = items;
  }

  public InstanceUserPage items(List<InstanceUser> items) {
    this.items = items;
    return this;
  }

  public InstanceUserPage addItemsItem(InstanceUser itemsItem) {
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
  public List<InstanceUser> getItems() {
    return items;
  }

  public void setItems(List<InstanceUser> items) {
    this.items = items;
  }


  public InstanceUserPage offset(Integer offset) {
    super.offset(offset);
    return this;
  }

  public InstanceUserPage limit(Integer limit) {
    super.limit(limit);
    return this;
  }

  public InstanceUserPage totalCount(Integer totalCount) {
    super.totalCount(totalCount);
    return this;
  }

  public InstanceUserPage sort(String sort) {
    super.sort(sort);
    return this;
  }

  public InstanceUserPage order(Sort.Direction order) {
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
    InstanceUserPage instanceUserPage = (InstanceUserPage) o;
    return Objects.equals(this.items, instanceUserPage.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUserPage {\n");
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

    private InstanceUserPage instance;

    public Builder() {
      this(new InstanceUserPage());
    }

    protected Builder(InstanceUserPage instance) {
      super(instance); // the parent builder shares the same instance
      this.instance = instance;
    }

    protected Builder copyOf(InstanceUserPage value) { 
      super.copyOf(instance);
      this.instance.setItems(value.items);
      return this;
    }

    public Builder items(List<InstanceUser> items) {
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
    * returns a built InstanceUserPage instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public InstanceUserPage build() {
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

