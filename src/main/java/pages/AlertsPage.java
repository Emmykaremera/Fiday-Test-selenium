package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    public By triggerAlertButton = By.cssSelector("a[data-ux='Link']");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

        public void triggerAlert(){
            driver.findElement(triggerAlertButton).click();
        }

    public String getResultText() {
        return driver.findElement(triggerAlertButton).getText();
    }

        public void alert_clickToDismiss(){
            driver.switchTo().alert().dismiss();
        }


public boolean isAlertDisplayed(String expectedMessage){
        String actualMessage = getResultText();
        return actualMessage.contains(expectedMessage);
}


}

