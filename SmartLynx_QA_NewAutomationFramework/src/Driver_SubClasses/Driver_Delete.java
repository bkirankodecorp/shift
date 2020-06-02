package Driver_SubClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Product_Subclasses.Product_ScreenShots;
import Utility.ExcelUtils;

public class Driver_Delete {
	
	
	private static WebElement Delete = null;
	private static  WebElement Driverconfirmationok =null; 
	private static  WebElement Driverconfirmationcancel =null;
	private static WebElement DriverDeleteMessage = null;
	
	 public static WebElement Delete(WebDriver driver){

		 Delete = driver.findElement(By.xpath(".//*[@id='DriverGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
		 
		 return Delete;
		 
		 }
	 
	 
	 public static void Search(WebDriver driver) throws Exception{

	WebElement 	 Search = driver.findElement(By.id("txtSearchDriverGrid"));
		 

	Search.sendKeys(ExcelUtils.getstringCellData(90, 4));
	 ExcelUtils.setCellData("Pass", 90, 7);
	 Thread.sleep(3000);
Search.sendKeys(Keys.ENTER); 
Thread.sleep(3000);
Driver_ScreenShots.CaptureScreenshot(driver);
	
	
		 
		 }
	 
	 
	 public static WebElement Driverconfirmationok(WebDriver driver) throws Exception{
	 
				
         		
         // Accepting alert		
		 Driverconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 Driverconfirmationok.click();
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 Thread.sleep(3000);
		 
		 WebElement	 Search = driver.findElement(By.id("txtSearchDriverGrid"));
			
			
		
	String	 GridData = driver.findElement(By.xpath("//*[@id='DriverGrid']/div[2]")).getText();
	
	if(GridData.isEmpty()){
		 Driver_ScreenShots.CaptureScreenshot(driver);
		
		
		System.out.println(" grid has no data");
		Thread.sleep(3000);
		Search.clear();
		 Driver_ScreenShots.CaptureScreenshot(driver);
	}
	else{
		 Driver_ScreenShots.CaptureScreenshot(driver);
System.out.println(" grid has  data");
Thread.sleep(3000);
		Search.clear();
		 
		 Driver_ScreenShots.CaptureScreenshot(driver);
	}
		return Driverconfirmationok;
	 
	 }
	 
	 public static WebElement Driverconfirmationcancel (WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
		 Driverconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 Driverconfirmationcancel.click();
		 
		 Driver_ScreenShots.CaptureScreenshot(driver);
		 
		 WebElement	 Search = driver.findElement(By.id("txtSearchDriverGrid"));
			
			
		
	String	 GridData = driver.findElement(By.xpath("//*[@id='DriverGrid']/div[2]")).getText();
	
	if(GridData.isEmpty()){
		 Driver_ScreenShots.CaptureScreenshot(driver);
		
		
		System.out.println(" grid has no data");
		Thread.sleep(3000);
		Search.clear();
		 Driver_ScreenShots.CaptureScreenshot(driver);
	}
	else{
		 Driver_ScreenShots.CaptureScreenshot(driver);
System.out.println(" grid has  data");
Thread.sleep(3000);
Driver_ScreenShots.CaptureScreenshot(driver);
		Search.clear();
		 Driver_ScreenShots.CaptureScreenshot(driver);
	}
		 
 
		return Driverconfirmationcancel;
	 
	 }
	 
	 public static WebElement DriverDeleteMessage(WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
		 DriverDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(DriverDeleteMessage.isDisplayed()){
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 System.out.println(DriverDeleteMessage.getText());
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 ExcelUtils.setCellData(DriverDeleteMessage.getText(), 91, 6);
			 ExcelUtils.setCellData("Pass", 91, 7);
			 
		 }else{
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 
			 System.out.println("No Message is Printed");

			 ExcelUtils.setCellData("Fail", 91, 7);
			 
			 Driver_ScreenShots.CaptureScreenshot(driver);
		 }
         
		return DriverDeleteMessage;
	 
	 }
	 
	 public static void confirmationContent (WebDriver driver) throws Exception{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = ExcelUtils.getstringCellData(89, 5); 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
  
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 {
		 	System.out.println(ActualconfirmationText);
		 	ExcelUtils.setCellData("pass", 89, 7);
			 Driver_ScreenShots.CaptureScreenshot(driver);
		 	ExcelUtils.setCellData(ActualconfirmationText, 89, 6);
		 }   
		 else{
			 
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 ExcelUtils.setCellData("Fail", 89, 7);
			 	
			 	ExcelUtils.setCellData(ActualconfirmationText, 89, 6);
		 }
  
		// Thread.sleep(2000);
		 
		 
   // Accepting alert		
		 String     ExpectedconfirmationContent = ExcelUtils.getstringCellData(90, 5); 
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
  
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
			 Driver_ScreenShots.CaptureScreenshot(driver);
		 	System.out.println(ActualconfirmationContent);
	ExcelUtils.setCellData("pass", 90, 7);
		 	
		 	ExcelUtils.setCellData(ActualconfirmationContent, 90, 6);
		 }   
		 else
		 {
			 Driver_ScreenShots.CaptureScreenshot(driver);
			 System.out.println(ActualconfirmationContent);
				ExcelUtils.setCellData("Fail", 90, 7);
			 	
			 
			 
		 }
	 
	 }
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}