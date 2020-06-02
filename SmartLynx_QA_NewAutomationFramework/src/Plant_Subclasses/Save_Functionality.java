package Plant_Subclasses;



import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void plant(WebDriver driver) throws Exception{
	
	
		
		Plant_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.verifysavemesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}


}
