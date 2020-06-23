package garagerock;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.GarageRockPage;

import static org.testng.Assert.assertEquals;

public class GarageRockPageTests extends BaseTests {

    @Test
    public void testClickOnGarageRockLink(){
        GarageRockPage garageRockPage = homePage.clickGenresPage().clickGarageRockGenre();
        assertEquals(garageRockPage.getPageHeadline(),"Garage Rock","Page headline is incorrect");

    }
}
