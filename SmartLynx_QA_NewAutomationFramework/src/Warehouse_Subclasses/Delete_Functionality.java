package Warehouse_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Delete_Functionality {
	
	private static int ColNum=5;
	
	public static void Warehouse(WebDriver driver) throws Exception{
	
	Warehouse_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(23, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	Warehouse_Methods.search(driver).sendKeys(Keys.ENTER);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.delete(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.delmsgconf(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.ok(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
	
	Warehouse_Methods.search(driver).sendKeys(Keys.DELETE);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	
	
	

}
}