package Shift_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {

	private static int ColNum=5;

	public static void shift(WebDriver driver) throws Exception{


		//Blank Input

		Shift_Methods.create(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.blankinputinshift(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(92, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.blankinputindescription(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(94, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.blankinputinstarttime(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(96, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.blankinputinendtime(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(98, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.blankinputinshowscheduleuntil(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(100, ColNum)));

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

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds", 101, 9);

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " milliseconds", 101, 10);

		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " seconds");




		//Invalid Input





		Shift_Methods.create(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(103, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(104, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(105, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(106, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(107, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.invalidinputinshift(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(110, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.invalidinputindescription(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(112, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad1 = new StopWatch();

		pageLoad1.start();

		Shift_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait1 = new WebDriverWait(driver, 10);

		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']//p")));

		pageLoad1.stop();
		//Get the time
		long pageLoadTime_ms1 = pageLoad1.getTime()-3000;

		long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms1 + " milliseconds", 113, 9);

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds1 + " seconds", 113, 10);

		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms1 + " milliseconds");

		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds1 + " seconds");









	}




}
