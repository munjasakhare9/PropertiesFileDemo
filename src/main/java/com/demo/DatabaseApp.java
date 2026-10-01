package com.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseApp {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("database.properties");
		Properties p = new Properties();
		p.load(fis);// load all properties from properties file and store in the map

		System.out.println(p);
		String userName = p.getProperty("uname");
		String password = p.getProperty("pwd");
		String driver = p.getProperty("driver");// key not present

		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
		System.out.println("Driver: " + driver);// null
		
		fis.close();
	}
}
