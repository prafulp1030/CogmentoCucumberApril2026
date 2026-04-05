package com.cogmento.ihelper;

import java.time.Duration;

import org.openqa.selenium.Dimension;

public interface IWebDriver {

	void get(String url);

	void maximize();

	void minimize();

	void fullScreen();

	void setSize(Dimension dimension);

	void deleteAllCookies();

	void implicitlyWait(Duration duration);

	void pageLoadTimeout(Duration duration);

	void close();

	void quit();

	void back();

	void forward();

	void refresh();

	void to(String url);

}
