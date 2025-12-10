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
        String option = "Keysight";
        var dropDownPage = homepage.clickDropdown();
        dropDownPage.selectFromDropDown(option);
        System.out.println(dropDownPage.getSelectedOption());
        assertEquals(dropDownPage.getSelectedOption() ,option);



    }

}
