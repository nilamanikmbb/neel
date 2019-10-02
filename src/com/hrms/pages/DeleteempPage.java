package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class DeleteempPage extends BaseClass{
	static By link_PIM=By.linkText("PIM");
	static By link_emplist=By.linkText("Employee List");
	static By dd_select=By.name("loc_code");
	static By txt_select=By.name("loc_name");
	static By btn_search=By.xpath("//input[@value='Search'][@type='button']");
	static By radio_btn=By.name("chkLocID[]");
	static By btn_delete=By.xpath("//input[@value='Delete'][@type='button']");
	public static void delemp(String id) throws Exception {
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(link_PIM);
		a.moveToElement(e).perform();
		driver.findElement(link_emplist).click();
		Thread.sleep(3000);
		BaseClass.enterframe();
		Select s=new Select(driver.findElement(dd_select));
		s.selectByIndex(1);
		driver.findElement(txt_select).sendKeys(id);
		driver.findElement(btn_search).click();
		Thread.sleep(3000);
		driver.findElement(radio_btn).click();
		driver.findElement(btn_delete).click();
		Thread.sleep(3000);
		System.out.println("employee deleted");
		Reporter.log("employee deleted");
		Log.info("employee deleted");
		BaseClass.exitframe();
	}

}
