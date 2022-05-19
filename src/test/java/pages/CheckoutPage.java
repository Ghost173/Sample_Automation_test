package pages;

import base.BasePage;
import objects.BillingDeatils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CheckoutPage extends BasePage {

    private final By firstname = By.id("billing_first_name");
    private final By lastname = By.id("billing_last_name");
    private final By comapnyname = By.id("billing_company");
    private final By addresslineone = By.id("billing_address_1");
    private final By city = By.id("billing_city");
    private final By postcode = By.id("billing_postcode");
    private final By phone = By.id("billing_phone");
    private final By email = By.id("billing_email");
    private final By placeorderbtn = By.id("place_order");
    private final By overlay = By.cssSelector(".blockUI.blockOverlay");

    private final By countryDropdown = By.id("billing_country");
    private final By billingState = By.id("billing_state");
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterfristName(String txt) {
        driver.findElement(firstname).sendKeys(txt);
        return this;
    }

    public CheckoutPage enterlastname(String txt) {
        driver.findElement(lastname).sendKeys(txt);
        return this;
    }

    public CheckoutPage enterComanyName(String txt) {
        driver.findElement(comapnyname).sendKeys(txt);
        return this;
    }

    public CheckoutPage selectCountry(String country) {
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(country);
        return this;
    }

    public CheckoutPage enterAddressLineOne(String txt) {
        driver.findElement(addresslineone).sendKeys(txt);
        return this;
    }

    public CheckoutPage enterCity(String txt) {
        driver.findElement(city).sendKeys(txt);
        return this;
    }

    public CheckoutPage selectSate(String state) {
        waitForOverlayDisapper(overlay);
        Select select = new Select(driver.findElement(billingState));
        select.selectByVisibleText(state);
        return this;
    }

    public CheckoutPage enterPostCode(String txt) {
        driver.findElement(postcode).sendKeys(txt);
        return this;
    }

    public CheckoutPage enterPhoneNumber(String txt) {
        driver.findElement(phone).sendKeys(txt);
        return this;
    }

    public CheckoutPage enterEmail(String txt) {
        driver.findElement(email).sendKeys(txt);
        return this;
    }

    public CheckoutPage billingDetails(BillingDeatils billingDeatils) {
       return enterfristName(billingDeatils.getFirstname())
        .enterlastname(billingDeatils.getLastname())
                .enterComanyName(billingDeatils.getComapnyname())
                .selectCountry(billingDeatils.getCountry())
                .enterAddressLineOne(billingDeatils.getAddresslineone())
                .enterCity(billingDeatils.getCity())
                .selectSate(billingDeatils.getState())
                .enterPostCode(billingDeatils.getPostcode())
                .enterPhoneNumber(billingDeatils.getPhone())
                .enterEmail(billingDeatils.getEmail());
    }

    public OrderConfirmPage clickPlaceoderBtn() {
        waitForOverlayDisapper(overlay);
        driver.findElement(placeorderbtn).click();
        return new OrderConfirmPage(driver);
    }

}
