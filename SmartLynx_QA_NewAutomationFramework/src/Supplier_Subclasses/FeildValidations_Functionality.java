package Supplier_Subclasses;

import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {
	
private static int ColNum=5;
	
	public static void supplier(WebDriver driver) throws Exception{
		
		
	
		Supplier_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.blankinputinnumber(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(95, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.blankinputinname(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(97, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.number(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(100, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(101, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.number(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.invalidinputinnumber(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.number(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(104, ColNum));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.invalidinputinname(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(106, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
		}

	
	

}
