package com.epam.reportportal.commons.template;

import static org.hamcrest.MatcherAssert.assertThat;

import com.google.common.collect.ImmutableMap;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

/**
 * @author Andrei Varabyeu
 */
public class TemplateEngineProviderTest {

  @Test
  public void testProvider() {
    final String res = new TemplateEngineProvider().get()
        .merge("template.ftl", ImmutableMap.builder().put("var", "hello world").build());
    assertThat(res, CoreMatchers.is("hello world"));
  }
}
