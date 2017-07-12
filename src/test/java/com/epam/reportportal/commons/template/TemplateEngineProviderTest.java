package com.epam.reportportal.commons.template;

import com.google.common.collect.ImmutableMap;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Andrei Varabyeu
 */
public class TemplateEngineProviderTest {

    @Test
    public void testProvider() {
        final String res = new TemplateEngineProvider().get()
                .merge("template.ftl", ImmutableMap.builder().put("var", "hello world").build());
        Assert.assertThat(res, CoreMatchers.is("hello world"));
    }
}
