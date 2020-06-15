package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class GenresPage {

    private WebDriver driver;
    private By headline = By.xpath("//*[@id=\"centerContent\"]/div/div[1]/h1");
    private By garage = By.linkText("Garage Rock");


    public GenresPage(WebDriver driver){
        this.driver = driver;
    }

    public GarageRockPage clickGarageRockGenre(){
        WebElement garageLink = driver.findElement(garage);
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
