package com.cogmento.runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com.cogmento.steps", "com.cogmento.hooks"},
		dryRun = false,
		monochrome = true, 
		snippets = SnippetType.UNDERSCORE,
		
		plugin = {
				"rerun:FailedScenario/failedScenario.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class RunnerTest extends AbstractTestNGCucumberTests {

	@Parameters({ "executionType", "browserName" })
	@BeforeClass
	public void setup(@Optional("local") String executionType, @Optional("Chrome") String browserName)
	
	{
		System.setProperty("executionType", executionType);

		System.setProperty("browserName", browserName);

	}

}
