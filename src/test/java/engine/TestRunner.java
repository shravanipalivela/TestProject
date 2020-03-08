
package engine;


import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = "src/test/resources/features", glue = { "stepDefinitions" }, plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/cucumberReports/report.html" }, monochrome = true, tags= {"@SmokeTest"}
)


public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("src/test/resources/configs/extent-config.xml");
		//Reporter.loadXMLConfig(PropertUtil.getEnvproperty("reportConfigPath"));

	}

}