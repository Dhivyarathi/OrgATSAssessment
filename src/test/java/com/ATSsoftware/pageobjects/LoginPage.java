package com.ATSsoftware.pageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ATSsoftware.testbase.BaseClass;

public class LoginPage extends BaseClass {
	
	BaseClass bc = new BaseClass();
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	
	@FindBy(linkText ="Accept")
	WebElement acceptbtn;
	
	@FindBy(xpath="//span[text()='Sign Up']")
	WebElement signinbtn;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement lastname;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	WebElement pwd;
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	WebElement confirmpwd;
	
	@FindBy(xpath="//span[text()='continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//input[@type='text'][1]")
	WebElement companyname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement companyaddress;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement country;
	
	@FindBy(xpath="//span[text()='Canada']")
	WebElement countryvaltoselect;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement Province;
	
	@FindBy(xpath="//span[text()='Ontario']")
	WebElement Provincevaltoselect;
	
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement city;
	
	@FindBy(xpath="(//span[text()='Scarborough'])[1]")
	WebElement cityvaltoselect;
			
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement postalcode;
	
	@FindBy(xpath="//div[@role=\"button\"]")
	WebElement organizationType;
	
	@FindBy(xpath="//li[text()='Manufacturer']")
	WebElement selectval;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement nextbtn;
	
	@FindBy(xpath="//p[text()='Owner/Partner']")
	WebElement role;
	
	@FindBy(xpath="//span[text()='sign up']")
	WebElement signupBtn;
	
	@FindBy(xpath="//h2[text()='Check Your Email']")
	WebElement cnfm;
	
	
	
	//Methods
	public void initSIgnUp() {
		acceptbtn.click();
		signinbtn.click();	
	}
	
	public void setUserdetails(String mail,String fname,String lname,String passwd,String confpasswd) throws InterruptedException {
		email.sendKeys(mail);
		Thread.sleep(1000);
		firstname.sendKeys(fname);
		Thread.sleep(1000);
		lastname.sendKeys(lname);
		Thread.sleep(1000);
		pwd.sendKeys(passwd);
		Thread.sleep(1000);
		confirmpwd.sendKeys(confpasswd);	
		
	}
	
	public void clickBtn() {
		continuebtn.click();
	}
	
	public void setOrgdetails(String cname,String caddress,String ccountry,String cprovince,String ccity,String cpostal) throws InterruptedException {
	companyname.sendKeys(cname);
	Thread.sleep(1000);
	companyaddress.sendKeys(caddress);
	Thread.sleep(1000);
	country.sendKeys(ccountry);
	countryvaltoselect.click();
	Thread.sleep(1000);
	Province.sendKeys(cprovince);
	Provincevaltoselect.click();
	Thread.sleep(1000);
	city.sendKeys(ccity);
	cityvaltoselect.click();
	Thread.sleep(1000);
	postalcode.sendKeys(cpostal);
	Thread.sleep(1000);
	organizationType.click();
	Thread.sleep(1000);
	selectval.click();
	Thread.sleep(1000);
	}
	
	public void nextBtn() {
		nextbtn.click();
	}
	
	public void roleSel() {
		role.click();
	}
	
	public void signupBtn() {
		signupBtn.click();
	}
	
    public void confirm() {
    	boolean status = cnfm.isDisplayed();
    	Assert.assertEquals(status, true);
    }
}
