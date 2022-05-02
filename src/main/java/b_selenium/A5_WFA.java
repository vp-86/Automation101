package b_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class A5_WFA extends A2_DriverInstance {


    public static void main(String[] args) {
        driver.findElement(By.id("test"));
        // window :
        // webBased : simple alert - prompt alert - confirmation alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.getText();

        alert.sendKeys("data");


       driver.switchTo().frame(1);
       driver.switchTo().frame("iframe");
       driver.switchTo().frame( driver.findElement( By.id( "frame123" ) ) );


      String main =  driver.getWindowHandle();

      Set<String> multipleWindow = driver.getWindowHandles();
      // for loop dont work here
      for( String childWindow : multipleWindow ){
          if( childWindow.equalsIgnoreCase( driver.getTitle())) {
              driver.switchTo().window(childWindow);
              break;
          }
      }

      // perform operation
      // switch to main
      driver.switchTo().window(main);
       // OR
      driver.switchTo().defaultContent(); // main frame

      // to go one frame back
      driver.switchTo().parentFrame(); // immediate parent frame

     /*
         // Opens a new tab and switches to new tab
        driver.switchTo().newWindow(WindowType.TAB);

        // Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);

      */


    }

}
