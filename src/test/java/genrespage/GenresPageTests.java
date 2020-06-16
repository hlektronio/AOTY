package genrespage;

import base.BaseTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.GenresPage;

import static org.testng.AssertJUnit.*;

public class GenresPageTests extends BaseTests {

    @Test
    public void clickOnGenreTest() {
        GenresPage genresPage = homePage.clickGenresPage();
        assertEquals("Page title is incorrect", "Music Genres", genresPage.getGenresPageTitle());
        var rightContent = driver.findElement(By.cssSelector(".rightContent"));
        assertEquals("Element is absent", true,rightContent.isDisplayed());
    }
}
