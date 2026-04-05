package com.cogmento.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.cogmento.ihelper.IJavascriptExecutor;

public class JavascriptExecutorUtils implements IJavascriptExecutor {

	/*
	 * Click on Element using JavaScript Executor
	 */

	private WaitUtils wait = new WaitUtils();

	private JavascriptExecutor getJavascriptExecutor() {
		return (JavascriptExecutor) DriverManager.getDriver();
	}

	@Override
	public void click(WebElement element) {
		getJavascriptExecutor().executeScript("arguments[0].click();", wait.elementToBeClickable(element));
	}

	@Override
	public void sendKeys(WebElement element, String value) {

		getJavascriptExecutor().executeScript("arguments[0].value='" + value + "'", wait.visibilityOf(element));
	}

	@Override
	public void scrollIntoView(WebElement element) {

		getJavascriptExecutor().executeScript("arguments[0].scrollIntoView();", wait.visibilityOf(element));
	}

	@Override
	public void borderForElement(WebElement element) {

		getJavascriptExecutor().executeScript("arguments[0].style.border='3px solid red'", wait.visibilityOf(element));
	}

	@Override
	public void changeElementBackgroundColor(WebElement element) {

		getJavascriptExecutor().executeScript("arguments[0].style.backgroundColor='rgb(255,0,0)';",
				wait.visibilityOf(element));
	}

}
