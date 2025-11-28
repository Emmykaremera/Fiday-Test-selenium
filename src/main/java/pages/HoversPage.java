package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    WebDriver driver;
    private By zombieIpsum = By.xpath(".//a[text()='ZOMBIE IPSUM']");

    public HoversPage(WebDriver driver){
        this.driver = driver;

    }

    public FigureCaption hoverOverFigure(int index){
        List<WebElement> figures = driver.findElements(zombieIpsum);
        WebElement figure = figures.get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(zombieIpsum));
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

