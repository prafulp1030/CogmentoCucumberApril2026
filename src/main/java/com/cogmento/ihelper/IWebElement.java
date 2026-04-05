package com.cogmento.ihelper;

import org.openqa.selenium.WebElement;

public interface IWebElement {

	void click(WebElement element);

	void sendKeys(WebElement element, String value);
	
	String getText(WebElement element);
	

}
