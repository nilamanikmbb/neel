package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class VerifyPage extends BaseClass{
	public static void verifytitle(String Title) {
	if(driver.getTitle().equals(Title))
	{
		System.out.println("title match");
		Reporter.log("title match");
		Log.info("title match");
	}
	else
	{
		System.out.println("title not matched and expected title is"+driver.getTitle());
		Reporter.log("title not matched and expected title is"+driver.getTitle());
		Log.info("title not matched and expected title is"+driver.getTitle());
	}
	

}
}
