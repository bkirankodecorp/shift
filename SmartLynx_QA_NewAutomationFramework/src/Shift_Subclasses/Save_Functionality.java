package Shift_Subclasses;



import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;

public class Save_Functionality {

	private static int ColNum=5;



	public static void shift(WebDriver driver) throws Exception{

		try {
			
			StopWatch pageLoad2 = new StopWatch();

			pageLoad2.start();
			
			Shift_Methods.create(driver).click();
			
			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			WebDriverWait wait2 = new WebDriverWait(driver, 10);

			wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("BaseShift_ShiftId")));

			pageLoad2.stop();
			//Get the time
			long pageLoadTime_ms2 = pageLoad2.getTime()-3000;

			long pageLoadTime_Seconds2 = pageLoadTime_ms2 / 1000;

			ExcelUtils.setCellData("Redirected to Create New Page in Shift Load Time: " + pageLoadTime_ms2 + " milliseconds", 11, 9);

			ExcelUtils.setCellData("Redirected to Create New Page in Shift  Load Time: " + pageLoadTime_Seconds2 + " seconds", 11, 10);

			System.out.println("Redirected to Create New Page in Shift  Load Time: " + pageLoadTime_ms2 + " milliseconds");

			System.out.println("Redirected to Create New Page in Shift  Load Time: " + pageLoadTime_Seconds2 + " seconds");

			
			Shift_Methods.shift(driver).clear();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.shift(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(12, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(14, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(15, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(16, ColNum)));

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

			ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds", 18, 9);

			ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " milliseconds", 18, 10);

			System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds");
			
			System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " seconds");


			
			
			Shift_Methods.verifysavemesage(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			Shift_Methods.closeconfirmationmessage(driver).click();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		


















	}


}
