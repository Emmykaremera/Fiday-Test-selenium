package dropdown;

import base.BaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTest extends BaseTest {
    @Test
    public void testSelectedOption(){
        homepage.removePopUp();
        var dropDownPage = homepage.clickDropdown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 0, "Incorrect number of selected option!");
        assertTrue(selectedOptions.contains(option), " Option not selected");


    }

}
