package com.cogmento.pages;

import org.openqa.selenium.WebDriver;

import com.cogmento.utils.DriverManager;
import com.cogmento.utils.WebElementUtils;

public class BasePage {

	protected WebDriver driver;
	protected WebElementUtils element;

	public BasePage() 
	{
		driver = DriverManager.getDriver();
		element = new WebElementUtils();

	}

}
