package LogIn;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LogInTest extends BaseTest {
    @Test
    public void loginTest(){
     homepage.removePopUp();
        var account = homepage.clickLogin();
        String email = "emmyb0853@gmail.com";
        account.emailInputs(email);
        account.passwordInputs("emmyb0853");
        account.AccountLogIn();


        String actualMessage = account.getErrorMessage();
        String expectedMessage = "The password/email address combo is incorrect.";
        assertTrue(actualMessage.contains(expectedMessage), "Expected error message not displayed. Actual: " + actualMessage);


    }
}
