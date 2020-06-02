package Vendor_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Delete_Functionality {
	
	private static int ColNum=5;
	
	public static void vendor(WebDriver driver) throws Exception{
		
		
		Vendor_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(29, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.delete(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.delmsgcont(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.ok(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.deleteconfirmedmesssgae(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.search(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
	
	
	
	
	
	

}
}