package Shift_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;

public class Edit_Fucntionality {
	
	private static int ColNum=5;
	
	public static void shift(WebDriver driver) throws Exception{


		Shift_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(33, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		StopWatch pageLoad = new StopWatch();
		
        pageLoad.start();
		
		Shift_Methods.edit(driver);
		
Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	        
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("BaseShift_Description")));

	        pageLoad.stop();
	        //Get the time
	        long pageLoadTime_ms = pageLoad.getTime()-3000;
	        
	        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
	        
	        ExcelUtils.setCellData("Redirected to Edit Page in Shift Load Time: " + pageLoadTime_ms + " milliseconds", 34, 9);
	        
	        ExcelUtils.setCellData("Redirected to Edit Page in Shift  Load Time: " + pageLoadTime_Seconds + " seconds", 34, 10);
	        
	        System.out.println("Redirected to Edit Page in Shift  Load Time: " + pageLoadTime_ms + " milliseconds");
	        
	        System.out.println("Redirected to Edit Page in Shift  Load Time: " + pageLoadTime_Seconds + " seconds");
		
		Shift_Methods.description(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.description(driver).sendKeys(ExcelUtils.getstringCellData(35, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.starttime(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.starttime(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.starttime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(36, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.endtime(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.endtime(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Shift_Methods.endtime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(37, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.showscheduleuntil(driver).sendKeys(Keys.DELETE);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.showscheduleuntil(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(38, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		StopWatch pageLoad1 = new StopWatch();
		
        pageLoad1.start();
		
		Shift_Methods.update(driver).click();
		
Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		 WebDriverWait wait1 = new WebDriverWait(driver, 10);
	        
	        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']//p")));

	        pageLoad1.stop();
	        //Get the time
	        long pageLoadTime_ms1 = pageLoad1.getTime()-3000;
	        
	        long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;
	        
	        ExcelUtils.setCellData("Redirected to Main Page in Shift Load Time: " + pageLoadTime_ms1 + " milliseconds", 40, 9);
	        
	        ExcelUtils.setCellData("Redirected to Main Page in Shift  Load Time: " + pageLoadTime_Seconds1 + " seconds", 40, 10);
	        
	        System.out.println("Redirected to Edit Main in Shift  Load Time: " + pageLoadTime_ms1 + " milliseconds");
	        
	        System.out.println("Redirected to Edit Main in Shift  Load Time: " + pageLoadTime_Seconds1 + " seconds");
		
		Shift_Methods.verifyupdationmesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Shift_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
	}
}