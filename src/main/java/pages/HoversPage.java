package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    WebDriver driver;


    public HoversPage(WebDriver driver){
        this.driver = driver;

    }


    public static class FigureCaption{
        private WebElement caption;
        private By color = By.xpath(".//a[text()='ZOMBIE COLOR']");


        public FigureCaption(WebElement caption){
            this.caption = caption;

            }

            public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
            }

            public String getLinkText(){
              return caption.findElement(color).getText();
            }

        }

    }

