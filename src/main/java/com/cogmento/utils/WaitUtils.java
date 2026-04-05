package com.cogmento.utils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cogmento.ihelper.IWait;

public class WaitUtils implements IWait {

	private WebDriverWait getWebDriverWait() {
		return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30));
	}

	@Override
	public WebElement elementToBeClickable(WebElement element) {

		return getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	@Override
	public WebElement visibilityOf(WebElement element) {
		return getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
	}

	@Override
	public Alert alertIsPresent() {
		return getWebDriverWait().until(ExpectedConditions.alertIsPresent());
	}

}
