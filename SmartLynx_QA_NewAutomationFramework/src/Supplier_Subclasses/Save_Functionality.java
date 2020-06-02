package Supplier_Subclasses;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void supplier(WebDriver driver) throws Exception{
	
	

		Supplier_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.number(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.terminalmappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(15, ColNum));
		
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
		
		Supplier_Methods.vendormappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(18, ColNum));
		
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
		
		Supplier_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.verifysavemesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
	
	
	
	
	
	
	
	
	
	
	}


}
