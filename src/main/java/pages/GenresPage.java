package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class GenresPage {

    private WebDriver driver;
    private By headline = By.xpath("//*[@id=\"centerContent\"]/div/div[1]/h1");
    private By grunge = By.cssSelector("#centerContent > div > div.rightContent > div:nth-child(2) > " +
            "div:nth-child(2) > div:nth-child(133) > a");
    private By garage = By.cssSelector("#centerContent > div > div.rightContent > " +
            "div:nth-child(2) > div:nth-child(2) > div:nth-child(121) > a");


    public GenresPage(WebDriver driver){
        this.driver = driver;
    }

    public GarageRockPage clickGarageRockGenre(){

        WebElement garageLink = driver.findElement(grunge);
        Actions actions = new Actions(driver);
        actions.moveToElement(garageLink);
        actions.perform();
        driver.findElement(garage).click();
        return new GarageRockPage(driver);

    }

    public String getGenresPageTitle(){
        return driver.findElement(headline).getText();
    }





}
