package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  {
    public WebDriver driver;



    public HomePage(WebDriver driver) {
        this.driver = driver;


    }
    private By popup = By.cssSelector(".x-el");

    public void removePopUp(){
        driver.findElement(popup).click();
    }

    public JoinUsPage clickJoinUsLink(){
        clickLink("JOIN US");
        return new JoinUsPage(driver);
    }



    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();

    }

    public void RemovePopUp() {

    }

}
