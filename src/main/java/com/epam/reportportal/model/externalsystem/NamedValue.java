package com.epam.reportportal.model.externalsystem;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Represents value that consists of id for making request and human readable name
 */
@Data
@NoArgsConstructor
public class NamedValue implements Serializable {

  private Long id;
  private String name;
}
