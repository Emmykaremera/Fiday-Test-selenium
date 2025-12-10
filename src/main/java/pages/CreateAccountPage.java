package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {
    private WebDriver driver;
    private By firstNameInputField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_NAME_FIRST']");
    private By secondNameInputField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_NAME_LAST']");
    private By emailInputField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_EMAIL']");
    private By phoneInputField = By.cssSelector("input[data-aid='CREATE_ACCOUNT_PHONE']");
    private By createAccountButton = By.cssSelector("button[data-ux='ButtonPrimary']");
    private By confirm = By.cssSelector("h4[data-ux='Heading']");


    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
    }
    public CreateAccountPage firstNameInputs(String firstName){
        driver.findElement(firstNameInputField).sendKeys(firstName);
        return this;
    }
    public CreateAccountPage lastNameInputs(String lastName){
        driver.findElement(secondNameInputField).sendKeys(lastName);
        return this;
    }
    public CreateAccountPage emailInputs(String email){

        driver.findElement(emailInputField).sendKeys(email);
        return this;
    }
    public CreateAccountPage phoneInput(String phoneNumber){
        driver.findElement(phoneInputField).sendKeys(phoneNumber);
        return this;
    }
    public CreateAccountPage clickCreateAccountButton(){

        driver.findElement(createAccountButton).click();
        return this;
    }

    public String getConfirm(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(confirm)).getText();
    }
}