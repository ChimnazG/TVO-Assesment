package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        monochrome = true,
        publish=true,
        features = "src/test/resources/features",
        glue = "stepDefinions",
        tags = "@TVO",
        dryRun = false
)
public class Runner {


}
