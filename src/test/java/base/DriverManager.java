package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

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
                ProfilesIni profile = new ProfilesIni();
                FirefoxProfile fxProfile = profile.getProfile("default");
                FirefoxOptions options = new FirefoxOptions();
//                options.setProfile(fxProfile);
                options.setHeadless(true);
                System.out.println("fxProfile" + fxProfile);
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default: throw new IllegalStateException("invalid browser name");
        }


        driver.manage().window().maximize();
        return driver;
    }
}
