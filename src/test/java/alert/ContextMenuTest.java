package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {



    @Test

    public void testContextMenu () {

        var contextMenu = homePage.clickContextMenu();

        contextMenu.moverToBox();
        String text = contextMenu.alert_getText();
        contextMenu.alert_clickToAccept();

        assertEquals(text, "You selected a context menu", "Alert text is incorrect");

    }
}
