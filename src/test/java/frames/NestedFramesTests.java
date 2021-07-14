package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test

    public void testNestedFrames () {

        var clickFrames = homePage.clickFrames();

        var clickNestedFrames = clickFrames.clickNestedFrames();

        assertEquals (clickNestedFrames.getTextFromLeftFrames(), "LEFT", "The text is incorrect");
        assertEquals (clickNestedFrames.getTextFromBottomFrames(), "BOTTOM", "The text is incorrect");
    }
}
