package Vendor_Subclasses;

import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {
	
private static int ColNum=5;
	
	public static void vendor(WebDriver driver) throws Exception{
	
		Vendor_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.number(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.blankinputinnumber(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(88, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.blankinputinname(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(90, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.number(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(93, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(94, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.number(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.invalidinputinnumber(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.number(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(97, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.invalidinputinname(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(99, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Vendor_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		}

	
	

}
