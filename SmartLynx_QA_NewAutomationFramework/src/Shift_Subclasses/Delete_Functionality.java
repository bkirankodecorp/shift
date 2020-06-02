package Shift_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Truck_Subclasses.screenshot;
import Utility.ExcelUtils;

public class Delete_Functionality {

	private static int ColNum=5;

	public static void shift(WebDriver driver) throws Exception{


		Shift_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(42, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad1 = new StopWatch();

		pageLoad1.start();

		Shift_Methods.delete(driver).click();


		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAlertOK")));

		pageLoad1.stop();
		//Get the time
		long pageLoadTime_ms1 = pageLoad1.getTime();
		long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;

		ExcelUtils.setCellData("Delete Alert Load Time: " + pageLoadTime_ms1 + " milliseconds", 43, 9);

		ExcelUtils.setCellData("Delete Alert Load Time: " + pageLoadTime_Seconds1 + " milliseconds", 43, 10);

		System.out.println("Delete Alert Load Time: " + pageLoadTime_ms1 + " milliseconds");
		System.out.println("Delete Alert Load Time: " + pageLoadTime_Seconds1 + " seconds");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.delmsgcont(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.ok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(42, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		try {

			if(driver.findElement(By.xpath(".//*[@id='ShiftGrid']/div[2]/table/tbody/tr[1]/td[1]")).isDisplayed()){

				ExcelUtils.setCellData("Shift is not Deleted Successfully", 45,7);

				ExcelUtils.setCellData("Fail", 45,8);

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				System.out.println("Shift is not deleted");


			}

		} catch (Exception e) {

			ExcelUtils.setCellData("Shift Deleted Successfully", 45,7);

			ExcelUtils.setCellData("Pass", 45,8);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			System.out.println("Shift Deleted Successfully");



		}









	}
}