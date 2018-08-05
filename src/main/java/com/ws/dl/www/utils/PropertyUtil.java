package com.ws.dl.www.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	public static String getJdbc(String key) {

		Properties properties = new Properties();

		try {
			properties.load(PropertyUtil.class.getResourceAsStream("/conf/jdbc.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

	public static String getApp (String key) {

		Properties properties = new Properties();

		try {
			properties.load(PropertyUtil.class.getResourceAsStream("/conf/app.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

}
