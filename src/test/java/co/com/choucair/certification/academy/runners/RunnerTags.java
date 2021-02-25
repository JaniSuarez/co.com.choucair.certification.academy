package co.com.choucair.certification.academy.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/academyChoucair.feature",
        tags="@stories",
        glue="co.com.choucair.certification.academy.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class RunnerTags {
}
