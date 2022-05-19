package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderConfirmPage extends BasePage {
    private final By orderSuccess = By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received");

    public OrderConfirmPage(WebDriver driver) {
        super(driver);
    }
    public String getSuccessoderMessage() {
        wait.until(ExpectedConditions.textToBe(orderSuccess, "Thank you. Your order has been received."));
        return driver.findElement(orderSuccess).getText();

    }
}
