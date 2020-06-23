package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    private By headline = By.cssSelector("div > h1");
    private By loginContainer = By.cssSelector("div.loginContainer");
    private By facebookButton = By.cssSelector("div.loginButton.facebook");
    private By googleButton = By.cssSelector("div.loginButton.google");


    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    public String checkHeadline(){
        return driver.findElement(headline).getText();
    }

    public boolean checkLoginContainer(){
        return driver.findElement(loginContainer).isDisplayed();
    }

    public boolean checkFacebookLoginButton(){
        return driver.findElement(facebookButton).isDisplayed();
    }

    public boolean checkGoogleLoginButton(){
        return driver.findElement(googleButton).isDisplayed();
    }

}
