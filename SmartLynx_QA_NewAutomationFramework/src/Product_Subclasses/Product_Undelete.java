package Product_Subclasses;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;



public class Product_Undelete {
	
	public static void Undelete(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		 // USE PAGE LIBRARY NOW

	
		
		driver.findElement(By.xpath(".//*[@id='btncreate']")).click();
		Thread.sleep(3000);
		Product_ScreenShots.CaptureScreenshot(driver);
		String Name = ExcelUtils.getstringCellData(69, 4);
		  driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode']")).sendKeys(Name);
		  Product_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(3000);
		  ExcelUtils.setCellData("pass", 70, 7);
		  String Description =  ExcelUtils.getstringCellData(17, 4);

		  driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc']")).sendKeys(Description);;
		  Product_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span[1]")).click();
          Thread.sleep(2000);
          Product_ScreenShots.CaptureScreenshot(driver);
          int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
          Product_ScreenShots.CaptureScreenshot(driver);
          String Product_Category_Input =ExcelUtils.getstringCellData(19, 4);
          driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Product_Category_Input);
          Thread.sleep(6000);
          Product_ScreenShots.CaptureScreenshot(driver);
          
          driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
          Thread.sleep(5000);
          Product_ScreenShots.CaptureScreenshot(driver);
         
         // driver.findElements(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]")).get(ok_size-1).click();
          //driver.findElement(By.xpath("//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]")).click();
          Product_ScreenShots.CaptureScreenshot(driver);
	
	

  			
              driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).submit();
              Thread.sleep(2000);
              Product_ScreenShots.CaptureScreenshot(driver);
              
              WebElement UnDeleteMessage = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
              
              
            if(UnDeleteMessage.isDisplayed()){
            	
            	System.out.println(UnDeleteMessage.getText());
            	
            	
            	ExcelUtils.setCellData(UnDeleteMessage.getText(), 70, 6);
            	ExcelUtils.setCellData("Pass", 70, 7);
            	
            	Product_ScreenShots.CaptureScreenshot(driver);
            //	driver.findElement(By.xpath(".//*[@id='BaseProduct_IsRecordActive']")).click();
            	Product_ScreenShots.CaptureScreenshot(driver);
            	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
            	Product_ScreenShots.CaptureScreenshot(driver);
            }
            else{
            	
            	
            	ExcelUtils.setCellData("Fail", 72, 7);
            	System.out.println("No Message displayed");
            	
            	
            }
            Thread.sleep(4000);
            WebElement UpdateMessage = driver.findElement(By.xpath("//*[@id='frmImportProducts']/div/div/div[2]/div[1]/div/div/p"));

            if(UpdateMessage.isDisplayed()){
            
		System.out.println(UpdateMessage.getText());
		
		ExcelUtils.setCellData(UpdateMessage.getText(), 71, 6);
	}
            else{
            	
            	
            	System.out.println("No Message is Displayed");
            	ExcelUtils.setCellData("Fail", 71, 6);
            	
            }
            
            WebElement SearchDeleted = driver.findElement(By.xpath("//*[@id='txtSearchProductGrid']"));
            
            
            SearchDeleted.click();
            
            SearchDeleted.sendKeys(ExcelUtils.getstringCellData(69, 4));
            
            Thread.sleep(1000);
            SearchDeleted.sendKeys(Keys.ENTER);
            
            SearchDeleted.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            SearchDeleted.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            
    String GridData= driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]")).getText();
    Thread.sleep(5000);
    
    System.out.print(GridData);
           ExcelUtils.setCellData(GridData, 72, 6);
           Thread.sleep(5000);
 if(GridData.isEmpty()){
	  Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btncreate']")).click();
		Thread.sleep(3000);
		Product_ScreenShots.CaptureScreenshot(driver);
		String Name1 = ExcelUtils.getstringCellData(69, 4);
		  driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode']")).sendKeys(Name1);
		  Product_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(3000);
		  ExcelUtils.setCellData("pass", 70, 7);
		  String Description1 =  ExcelUtils.getstringCellData(17, 4);

		  driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc']")).sendKeys(Description1);;
		  Product_ScreenShots.CaptureScreenshot(driver);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span[1]")).click();
          Thread.sleep(2000);
          Product_ScreenShots.CaptureScreenshot(driver);
          int ok_size1=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
          Product_ScreenShots.CaptureScreenshot(driver);
          String Product_Category_Input1 =ExcelUtils.getstringCellData(19, 4);
          driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size1-1).sendKeys(Product_Category_Input1);
          Thread.sleep(6000);
          Product_ScreenShots.CaptureScreenshot(driver);
          
          driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size1-1).sendKeys(Keys.ENTER);
          Thread.sleep(5000);
          Product_ScreenShots.CaptureScreenshot(driver);
         
         // driver.findElements(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]")).get(ok_size-1).click();
          //driver.findElement(By.xpath("//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]")).click();
          Product_ScreenShots.CaptureScreenshot(driver);
	
	

  			
              driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).submit();
              Thread.sleep(2000);
              Product_ScreenShots.CaptureScreenshot(driver);
              
              WebElement UnDeleteMessage1    = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
              
              
              if(UnDeleteMessage1.isDisplayed()){
              	
              	System.out.println(UnDeleteMessage1.getText());
              	
              	
              	ExcelUtils.setCellData(UnDeleteMessage1.getText(), 70, 6);
              	ExcelUtils.setCellData("Pass", 70, 7);
              	
              	Product_ScreenShots.CaptureScreenshot(driver);
              	driver.findElement(By.xpath(".//*[@id='BaseProduct_IsRecordActive']")).click();
              	Product_ScreenShots.CaptureScreenshot(driver);
              	driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
              	Product_ScreenShots.CaptureScreenshot(driver);
              }
              else{
              	
              	
              	ExcelUtils.setCellData("Fail", 72, 7);
              	System.out.println("No Message displayed");
              	
              	
              }
              Thread.sleep(4000);
              WebElement UpdateMessage1 = driver.findElement(By.xpath("//*[@id='frmImportProducts']/div/div/div[2]/div[1]/div/div/p"));

              if(UpdateMessage1.isDisplayed()){
              
  		System.out.println(UpdateMessage1.getText());
  		ExcelUtils.setCellData("Pass", 72, 7);
  		ExcelUtils.setCellData(UpdateMessage1.getText(), 71, 6);
  	}
              else{
              	
              	
              	System.out.println("No Message is Displayed");
              	ExcelUtils.setCellData("Fail", 71, 6);
              	
              }
              
              WebElement SearchDeleted1 = driver.findElement(By.xpath("//*[@id='txtSearchProductGrid']"));
              
              
              SearchDeleted1.click();
              
              SearchDeleted1.sendKeys(ExcelUtils.getstringCellData(69, 4));
              
              Thread.sleep(1000);
              SearchDeleted1.sendKeys(Keys.ENTER);
              Thread.sleep(1000);
              SearchDeleted1.sendKeys(Keys.ENTER);
              Thread.sleep(5000);
      String GridData1= driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]")).getText();
      Thread.sleep(1000);
      System.out.print(GridData1);
 
 }
           
}
	
}
