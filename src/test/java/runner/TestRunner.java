package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"src/test/resources/CucumberReport/Login.feature"},
        glue = {"stepDefinitions","helpers"},
        tags = {"@Smoke"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true


)
public class TestRunner {

}
