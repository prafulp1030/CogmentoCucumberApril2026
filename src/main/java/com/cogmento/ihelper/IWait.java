package com.cogmento.ihelper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IWait {

	WebElement elementToBeClickable(WebElement element);

	WebElement visibilityOf(WebElement element);

	Alert alertIsPresent();

}
