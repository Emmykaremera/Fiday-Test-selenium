package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class HoverTests extends BaseTest {
    @Test
    public void testHover(){
        homepage.removePopUp();
        homepage.clickHovers(1);

    }
}
