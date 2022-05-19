package normal;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basictest extends BaseTest {

    @Test
    public void dummytest() throws InterruptedException{
        driver.get("https://askomdch.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("blue");
        driver.findElement(By.cssSelector("#woocommerce_product_search-1 > form > button")).click();
        Thread.sleep(5000);
        Assert.assertEquals(
                driver.findElement(By.xpath("//h1[contains(text(),'Search results: “blue”')]")).getText(),
                "Search results: “blue”"
        );
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='Proceed to checkout']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("billing_first_name")).sendKeys("ghostdemo");
        driver.findElement(By.id("billing_last_name")).sendKeys("rider");
        driver.findElement(By.id("billing_company")).sendKeys("cmpy dev");
        driver.findElement(By.id("billing_address_1")).sendKeys("14/1 2A cross street");
        driver.findElement(By.id("billing_city")).sendKeys("home town city");
        driver.findElement(By.id("billing_postcode")).sendKeys("00600");
        driver.findElement(By.id("billing_phone")).sendKeys("321456987");
        driver.findElement(By.id("billing_email")).sendKeys("ghost173@mail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("place_order")).click();
        Thread.sleep(3000);
        Assert.assertEquals(
                driver.findElement(By.cssSelector(".woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")).getText(),
                "Thank you. Your order has been received."
        );

    }
}
