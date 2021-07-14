package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModalTests extends BaseTests {

    @Test

    public void testModals () {

        var clickModal = homePage.clickEntryAd();

        clickModal.clickCloseButton();

        clickModal.doubleClickHereButton1();

        String text = clickModal.getModalText();

        clickModal.clickCloseButton();

        assertEquals(text,"THIS IS A MODAL WINDOW", "The modal text incorrect");
    }
}
