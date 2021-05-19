package Runner_Files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "C:\\Users\\Admin\\Downloads\\Header_positive_web-main\\src\\main\\java\\Circles_positive_scenarios\\Circles_positive_scenarios.feature",
		glue= {"Circles_positive_scenarios"},
		monochrome = true
		,publish = true
       	)
public class Circle_positive_Runner extends AbstractTestNGCucumberTests {

}
