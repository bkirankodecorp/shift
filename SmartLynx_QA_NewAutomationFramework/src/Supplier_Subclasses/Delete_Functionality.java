package Supplier_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Delete_Functionality {
	
	private static int ColNum=5;
	
	public static void supplier(WebDriver driver) throws Exception{
		
		Supplier_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(35, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.delete(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.delmsgcont(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.ok(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.deleteconfirmedmesssgae(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Supplier_Methods.search(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
	
	
	
	
	

}
}