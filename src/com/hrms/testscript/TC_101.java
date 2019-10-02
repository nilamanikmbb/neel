package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_101 {
	@Test
	public static void tc101() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		BaseClass.OpenApp();
		VerifyPage.verifytitle("hrmd");
		LoginPage.login("admin", "admin");
		VerifyPage.verifytitle("hrmd");
		LogoutPage.logout();
		BaseClass.CloseApp();
	}

}
