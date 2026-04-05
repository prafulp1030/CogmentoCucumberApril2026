package com.cogmento.ihelper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v141.indexeddb.model.Key;

public interface IActions {

	void click(WebElement element);

	void doubleClick(WebElement element);

	void contextClick(WebElement element);

	void clickAndHold(WebElement element);

	void release(WebElement element);

	void dragAndDrop(WebElement source, WebElement target);

	void moveToElement(WebElement element);

	void scrollToElement(WebElement element);

	void sendKeys(WebElement element, String value);

	void keyDown(Key key);

	void keyUp(Key key);

}
