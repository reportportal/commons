package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.validation.Valid;

/**
 * PatchArrayString
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.8.0")
public class PatchArrayString implements PatchOperation {

  /**
   * Gets or Sets op
   */
  public enum OpEnum {
    ADD("add"),
    
    REPLACE("replace"),
    
    REMOVE("remove");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OpEnum op;

  private String path;

  @Valid
  private List<String> value = new ArrayList<>();

  public PatchArrayString() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public PatchArrayString(OpEnum op, String path, List<String> value) {
      this.op = op;
      this.path = path;
      this.value = value;
  }

  public PatchArrayString op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
   */
  
  @Schema(name = "op", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("op")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public PatchArrayString path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PatchArrayString value(List<String> value) {
    this.value = value;
    return this;
  }

  public PatchArrayString addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
   */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchArrayString patchArrayString = (PatchArrayString) o;
    return Objects.equals(this.op, patchArrayString.op) &&
        Objects.equals(this.path, patchArrayString.path) &&
        Objects.equals(this.value, patchArrayString.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchArrayString {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    private PatchArrayString instance;

    public Builder() {
      this(new PatchArrayString());
    }

    protected Builder(PatchArrayString instance) {
      this.instance = instance;
    }

    protected Builder copyOf(PatchArrayString value) { 
      this.instance.setOp(value.op);
      this.instance.setPath(value.path);
      this.instance.setValue(value.value);
      return this;
    }

    public Builder op(OpEnum op) {
      this.instance.op(op);
      return this;
    }
    
    public Builder path(String path) {
      this.instance.path(path);
      return this;
    }
    
    public Builder value(List<String> value) {
      this.instance.value(value);
      return this;
    }
    
    /**
    * returns a built PatchArrayString instance.
    *
    * The builder is not reusable (NullPointerException)
    */
    public PatchArrayString build() {
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

