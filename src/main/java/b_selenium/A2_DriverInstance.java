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
         Chrome :
         - ChromeOptions options = new ChromeOptions();
         - options.addArguments("window-size=1400,800")
         - options.addArguments("headless")

         Firefox
         -System.setpropery("webdriver.gecko.driver","path");
          FirefoxOptions fo = new FirefoxOptions();
          fo.setBinary(new FirefoxBinary().addCommandLineOptions("--headless"));
          WebDriver driver = new FirefoxDriver(fo);

         htmlUnitDriver      -- java based
         - add Pom dependency
         - WebDriver driver = new HtmlUnitDriver();

         phantom JS : ( Ghost Driver ) -javascript based
         - latest version we have to download only phantomjs.exe
         - add driver dependency in POM


         - fast, run behind scene, interact directly with DOM API
         - ghost driver use JSON wire protocol -- HTTP rest calls
              - sytem.setProperty("phantomjs.binary.path",FilePath)


     */
}
