package com.ATSsoftware.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ATSsoftware.pageobjects.LoginPage;
import com.ATSsoftware.testbase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_UserLoginTest extends BaseClass {
	
	
	@Test
	public void loginTest() throws InterruptedException {
		
		String mail = prop.getProperty("mailid");
		String fname = prop.getProperty("FirstName");
		String lname = prop.getProperty("LastName");
		String passwd = prop.getProperty("Password");
		String ConfirmPassword = prop.getProperty("ConfirmPassword");
		String cname = prop.getProperty("CompanyName");
		String caddress = prop.getProperty("CompanyAddress");
		String ccountry = prop.getProperty("CompanyCountry");
		String cprovince = prop.getProperty("CompanyProvince");
		String ccity = prop.getProperty("CompanyCity");
		String cpostal = prop.getProperty("CompanyPostal");
		
		LoginPage lp = new LoginPage(driver);
		lp.initSIgnUp();
		lp.setUserdetails(mail,fname,lname,passwd,ConfirmPassword);
		
		lp.clickBtn();
		Thread.sleep(1000);
		
		lp.setOrgdetails(cname,caddress,ccountry,cprovince,ccity,cpostal);
		lp.nextBtn();
		lp.roleSel();
		lp.signupBtn();
		lp.confirm();
	}
	
	
}
