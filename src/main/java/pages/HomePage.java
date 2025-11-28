package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  {
    public WebDriver driver;



    public HomePage(WebDriver driver) {
        this.driver = driver;


    }
    private By popup = By.cssSelector("#popup-widget183-close-icon > path");

    public void removePopUp(){
        driver.findElement(popup).click();
    }

    public DropdownPage clickDropdown(){
        clickLink("MORE");
        return new DropdownPage(driver);
    }

    public JoinUsPage clickJoinUsLink(){
        clickLink("JOIN US");
        return new JoinUsPage(driver);
    }


    public HoversPage clickHovers(){
        clickLink("ZOMBIE IPSUM");
        return new HoversPage(driver);
    }


    public CreateAccountPage clickCreateAccountButton(){
        clickLink("CREATE ACCOUNT");
        return new CreateAccountPage(driver);
    }

    //public AlertsPage click



    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();

    }

    public void RemovePopUp() {

    }

}
