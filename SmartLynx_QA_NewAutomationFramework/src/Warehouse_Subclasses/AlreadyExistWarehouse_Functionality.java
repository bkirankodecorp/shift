package Warehouse_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class AlreadyExistWarehouse_Functionality {
	
private static int ColNum=5;
	
	public static void Warehouse(WebDriver driver) throws Exception{
		
		
		Warehouse_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(44, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Warehouse_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.searchforalreadyexistwarehouse(driver);
		
		Thread.sleep(3000);
		
		Warehouse_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(45, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(46, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.alreadyexistfile(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(49, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.verifyalreadyexistupdationmesage(driver);
		
		Thread.sleep(3000);
		
		Warehouse_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		}

}
