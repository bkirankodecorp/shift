
package DOTDefectList_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class AlreadyExistDOTDefectList_Functionality {
	
private static int ColNum=5;
	
	public static void dotdefectlist(WebDriver driver) throws Exception{
	
		
		DOTDefectList_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(22, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.searchforalreadyexistdotdefeclist(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(24, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.alreadyexistdotdefectlistvalidationmessage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(27, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.verifyalreadyexistupdationmesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		DOTDefectList_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
		}

}
