package Trailer_SubClasses;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.jna.platform.unix.X11;

import Product_Subclasses.Product_ScreenShots;
import Utility.ExcelUtils;

public class Trailer_Delete {
	private static WebElement Delete = null;
	private static  WebElement Trailerconfirmationok =null; 
	private static  WebElement Trailerconfirmationcancel =null;
	private static WebElement TrailerDeleteMessage = null;
	
	
	 public static void Delete(WebDriver driver) throws Exception{
			
			WebElement Delete_Search = driver.findElement(By.id("txtSearchTrailerGrid"));
			
			
			Delete_Search.sendKeys(ExcelUtils.getstringCellData(102, 4));
			 ExcelUtils.setCellData("Pass", 102, 7);
		
			 Delete_Search.sendKeys(Keys.ENTER); 
			 
			 Thread.sleep(3000);
			 Delete_Search.sendKeys(Keys.ENTER);  

			 Thread.sleep(3000);
			 
			 
			 WebElement Deletebutton = driver.findElement(By.xpath("//*[@id='TrailerGrid']/div[2]/table/tbody/tr/td[6]/a"));
			 
			 
			 
			 Deletebutton.click();
			 Thread.sleep(3000);
			 String     ExpectedconfirmationText = "Confirmation"; 
			 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
	  
			 if(ExpectedconfirmationText.equals(ActualconfirmationText))
			 {
			 	System.out.println(ActualconfirmationText);
			 	
			 	ExcelUtils.setCellData(ActualconfirmationText, 60, 6);
			 	
			 	ExcelUtils.setCellData("Pass", 60, 6);
			 	
			 	
			 	// ExcelUtils.setCellData(TrailerDeleteMessage.getText(),53 , 6);
			 	 //ExcelUtils.setCellData(TrailerDeleteMessage.getText(),53 , 6);
			 	
			 }   
			 else{
				 	
				 	ExcelUtils.setCellData("Fail", 60, 6);
				 
			 }
			// Thread.sleep(2000);
			 
			 
	   // Accepting alert		
			 String     ExpectedconfirmationContent = ExcelUtils.getstringCellData(60,5 );
			 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
	  
			 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
			 {
			 	System.out.println(ActualconfirmationContent);
			 	 ExcelUtils.setCellData(ActualconfirmationContent,59 , 6);
			 	 ExcelUtils.setCellData("Pass",59 , 7);
			 }   
			 else
			 {
				 System.out.println(ActualconfirmationContent);
				 
				 ExcelUtils.setCellData("Fail",59 , 7);
				 
			 }
		 
	Thread.sleep(3000);
	
	
	 

	WebElement Delete_Cancel_Button = driver.findElement(By.xpath("//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
	
	Delete_Cancel_Button.click();
	
	Thread.sleep(2000);
	 
     Delete_Search.clear();
	Thread.sleep(5000);	 
	Delete_Search.sendKeys(ExcelUtils.getstringCellData(102, 4));	 
	 
	Thread.sleep(3000);
	Delete_Search.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	Delete_Search.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
		
		WebElement GridDate = driver.findElement(By.xpath("//*[@id='TrailerGrid']/div[2]"));
		
		if(GridDate.getText().isEmpty()){
			
			
			System.out.println("Trailer is not deleted");
			ExcelUtils.setCellData("Pass", 103, 7);
			ExcelUtils.setCellData(GridDate.getText(), 103, 6);
			
			
		}else{
			
			

			System.out.println("Trailer is  deleted");
			ExcelUtils.setCellData("Fail", 103, 7);
			
				
			
		}
		
		 
		Thread.sleep(6000);
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='TrailerGrid']/div[2]/table/tbody/tr/td[6]/a")).click();
		 
		 Thread.sleep(5000);
		
		WebElement Delete_Ok = driver.findElement(By.xpath("//*[@id='btnConfirmationOK']"));
		
		Delete_Ok.click();
		Thread.sleep(5000);
		Delete_Search.clear();
		Thread.sleep(5000);
		Delete_Search.sendKeys(ExcelUtils.getstringCellData(102, 4));	 
		 
		Thread.sleep(3000);
		Delete_Search.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		WebElement GridData_Ok = driver.findElement(By.xpath("//*[@id='TrailerGrid']/div[2]"));
		
		
		if(GridData_Ok.getText().isEmpty()){
			
			System.out.println("trailer is deleted");
			ExcelUtils.setCellData(GridData_Ok.getText(), 104, 6);
			
			ExcelUtils.setCellData("Pass", 104, 7);
			
			
			
		}else{
			
			System.out.println("trailer is not  deleted");
			ExcelUtils.setCellData("Fail", 104, 7);
			
			
			
			
		}
		
	
	 }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
		
	
