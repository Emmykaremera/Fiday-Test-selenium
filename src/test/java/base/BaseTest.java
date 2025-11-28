package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    WebDriver driver;
   protected HomePage homepage;


@BeforeMethod
   public void SetUp(){
       System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://candymapper.com");
       homepage = new HomePage(driver);
   }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

}
