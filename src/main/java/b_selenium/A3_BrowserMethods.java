package b_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class A3_BrowserMethods {


/*
  * isDisplayed() --- Do not confuse with this if element present but hidden ( having
                      ht/wt > 0 ) then it will return true
 */
    public static WebDriver driver;

    public static void main(String[] args) {

        // browser command
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        //driver.close(); - close single widnow
        //driver.quit(); - close all window from same session

        // navigation command
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        driver.get("https://www.google.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com");
        driver.quit();

        // webElement command
        
        By username = By.id("test");
        driver.get("www.gmail.com");
        // driver.findElement( By.id("test") ).click();
        driver.findElement(username).click(); //waits for pageload -- not if JSE click
        driver.findElement(username).sendKeys();
        driver.findElement(username).submit(); // works best with forms
        driver.findElement(username).clear();
        driver.findElement(username).getText();
        driver.findElement(username).getTagName();
        driver.findElement(username).getAttribute("innterHtml");
        driver.findElement(username).getRect();
        driver.findElement(username).getSize();
        driver.findElement(username).getLocation();

        //radiobutton
        driver.findElement(username).isDisplayed();
        driver.findElement(username).isSelected(); // radio checkbox dropdown
        driver.findElement(username).isEnabled(); // radio
        new Select(driver.findElement(username)).isMultiple(); // dropdown

    }
}
