/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.model.integration.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

/**
 * @author <a href="mailto:ihar_kahadouski@epam.com">Ihar Kahadouski</a>
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAuthRQ {

  @NotNull
  private Boolean enabled;

  @NotEmpty
  @JsonProperty("integrationParameters")
  private Map<String, Object> integrationParams;

  @Override
  public String toString() {
    return "UpdateAuthRQ{" + "enabled=" + enabled + ", authParams=" + integrationParams + '}';
  }
}
