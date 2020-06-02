package Warehouse_Subclasses;

import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {
	
private static int ColNum=5;
	
	public static void Warehouse(WebDriver driver) throws Exception{
	
		Warehouse_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Warehouse_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.blankinputname(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(56, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.blankinputdes(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(58, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(61, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(62, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.name(driver).click();
		
		Warehouse_Methods.invalidnameinput(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.name(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(65, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).click();
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.invaliddesinput(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(67, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Warehouse_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		}

	
	

}
