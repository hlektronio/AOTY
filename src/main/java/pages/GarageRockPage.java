package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GarageRockPage {

    WebDriver driver;
    private By headline = By.cssSelector(".headline");



    public GarageRockPage(WebDriver driver){
        this.driver = driver;
    }

    public String getPageHeadline(){
        return driver.findElement(headline).getText();

    }


}

