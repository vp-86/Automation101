package b_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class A3_BrowserMethods {

    public static WebDriver driver;

    public static void main(String[] args) {

        // browser command
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.close();

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
        // driver.findElement( By.id("username") ).click();
        driver.findElement(username).click(); //
        driver.findElement(username).sendKeys();
        driver.findElement(username).clear();
        driver.findElement(username).getText();
        driver.findElement(username).getTagName();
        driver.findElement(username).getAttribute("innterHtml");
        driver.findElement(username).getRect();
        driver.findElement(username).getSize();
        driver.findElement(username).getLocation();
        
        
        
        
        
    }
}
