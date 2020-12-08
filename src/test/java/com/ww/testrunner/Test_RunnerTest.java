package com.ww.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "Test_Scripts/PestR.feature",
		glue= "com.ww.stepdef",
		plugin= {"pretty", "html:target/cucumber-reports", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		dryRun = false
		
		)

public class Test_Runner {

}
