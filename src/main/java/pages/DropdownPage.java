package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By dropdown = By.cssSelector("ul[data-ux='Dropdown']");
    private String selectedOption;


    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
    }


    public String selectFromDropDown(String option) {

        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));

        WebElement item = menu.findElement(By.xpath(".//a[normalize-space()='" + option + "']"));
        item.click();
        return selectedOption = option;

    }

    public int getSelectedOptions() {

        WebElement selected = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
        return selected.findElements(By.tagName("li")).size();
    }

    public String getSelectedOption() {
        return selectedOption;
    }
}
