package com.cogmento.ihelper;

public interface IAlert {

	void accept();

	void dismiss();

	String getText();

	void sendKeys(String value);
}
