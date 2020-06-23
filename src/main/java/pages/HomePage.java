package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    private By bestAlbums = By.linkText("Best Albums");
    private By newReleases = By.linkText("New Releases");
    private By lists = By.linkText("Lists");
    private By login = By.linkText("Sign In");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnMenuItem(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public GenresPage clickGenresPage() {
        clickOnMenuItem("Genres");
        return new GenresPage(driver);
    }

    public LoginPage clickLoginPage(){
        clickOnMenuItem("Sign In");
        return new LoginPage(driver);
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
    public String checkLoginLink() {
        return checkTopMenuLinks(login);
    }

//    public boolean checkSearchBox(){
//        return driver.findElement(searchbox).isDisplayed();
//    }
//
//    public boolean checkFooterSection(){
//        return driver.findElement(footer).isDisplayed();
//    }
}








