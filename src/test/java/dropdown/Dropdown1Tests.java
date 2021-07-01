package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Dropdown1Tests extends BaseTests {


    @Test

    public void testDropdown1 () {

        var dropDown1 = homePage.clickDropDown1();

        String option = "Option 1";

        dropDown1.selectFromDropDown(option);

        var selectedOptions = dropDown1.getSelectedOptions();

        assertEquals (selectedOptions.size(), 1, "Incorrect number of selections");

        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
