
package Orderhold_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class AlreadyExistOrderhold_Functionality {
	
private static int ColNum=5;
	
	public static void orderhold(WebDriver driver) throws Exception{
	
		
		Orderhold_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(22, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.searchforalreadyexistdotdefeclist(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(24, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.alreadyexistdotdefectlistvalidationmessage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(27, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.verifyalreadyexistupdationmesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Orderhold_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
		}

}
