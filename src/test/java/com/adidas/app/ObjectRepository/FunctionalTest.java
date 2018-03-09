package com.adidas.app.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) {
        switch (browser) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.get("https://www.adidas.fi");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,3);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @AfterTest
    public void AfterTest(){
        driver.quit();
    }

}
