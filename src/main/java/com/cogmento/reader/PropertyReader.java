package com.cogmento.reader;

import java.io.FileInputStream;
import java.util.Properties;

import com.cogmento.exceptions.PropertyFileNotFound;

public class PropertyReader {

	private PropertyReader() {

	}

	public static String getProperty(String key) {

		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\qa-config.properties";

		try (FileInputStream fis = new FileInputStream(path)) {

			prop.load(fis);

		} catch (PropertyFileNotFound property) {
			throw new PropertyFileNotFound("Property file is not Exist on above Path");
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
		

		return prop.getProperty(key);

	}
}
