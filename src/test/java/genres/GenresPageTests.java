package genres;

import base.BaseTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.GenresPage;


import static org.testng.Assert.assertEquals;

public class GenresPageTests extends BaseTests {

    @Test
    public void clickOnGenreTest() {
        GenresPage genresPage = homePage.clickGenresPage();
        assertEquals(genresPage.getGenresPageTitle(),"Music Genres","Page title is incorrect");
        var rightContent = driver.findElement(By.cssSelector(".rightContent"));
        assertEquals(true,rightContent.isDisplayed(),"Element is absent");
    }
}
