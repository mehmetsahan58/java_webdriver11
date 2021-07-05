package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {

    @Test

    public void testBackspace () {

        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("Mehmett"+ Keys.BACK_SPACE);
        assertEquals (keyPage.getResult(), "You entered: BACK_SPACE" ,"Text is incorrect");


    }

    @Test

    public void testDifferentKeys () {

        var keyPage = homePage.clickKeyPresses();
        keyPage.enterDifferentKeys();
        //assertEquals (keyPage.getResult(), "You entered: BACK_SPACE" ,"Text is incorrect");
    }
}
