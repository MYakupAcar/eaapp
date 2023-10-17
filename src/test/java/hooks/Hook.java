package hooks;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.Driver;

public class Hook {

    @Before()
    public void setUp() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("homePage"));
    }

    @After()
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}