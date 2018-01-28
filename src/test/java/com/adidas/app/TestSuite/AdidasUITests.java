package com.adidas.app.TestSuite;

import com.adidas.app.ObjectRepository.AdidasProductDetailsPage;
import com.adidas.app.ObjectRepository.FunctionalTest;
import org.testng.annotations.Test;
import com.adidas.app.ObjectRepository.AdidasHomePage;
import org.testng.Assert;

public class AdidasUITests extends FunctionalTest {
//    WebDriver driver;
//    String chromeNodeUrl;
//    String firefoxNodeUrl;

//    log.info(System.getProperty('webdriver.chrome.driver'))
//    @BeforeTest
//    public void SetUp() throws MalformedURLException {
//        chromeNodeUrl = "http://172.17.0.3:5555/wd/hub";
//        firefoxNodeUrl = "http://172.17.0.4:5555/wd/hub";
//
//       DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setBrowserName("firefox");
//        capabilities.setPlatform(Platform.LINUX);
//
//        driver = new RemoteWebDriver(new URL(firefoxNodeUrl),capabilities);
//
//    }

    @Test
    public void OpenHomePage() {
        AdidasHomePage home = new AdidasHomePage(driver);
        Assert.assertTrue(home.header.isDisplayed(),"Header is not found");
        Assert.assertEquals(home.getUpperMenuItems.size(), 4);
        Assert.assertTrue(home.logo.isDisplayed(),"Logo is not found");
        Assert.assertTrue(home.mainMenu.isDisplayed(),"Main menu is not found");
        Assert.assertEquals(home.getMainMenuItems.size(),6,"Missing menu item");
        Assert.assertTrue(home.searchBox.isDisplayed());
        Assert.assertTrue(home.shoppingCart.isDisplayed());

        Assert.assertTrue(home.mainCarousel.isDisplayed(),"Main carousel is not found");
        Assert.assertTrue(home.getTeasers.size()>0, "Teasers should have at least 1 item");
        Assert.assertTrue(home.itemsBestOfAdidas.size()>0, "Best Of Adidas should have at least 1 item");

        Assert.assertEquals(home.joinAdidas.getText(),"JOIN US & GET A SPECIAL WELCOME GIFT");
        Assert.assertTrue(home.emailSubmit.isDisplayed(),"Send email box is not found");
    }

    @Test
    public void ProductDetailsPage() {
        AdidasHomePage home = new AdidasHomePage(driver);
        AdidasProductDetailsPage pdp = home.NavigateToGallery();
        Assert.assertTrue(pdp.productImage.isDisplayed(), "Product main image is not found");
        Assert.assertTrue(pdp.orderInformation.isDisplayed(),"");
        Assert.assertTrue(pdp.productInformation.isDisplayed());
        Assert.assertTrue(pdp.priceBig.isDisplayed());
        Assert.assertTrue(pdp.addToBag.isDisplayed());
        Assert.assertTrue(pdp.pdpDescription.isDisplayed());
    }

    @Test
    public void FavoritesPage() {
        AdidasHomePage home = new AdidasHomePage(driver);

    }
}
