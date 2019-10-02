package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;


public class AddEmpPage extends BaseClass{
	static By link_PIM=By.linkText("PIM");
	static By link_addemp=By.linkText("Add Employee");
	static By txt_firstname=By.name("txtEmpFirstName");
	static By txt_lastname=By.name("txtEmpLastName");
	static By btn_save=By.id("btnEdit");
	public static void addemp(String firstname,String lastname) throws Exception { 
	Actions action=new Actions(driver);
	WebElement element=driver.findElement(link_PIM);
	action.moveToElement(element).perform();
	driver.findElement(link_addemp).click();
	Thread.sleep(3000);
	BaseClass.enterframe();
	driver.findElement(txt_firstname).sendKeys(firstname);
	driver.findElement(txt_lastname).sendKeys(lastname);
	driver.findElement(btn_save).click();
	System.out.println("emp added");
	Reporter.log("emp added");
	Log.info("emp added");
	Thread.sleep(3000);
	BaseClass.exitframe();
}
}
