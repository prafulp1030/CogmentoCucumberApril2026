package com.cogmento.steps;

import java.util.HashMap;

public class TextContext {

	private HashMap<String, Object> mapTextContext;

	public TextContext() {
		mapTextContext = new HashMap<String, Object>();
	}

	public void set(String key, Object value) {
		mapTextContext.put(key, value);
	}

	public Object get(String key) {
		return mapTextContext.get(key);
	}

	public void remore(String key) {
		mapTextContext.remove(key);
	}

}
