package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {


    public WebDriver initializeDriver(String browser) {
        WebDriver driver;

        String localbrowser = System.getProperty("browser");

        switch (browser) {
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default: throw new IllegalStateException("invalid browser name");
        }

        driver.manage().window().maximize();
        return driver;
    }
}
