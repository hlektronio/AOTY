package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    private By bestAlbums = By.linkText("Best Albums");
    private By newReleases = By.linkText("New Releases");
    private By lists = By.linkText("Lists");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnGenres(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public GenresPage clickGenresPage() {
        clickOnGenres("Genres");
        return new GenresPage(driver);
    }

    private String checkTopMenuLinks(By menuItem) {
        return driver.findElement(menuItem).getText();
    }

    public String checkBestAlbumsLink() {
        return checkTopMenuLinks(bestAlbums);
    }

    public String checkNewReleasesLink() {
        return checkTopMenuLinks(newReleases);
    }

    public String checkListsLink() {
        return checkTopMenuLinks(lists);
    }
}








