package com.epam.reportportal.api.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* SettingsSettingNameBody
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = OrganizationRetentionPolicy.class, name = "OrganizationRetentionPolicy"),
  @JsonSubTypes.Type(value = OrganizationNotificationPolicy.class, name = "OrganizationNotificationPolicy")
})
public interface SettingsSettingNameBody {

}