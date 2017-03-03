package com.jass.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jass.common.CommonMethods;
import com.jass.pageobject.LogOffPage;
import com.jass.pageobject.SignInPage;
import com.jass.pageobject.WelcomePage;

public class LoginTests  extends CommonMethods {
		
		String sURL="http://107.170.213.234/catalog/";
		String ExpectedText = "Welcome to iBusiness";
		public CommonMethods CM;
		WelcomePage WP;
		SignInPage SI;
		LogOffPage LOP;

	@BeforeMethod
		public void setUp(){
		CM=new CommonMethods();
		
			CM.openBrowser("Firefox");
			CM.openUrl(sURL);
			
		}
	@AfterMethod
	public void tearDown(){
		CM.closeBrowser();

	}
//	@Test
//	public void testcase01(){
//       WP=new WelcomePage();
////       System.out.println("Swathi1");
//// 	   driver.findElement(By.xpath(".//*[@id='bodyContent']/div/div[1]/a[1]/u")).click();
//   	   WP.clickLogyourselfLink();
////   	  System.out.println("Swathi2");
//   	   SI=new SignInPage();
////   	  System.out.println("Swathi3");
//   	   SI.Login("ecalix@test.com","test123");
////   	  System.out.println("Swathi4");
//   	   CM.verifyText(ExpectedText);
////   	  System.out.println("Swathi5");
//   	   LOP=new LogOffPage();
////   	  System.out.println("Swathi6");
//   	   LOP.clickLogoff();
////   	   System.out.println("Swathi7");
//			}
@Test
public void testcase02(){
	WP=new WelcomePage();
	WP.clickLogyourselfLink();
	SI=new SignInPage();
	SI.Login("ecalix@test.com", "test123");
	CM.verifyText(ExpectedText);
	LOP=new LogOffPage();
	LOP.clickLogoff();
	
}
		
	}



