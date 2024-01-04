package com.bella.utilities;

import java.io.FileNotFoundException;

public class Configurations {

	FileUtil file = new FileUtil();

	public String getAppUrl() throws FileNotFoundException {

		return file.getProperty("/src/main/resources/config.properties", "appUrl");
	}

	public String getBrowserName() throws FileNotFoundException {
		return file.getProperty("/src/main/resources/Browser.properties", "browser");
	}
	
	public String getCheckOutUrl() throws FileNotFoundException {
			return file.getProperty("/src/main/resources/config.properties", "checkoutUrl");
	}

	
	
	
	
	
	
	
	
	
	/*
	 * public String getUserName() throws FileNotFoundException {
	 * 
	 * //file.getProperty("/src/main/resources/adminLogin.properties", "username");
	 * return file.getProperty("/src/main/resources/adminLogin.properties",
	 * "username");
	 * 
	 * }
	 * 
	 * public void getPassword() throws FileNotFoundException {
	 * 
	 * System.out.println(file.getProperty(
	 * "/src/main/resources/adminLogin.properties", "password")); }
	 */

}
