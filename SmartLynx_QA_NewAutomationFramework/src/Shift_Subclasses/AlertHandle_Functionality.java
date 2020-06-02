package Shift_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;

public class AlertHandle_Functionality {

	private static int ColNum=5;

	public static void shift(WebDriver driver) throws Exception{

		Shift_Methods.create(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(21, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(22, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(23, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(24, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(25, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad1 = new StopWatch();

		pageLoad1.start();

		Shift_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("btnAlertOK")));

		pageLoad1.stop();
		//Get the time
		long pageLoadTime_ms1 = pageLoad1.getTime()-3000;
		long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;

		ExcelUtils.setCellData("Alert Load Time: " + pageLoadTime_ms1 + " milliseconds", 27, 9);

		ExcelUtils.setCellData("Alert Load Time: " + pageLoadTime_Seconds1 + " milliseconds", 27, 10);

		System.out.println("Alert Load Time: " + pageLoadTime_ms1 + " milliseconds");
		System.out.println("Alert Load Time: " + pageLoadTime_Seconds1 + " seconds");

		

		Shift_Methods.alertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(29, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad = new StopWatch();
		pageLoad.start();

		Shift_Methods.save(driver).click();
		
		Thread.sleep(3000);
		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']//p")));

		pageLoad.stop();
		//Get the time
		long pageLoadTime_ms = pageLoad.getTime()-3000;
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds", 31, 9);

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " milliseconds", 31, 10);

		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " seconds");


		

		Shift_Methods.verifyalertsavemesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);






	}
}