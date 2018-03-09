package com.adidas.app.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdidasProductDetailsPage extends PageObject {

    public AdidasProductDetailsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    WebElement productImage;
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

    public WebElement ProductImage(){
        productImage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class*='glass_image_viewer___']")));
        return productImage;
    }
}
