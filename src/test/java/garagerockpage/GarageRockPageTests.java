package garagerockpage;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.GarageRockPage;

import static org.testng.Assert.assertEquals;

public class GarageRockPageTests extends BaseTests {

    @Test
    public void testClickOnGarageRockLink(){
        GarageRockPage garageRockPage = homePage.clickGenresPage().clickGarageRockGenre();
        assertEquals(garageRockPage.getPageTitle(),"Garage Rock","Page title is incorrect");

    }
}
