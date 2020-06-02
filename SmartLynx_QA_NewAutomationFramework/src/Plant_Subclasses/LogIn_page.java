package Plant_Subclasses;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.ExcelUtils;


public class LogIn_page {

public static WebElement login = null;

private static int locatorvalue=4;

private static int colnum=5;

public static WebElement login(WebDriver driver) throws Exception{
	
	driver.findElement(By.name(ExcelUtils.getstringCellData(5, locatorvalue))).sendKeys(ExcelUtils.getstringCellData(5, colnum));
	
	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);

	driver.findElement(By.name(ExcelUtils.getstringCellData(6, locatorvalue))).sendKeys(ExcelUtils.getstringCellData(6, colnum));

	Thread.sleep(3000);

	screenshot.CaptureScreenshot(driver);
	
	StopWatch pageLoad = new StopWatch();
    pageLoad.start();


	driver.findElement(By.name(ExcelUtils.getstringCellData(7, locatorvalue))).click();

	WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Maintenance')]")));

    pageLoad.stop();
    //Get the time
    long pageLoadTime_ms = pageLoad.getTime();
    long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
    
    ExcelUtils.setCellData("User Logged in: " + pageLoadTime_ms + " milliseconds", 7, 9);
    
    ExcelUtils.setCellData("User Logged in: " + pageLoadTime_Seconds + " seconds", 7, 10);

    
    System.out.println("User Logged in: " + pageLoadTime_ms + " milliseconds");
    System.out.println("User Logged in: " + pageLoadTime_Seconds + " seconds");
	
	WebElement mainpage=driver.findElement(By.xpath("//span[contains(text(),'Maintenance')]"));
	
	if(mainpage.isDisplayed()){
		
		
		ExcelUtils.setCellData("User Logged-in Successfully", 7,8);	
	
		System.out.println("User Logged-in Successfully");
	
		Thread.sleep(3000);
	
	}
	
	else{
		
		ExcelUtils.setCellData("User Logged-in UnSuccessfull", 7,8);	
		
	}
		
		
		
		
	
	

return login;

}

}