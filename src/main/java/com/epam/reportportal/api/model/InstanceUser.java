package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * InstanceUser
 */
@Validated



public class InstanceUser extends User  {
  @JsonProperty("stats")
  private InstanceUserStats stats = null;

  public InstanceUser stats(InstanceUserStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public InstanceUserStats getStats() {
    return stats;
  }

  public void setStats(InstanceUserStats stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceUser instanceUser = (InstanceUser) o;
    return Objects.equals(this.stats, instanceUser.stats) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stats, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
