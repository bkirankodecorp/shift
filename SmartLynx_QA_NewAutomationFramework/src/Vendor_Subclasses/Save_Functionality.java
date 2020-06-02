package Vendor_Subclasses;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void vendor(WebDriver driver) throws Exception{
	
	
	Vendor_Methods.create(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Vendor_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Vendor_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Vendor_Methods.suppliermapping(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Vendor_Methods.suppliermappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(15, ColNum));
	
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
	
	Vendor_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Vendor_Methods.verifysavemesage(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Vendor_Methods.closeconfirmationmessage(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	
	
	
	
	
	
	
	
	
	
	}


}
