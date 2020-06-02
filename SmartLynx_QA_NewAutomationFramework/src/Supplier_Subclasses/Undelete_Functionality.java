package Supplier_Subclasses;

import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Undelete_Functionality {
	
private static int ColNum=5;
	
	public static void supplier(WebDriver driver) throws Exception{
	
		
	Supplier_Methods.create(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(41, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(42, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.undeletevalidationmessage1(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.update(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.verifyundeleteupdationmesage1(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.closeconfirmationmessage(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.create(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(49, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(50, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.undeletevalidationmessage2(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.update(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.verifyundeleteupdationmesage2(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.closeconfirmationmessage(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.create(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(57, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(58, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.undeletevalidationmessage3(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.undelete(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.update(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.verifyundeleteupdationmesage3(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Supplier_Methods.closeconfirmationmessage(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
		
	
	
		
	}

}
