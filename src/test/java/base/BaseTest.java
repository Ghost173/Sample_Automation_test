package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public WebDriver startDriver(String browser) {
        driver = new DriverManager().initializeDriver(browser);
        return driver;
    }


    @AfterMethod
    public void quitDriver() {
        driver.quit();
    }
}
