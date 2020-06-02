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


public class Product_ExistingValues {
	public static void ExistingValues(WebDriver driver) throws Exception {
		Product_ScreenShots.CaptureScreenshot(driver);
		 // USE PAGE LIBRARY NOW

		
		driver.findElement(By.xpath(".//*[@id='btncreate']")).click();
	Thread.sleep(2000);
	Product_ScreenShots.CaptureScreenshot(driver);
	String Name=ExcelUtils.getstringCellData(15, 4);
	
	  driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode']")).sendKeys(Name);
	
	
	
	
	
	
	
	  Product_ScreenShots.CaptureScreenshot(driver);
		String Description = ExcelUtils.getstringCellData(17, 4);

	  driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc']")).sendKeys(Description);
	  Product_ScreenShots.CaptureScreenshot(driver);
	  driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span[1]")).click();
      Thread.sleep(3000);
      Product_ScreenShots.CaptureScreenshot(driver);
      int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
      Product_ScreenShots.CaptureScreenshot(driver);
      
      String Product_Category_Input = ExcelUtils.getstringCellData(19, 4);
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Product_Category_Input);
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
     /* driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[4]/div/span[1]/span/span[2]/span")).click();
      Thread.sleep(6000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      int ok_size1=driver.findElements(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'BARREL')]")).size();
      Thread.sleep(6000);
      driver.findElements(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'BARREL')]")).get(ok_size1-1).click();
      Thread.sleep(6000);
      */Product_ScreenShots.CaptureScreenshot(driver);
      /*
      driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
      Thread.sleep(9000);
      Product_ScreenShots.CaptureScreenshot(driver);
      
      
      
      driver.findElement(By.xpath(".//li[@class='k-item'][@data-offset-index='0'][contains(text(),'Gallons')]")).click();
      Product_ScreenShots.CaptureScreenshot(driver);
      */



			 Thread.sleep(5000);
         // Thread.sleep(2000);
          Product_ScreenShots.CaptureScreenshot(driver);
          driver.findElement(By.xpath("//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();;
          Thread.sleep(3000);
          Product_ScreenShots.CaptureScreenshot(driver);
          
          WebElement ExistingMessage = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
          
          
          if(ExistingMessage.isDisplayed())
          {
        	  System.out.println(ExistingMessage.getText());
        	  ExcelUtils.setCellData("Pass", 67, 7);
        	  ExcelUtils.setCellData(ExistingMessage.getText(), 67, 6);
        	   Product_ScreenShots.CaptureScreenshot(driver);
        	  driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button")).click();
        	  
        	   Product_ScreenShots.CaptureScreenshot(driver);  
          }
          
          else{
        	  ExcelUtils.setCellData("Fail", 67, 7);
        	  System.out.println("No Message");
        	  
          }
          Thread.sleep(3000);
          
          Product_ScreenShots.CaptureScreenshot(driver);
          
          
         WebElement UpDateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
          if( UpDateMessage .isDisplayed())
{
        	  Product_ScreenShots.CaptureScreenshot(driver);
            	System.out.println(UpDateMessage.getText());
            	ExcelUtils.setCellData(UpDateMessage.getText(), 68, 6);
            	ExcelUtils.setCellData("Pass", 68, 7);
            	
            	
}else{
	
	ExcelUtils.setCellData("Fail", 68, 7);
	
	System.out.println("NO Message displayed");
	
	
}
          
          
          
          
          
          
          
          
}
	
}
