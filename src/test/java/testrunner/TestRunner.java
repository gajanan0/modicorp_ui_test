package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/Destination"},
        features = {"src/test/resources/Features"},
        glue={"stepdefs"}
)

public class TestRunner {

}
