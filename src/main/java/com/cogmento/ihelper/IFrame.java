package com.cogmento.ihelper;

import org.openqa.selenium.WebElement;

public interface IFrame {

	void frame(String idOrName);

	void frame(int index);

	void frame(WebElement element);

	void parentFrame();

	void defaultContent();

}
