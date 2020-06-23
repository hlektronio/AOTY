package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPageTests extends BaseTests {

    @Test
    public void checkLoginPageHeadline(){
        LoginPage loginPage = homePage.clickLoginPage();
        assertEquals(loginPage.checkHeadline(),"Sign In / Create Account","Login page headline is incorrect");
    }

    @Test
    public void checkLoginOptionsContainer(){
        LoginPage loginPage = homePage.clickLoginPage();
        assertTrue(loginPage.checkLoginContainer());
        assertTrue(loginPage.checkFacebookLoginButton());
        assertTrue(loginPage.checkGoogleLoginButton());
    }


    @Test
    public void checkSearchbox(){
        assertTrue(checkSearchBox());
    }

    @Test
    public void checkFooter(){
        assertTrue(checkFooterSection());
    }
}
