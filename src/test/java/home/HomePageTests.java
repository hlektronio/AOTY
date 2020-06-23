package home;


import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class HomePageTests extends BaseTests {


    @Test
    public void checkTopMenuItems(){
        assertEquals(homePage.checkBestAlbumsLink(),"Best Albums","Best Albums link is incorrect");
        assertEquals(homePage.checkListsLink(),"Lists","Lists link is incorrect");
        assertEquals(homePage.checkNewReleasesLink(), "New Releases","New Releases link is incorrect");
    }

}
