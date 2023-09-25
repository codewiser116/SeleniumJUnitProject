package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.AboutStorePage;
import pages.CommonPage;
import pages.DeliveryPage;
import utilities.Driver;

public class VerifyTabsTests {

    WebDriver driver;

    @Test
    public void verifyAboutAndDeliveryTabs(){
        /*
        1. go to https://gadgetarium.us/
        2. click on "About Store"
        3. verify the url contains "about"
        4. verify "Shop Gadgetarium" text is present
        5. click on "Delivery"
        6. verify the url contains "delivery"
        7. verify "Pickup from the warehouse" text is present
         */

        driver = Driver.getDriver();
        driver.get("https://gadgetarium.us/");

        CommonPage commonPage = new CommonPage();
        AboutStorePage aboutStorePage = new AboutStorePage();
        DeliveryPage deliveryPage = new DeliveryPage();

        commonPage.aboutStoreTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("about"));
        Assert.assertEquals(aboutStorePage.shopGadgetarium.getText(), "Shop Gadgetarium");

        commonPage.deliveryTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("delivery"));
        Assert.assertEquals(deliveryPage.pickupFromWarehouse.getText(), "Pickup from the warehouse");
    }




}
