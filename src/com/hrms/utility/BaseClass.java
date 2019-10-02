package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	public static WebDriver driver;
	public static String framename="rightMenu";
	public static String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public static void OpenApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Datascience\\\\Desktop\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		System.out.println("Application open");
		Reporter.log("Application open");
		Log.info("Application open");
	}
	public static void CloseApp() {
		driver.quit();
		System.out.println("Application close");
		Reporter.log("Application close");
		Log.info("Application close");

	}
	public static void enterframe() {
		driver.switchTo().frame(framename);
		System.out.println("Enter to frame");
		Reporter.log("Enter to frame");
		Log.info("Enter to frame");

	}
	public static void exitframe() {
		driver.switchTo().defaultContent();
		System.out.println("Exit to frame");
		Reporter.log("Exit to frame");
		Log.info("Exit to frame");

	}

}
