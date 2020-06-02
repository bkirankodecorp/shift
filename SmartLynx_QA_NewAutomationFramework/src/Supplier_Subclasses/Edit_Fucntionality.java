package Supplier_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Edit_Fucntionality {
	
	private static int ColNum=5;
	
	public static void supplier(WebDriver driver) throws Exception{


		Supplier_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(23, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.edit(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(25, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(27, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmappingsearchbox(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmappingsearchbox(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmappingcheckbox(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.vendormapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.vendormappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(30, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.vendormappingsearchbox(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.vendormappingsearchbox(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.vendormappingcheckbox(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.verifyupdationmesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
	}
}