package PredefinedChatMsg_Subclasses;



import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {
	
	private static int ColNum=5;
	


	public static void predefinedchatmsg(WebDriver driver) throws Exception{
	
	
		
		PredefinedChatMsg_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.verifysavemesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}


}
