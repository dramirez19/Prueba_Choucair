package com.choucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/choucair/stepdefinitions",
        features = "src/test/resources/com.choucair.features/meeting.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class newMeeting {
}
