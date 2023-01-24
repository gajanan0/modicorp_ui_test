package stepdefs;

import Context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.datatype.Duration;
import java.nio.file.Files;
import java.util.Properties;

    public class Hooks {

        WebDriver driver;
        TestContext testContext;

        public Hooks(TestContext context) {
            testContext = context;
        }
        @Before
        public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        driver = testContext.getWebDriverManager().getDriver();
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
        }

        @After
        public void afterScenario(){
            System.out.println("This will run after the Scenario");
            driver.quit();
            testContext.getWebDriverManager().closeDriver();
        }

}
