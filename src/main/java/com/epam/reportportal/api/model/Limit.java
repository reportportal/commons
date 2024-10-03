package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.constraints.Min;

/**
 * 
 */

@Schema(name = "Limit", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class Limit {

  private Integer limit;

  private Integer count;

  public Limit() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public Limit(Integer limit, Integer count) {
      this.limit = limit;
      this.count = count;
  }

  public Limit limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The limit used for this page of results. This will be the same as the limit query parameter unless it exceeded the maximum value allowed for this API endpoint.
   * minimum: 0
   * @return limit
   */
  @Min(0) 
  @Schema(name = "limit", description = "The limit used for this page of results. This will be the same as the limit query parameter unless it exceeded the maximum value allowed for this API endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Limit count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of results returned in this page of results.
   * minimum: 0
   * @return count
   */
  @Min(0) 
  @Schema(name = "count", description = "The number of results returned in this page of results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limit limit = (Limit) o;
    return Objects.equals(this.limit, limit.limit) &&
        Objects.equals(this.count, limit.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

    private Limit instance;

    public Builder() {
      this(new Limit());
    }

    protected Builder(Limit instance) {
      this.instance = instance;
    }

    protected Builder copyOf(Limit value) { 
      this.instance.setLimit(value.limit);
      this.instance.setCount(value.count);
      return this;
    }

    public Builder limit(Integer limit) {
      this.instance.limit(limit);
      return this;
    }
    
    public Builder count(Integer count) {
      this.instance.count(count);
      return this;
    }
    
    /**
    * returns a built Limit instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public Limit build() {
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

