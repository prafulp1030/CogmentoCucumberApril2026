package com.cogmento.utils;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.cogmento.ihelper.ICalendar;
import com.cogmento.ihelper.IWebElement;

public class CalendarUtils implements ICalendar {

	IWebElement element = new WebElementUtils();

	@Override
	public void selectMonthAndYear(WebElement monthYear, WebElement next, String expectedMonthAndYear) {

		while (true) {
			String displayedMonthYear = element.getText(monthYear);

			if (displayedMonthYear.equalsIgnoreCase(expectedMonthAndYear)) {
				break;
			} else {

				element.click(next);
			}
		}
	}

	@Override
	public void selectDate(List<WebElement> listDate, String expectedDate) {

		for (WebElement date : listDate) {
			String actualDate = element.getText(date);

			if (actualDate.equals(expectedDate)) {
				element.click(date);

				break;

			}
		}
	}

}
