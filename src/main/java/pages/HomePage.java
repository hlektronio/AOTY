package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnGenres(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public GenresPage clickGenresPage(){
        clickOnGenres("Genres");
        return new GenresPage(driver);
    }

}

