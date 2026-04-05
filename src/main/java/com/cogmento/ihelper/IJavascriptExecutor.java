package com.cogmento.ihelper;

import org.openqa.selenium.WebElement;

public interface IJavascriptExecutor {

	void click(WebElement element);

	void sendKeys(WebElement element, String value);

	void scrollIntoView(WebElement element);

	void borderForElement(WebElement element);

	void changeElementBackgroundColor(WebElement element);

}
