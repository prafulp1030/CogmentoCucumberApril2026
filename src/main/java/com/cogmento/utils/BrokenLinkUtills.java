package com.cogmento.utils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cogmento.ihelper.IBrokenLink;

public class BrokenLinkUtills implements IBrokenLink {
	int responseCode;

	@Override
	public void findBrokenLink() {

		List<WebElement> listLinks = DriverManager.getDriver().findElements(By.tagName("a"));

		for (WebElement link : listLinks) {

			String linkAddress = link.getAttribute("href");

			if (linkAddress.isEmpty() || linkAddress != null) {

				try {
					URL url = new URL(linkAddress);

					URLConnection urlCon = url.openConnection();

					HttpURLConnection httpUrlCon = (HttpURLConnection) urlCon;

					httpUrlCon.connect();

					int responseCode = httpUrlCon.getResponseCode();

				} catch (Exception e) {
					e.getLocalizedMessage();
				}

				if (responseCode >= 400) {
					System.err.println("Link is Invalid " + linkAddress);
				} else {
					System.out.println("Link is valid" + linkAddress);
				}
			}

		}
	}

}
