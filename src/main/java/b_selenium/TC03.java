package b_selenium;

import com.aventstack.extentreports.util.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;


public class TC03 extends  Base {

    private static  String I_am_private;
           static  String I_am_default;
    protected static  String I_am_protected;
    public static String I_am_public;

    public static void main(String[] args) {
       driver.get("url");

       clickElement("xpath","//span[text()='Check Box']");

        String Title = getElement("xpath","//span[text()='Home']").getText();


        if(  getElement("tagName","input").isSelected() ){
            getElement("tagName","input").click();
        }


        // check -- uncheck
        // uncheck -- check
        // verify and assert
       // SoftAssert  - it does not fail script - capture all assertion and updtes at last with  ( assert.all)
       // hard Assert   - assert :     where ever fails, it fails script
       // Assert.assertEquals(1,2)  assertTrue( condition ) assertFalse  assertContains(1,2)




    }

    ////span[text()='Check Box']







}
