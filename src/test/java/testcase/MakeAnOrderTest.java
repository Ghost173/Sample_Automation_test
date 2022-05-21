package testcase;

import base.BaseTest;
import objects.BillingDeatils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.JacksonUtils;

import java.io.IOException;
import java.io.InputStream;

public class MakeAnOrderTest extends BaseTest {

//    @Test
//    public void makeAnOderFromStorePage() throws InterruptedException{
//        BillingDeatils billingDeatils = new BillingDeatils();
//        billingDeatils.setFirstname("demoauto");
//        billingDeatils.setLastname("Demo user last");
//        billingDeatils.setComapnyname("demo company");
//        billingDeatils.setCountry("United States (US)");
//        billingDeatils.setAddresslineone("124/4 A dummy lane");
//        billingDeatils.setCity("Newbie");
//        billingDeatils.setState("Alabama");
//        billingDeatils.setPostcode("00600");
//        billingDeatils.setPhone("321456987");
//        billingDeatils.setEmail("ghost173@mail.com");
//
//        HomaPage homePage = new HomaPage(driver).load();
//        StorePage storepage = homePage.clickStoreMenuLink();
//        Thread.sleep(300);
//        storepage.enterTextInSearchFlt("blue")
//                .ClickSearchBtn();
//        Assert.assertEquals( storepage.getSearchTitle(), "Search results: “blue”");
//        storepage.clickAddToCartBtn();
//        CartPage cartPage = storepage.clickViewCartLbl();
//        CheckoutPage checkoutPage = cartPage.clickcheckoutBtn();
//        checkoutPage.billingDetails(billingDeatils);
//        OrderConfirmPage orderConfirmPage = checkoutPage.clickPlaceoderBtn();
//        Assert.assertEquals(
//                orderConfirmPage.getSuccessoderMessage(),
//                "Thank you. Your order has been received."
//        );
//
//    }


}
