package b_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class A6_Waits extends A2_DriverInstance{

    public static void main(String[] args) {

         /* implicit wait :
           By implicitly waiting, WebDriver polls the DOM for a certain duration when trying to find any element.
           This can be useful when certain elements on the webpage are not available immediately and need some time to load.

           default value 0 ;  Once set, the implicit wait is set for the life of the session.;

           Warning: Do not mix implicit and explicit waits.
           Doing so can cause unpredictable wait times ( unintended consequences : namely waits sleeps for max time even element found)
           For example, setting an implicit wait of 10 seconds and an explicit wait of 15 seconds could cause a timeout to occur after 20 seconds.
         */


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);


        /*
        Explicit waits
        They allow your code to halt program execution, or freeze the thread, until the condition you pass it resolves.
        The condition is called with a certain frequency until the timeout of the wait is elapsed.
        This means that for as long as the condition returns a falsy value, it will keep trying and waiting.

        Since explicit waits allow you to wait for a condition to occur, they make a good fit for synchronising the state between the browser
        and its DOM, and your WebDriver script.
         */

        WebDriverWait wait = new WebDriverWait(driver,30);
             wait.until( ExpectedConditions.alertIsPresent() );
                wait.until( ExpectedConditions.titleIs("") );
                wait.until( ExpectedConditions.elementToBeClickable( By.id("")) );
                wait.until( ExpectedConditions.presenceOfElementLocated( By.id("")) );
                wait.until( ExpectedConditions.visibilityOfElementLocated( By.id("") ) );


        /*
        FluentWait instance defines the maximum amount of time to wait for a condition, as well as the frequency with which to check the condition.

        Users may configure the wait to ignore specific types of exceptions whilst waiting,
        such as NoSuchElementException when searching for an element on the page.
         */
        FluentWait<WebDriver> waitF= new FluentWait<WebDriver>(driver);
        waitF.withTimeout(Duration.ofSeconds(30));
        waitF.pollingEvery(Duration.ofSeconds(3));
        waitF.ignoring(NoSuchElementException.class);

//        val foo = wait.until {it.findElement(By.id("foo")) }

    }


}
