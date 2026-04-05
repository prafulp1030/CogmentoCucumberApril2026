package com.cogmento.ihelper;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ICalendar {

	void selectMonthAndYear(WebElement monthYear, WebElement next, String expectedMonthAndYear);

	void selectDate(List<WebElement> listDate, String expectedDate);

}
