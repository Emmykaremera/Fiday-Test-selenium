package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {
    @Test
    public void testCancleAlert(){
        homepage.removePopUp();
        homepage.clickAlerts();
//        var alertsPage =
//        alertsPage.triggerAlert();
//        alertsPage.alert_clickToDismiss();
//
//        String resultMessage = alertsPage.getResultText();

//        assertEquals(resultMessage, "You successfully clicked an alert", "Message after canceling alert is incorrect");

    }
}
