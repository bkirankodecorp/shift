package PredefinedChatMsg_Subclasses;

import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {
	
private static int ColNum=5;
	
	public static void predefinedchatmsg(WebDriver driver) throws Exception{
	
		
		PredefinedChatMsg_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.blankinputindescription(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(39, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.savemessage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(44, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.description(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.invalidinputindescripiton(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(47, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		PredefinedChatMsg_Methods.back(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

	
	

}
