package Plant_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class AlreadyExistPlant_Functionality {
	
private static int ColNum=5;
	
	public static void plant(WebDriver driver) throws Exception{
	
		
		
		Plant_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(53, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.searchforalreadyexistplant(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(55, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(56, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.alreadyexistplantvalidationmessage1(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.verifyalreadyexistupdationmesage1(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(63, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(64, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.alreadyexistplantvalidationmessage2(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.verifyalreadyexistupdationmesage2(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.create(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(71, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(72, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.alreadyexistplantvalidationmessage3(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(75, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.verifyalreadyexistupdationmesage3(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Plant_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
		
		
		
		}

}
