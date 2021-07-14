package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test

    public void testFrames () {

        var editorPage = homePage.clickWYSIWYGEditor();

        editorPage.clearTextArea();
        String text1 = "Hello ";
        String text2 = "World!";

        editorPage.setTextArea(text1);
        editorPage.setTextArea(text2);

        editorPage.decreaseIndention();

        assertEquals (editorPage.getTextFromEditArea(), text1 + text2 , "Editor text is incorrect");

    }
}
