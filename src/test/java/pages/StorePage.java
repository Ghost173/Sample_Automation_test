package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage extends BasePage {

    private final By searchFld  = By.ById.cssSelector("#woocommerce-product-search-field-0");
    private final By searchBtn  = By.cssSelector("#woocommerce_product_search-1 > form > button");
    private final By title = By.xpath("//*[@id=\"main\"]/div/header/h1");
    private final By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
    private final By clickViewCartlbl = By.cssSelector("a[title='View cart']");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage enterTextInSearchFlt (String txt) {
        driver.findElement(searchFld).sendKeys(txt);
        return this;
    }

    public StorePage ClickSearchBtn () {
        driver.findElement(searchBtn).click();
        return this;
    }

    public String getSearchTitle() {
         wait.until(ExpectedConditions.textToBe(title, "Search results: “blue”"));
        return  driver.findElement(title).getText();
    }

    public StorePage clickAddToCartBtn() {
        driver.findElement(addToCartBtn).click();
        return this;
    }

    public CartPage clickViewCartLbl() {
        wait.until(ExpectedConditions.elementToBeClickable(clickViewCartlbl));
        driver.findElement(clickViewCartlbl).click();
        return new CartPage(driver);
    }
}
