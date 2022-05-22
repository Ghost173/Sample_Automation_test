package testcase;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.StorePage;

public class NavigationTest extends BaseTest {

    @Test
    public void naviageStorepageFromHome() {
        StorePage storePage =new StorePage(getDriver());
        storePage.load();
    }

    @Test
    public void naviageStorepageFromHome2() {
        StorePage storePage =new StorePage(getDriver());
        storePage.load();
    }
    @Test
    public void naviageStorepageFromHome3() {
        StorePage storePage =new StorePage(getDriver());
        storePage.load();
    }

}
