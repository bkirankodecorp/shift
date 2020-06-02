package Vendor_Subclasses;

import org.openqa.selenium.*;

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

	driver.findElement(By.name(ExcelUtils.getstringCellData(7, locatorvalue))).click();

	Thread.sleep(3000);
	
	screenshot.CaptureScreenshot(driver);
	
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