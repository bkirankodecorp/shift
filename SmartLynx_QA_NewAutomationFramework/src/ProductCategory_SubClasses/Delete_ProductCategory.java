package ProductCategory_SubClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Product_Subclasses.Product_ScreenShots;
import Utility.ExcelUtils;

public class Delete_ProductCategory {

	
	private static WebElement Delete = null;
	private static WebElement Search = null;
	private static  WebElement productCategoryconfirmationok =null; 
	private static  WebElement productCategoryconfirmationcancel =null;
	private static WebElement productcategoryDeleteMessage = null;
	
	
	 public static WebElement Delete(WebDriver driver) throws Exception{

		 Delete = driver.findElement(By.xpath(".//*[@id='ProductCategoryGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
		 ExcelUtils.setCellData("Pass",28, 7); 
		 return Delete;
		 
		 }
        
	 public static WebElement Search (WebDriver driver)throws Exception{
        	 
        	 Search = driver.findElement(By.id("txtSearchProductCategoryGrid"));
        	 ExcelUtils.setCellData("Pass",27, 7);
             return Search;     	 
        
         }
	 
	 
	 public static WebElement productCategoryconfirmationok(WebDriver driver) throws Exception{
	     // Accepting alert		
		 productCategoryconfirmationok = driver.findElement(By.xpath(".//*[@id='btnConfirmationOK']"));
		 ExcelUtils.setCellData("Pass",33, 7); 
		 String griddata = driver.findElement(By.xpath("//*[@id='ProductCategoryGrid']/div[2]")).getText();
			
			if(griddata.isEmpty())
			{
				
			  System.out.println(griddata);
			  ExcelUtils.setCellData(griddata, 34, 6);
			  ExcelUtils.setCellData("Pass", 34, 7);
			  Product_ScreenShots.CaptureScreenshot(driver);
			  driver.findElement(By.id("txtSearchProductCategoryGrid")).clear();
			  
			}
			else
			{
				
				System.out.println("grid has data");
				  ExcelUtils.setCellData("Pass", 34, 7);
				  ExcelUtils.setCellData(griddata, 34, 5);
				  Product_ScreenShots.CaptureScreenshot(driver);
				  driver.findElement(By.id("txtSearchProductCategoryGrid")).clear();
			}
		return productCategoryconfirmationok;
	 
	 }
	 
	 public static WebElement productCategoryconfirmationcancel (WebDriver driver) throws Exception{
		 
			
  		
         // Accepting alert		
		 productCategoryconfirmationcancel = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[2]/button[1]"));
		 ExcelUtils.setCellData("Pass",31, 7); 
		 String griddata = driver.findElement(By.xpath("//*[@id='ProductCategoryGrid']/div[2]")).getText();
			
			if(griddata.isEmpty())
			{
				
			System.out.println(griddata);
			
			ExcelUtils.setCellData(griddata, 33, 6);
			  ExcelUtils.setCellData("Pass", 33, 7);
			  Product_ScreenShots.CaptureScreenshot(driver);
			  driver.findElement(By.id("txtSearchProductCategoryGrid")).clear();
			  
			}else{
				
				System.out.println("grid has data");
				  ExcelUtils.setCellData("Pass", 33, 7);
				  ExcelUtils.setCellData(griddata, 33, 5);
				  Product_ScreenShots.CaptureScreenshot(driver);
				  driver.findElement(By.id("txtSearchProductCategoryGrid")).clear();
			}
		return productCategoryconfirmationcancel;
	 
	 }
	 
	 
	 
	 public static WebElement PropductCategoryDeleteMessage(WebDriver driver) throws Exception{
		 
			
	  		
         // Accepting alert		
		 productcategoryDeleteMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
		 if(productcategoryDeleteMessage.isDisplayed()){
			 ExcelUtils.setCellData("Pass", 35, 7);
			 System.out.println(productcategoryDeleteMessage.getText());
			 ExcelUtils.setCellData(productcategoryDeleteMessage.getText(), 35, 6);
			 
		 }
		 else{
			 ExcelUtils.setCellData("Pass", 35, 7);
			 System.out.print("No Message is displayed");
			 
			 
		 }
		return productcategoryDeleteMessage;
	 
	 }
	 
	 
	 public static void confirmationContent (WebDriver driver) throws Exception{
		 
			Thread.sleep(2000);
		 String     ExpectedconfirmationText = ExcelUtils.getstringCellData(29, 4);
		 String     ActualconfirmationText = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmation']/div/div/div[1]/div/div[1]/h2")).getText();
     
		 if(ExpectedconfirmationText.equals(ActualconfirmationText))
		 { ExcelUtils.setCellData("Pass",29, 7); 
		 ExcelUtils.setCellData(ActualconfirmationText,29, 6); 
		 	System.out.println(ActualconfirmationText);
		 }   else{
			 
			 ExcelUtils.setCellData("Pass",29, 7); 
			 System.out.println("No delete Message");
			 ExcelUtils.setCellData(ActualconfirmationText,29, 6); 
			 
		 }
     
		// Thread.sleep(2000);
		 
		 
      // Accepting alert		
		 String     ExpectedconfirmationContent = ExcelUtils.getstringCellData(30, 5); 
		 String     ActualconfirmationContent = driver.findElement(By.xpath(".//*[@id='dvDeleteConfirmationContent']")).getText();
     
		 if(ExpectedconfirmationContent.equals(ActualconfirmationContent))
		 {
			 ExcelUtils.setCellData(ActualconfirmationContent,30, 6); 
			 ExcelUtils.setCellData("Pass",30, 7); 
		 	System.out.println(ActualconfirmationContent);
		 }   
		 else
		 {
			 System.out.println(ActualconfirmationContent);
			 
			 ExcelUtils.setCellData("Fail",30, 7);
			 
		 }
	 
	 }
	
	
	
}
