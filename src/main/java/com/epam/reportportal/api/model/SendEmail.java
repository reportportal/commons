package com.epam.reportportal.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * This action sends an email notification to specified recipients.
 */
@Schema(description = "This action sends an email notification to specified recipients.")
@Validated



public class SendEmail   {
  @JsonProperty("send_email")
  private SendEmailSendEmail sendEmail = null;

  public SendEmail sendEmail(SendEmailSendEmail sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

  /**
   * Get sendEmail
   * @return sendEmail
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public SendEmailSendEmail getSendEmail() {
    return sendEmail;
  }

  public void setSendEmail(SendEmailSendEmail sendEmail) {
    this.sendEmail = sendEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEmail sendEmail = (SendEmail) o;
    return Objects.equals(this.sendEmail, sendEmail.sendEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmail {\n");
    
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
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