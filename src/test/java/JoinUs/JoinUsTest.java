package JoinUs;

import base.BaseTest;
import org.testng.annotations.Test;

public class JoinUsTest extends BaseTest {
    @Test
    public void testJoinUs(){
     homepage.removePopUp();
        var joinPage = homepage.clickJoinUsLink();
    }
}
