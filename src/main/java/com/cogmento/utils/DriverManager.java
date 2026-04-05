package com.cogmento.utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	//Singleton design Pattern
	private DriverManager()
	{
		
	}
	
	public static void setDriver(WebDriver driver)
	{
		threadLocal.set(driver);	
	}
	
	public static WebDriver getDriver()
	{
		return threadLocal.get();
	}
	
	public static void removeDriver()
	{
		threadLocal.remove();
	}

}
