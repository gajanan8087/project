package com.jbk.Eproc.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.Eproc.TestBase.TestBase;
import com.jbk.Eproc.Util.ExtentLogsReport;

public class LoginPageTest extends TestBase {
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		
		ExtentLogsReport.info(test1, "loginPageTitleTest is started");
		ExtentLogsReport.IExtentResult(test1, loginPage.validateloginpageTitle(), "loginPageTitle Test is passed", "loginPageTitle Test is Filed", "loginPageTitle Test is skipped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "loginPageTitleTest is completed");
		Assert.assertTrue(loginPage.validateloginpageTitle());
	}

	// ImageLogo check
//	@Test(priority = 2)
//	public void loginPageLogoImgTest() {
//		Assert.assertTrue(loginpage.validateJBKlogoImg());
//	}

	// Logo check
	@Test(priority = 3)
	public void loginPageLogoTest() {
		ExtentLogsReport.info(test1, "loginPageLogoTest started");
		ExtentLogsReport.IExtentResult(test1, loginPage.validateloginpageLogo(),"loginPageLogoTest is passed", "loginPageLogoTest is failed", "loginPageLogoTest is skiped", driver, "YES", "YES");
		ExtentLogsReport.info(test1, "loginPageLogoTest complieted");
		Assert.assertTrue(loginPage.validateloginpageLogo());
		
	}
	
 
	// Tagline check
	/*@Test(priority = 4)
	public void loginPageTaglineTest() {
		Assert.assertTrue(loginPage.validateloginpageLogoTagline());
	}

	@Test(priority = 5)
	public void loginPageLoginBoxMsg() {
		Assert.assertTrue(loginPage.validateLoginBoxMsg());
	}*/
	
/*	@Test(priority=6)
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String actResult=driver.getTitle();
		ExtentLogsReport.IExtentResult(test1, actResult, "JavaByKiran | Dashboard",  "Login Successful", "Login get failed", "Login tes get skiped", driver, "YES", "YES");
		ExtentLogsReport.pass(test1, "Login Successfully");
		test1.info("LoginTest get complieted");
		//ExtentLogsReport.info(test1, "LoginTest get complieted");
		//Assert.assertEquals(actResult, "JavaByKiran | Dashboard");
			}
*/

}
