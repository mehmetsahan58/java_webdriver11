package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test

    public void testHorizontalSlider () {

        var horizontalSliderPage = homePage.clickHorizontalSlider();

        horizontalSliderPage.clickAndHoldAndMoveSlide("2");

        assertEquals(horizontalSliderPage.getSlideValue(), "2", "The value is incorrect");
    }
}
