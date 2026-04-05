package com.cogmento.utils;

import org.openqa.selenium.WebElement;

import com.cogmento.ihelper.IWebElement;

public class WebElementUtils implements IWebElement {

	private WaitUtils wait = new WaitUtils();

	@Override
	public void click(WebElement element) {

		wait.elementToBeClickable(element).click();
	}

	@Override
	public void sendKeys(WebElement element, String value) {

		wait.visibilityOf(element).sendKeys(value);
	}

	@Override
	public String getText(WebElement element) {

		return wait.visibilityOf(element).getText();
	}

}
