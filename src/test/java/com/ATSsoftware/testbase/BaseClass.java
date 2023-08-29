package com.ATSsoftware.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public WebDriver driver; 
	public Properties prop;
	
	
	@BeforeMethod
	public void openurl() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\karth\\eclipse-workspace\\DemoATSSoftware\\resources\\config.properties");
		prop.load(fis);
		
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//@AfterMethod
		public void closeurl() {
		driver.quit();
		}

}
