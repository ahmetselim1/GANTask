package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinitions"},
        tags = "@smoke",
        strict = true,
      plugin={"pretty", "html:target/HtmlReports"}
//      plugin={"pretty", "json:target/JSONReports/report.json"}
//      plugin = {"pretty", "junit:target/JUnitReports/report.xml"}

)
public class CukesRunner {

    @BeforeClass
    public static void beforeTestSuiteActions() {
        System.out.println("Setting up the web driver.....");
        if (System.getProperty("driver") == null)
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        BaseDriver.initializeDriver("chrome");
    }


    @AfterClass
    public static void afterTestSuiteActions() {
        BaseDriver.driver.quit();
    }
}
