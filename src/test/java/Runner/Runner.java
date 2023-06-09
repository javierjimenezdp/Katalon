package Runner;

import Reports.Reports;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = "StepDefinitions",
        tags = "@Scenario1",
        snippets = SnippetType.CAMELCASE
)
public class Runner {

}