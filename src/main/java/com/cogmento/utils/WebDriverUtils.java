package com.cogmento.utils;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import com.cogmento.ihelper.IWebDriver;

public class WebDriverUtils implements IWebDriver {

	@Override
	public void get(String url) {
		DriverManager.getDriver().get(url);
	}

	@Override
	public void maximize() {
		DriverManager.getDriver().manage().window().maximize();
	}

	@Override
	public void minimize() {

		DriverManager.getDriver().manage().window().minimize();
	}

	@Override
	public void fullScreen() {

		DriverManager.getDriver().manage().window().fullscreen();
	}

	@Override
	public void setSize(Dimension dimension) {

		// e.g.
		// Dimension d = new Dimension(1200, 3000);

		DriverManager.getDriver().manage().window().setSize(dimension);
	}

	@Override
	public void implicitlyWait(Duration duration) {

		DriverManager.getDriver().manage().timeouts().implicitlyWait(duration);
	}

	@Override
	public void pageLoadTimeout(Duration duration) {

		DriverManager.getDriver().manage().timeouts().pageLoadTimeout(duration);
	}

	@Override
	public void close() {

		DriverManager.getDriver().close();
	}

	@Override
	public void quit() {

		DriverManager.getDriver().quit();
	}

	@Override
	public void back() {

		DriverManager.getDriver().navigate().back();
	}

	@Override
	public void forward() {

		DriverManager.getDriver().navigate().forward();
	}

	@Override
	public void refresh() {

		DriverManager.getDriver().navigate().refresh();
	}

	@Override
	public void to(String url) {

		DriverManager.getDriver().navigate().to(url);
	}

	@Override
	public void deleteAllCookies() {

		DriverManager.getDriver().manage().deleteAllCookies();
	}

}
