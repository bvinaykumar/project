package com.jass.commonmethods;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commonmethod {
public WebDriver driver;
	
		public void openBrowser(String sBrowser){
			if (sBrowser.equalsIgnoreCase("Firefox")){
				driver=new FirefoxDriver();
				System.setProperty("webdriver.gecko.driver","C:\\Users\\bvina\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");		
				System.out.println("Opening FireFox");
			    }else{
			    	System.out.println("Please open a browser Firefox");
//			    	Assert.fail();
			}
		}
		public void openURL(String sURL){
			driver.get(sURL);
			System.out.println("Opening URL");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		public void closeBrowser(){
			driver.quit();
			System.out.println("close Browser");
		
		}
		public void verifyText(String expected){
			 try{
				 driver.findElement(By.xpath("//*[contains(text(),'"+ expected.trim() +"')]"));
				 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" verified");
				// return true;
			 }
			 catch(NoSuchElementException e){
				 System.out.println("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
				 Assert.fail("On page " + driver.getTitle() + ". Expected Text \""+ expected +"\" not found");
			     
			 }
		}
	 
		public void click(String sXPATH){
			try{
				driver.findElement(By.xpath(sXPATH)).click();
				System.out.println(sXPATH+" clicked");
				 try {
						Thread.sleep(2000);
						
			}catch(Exception e){
				System.out.println(sXPATH+" not clicked");
				Assert.fail();
			}
			}
			
		public void click (WebElement slocator){
			try{
				slocator.click();
				System.out.println(slocator+" clicked");
				 try {
						Thread.sleep(2000);
					}
						e.printStackTrace();
					}
			}catch(Exception e){
				System.out.println(slocator+" not clicked");
				Assert.fail();
		}
		}
		 
		}
		public void sendValue(String sXPATH, String sValue){
			try{
				driver.findElement(By.xpath(sXPATH)).clear();
				driver.findElement(By.xpath(sXPATH)).sendKeys(sValue);;
				System.out.println(sValue+" entered");
			}catch(Exception e){
				System.out.println(sValue+" not entered");
				Assert.fail();		 
			}
		}		
}























































