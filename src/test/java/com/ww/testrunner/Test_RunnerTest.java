package com.ww.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Test_Scripts/PestR.feature",
		glue= "com.ww.stepdef",
		plugin= {"pretty", "html:target/cucumber-html-report"},
		monochrome = true,
		dryRun = false
		
		)

public class Test_RunnerTest  {
	

}
