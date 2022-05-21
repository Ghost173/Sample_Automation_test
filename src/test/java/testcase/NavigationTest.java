package testcase;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class NavigationTest extends BaseTest {

    @Test
    public void naviageStorepageFromHome() {
        StorePage storePage =new StorePage(driver);
        storePage.load();
    }
}
