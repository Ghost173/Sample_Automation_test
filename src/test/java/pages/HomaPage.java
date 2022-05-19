package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomaPage extends BasePage {

    private final By storeMenuLink = By.cssSelector("#menu-item-1227 > a");

    public HomaPage(WebDriver driver) {
        super(driver);
    }

    public HomaPage load() {
        load("/");
        return this;
    }

    public StorePage clickStoreMenuLink() {
        driver.findElement(storeMenuLink).click();
        return new StorePage(driver);
    }
}
