package b_selenium;

public class A2_DriverInstance {

    /*
     GeckoDriver

        WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");

		illegal state exception

        To resolve :
        Opt 1:
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");

        Opt 2:
        -- add driver path to system variable path

        Opt 3:
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(cap);

        Run headless:
        ------------------
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        WebDriver driver = new FirefoxDriver(options);

        Error:
         1. Not connected exception :  ( latest firefox but old selenium )
         2. webdriver exception fail to decode : ( mismatch between GECKO and selenium/firefox )
         3. connection refused :   -- clear browser cache
         4. Unreachable Browser Exception : session is closed, while selenium tries to interact

       TODO - complete other issues later

     */

    /*


     */
}
