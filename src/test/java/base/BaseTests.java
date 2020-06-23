package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class BaseTests {

    protected WebDriver driver;
    protected HomePage homePage;
    protected By searchbox = By.id("searchContainer");
    protected By footer = By.cssSelector("div.footerContent");

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.albumoftheyear.org/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


    public boolean checkSearchBox(){
        return driver.findElement(searchbox).isDisplayed();
    }

    public boolean checkFooterSection(){
        return driver.findElement(footer).isDisplayed();
    }
    }





