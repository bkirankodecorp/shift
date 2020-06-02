package Shift_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;

public class Undelete_Functionality {

	private static int ColNum=5;

	public static void shift(WebDriver driver) throws Exception{



		Shift_Methods.create(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(48, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(49, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(50, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(51, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(52, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		StopWatch pageLoad1 = new StopWatch();

		pageLoad1.start();

		Shift_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait1 = new WebDriverWait(driver, 10);

		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'An entered Shift already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]")));

		pageLoad1.stop();
		//Get the time
		long pageLoadTime_ms1 = pageLoad1.getTime()-3000;

		long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;

		ExcelUtils.setCellData("Undelete Validation fired Load Time: " + pageLoadTime_ms1 + " milliseconds", 54, 9);

		ExcelUtils.setCellData("Undelete Validation fired Load Time: " + pageLoadTime_Seconds1 + " seconds", 54, 10);

		System.out.println("Undelete Validation fired Load Time: " + pageLoadTime_ms1 + " milliseconds");

		System.out.println("Undelete Validation fired Load Time: " + pageLoadTime_Seconds1 + " seconds");


		

		Shift_Methods.undeletevalidationmessage1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad = new StopWatch();

		pageLoad.start();

		Shift_Methods.update(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']//p")));

		pageLoad.stop();
		//Get the time
		long pageLoadTime_ms = pageLoad.getTime()-3000;

		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;

		ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms + " milliseconds", 56, 9);

		ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_Seconds + " seconds", 56, 10);

		System.out.println("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms + " milliseconds");

		System.out.println("Redirected to Main Page in Shift Load Time: " + pageLoadTime_Seconds + " seconds");

		
		
		Shift_Methods.verifyundeleteupdationmesage1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.create(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(59, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(60, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(61, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(62, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(63, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		StopWatch pageLoad2 = new StopWatch();

		pageLoad2.start();

		Shift_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);

		wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(),'An entered Shift already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]")));

		pageLoad2.stop();
		//Get the time
		long pageLoadTime_ms2 = pageLoad2.getTime()-3000;

		long pageLoadTime_Seconds2 = pageLoadTime_ms2 / 1000;

		ExcelUtils.setCellData("Undelete Validation fired Load Time: " + pageLoadTime_ms2 + " milliseconds", 65, 9);

		ExcelUtils.setCellData("Undelete Validation fired Load Time: " + pageLoadTime_Seconds2 + " seconds", 65, 10);

		System.out.println("Undelete Validation fired Load Time: " + pageLoadTime_ms2 + " milliseconds");

		System.out.println("Undelete Validation fired Load Time: " + pageLoadTime_Seconds2 + " seconds");

		
		Shift_Methods.undeletevalidationmessage2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.undelete(driver).click();

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

		ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms3 + " milliseconds", 68, 9);

		ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_Seconds3 + " seconds", 68, 10);

		System.out.println("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms3 + " milliseconds");

		System.out.println("Redirected to Main Page in Shift Load Time: " + pageLoadTime_Seconds3 + " seconds");

		

		Shift_Methods.verifyundeleteupdationmesage2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Shift_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

	}

}
