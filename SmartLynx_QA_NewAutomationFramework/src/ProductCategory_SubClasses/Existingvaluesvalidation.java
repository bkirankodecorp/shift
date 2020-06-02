package ProductCategory_SubClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;



public class Existingvaluesvalidation {
	private static WebElement existingvalues =null;
	
	 public static  void  existingvalues(WebDriver driver) throws Exception{
	
	
		 String Description =ExcelUtils.getstringCellData(13, 4);
		 int MaxUserAutoClose = ExcelUtils.getintCellData(14, 4);
	        int MaxPMServerAutoClose = ExcelUtils.getintCellData(15, 4); 
			
 WebElement	createnew = driver.findElement(By.xpath(".//*[@id='btncreate']"));
 ProductCatagory_ScreenShots.CaptureScreenshot(driver); 
 createnew.click();

 ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(5000);
 
   driver.findElement(By.xpath(".//*[@id='BaseProductCategory_Description']")).sendKeys(Description);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);

  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']"));
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']")).clear();
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxManualAdjustment']")).sendKeys(String.valueOf(MaxUserAutoClose));
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
 
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  
 driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']"));
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']")).clear();
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);

  driver.findElement(By.xpath(".//*[@id='BaseProductCategory_MaxProductMovementAutoCloseAdjustment']")).sendKeys(String.valueOf(MaxPMServerAutoClose));
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  Thread.sleep(2000);
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  WebElement Save  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  Save.click();
 
  Thread.sleep(5000);
  
  WebElement ExistingValues = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[1]/div/div/p"));
  
  
  if(ExistingValues.isDisplayed())
  {
	  
	  System.out.print(ExistingValues.getText());
	  ExcelUtils.setCellData(ExistingValues.getText(), 24, 5); 
	  ExcelUtils.setCellData("Pass", 24, 7); 
	  Thread.sleep(5000);
	  WebElement Update  = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));
	  Update.click();
	  ExcelUtils.setCellData("Pass", 25, 7); 
	  ProductCatagory_ScreenShots.CaptureScreenshot(driver);
  }else{
	  
	  
	  System.out.print(ExistingValues.getText());
	  ExcelUtils.setCellData("Fail", 24, 7); 
  }
  

 Thread.sleep(2000);
 
System.out.println("ok");
  
WebElement UpDateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
if(UpDateMessage.isDisplayed())
 
{ExcelUtils.setCellData("Pass", 26, 7); 
ExcelUtils.setCellData(UpDateMessage.getText(), 26, 6); 
	
	System.out.println(UpDateMessage.getText());
	
	
}
else{
	
	ExcelUtils.setCellData("Pass", 26, 7); 
	System.out.println(UpDateMessage.getText());
	
}

 
	 }
}
