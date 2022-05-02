package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/Feature/sample.feature",
        glue = {"stepDefinition"},
        tags = "@smoke",
        plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        )

public class myTest extends AbstractTestNGCucumberTests {


}
