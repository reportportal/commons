package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * PatchBoolean
 */
@Validated



public class PatchBoolean  implements PatchOperation {
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("op")
  private OpEnum op = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("value")
  private Boolean value = null;

  public PatchBoolean op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
   **/
  @Schema(description = "")
      @NotNull

    public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public PatchBoolean path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @Schema(description = "")
      @NotNull

    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PatchBoolean value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
      @NotNull

    public Boolean isValue() {
    return value;
  }

  public void setValue(Boolean value) {
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
    PatchBoolean patchBoolean = (PatchBoolean) o;
    return Objects.equals(this.op, patchBoolean.op) &&
        Objects.equals(this.path, patchBoolean.path) &&
        Objects.equals(this.value, patchBoolean.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchBoolean {\n");
    
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
}
