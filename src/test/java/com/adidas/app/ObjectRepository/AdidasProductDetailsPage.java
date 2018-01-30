package com.adidas.app.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdidasProductDetailsPage extends PageObject {

    public AdidasProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div[class*='glass_image_viewer___']")
    public WebElement productImage;
    @FindBy(css = "[class*='order_information___']")
    public WebElement orderInformation;
    @FindBy(css = "[class*='product_information___']")
    public WebElement productInformation;
    @FindBy(css = "[class='price-big']")
    public WebElement priceBig;
    @FindBy(css = "[data-auto-id='add-to-bag']")
    public WebElement addToBag;
    @FindBy(css = "div[class *=apparel-description-stack-test-condensed-hide]")
    public WebElement pdpDescription;
}
