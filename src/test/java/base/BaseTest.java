package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    private ThreadLocal <WebDriver> driver = new ThreadLocal<>();

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    public WebDriver getDriver() {
        return this.driver.get();
    }

    @Parameters("browser")
    @BeforeMethod
    public void startDriver(String browser) {

        setDriver(new DriverManager().initializeDriver(browser));
        System.out.println("CURRENT THREAD: " + Thread.currentThread().getId()+ ", " + "DRIVER = " + getDriver());

    }


    @AfterMethod
    public void quitDriver() {
        System.out.println("CURRENT THREAD: " + Thread.currentThread().getId()+ ", " + "DRIVER = " + getDriver());
        getDriver().quit();
    }
}
