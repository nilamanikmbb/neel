package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class LoginPage extends BaseClass{
static By txt_Username=By.name("txtUserName");
static By txt_password=By.xpath("//input[@name='txtPassword']");
static By btn_login=By.name("Submit");
public static void login(String un,String pw) throws Exception {
	driver.findElement(txt_Username).sendKeys(un);
	driver.findElement(txt_password).sendKeys(pw);
	driver.findElement(btn_login).click();
	System.out.println("login completed");
	Reporter.log("Login completed");
	Log.info("Login completed");
	Thread.sleep(3000);
}
	
}
