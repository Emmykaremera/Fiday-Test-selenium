package createAccount;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import pages.HomePage;

import java.awt.image.BaseMultiResolutionImage;

import static org.junit.Assert.assertTrue;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createAccountTest() {
        homepage.removePopUp();
        var createAccount = homepage.clickCreateAccountButton();

        String email = "emmyb0853@gmail.com";

        createAccount.firstNameInputs("Emmy");
        createAccount.lastNameInputs("Byiringiro");
        createAccount.emailInputs(email);
        createAccount.phoneInput("0791376494");
        createAccount.clickCreateAccountButton();

        String actualMessage = createAccount.getConfirm();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains("Check your email"));

    }
}
