package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage  {
    public WebDriver driver;
    private By navbarItems = By.id("nav-67");
    private By createAccountLink = By.id("n-5599-membership-create-account");
    private By utilitiesMenuButton = By.cssSelector("[data-ux='UtilitiesMenuLink']");
    private By navMore = By.cssSelector("[data-aid='NAV_MORE']");
    private By zombieIpsum = By.xpath(".//a[text()='ZOMBIE IPSUM']");


    public HomePage(WebDriver driver) {
        this.driver = driver;


    }
    private By popup = By.cssSelector("#popup-widget183-close-icon > path");

    public void removePopUp(){
        driver.findElement(popup).click();
    }

    public DropdownPage clickDropdown(){
        driver.findElement(navMore).click();
        return new DropdownPage(driver);
    }

    public LoginPage clickLogin(){
        clickLink("JOIN US");
        return new LoginPage(driver);
    }


    public void clickHovers(int index){


        List<WebElement> figures = driver.findElements(zombieIpsum);
        WebElement figure = figures.get(index - 1);

        Actions actions = new Actions(driver);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", figure);
        actions.moveToElement(figure).perform();

    }


    public CreateAccountPage clickCreateAccountButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(utilitiesMenuButton));
        menuButton.click();

        WebElement createAccount = wait.until(
                ExpectedConditions.elementToBeClickable(createAccountLink)
        );
        createAccount.click();

        return new CreateAccountPage(driver);
    }


    public void clickAlerts(){
        driver.findElements(By.cssSelector("a[href*='tel:+442079460']")).get(0).click();
        driver.switchTo().alert().accept();

    }



    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();

    }

    public void RemovePopUp() {

    }

}
