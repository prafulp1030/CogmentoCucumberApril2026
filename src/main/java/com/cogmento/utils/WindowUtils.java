package com.cogmento.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.cogmento.ihelper.IWindow;

public class WindowUtils implements IWindow {

	@Override
	public void switchToNewWindow(int indexPosition) {

		Set<String> setWindows = DriverManager.getDriver().getWindowHandles();

		Iterator<String> iterator = setWindows.iterator();

		ArrayList<String> arrayList = new ArrayList<>();

		while (iterator.hasNext()) {
			arrayList.add(iterator.next());
		}

		DriverManager.getDriver().switchTo().window(arrayList.get(indexPosition));

	}

}
