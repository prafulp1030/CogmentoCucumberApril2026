package com.cogmento.ihelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface iDropdown {

	void selectByVisibleText(WebElement element, String visibleText);

	void selectByValue(WebElement element, String value);

	void selectByIndex(WebElement element, int index);

	void selectValue(List<WebElement> listElement, String expectedValue);

}
