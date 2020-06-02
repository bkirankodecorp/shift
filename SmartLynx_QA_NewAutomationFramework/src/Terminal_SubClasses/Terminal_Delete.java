package Terminal_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Terminal_Delete {
	
	 public static void Delete(WebDriver driver) throws Exception{
			
			WebElement Delete_Search = driver.findElement(By.id("txtSearchTerminalGrid"));
			
			
			Delete_Search.sendKeys(ExcelUtils.getstringCellData(112, 4));
			 ExcelUtils.setCellData("Pass", 112, 7);
		
			 Delete_Search.sendKeys(Keys.ENTER); 
			 
			 Thread.sleep(3000);
			 Delete_Search.sendKeys(Keys.ENTER);  

			 Thread.sleep(3000);
			 
			 
			 WebElement Deletebutton = driver.findElement(By.xpath("//*[@id='TerminalGrid']/div[2]/table/tbody/tr[1]/td[6]/a"));
			 
			 
			 
			 Deletebutton.click();
			 Thread.sleep(3000);
			 String     ExpectedconfirmationText =  ExcelUtils.getstringCellData(113,5 );
			 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
	  
			 if(ExpectedconfirmationText.equals(ActualconfirmationText))
			 {
			 	System.out.println(ActualconfirmationText);
			 	
			 	ExcelUtils.setCellData(ActualconfirmationText, 113, 6);
			 	
			 	ExcelUtils.setCellData("Pass", 113, 7);
			 	
			 	
			 	
			 }   
			 else{
				 	System.out.println(ActualconfirmationText);
				 	ExcelUtils.setCellData(ActualconfirmationText, 113, 6);
				 	
				 	ExcelUtils.setCellData("Fail", 113, 6);
				 
			 }
			// Thread.sleep(2000);
			 
			 
	   // Accepting alert		
			 String     ExpectedconfirmationContent = ExcelUtils.getstringCellData(114,5 );
			 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
	  
			 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
			 {
			 	System.out.println(ActualconfirmationContent);
			 	 ExcelUtils.setCellData(ActualconfirmationContent,114 , 6);
			 	 ExcelUtils.setCellData("Pass",114 , 7);
			 }   
			 else
			 {
				 System.out.println(ActualconfirmationContent);
				 
				 ExcelUtils.setCellData("Fail",114 , 7);
				 
			 }
		 
	Thread.sleep(3000);
	
	
	 

	WebElement Delete_Cancel_Button = driver.findElement(By.xpath("//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
	
	Delete_Cancel_Button.click();
	
	Thread.sleep(2000);
	 
  Delete_Search.clear();
	Thread.sleep(5000);	 
	Delete_Search.sendKeys(ExcelUtils.getstringCellData(112, 4));	 
	 
	Thread.sleep(3000);
	Delete_Search.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	Delete_Search.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
		
		WebElement GridDate = driver.findElement(By.xpath("//*[@id='TerminalGrid']/div[2]"));
		
		if(GridDate.getText().isEmpty()){
			
			
			System.out.println("terminal is not deleted");
			ExcelUtils.setCellData("Pass", 113, 7);
			ExcelUtils.setCellData(GridDate.getText(), 113, 6);
			
			
		}else{
			
			

			System.out.println("terminal is not deleted");
			ExcelUtils.setCellData("Fail", 113, 7);
			
				
			
		}
		
		 
		Thread.sleep(6000);
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='TerminalGrid']/div[2]/table/tbody/tr[1]/td[6]/a")).click();
		 
		 Thread.sleep(5000);
		
		WebElement Delete_Ok = driver.findElement(By.xpath("//*[@id='btnConfirmationOK']"));
		
		Delete_Ok.click();
		Thread.sleep(5000);
		Delete_Search.clear();
		Thread.sleep(5000);
		Delete_Search.sendKeys(ExcelUtils.getstringCellData(112, 4));	 
		 
		Thread.sleep(3000);
		Delete_Search.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		
		WebElement GridData_Ok = driver.findElement(By.xpath("//*[@id='TerminalGrid']/div[2]"));
		
		
		if(GridData_Ok.getText().isEmpty()){
			
			System.out.println("terminal is deleted");
			ExcelUtils.setCellData(GridData_Ok.getText(), 116, 6);
			
			ExcelUtils.setCellData("Pass", 116, 7);
			
			
			
		}else{
			
			System.out.println("terminal is not  deleted");
			ExcelUtils.setCellData("Fail", 116, 7);
			
			
			
			
		}
		
	
	 }
}
		
		
		