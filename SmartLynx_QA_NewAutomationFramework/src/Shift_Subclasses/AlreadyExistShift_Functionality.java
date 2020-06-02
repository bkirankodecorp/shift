package Shift_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;

public class AlreadyExistShift_Functionality {

	private static int ColNum=5;

	public static void shift(WebDriver driver) throws Exception{


		Shift_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(70, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.searchforalreadyexistshift(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.create(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(72, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(73, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(74, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(75, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(76, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		StopWatch pageLoad1 = new StopWatch();

		pageLoad1.start();

		Shift_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait1 = new WebDriverWait(driver, 10);

		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'An entered Shift already exists. Please edit this one or create a new with unique value.')]")));

		pageLoad1.stop();
		//Get the time
		long pageLoadTime_ms1 = pageLoad1.getTime()-3000;

		long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;

		ExcelUtils.setCellData("Already Existed ShiftID Validation fired Load Time: " + pageLoadTime_ms1 + " milliseconds", 78, 9);

		ExcelUtils.setCellData("Already Existed ShiftID Validation fired Load Time: " + pageLoadTime_Seconds1 + " seconds", 78, 10);

		System.out.println("Already Existed ShiftID Validation fired Load Time: " + pageLoadTime_ms1 + " milliseconds");

		System.out.println("Already Existed ShiftID Validation fired Load Time: " + pageLoadTime_Seconds1 + " seconds");




		Shift_Methods.alreadyexistfile(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(79, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(80, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(81, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(82, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad3 = new StopWatch();

		pageLoad3.start();

		Shift_Methods.update(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait3 = new WebDriverWait(driver, 10);

		wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']//p")));

		pageLoad3.stop();
		//Get the time
		long pageLoadTime_ms3 = pageLoad3.getTime()-3000;

		long pageLoadTime_Seconds3 = pageLoadTime_ms3 / 1000;

		ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms3 + " milliseconds", 84, 9);

		ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_Seconds3 + " seconds", 84, 10);

		System.out.println("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms3 + " milliseconds");

		System.out.println("Redirected to Main Page in Shift Load Time: " + pageLoadTime_Seconds3 + " seconds");


		

		Shift_Methods.verifyalreadyexistupdationmesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);









	}

}
