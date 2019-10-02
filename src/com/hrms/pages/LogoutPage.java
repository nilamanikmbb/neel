package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class LogoutPage extends BaseClass{
	static By link_logout=By.linkText("Logout");
	public static void logout(){
		driver.findElement(link_logout).click();
		System.out.println("logout comleted");
		Reporter.log("logout comleted");
		Log.info("logout comleted");
	}

}
