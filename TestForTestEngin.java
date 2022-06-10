package com.testFacebookPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoAutomationAlertFramAndWindow.Alerts;
import com.demoAutomationTest.DemoPage;
import com.facebookpages.SignupPage;

import generic.BaseTest;

public class TestForTestEngin extends BaseTest{

	private SignupPage objSignUpPage;
	private Alerts objAlerts;
	private DemoPage objDemoPage;
	
	@BeforeSuite
	public void verifyAllMethodCall() {
		System.out.println("Call 1st Method");
		System.out.println("Call 2nd Method");
		System.out.println("Call 3rd Method");
	}
	
	@BeforeTest
	public void initializeOfEnv() {
		objSignUpPage = new SignupPage();
		 objDemoPage = new DemoPage();
		 objAlerts = new Alerts();
	}
	
	@BeforeClass
	public void getSetOfURL() {
	objSignUpPage.initilizeWebDriver("https://www.facebook.com/campaign/landing.php?campaign_id=16109720371&extra_1=s%7Cc%7C580541310639%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=580541310639&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D16109720371%26adgroupid%3D134258540818%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D1007769%26loc_interest_ms%3D%26feeditemid%3D%26");
	objDemoPage.initilizeWebDriver("https://demoqa.com/text-box");
	objAlerts.initilizeWebDriver("https://demoqa.com/alerts");
	
	}
	@BeforeMethod
	public void setUrlOfMethods() {
		
		System.out.println("Call 1st Method Called");
		System.out.println("Call 2nd Method Called");
		System.out.println("Call 3rd Method Called");
		}
	
	@Test
	public void verifySignupPage() {
		objSignUpPage.setFirstNameOnFaceBookPage();
		objSignUpPage.setLastNameOnFaceBookPage();
		objSignUpPage.setRegisterMailId();
	}
	
	@Test
	public void verifyTextBoxOfDemoQA() {
		objDemoPage.getTextBoxDetails();
	}
	
	@Test
	public void verifyAlertsOfDemoQA() {
		objAlerts.checkAleartsClicks();
	}
	
	@AfterSuite
	public void check() {
	System.out.println("1st Method executed");
	System.out.println("2nd Method executed");
	System.out.println("3rd Method executed");	
	}
	
	
	@AfterTest
	public void getResult() {
		System.out.println("1st result");
		System.out.println("2nd result");
		System.out.println("3d result");	
	}

	@AfterClass
	public void tearDownInBaseTest() {
		objSignUpPage.tearDown();
		objAlerts.tearDown();
		objDemoPage.tearDown();
	}

    @AfterMethod
	public void getOutPutPrinted() {
		System.out.println("1st Method executed");
		System.out.println("2nd Method executed");
		System.out.println("3rd Method executed");	
	}
	
}
