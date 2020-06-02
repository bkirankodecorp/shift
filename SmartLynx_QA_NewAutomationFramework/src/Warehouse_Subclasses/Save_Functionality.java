package Warehouse_Subclasses;



import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void Warehouse(WebDriver driver) throws Exception{
	
	
	Warehouse_Methods.create(driver);
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.save(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	Warehouse_Methods.verifysavemesage(driver);
	
	Thread.sleep(3000);
	
	Warehouse_Methods.closeconfirmationmessage(driver).click();
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
	
	
	
	
	
	
	
	
	
	}


}
