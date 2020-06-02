package Product_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;



public class Edit_Product {

	
	
	  private static WebElement Editbutton = null;
	
	  
	    private static WebElement EditDescription = null; 
	    private static WebElement EditProductCategorydropdown = null;
	    private static WebElement EditProductCategoryinput = null;
	    private static WebElement EditUnitOfMeasuresselect = null;
	    private static WebElement EditUnitOfMeasuresselectone=null;
	    private static WebElement EditProductSoldAs = null;
	    private static WebElement Editcheckbox =null;
	    private static WebElement Update =null;
	    private static WebElement EditProductSoldAsSearchbox = null;
	    private static WebElement UpdateMessage =null;
	  public static WebElement Editbutton(WebDriver driver) throws Exception{

			 Editbutton = driver.findElement(By.xpath("//*[@id='ProductGrid']/div[2]/table/tbody/tr[1]/td[5]/a"));
			 ExcelUtils.setCellData("Pass", 40, 7);
			 return Editbutton;
			 
			 }
	  
	  

		public static WebElement EditDescription(WebDriver driver) throws Exception{
			// TODO Auto-generated method stub
			
			    EditDescription =  driver.findElement(By.xpath("//*[@id='BaseProduct_NumDesc']"));
			    ExcelUtils.setCellData("Pass", 41, 7);
		        return EditDescription;
		}

		public static WebElement EditProductCategorydropdown(WebDriver driver)throws Exception{
			
			EditProductCategorydropdown = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[3]/div/span[1]/span/span[1]"));
			
//			WebElement input = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
			 ExcelUtils.setCellData("Pass", 42, 7);
			return EditProductCategorydropdown;
		}
		public static WebElement  EditProductCategoryinput(WebDriver driver) throws Exception
		{
			
			 Product_ScreenShots.CaptureScreenshot(driver);
			 int ok_size=driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).size();
			  Product_ScreenShots.CaptureScreenshot(driver);
             driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(43, 4));
             Thread.sleep(6000);
             ExcelUtils.setCellData("Pass", 43, 7);
              Product_ScreenShots.CaptureScreenshot(driver);
             driver.findElements(By.xpath(".//span[@class='k-list-filter']/input")).get(ok_size-1).sendKeys(Keys.ENTER);
              Product_ScreenShots.CaptureScreenshot(driver);
             
             
            
             
                
                Thread.sleep(3000);
			
			return  EditProductCategoryinput;
		}
		public static WebElement EditUnitOfMeasuresselect(WebDriver driver)throws Exception{
			
			EditUnitOfMeasuresselect = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/div[4]/div/span[1]/span/span[2]/span"));
			 ExcelUtils.setCellData("Pass", 46, 7);
			return EditUnitOfMeasuresselect;
		}

		public static void EditUnitOfMeasuresselectone(WebDriver driver) throws Exception{
			
			
			 int ok_size=driver.findElements(By.xpath("//ul[@id='BaseProduct_UnitOfMeasure_listbox']/li[4]")).size();
			  Product_ScreenShots.CaptureScreenshot(driver);
            driver.findElements(By.xpath("//ul[@id='BaseProduct_UnitOfMeasure_listbox']/li[4]")).get(ok_size-1).click();
            Thread.sleep(6000);
            ExcelUtils.setCellData("Pass", 47, 7);
             Product_ScreenShots.CaptureScreenshot(driver);
         //   driver.findElements(By.xpath("//ul[@id='BaseProduct_UnitOfMeasure_listbox']/li[4]")).get(ok_size-1).sendKeys(Keys.ENTER);
             Product_ScreenShots.CaptureScreenshot(driver);
            

		}
		
		public static void Bulk(WebDriver driver) throws Exception{
			
			  WebElement NonBulk = driver.findElement(By.xpath(".//*[@id='chkNonBulk']"));
			  
			  
			  if(NonBulk.isSelected()){
				  
				  WebElement  NonBulktype = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[2]/div[3]/div/span[1]/span/span[2]/span"));
				  
				  NonBulktype.click();
				  
				  WebElement  NonBulktypeSelect = driver.findElement(By.xpath(".//*[@id='BaseProduct_NonFuelTypeId_listbox']/li[2]"));
				  
				  NonBulktypeSelect.click();
				  
				  WebElement TruckMapping = driver.findElement(By.xpath("//a[contains(text(),'Product/Truck Mapping')]"));	  
				  
				  TruckMapping.click();
				  WebElement Search = driver.findElement(By.xpath(".//*[@id='TruckTypeAhead']"));
				  
				  
				  Search.sendKeys(ExcelUtils.getstringCellData(55, 4));
				  
				  Search.sendKeys(Keys.ENTER);
				  Thread.sleep(5000);
				  WebElement TruckCheckbox = driver.findElement(By.xpath(".//*[@id='ProductTrucksGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
				 
				  if(TruckCheckbox.isSelected()){
					  
					  
					  System.out.println("Checked");
					  
					  
				  }else{
					  
					  System.out.println("Checked");
					  TruckCheckbox.click();
					  
				  }
				  
				  
				  WebElement Update = driver.findElement(By.xpath(".//*[@name='btnCreate'][@type='submit']"));
				  
				  
				  Update.click();
				  
				  Thread.sleep(5000);
				  
				  WebElement  ExpectedUpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));	
					
				  if(ExpectedUpdateMessage.isDisplayed()){
					  
					  System.out.println(ExpectedUpdateMessage.getText());
					  
					  ExcelUtils.setCellData(ExpectedUpdateMessage.getText(), 58, 6);
					  
					  ExcelUtils.setCellData("Pass", 58, 7);
					  
					  
				  
				  }else{
					  
		             ExcelUtils.setCellData(ExpectedUpdateMessage.getText(), 58, 6);
					  
					 ExcelUtils.setCellData("Fail", 58, 7);
					  

					  
				  }
				  
				  
				  		  
			  }
			  
			  else
			  {
				  System.out.println("Clicking on the Product Sold as Tab");
					WebElement  ProductSoldAs =driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
					
					ProductSoldAs.click();
					 ExcelUtils.setCellData("Pass", 51, 7);
					Thread.sleep(3000);
					WebElement	ProductSoldAsSearchbox =driver.findElement(By.xpath(".//*[@id='SoldAsTypeAhead']"));
					
					ProductSoldAsSearchbox.sendKeys(ExcelUtils.getstringCellData(52, 4));
					Thread.sleep(3000);
					 ExcelUtils.setCellData("Pass", 52, 7);
					WebElement	checkbox =driver.findElement(By.xpath(".//*[@id='SoldAsProductsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
					checkbox.click();
					
					
					 ExcelUtils.setCellData("Pass", 53, 7);
				/*	WebElement	TruckMapping = driver.findElement(By.xpath(" //a[contains(text(),'Product/Truck Mapping')]"));
					 ExcelUtils.setCellData("Pass", 54, 7);
					TruckMapping.click();
					Thread.sleep(3000);
					
			          WebElement Search = driver.findElement(By.xpath(".//*[@id='TruckTypeAhead']"));
					  
			          ExcelUtils.setCellData("Pass", 55, 7);
					  Search.sendKeys(ExcelUtils.getstringCellData(55, 4));
					 
					  Search.sendKeys(Keys.ENTER);
					  Thread.sleep(3000);
					  
					  WebElement TruckCheckbox = driver.findElement(By.xpath(".//*[@id='ProductTrucksGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
					  if(TruckCheckbox.isSelected()){
						  
						  
						  System.out.println("Checked");
						  
						  ExcelUtils.setCellData("Pass", 56, 7);
					  }else{
						  
						  System.out.println("Checked");
						  TruckCheckbox.click();
						  ExcelUtils.setCellData("Pass", 56, 7);
						  
					  }
					  
					  */
					  Thread.sleep(3000);
					  
					  WebElement Update = driver.findElement(By.xpath(".//*[@name='btnCreate'][@type='submit']"));
					  ExcelUtils.setCellData("Pass", 27, 7);
					  
					  Update.click();
					  Thread.sleep(6000);
					  
					  
					  
					  WebElement  ExpectedUpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));	
						
					  if(ExpectedUpdateMessage.isDisplayed()){
						  
						  System.out.println(ExpectedUpdateMessage.getText());
						  
						  ExcelUtils.setCellData(ExpectedUpdateMessage.getText(), 58, 6);
						  
						  ExcelUtils.setCellData("Pass", 58, 7);
						  
						  
					  
					  }else{
						  
			             ExcelUtils.setCellData(ExpectedUpdateMessage.getText(), 58, 6);
						  
						 ExcelUtils.setCellData("Fail", 58, 7);
						  

						  
					  }
			  }
		}
			
	
		public static WebElement Update(WebDriver driver){
  
			return Update;
			
		}
		
		public static void UpdateMessage(WebDriver driver){
		WebElement	UpdateMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));
			
		System.out.print(UpdateMessage.getText());
			
		}
		
		
		
		
		
		
		
}
