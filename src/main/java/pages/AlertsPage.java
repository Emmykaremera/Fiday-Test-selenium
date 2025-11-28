package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    public By triggerAlertButton = By.cssSelector("#n-55 > div > section > div.x-el.x-el-div.c1-1.c1-2.c1-2s.c1-1s.c1-1t.c1-1u.c1-1v.c1-i.c1-b.c1-c.c1-1w.c1-d.c1-1x.c1-82.c1-83.c1-e.c1-1y.c1-f.c1-1z.c1-g > div > div.x-el.x-el-div.c1-1.c1-2.c1-84.c1-81.c1-87.c1-88.c1-1v.c1-3g.c1-1u.c1-3i.c1-1t.c1-r.c1-89.c1-t.c1-9j.c1-b.c1-c.c1-d.c1-5y.c1-e.c1-f.c1-g > p");

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

