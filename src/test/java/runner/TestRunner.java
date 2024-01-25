package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/tsank/IntelliJ IDEA Community Edition 2023.1.2/TCasesSelenium/src/test/resources/CucumberReport/Login.feature",
        glue = {"stepDefinitions","helpers"},
        tags = {"@Smoke"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        monochrome = true


)
public class TestRunner {

}
