package com.guru99.demo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(
        features = "src/test/resources/com.guru99.demo/features/RegistroDemo.feature",
        glue = "com.guru99.demo.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegistroRunnerDemo {

}
