package com.cogmento.base;

import java.time.Duration;

import com.cogmento.reader.PropertyReader;
import com.cogmento.utils.WebDriverUtils;

public class BaseTest {

	private WebDriverUtils webdriver = new WebDriverUtils();

	public void initialization() 
	{

		webdriver.get(PropertyReader.getProperty("URL"));

		webdriver.maximize();

		webdriver.pageLoadTimeout(Duration.ofSeconds(30));

		webdriver.implicitlyWait(Duration.ofSeconds(30));

		webdriver.deleteAllCookies();
	}
	

	public void terminateSession() {
		new WebDriverUtils().quit();
	}

}
