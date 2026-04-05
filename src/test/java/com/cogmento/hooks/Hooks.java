package com.cogmento.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cogmento.base.BaseTest;
import com.cogmento.utils.DriverFactory;
import com.cogmento.utils.DriverManager;
import com.cogmento.utils.DriverType;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void beforeScrenario() {
		String executionType = System.getProperty("executionType");

		String browserName = System.getProperty("browserName");

		DriverFactory.initDriver(executionType, DriverType.valueOf(browserName.toUpperCase()));
		
		
		
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);

		scenario.attach(src, "image/png", scenario.getName());

	}

	@After
	public void afterScenario() {
		new BaseTest().terminateSession();
	}

}
