package com.cogmento.utils;

import com.cogmento.ihelper.IAlert;
import com.cogmento.ihelper.IWait;

public class AlertUtils implements IAlert {

	IWait wait = new WaitUtils();

	@Override
	public void accept() {

		wait.alertIsPresent().accept();

	}

	@Override
	public void dismiss() {

		wait.alertIsPresent().dismiss();
	}

	@Override
	public String getText() {

		return wait.alertIsPresent().getText();
	}

	@Override
	public void sendKeys(String value) {

		wait.alertIsPresent().sendKeys(value);
	}

}
