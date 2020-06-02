package Vendor_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Edit_Fucntionality {
	
	private static int ColNum=5;
	
	public static void vendor(WebDriver driver) throws Exception{


		Vendor_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(20, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.edit(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(22, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.suppliermapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.suppliermappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(24, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.suppliermappingsearchbox(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.suppliermappingsearchbox(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.suppliermappingcheckbox(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.verifyupdationmesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
	
}
}