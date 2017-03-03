package com.jass.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jass.common.CommonMethods;
import com.jass.common.DataDriverXLS;
import com.jass.pageobject.CreateAccountPage;


public class LoginTest2 {
	String sURL="http://107.170.213.234/catalog/";
	String ExpectedText = "Welcome to iBusiness";
	public CommonMethods CM;
	CreateAccountPage CP;
	DataDriverXLS GetExcel;

  

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


	@Test
	public void testcase01() throws IOException  {
	
		GetExcel=new DataDriverXLS("‪C:\\Selenium\\Book1.xlsx");
		//System.out.println(GetExcel.getColumnCount("Sheet1"));
		 //  String getData=GetExcel.getCellData("Sheet1",1,2);
		 //  System.out.println(getData);
	    //   System.out.println("Swathi1");
	   //CP= new CreateAccountPage();
	   //CP.clickCreateAccount();
	  
			}


}
