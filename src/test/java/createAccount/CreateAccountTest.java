package createAccount;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import java.awt.image.BaseMultiResolutionImage;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() {
        homepage.removePopUp();
        var joinpage = homepage.clickJoinUsLink();
        var createAccount = homepage.clickCreateAccountButton();
        createAccount.setFirstName("Emmy");
        createAccount.setLastName("Byiringiro");
        createAccount.setEmail("emmyb0853@gmail.com");
        createAccount.setPhoneNumber("0791376494");
        createAccount.clickCreateButton();

    }
}
