package Warehouse_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Undelete_Functionality {
	
private static int ColNum=5;
	
	public static void Warehouse(WebDriver driver) throws Exception{
	
		Warehouse_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(30, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(31, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.undelerrormsg(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.verifyundeleteupdationmesage1(driver);
		
		Thread.sleep(3000);
		
		Warehouse_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(37, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Warehouse_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(39, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(40, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.save(driver).click();
	
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.undelerrormsg(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.undelete(driver).click();
	
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.verifyundeleteupdationmesage2(driver);
		
		Thread.sleep(3000);
		
		Warehouse_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
	}

}
