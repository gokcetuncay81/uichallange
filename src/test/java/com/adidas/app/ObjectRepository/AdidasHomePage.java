package com.adidas.app.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AdidasHomePage extends PageObject {
    @FindBy(css = "[data-auto-id*='header-']")
    public WebElement header;
    @FindBy(css = "[data-auto-id *='glass-header-top']")
    private WebElement upperMenu;
    public List<WebElement> getUpperMenuItems = upperMenu.findElements(By.tagName("a"));
    @FindBy(css = "[data-auto-id ='logo']")
    public WebElement logo;
    @FindBy(css = "[data-auto-id = 'main-menu']")
    public WebElement mainMenu;
    public List<WebElement> getMainMenuItems = mainMenu.findElements(By.cssSelector("div[data-auto-id='glass-navigation-flyout']"));
    @FindBy(css = "[data-auto-id = 'glass-search']")
    public WebElement searchBox;
    @FindBy(css = "[class *= 'header_cart_link___']")
    public WebElement shoppingCart;

    @FindBy(css = "div[data-auto-id='homepage']")
    private WebElement homeBody;
    public WebElement mainCarousel = homeBody.findElement(By.cssSelector("div[data-auto-id='carousel-slider']"));
    private WebElement teasers = homeBody.findElements(By.cssSelector("div[class=stack]")).get(0);
    public List<WebElement> getTeasers = teasers.findElements(By.cssSelector("div[class*='teaser_container_']"));
    private WebElement bestOfAdidas = homeBody.findElement(By.xpath("//div[@data-auto-id='homepage']/div/div[3]"));
    public List<WebElement> itemsBestOfAdidas = bestOfAdidas.findElements(By.cssSelector("div[class *= 'item_wrapper___']"));

    @FindBy(css = "form[action ='/on/demandware.store/Sites-adidas-FI-Site/fi_FI/Newsletter-Subscribe']")
    WebElement formNewsletter;
    public WebElement joinAdidas = formNewsletter.findElements(By.cssSelector("div[class = 'col-l-12 col-s-12 no-gutters']")).get(0);
    public WebElement emailSubmit = formNewsletter.findElement(By.cssSelector("[type='email']"));

    public AdidasHomePage(WebDriver driver){
        super(driver);
    }

    public AdidasProductDetailsPage NavigateToGallery() {
        itemsBestOfAdidas.get(0).click();
        return new AdidasProductDetailsPage(driver);
    }
}
