package com.adidas.app.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AdidasHomePage extends BasePage {
    @FindBy(css = "[data-auto-id*='header-']")
    public WebElement header;
    @FindBy(css = "[data-auto-id *='glass-header-top']")
    WebElement upperMenu;
    public List<WebElement> getUpperMenuItems = upperMenu.findElements(By.tagName("a"));
    @FindBy(css = "[data-auto-id ='logo']")
    public WebElement logo;
    @FindBy(css = "[data-auto-id = 'main-menu']")
    public WebElement mainMenu;
    public List<WebElement> getMainMenuItems = mainMenu.findElements(By.cssSelector("div[data-auto-id='glass-navigation-flyout']"));

//    @FindBy(css = "[class *='glass-search_']")
    List<WebElement> searchBoxes;
//    @FindBy(css = "[class *= 'header_cart_link___']")
    List<WebElement> shoppingCarts;

    @FindBy(css = "div[data-auto-id='homepage']")
    WebElement homeBody;
    public WebElement mainCarousel = homeBody.findElement(By.cssSelector("div[data-auto-id='carousel-slider']"));
    private WebElement teasers = homeBody.findElements(By.cssSelector("div[class=stack]")).get(0);
    public List<WebElement> getTeasers = teasers.findElements(By.cssSelector("div[class*='teaser_container_']"));
    private WebElement bestOfAdidas = homeBody.findElement(By.xpath("//div[@data-auto-id='homepage']/div/div[3]"));
    public List<WebElement> itemsBestOfAdidas = bestOfAdidas.findElements(By.cssSelector("div[class *= 'item_wrapper___']"));
    public List<WebElement> emptyHeartIcons = bestOfAdidas.findElements(By.cssSelector("[class *= 'toggle_wishlist_button___']"));

    @FindBy(css = "form[action ='/on/demandware.store/Sites-adidas-FI-Site/fi_FI/Newsletter-Subscribe']")
    WebElement formNewsletter;
    public WebElement joinAdidas = formNewsletter.findElements(By.cssSelector("div[class = 'col-l-12 col-s-12 no-gutters']")).get(0);
    public WebElement emailSubmit = formNewsletter.findElement(By.cssSelector("[type='email']"));
    List<WebElement> wishlistHearts;

    public AdidasHomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public AdidasProductDetailsPage NavigateToGallery() {
        itemsBestOfAdidas.get(0).click();
        return new AdidasProductDetailsPage(driver,wait);
    }

    public WebElement WishListHeart() {
        wishlistHearts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div[class*='wishlist_icon_container___']")));
        return wishlistHearts.get(1);
    }

    public WebElement SearchBox() {
        searchBoxes = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[class *='glass-search_']")));
        return searchBoxes.get(1);
    }

    public WebElement ShoppingCart() {
        shoppingCarts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[class *= 'header_cart_link___']")));
        return shoppingCarts.get(1);
    }

}
