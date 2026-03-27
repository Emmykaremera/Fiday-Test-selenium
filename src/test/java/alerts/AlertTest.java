package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals; // Often better than just assertTrue for text comparison

public class AlertTest extends BaseTest {
    @Test
    public void testCancleAlert(){
        homepage.removePopUp();
        var alertsPage = homepage.clickAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToDismiss();

        String resultMessage = alertsPage.getResultText();

        assertEquals(resultMessage, "You successfully clicked an alert", "Message after canceling alert is incorrect");

    }
}
