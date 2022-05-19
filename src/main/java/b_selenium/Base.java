package b_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Base {
    
    static WebDriver driver; /// 10001
    
    public Base(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // 100001
    }
    
    public static WebElement getElement(String locator, String para){ //E_Chebxob101
      
        switch (locator){
            case "xpath":
                return driver.findElement(By.xpath(para)); // 10001 -  E_Checkbox101
            case "cssSelector":
                return driver.findElement(By.cssSelector(para));
            case "name":
                return driver.findElement(By.name(para));
            case "className":
                return driver.findElement(By.className(para));
            case "linkText":
                return driver.findElement(By.linkText(para));
            case "partialLinkText":
                return driver.findElement(By.partialLinkText(para));
            case "tag":
                return driver.findElement(By.tagName(para));
            default:
                return driver.findElement(By.id(para));
        }

    }

    public static void clickElement(String locator, String para){
        getElement(locator,para).click(); /// E_Checkbox101.click();
    }

    public static void sendText(String locator, String para, String inputText){

        getElement(locator,para).sendKeys(inputText);
    }

    //Alert
    private static Alert switchToAlert(){
        return driver.switchTo().alert();
    }

    public static void acceptAlert(){
        switchToAlert().accept();
    }

    public static void dismissAlert(){
        switchToAlert().dismiss();
    }

    public static void sendTextToAlert(String para){
        switchToAlert().sendKeys(para);
    }

    public static String getTextFromAlert(){
        return switchToAlert().getText();
    }

    // window handling
    public static String getCurrentWindow(){
        return driver.getWindowHandle();
    }

    public static Set<String> getAllWindows(){
        return driver.getWindowHandles();
    }
    
    public static WebDriver switchToWindow(String expectedTitle){

        for(String currWindow: getAllWindows()){

            if(currWindow.equalsIgnoreCase( expectedTitle )){
                driver =  driver.switchTo().window(currWindow);
            }
        }

        return driver;
    }

    public static WebDriver switchToParentWindow(){
        return driver.switchTo().parentFrame();
    }

    public static WebDriver switchToMainWindow(){
        return driver.switchTo().defaultContent();
    }

    //Frame - Overloaded method
    public static WebDriver switchToFrame(int i){
        return driver.switchTo().frame(i); // int number string name or element
    }
    public static WebDriver switchToFrame(String frameName){
        return driver.switchTo().frame(frameName); // int number string name or element
    }
    public static WebDriver switchToFrame( String locator, String para ){
        return driver.switchTo().frame( getElement(locator, para));
    }

    //checkbox
    public static void checkBoxOps(WebElement element ){
        element.isSelected();
        element.isEnabled();
        element.isDisplayed();
    }

    //radioButton
    public static void radioOps(){}

    //





    
}
