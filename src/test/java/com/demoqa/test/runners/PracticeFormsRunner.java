package com.demoqa.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/practiceForms.feature",
        glue = "com.demoqa.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class PracticeFormsRunner {
}
