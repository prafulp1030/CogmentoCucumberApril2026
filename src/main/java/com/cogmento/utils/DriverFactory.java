package com.cogmento.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cogmento.exceptions.DriverException;

public class DriverFactory {

	private DriverFactory() {

	}

	public static void initDriver(String executionType, DriverType driverType) {

		WebDriver driver = null;

		if (executionType.equalsIgnoreCase("remote")) {

			URL url = null;

			try {
				url = new URL("http:localhost:4444/wb/hub");
			} catch (MalformedURLException e) {

				e.getLocalizedMessage();
			}

			switch (driverType) {
			case CHROME:
				ChromeOptions chromeOptions = new ChromeOptions();
				driver = new RemoteWebDriver(url, chromeOptions);
				break;

			case EDGE:
				EdgeOptions edgeOptions = new EdgeOptions();
				driver = new RemoteWebDriver(url, edgeOptions);
				break;

			case FIREFOX:
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				driver = new RemoteWebDriver(url, firefoxOptions);
				break;

			case IE:
				InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
				driver = new RemoteWebDriver(url, internetExplorerOptions);
				break;

			case INCOGNITO:
				ChromeOptions chromeOptions1 = new ChromeOptions();
				chromeOptions1.addArguments("--incognito");
				driver = new RemoteWebDriver(url, chromeOptions1);
				break;

			case HEADLESS:
				ChromeOptions chromeOptions2 = new ChromeOptions();
				chromeOptions2.addArguments("--headless");
				driver = new RemoteWebDriver(url, chromeOptions2);
				break;

			default:
				throw new DriverException("Driver initalization issue");
			}

		} else if (executionType.equalsIgnoreCase("local")) {
			switch (driverType) {
			case CHROME:
				driver = new ChromeDriver();
				break;

			case EDGE:
				driver = new EdgeDriver();
				break;

			case FIREFOX:
				driver = new FirefoxDriver();
				break;

			case IE:
				driver = new InternetExplorerDriver();
				break;

			case INCOGNITO:
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--incognito");
				driver = new ChromeDriver(chromeOptions);
				break;

			case HEADLESS:
				ChromeOptions chromeOptions1 = new ChromeOptions();
				chromeOptions1.addArguments("--headless");
				driver = new ChromeDriver(chromeOptions1);
				break;

			default:
				throw new DriverException("Driver initalization issue");

			}

		}

		DriverManager.setDriver(driver);

	}

}
