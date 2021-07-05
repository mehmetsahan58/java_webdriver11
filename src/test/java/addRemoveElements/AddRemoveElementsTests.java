package addRemoveElements;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTests extends BaseTests {


    @Test

    public void testAddRemoveButtons () {

        var addRemove = homePage.clickAddRemoveElements();

        addRemove.clickAddElement();
        assertEquals (addRemove.getDeleteButton(), "Delete", "Incorrect button");

        addRemove.clickDeleteButton();

    }
}
