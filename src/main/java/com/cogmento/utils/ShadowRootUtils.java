package com.cogmento.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import com.cogmento.ihelper.IShadowRoot;

public class ShadowRootUtils implements IShadowRoot {

	@Override
	public WebElement handleShadowRoot(WebElement parentElement, String cssSelector) {

		SearchContext shadowRoot = parentElement.getShadowRoot();

		return shadowRoot.findElement(By.cssSelector(cssSelector));
	}

}
