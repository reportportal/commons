package com.epam.reportportal.api.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
/**
* PatchOperation
*/
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = PatchObject.class, name = "PatchObject"),
  @JsonSubTypes.Type(value = PatchArrayString.class, name = "PatchArrayString"),
  @JsonSubTypes.Type(value = PatchString.class, name = "PatchString"),
  @JsonSubTypes.Type(value = PatchNumber.class, name = "PatchNumber"),
  @JsonSubTypes.Type(value = PatchInteger.class, name = "PatchInteger"),
  @JsonSubTypes.Type(value = PatchBoolean.class, name = "PatchBoolean")
})
public interface PatchOperation {

}
