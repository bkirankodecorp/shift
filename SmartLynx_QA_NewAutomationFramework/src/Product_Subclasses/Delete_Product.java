package Product_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.ExcelUtils;
public class Delete_Product {
	private static WebElement Delete = null;
	private static  WebElement confirmationok =null; 
	private static  WebElement confirmationcancel =null;
	
	public static void search(WebDriver driver) throws Exception{
		
		WebElement Delete_Search = driver.findElement(By.id("txtSearchProductGrid"));
		
		
		Delete_Search.sendKeys(ExcelUtils.getstringCellData(59, 4));
		 ExcelUtils.setCellData("Pass", 59, 7);
		 Product_ScreenShots.CaptureScreenshot(driver);
		 Delete_Search.sendKeys(Keys.ENTER); 
		Thread.sleep(2000);
		
		 Delete_Search.sendKeys(Keys.ENTER);
		 Product_ScreenShots.CaptureScreenshot(driver);
	}
	
	
	
	
	
	
	
	
	 public static WebElement Delete(WebDriver driver) throws Exception{

		 Delete = driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]/table/tbody/tr[1]/td[6]/a"));
		 
		 ExcelUtils.setCellData("Pass", 60, 7);
		 
		 return Delete;
		 
		 }
	 
	 
	 public static void confirmationok (WebDriver driver) throws Exception{
	 
				
         		
         // Accepting alert		
        confirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
        
        ExcelUtils.setCellData("Pass", 65, 7);
        Product_ScreenShots.CaptureScreenshot(driver);
        confirmationok.click();
        Thread.sleep(5000);
      //  driver.findElement(By.id("txtSearchProductGrid")).sendKeys(ExcelUtils.getstringCellData(59, 4));
        
      //  Thread.sleep(5000);
	String griddata = driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]")).getText();
	Product_ScreenShots.CaptureScreenshot(driver);
		if(griddata.isEmpty())
		{
			
		System.out.println(griddata);
		
		Thread.sleep(3000);
		ExcelUtils.setCellData(griddata, 66, 6);
		 ExcelUtils.setCellData("Pass", 66, 7);
		 Product_ScreenShots.CaptureScreenshot(driver);
		 driver.findElement(By.id("txtSearchProductGrid")).clear();
		}else{
			ExcelUtils.setCellData(griddata, 66, 6);
			System.out.println("grid has data");
			 ExcelUtils.setCellData("fail", 66, 7);
			 Product_ScreenShots.CaptureScreenshot(driver);
			 driver.findElement(By.id("txtSearchProductGrid")).clear();
			
		}
		
		
		
		
		
		
		
		
		
		
	 
	 }
	 
	 public static void confirmationcancel (WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
        confirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
        ExcelUtils.setCellData("Pass", 63, 7);
        Product_ScreenShots.CaptureScreenshot(driver);
        confirmationcancel.click();
        Product_ScreenShots.CaptureScreenshot(driver);
       // Thread.sleep(3000);
      //  driver.findElement(By.id("txtSearchProductGrid")).sendKeys(ExcelUtils.getstringCellData(59, 4));
        Thread.sleep(3000);
String griddata = driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]")).getText();
		
		if(griddata.isEmpty())
		{
			
		System.out.println(griddata);
		
		ExcelUtils.setCellData(griddata, 64, 6);
		  ExcelUtils.setCellData("Pass", 64, 7);
		  Product_ScreenShots.CaptureScreenshot(driver);
		  driver.findElement(By.id("txtSearchProductGrid")).clear();
		  
		}else{
			
			System.out.println("grid has data");
			  ExcelUtils.setCellData("Pass", 64, 7);
			  ExcelUtils.setCellData(griddata, 64, 5);
			  Product_ScreenShots.CaptureScreenshot(driver);
			  driver.findElement(By.id("txtSearchProductGrid")).clear();
		}
        
        
	
	 
	 }
	 
	 public static void confirmationContent (WebDriver driver) throws Exception{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = ExcelUtils.getstringCellData(61, 5); 
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
        
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 {
		 	System.out.println(ActualconfirmationText);
		 	
		 	ExcelUtils.setCellData("Pass", 61, 7);
		 	ExcelUtils.setCellData(ActualconfirmationText, 61, 6);
		 	Product_ScreenShots.CaptureScreenshot(driver);
		 	
		 }   
		 else{
			 
			 
			 System.out.println(ActualconfirmationText);
			 Product_ScreenShots.CaptureScreenshot(driver);
			 	ExcelUtils.setCellData("Fail", 61, 7);
			 
			 
		 }
		 Thread.sleep(2000);
		 
		 
         // Accepting alert		
		 String     ExpectedconfirmationContent = ExcelUtils.getstringCellData(62, 5); 
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
        
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
		 	System.out.println(ActualconfirmationContent);
		 	
		 	ExcelUtils.setCellData("Pass", 62, 7);
		 	Product_ScreenShots.CaptureScreenshot(driver);
		 	
		 	ExcelUtils.setCellData(ActualconfirmationContent, 62, 6);
		 	
		 }   
		 else{
			 
			 System.out.println("data not matched");
			 Product_ScreenShots.CaptureScreenshot(driver);
			 ExcelUtils.setCellData("Fail", 62, 7);
			 
		 }
        
        
        
        
        
        
        
        
		
	 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
