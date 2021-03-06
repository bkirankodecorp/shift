package Orderhold_Subclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Delete_Functionality {

	private static int ColNum=5;

	public static void orderhold(WebDriver driver) throws Exception{

		Orderhold_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(16, ColNum));

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.delete(driver).click();

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.deletealertcontent(driver);

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.ok(driver).click();


		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Orderhold_Methods.search(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);





	}
}