package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private final By clickCheckoutBtn = By.xpath("//a[normalize-space()='Proceed to checkout']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage clickcheckoutBtn() {
        driver.findElement(clickCheckoutBtn).click();
        return  new CheckoutPage(driver);
    }
}
