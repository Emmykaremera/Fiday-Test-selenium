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
        var hoversPage = homepage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue("Caption not displayed", caption.isCaptionDisplayed());
        assertEquals(caption.getLinkText(), "ZOMBIE IPSUM");
    }
}
