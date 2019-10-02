package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.DeleteempPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_103 extends BaseClass{
	@Test
	public static void tc103() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		BaseClass.OpenApp();
		VerifyPage.verifytitle("hrms");
		LoginPage.login("admin", "admin");
		VerifyPage.verifytitle("hrms");
		DeleteempPage.delemp("0049");
		LogoutPage.logout();
		BaseClass.CloseApp();
	}

}
