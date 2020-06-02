package Warehouse_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Edit_Fucntionality {
	
	private static int ColNum=5;
	
	public static void Warehouse(WebDriver driver) throws Exception{

Warehouse_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(17, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
Warehouse_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	Warehouse_Methods.search(driver).sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	
	Warehouse_Methods.edit(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.description(driver).clear();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(19, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.update(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.verifyupdationmesage(driver);
	
	Thread.sleep(3000);
	
	Warehouse_Methods.closeconfirmationmessage(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
}
}