package Product_Subclasses;

import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sun.jna.platform.win32.OaIdl.EXCEPINFO;

import Utility.ExcelUtils;



 public class Product_Validation {

    private static MouseHandler mouse = null;
    private static WebElement button = null;
    private static WebElement Search = null;
    private static WebElement Description = null; 
    private static WebElement ProductCategorydropdown = null;
    private static WebElement ProductCategoryinput = null;
    private static WebElement EPA = null;
    private static WebElement HazmatMessageDropDown =null;
    private static WebElement submit = null;
    private static WebElement Meter = null;
    private static WebElement ProductModeSelect = null;
    private static WebElement ProductMode = null;
    private static WebElement HazmatMessageDropDownSelect=null;
    private static WebElement IRSMessagedropdown=null;
    private static WebElement IRSMessagedropdownSelect = null;
    private static WebElement CrossReferanceName= null;
    
    
    
    public static MouseHandler mouse (WebDriver driver) throws Exception{
    	
    	
    	    WebElement Maintenace = driver.findElement(By.xpath("//li[2]/span"));
    	 
    	    Maintenace.click();
    	  
    	    int ok_size1=driver.findElements(By.xpath("//li[2]/span")).size();
    	   
    	    Actions action2 = new Actions(driver);
    	   
    	   Thread.sleep(5000);

    	   action2.moveToElement(driver.findElements(By.xpath("//a[contains(text(),'Product')]")).get(ok_size1-1)).click();

    	   Thread.sleep(5000);

    	   driver.findElement(By.xpath("//a[contains(text(),'Product')]")).click();
    	   ExcelUtils.setCellData("Pass", 6, 7);
    	  return mouse;
	  
 }
    
    public static WebElement Search(WebDriver driver) throws Exception{

   	 Search = driver.findElement(By.xpath(".//*[@id='txtSearchProductGrid']"));
   	 ExcelUtils.setCellData("Pass", 7, 7);
   	 return Search;
   	 
   	 }

    
 
 public static WebElement button(WebDriver driver) throws Exception{

	 button = driver.findElement(By.xpath(".//*[@id='btncreate']"));
	 ExcelUtils.setCellData("Pass", 8, 7);
	 return button;
	 
	 }

 public static void FieldErrorMessage(WebDriver driver) throws Exception{
	 
	 
	    String ExpectedNameErrorMessage = ExcelUtils.getstringCellData(11, 5);
		String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode-error']")).getText();
		
		if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
		{
			System.out.println(ActualNameErrorMessage);
			ExcelUtils.setCellData(ActualNameErrorMessage, 11, 6);
			ExcelUtils.setCellData("Pass", 11, 7);
			
		} 
		else
		{
			ExcelUtils.setCellData(ActualNameErrorMessage, 11, 6);
			ExcelUtils.setCellData("Fail", 11, 7);
		}
	 
		    String ExpectedDescriptionErrorMessage = ExcelUtils.getstringCellData(12, 5);;
			String ActualDescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc-error']")).getText();
			
			if(ExpectedDescriptionErrorMessage.equals(ActualDescriptionErrorMessage))
			{
				System.out.println(ActualDescriptionErrorMessage);
				ExcelUtils.setCellData(ActualDescriptionErrorMessage, 12, 6);
				ExcelUtils.setCellData("Pass",12,7);
				
			}
			else
			{
				
				ExcelUtils.setCellData(ActualDescriptionErrorMessage, 12, 6);
				ExcelUtils.setCellData("Pass", 12, 7);
			}
		  
			    String ExpectedProductCategoryErrorMessage = ExcelUtils.getstringCellData(13, 5);
				String ActualProductCategoryErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-error']")).getText();
				
				if(ExpectedProductCategoryErrorMessage.equals(ActualProductCategoryErrorMessage))
				{
					System.out.println(ActualProductCategoryErrorMessage);
					ExcelUtils.setCellData(ActualProductCategoryErrorMessage, 13, 6);
					ExcelUtils.setCellData("Pass", 13, 7);
				}else{
					
					ExcelUtils.setCellData(ActualProductCategoryErrorMessage, 13, 6);
					ExcelUtils.setCellData("Pass", 13, 7);
					
}
	}
 
 

public static void Name(WebDriver driver) throws Exception {
	// TODO Auto-generated method stub
	
WebElement	Name = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode']"));
Name.sendKeys(ExcelUtils.getstringCellData(14, 4));
Thread.sleep(2000);
String ExpectedNameErrorMessage = ExcelUtils.getstringCellData(14, 5);
String ActualNameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode-error']")).getText();

if(ExpectedNameErrorMessage.equals(ActualNameErrorMessage))
{
	System.out.println(ActualNameErrorMessage);
	ExcelUtils.setCellData(ActualNameErrorMessage, 14, 6);
	ExcelUtils.setCellData("Pass",14, 7);
}
else
{
	System.out.println("Not Working");
	ExcelUtils.setCellData("Fail",14, 7);	
}
Thread.sleep(2000);
WebElement NameErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NameCode-error']"));

if(NameErrorMessage.isDisplayed())
{
	Name.clear();
	Name.sendKeys(ExcelUtils.getstringCellData(15, 4));
	ExcelUtils.setCellData("Pass",15, 7);
	
}
else
{
	System.out.println("NotWorking");
	ExcelUtils.setCellData("Fail",15, 7);
}

}
             
public static void Description(WebDriver driver) throws Exception {
	// TODO Auto-generated method stub
	
Description =  driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc']"));
Thread.sleep(2000);
Description.sendKeys(ExcelUtils.getstringCellData(16, 4));

String ExpectedDescriptionErrorMessage = ExcelUtils.getstringCellData(16, 5) ;
String ActualDescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc-error']")).getText();

if(ExpectedDescriptionErrorMessage.equals(ActualDescriptionErrorMessage))
{
	System.out.println(ActualDescriptionErrorMessage);
	
	ExcelUtils.setCellData(ActualDescriptionErrorMessage, 16, 6);
	
	ExcelUtils.setCellData("Pass", 16, 7);
	
}
else
{
	
	System.out.println(ActualDescriptionErrorMessage);
	
	ExcelUtils.setCellData("Fail", 16, 7);
	
}

Thread.sleep(2000);
WebElement DescriptionErrorMessage = driver.findElement(By.xpath(".//*[@id='BaseProduct_NumDesc-error']"));

if(DescriptionErrorMessage.isDisplayed())
{
	Description.clear();
	Description.sendKeys(ExcelUtils.getstringCellData(17, 4));
	System.out.println("data for Description  instered");
	ExcelUtils.setCellData("Pass", 17, 7);
}
else
{
	System.out.println("data for Description not instered");
	
	ExcelUtils.setCellData("Fail", 17, 7);
}
//return DescriptionErrorMessage;        
               
}
public static WebElement ProductCategorydropdown(WebDriver driver) throws Exception{
	
	ProductCategorydropdown = driver.findElement(By.xpath("//div[@id='tabProductDetails']/div/div/fieldset/div[3]/div/span/span/span[2]/span"));
	
//	WebElement input = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
	ExcelUtils.setCellData("pass", 18, 7);
	return ProductCategorydropdown;
}

public static WebElement ProductCategoryinput(WebDriver driver)throws Exception

{
	ProductCategoryinput = driver.findElement(By.xpath(".//*[@id='BaseProduct_DefaultProductCategoryId-list']/span/input"));
	ExcelUtils.setCellData("pass", 19, 7);
	return ProductCategoryinput;
}
public static WebElement  Meter(WebDriver driver)throws Exception{
	
	
	Meter = driver.findElement(By.xpath(".//*[@id='BaseProduct_MeterCalibration']"));
	ExcelUtils.setCellData("pass", 20, 7);
	return Meter;
	
}
public static void ToolTipsMessage(WebDriver driver) throws InterruptedException{
	
	WebElement	ToolTipsMessage= driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[1]/label/span/i"));
	
	
   System.out.println("Checking");
    
   Thread.sleep(3000);
  
	
	
	WebElement element = driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[1]/label/span/i"));

    Actions action = new Actions(driver);

    action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[1]/label/span/i"))).click().build().perform();
	
    System.out.println(ToolTipsMessage.getText());
}

public static WebElement ProductMode(WebDriver driver){
	
 ProductMode =driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[2]/div/span[1]/span/span[2]/span"));

	return ProductMode;
}

public static WebElement ProductModeSelect(WebDriver driver)throws Exception{
	
	  ProductModeSelect = driver.findElement(By.xpath("//*[@id='BaseProduct_ProductMode_listbox']/li"));
		ExcelUtils.setCellData("pass", 22, 7);
	 return ProductModeSelect;
}

public static WebElement HazmatMessageDropDown(WebDriver driver)throws Exception{
	
	HazmatMessageDropDown = driver.findElement(By.xpath("//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[3]/div/span[1]/span/span[2]/span"));
	
			return HazmatMessageDropDown;
}

public static WebElement HazmatMessageDropDownSelect(WebDriver driver)throws Exception{
	
	HazmatMessageDropDownSelect = driver.findElement(By.xpath("//*[@id='BaseProduct_HazmatMessageId_listbox']/li"));
	ExcelUtils.setCellData("pass", 22, 7);
			return HazmatMessageDropDownSelect;
}


public static WebElement IRSMessagedropdown(WebDriver driver)throws Exception{
	
	IRSMessagedropdown = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[1]/div[4]/div/span[1]/span/span[2]/span"));
	ExcelUtils.setCellData("pass", 23, 7);
	return IRSMessagedropdown;
	
	
}



public static WebElement IRSMessagedropdownSelect (WebDriver driver)throws Exception{
	
	IRSMessagedropdownSelect = driver.findElement(By.xpath("//*[@id='BaseProduct_IRSMessageId_listbox']/li"));
	ExcelUtils.setCellData("pass", 24, 7);
	return IRSMessagedropdownSelect;
	
}
public static WebElement EPA(WebDriver driver)throws Exception{
	
	
	EPA= driver.findElement(By.xpath(".//*[@id='BaseProduct_EPADisclaimer']"));
	ExcelUtils.setCellData("pass", 25, 7);
			return EPA;
}

public static WebElement CrossReferanceName(WebDriver driver) throws Exception{
	
	CrossReferanceName = driver.findElement(By.xpath(".//*[@id='BaseProduct_InvXId']"));
	
	CrossReferanceName.sendKeys(ExcelUtils.getstringCellData(10, 4));
	ExcelUtils.setCellData("pass", 29, 7);
	
	return CrossReferanceName;
}




public static void CrossReferanceDescription(WebDriver driver) throws Exception{

	WebElement	CrossReferanceDescription=driver.findElement(By.xpath(".//*[@id='BaseProduct_InvXDescription']"));
	
	CrossReferanceDescription.sendKeys(ExcelUtils.getstringCellData(30, 4));
	Thread.sleep(2000);	
	CrossReferanceDescription.sendKeys(Keys.TAB);
	Thread.sleep(2000);
	
	String ActualValidationMessageforDescription = ExcelUtils.getstringCellData(30, 5);
	String ExpectedValidationMessageforDescription = driver.findElement(By.xpath(".//*[@id='BaseProduct_InvXDescription-error']")).getText();
			
if(ActualValidationMessageforDescription.contentEquals(ExpectedValidationMessageforDescription)){
		
		System.out.println(ExpectedValidationMessageforDescription);
		ExcelUtils.setCellData("Pass", 30, 7);
		ExcelUtils.setCellData(ExpectedValidationMessageforDescription, 30, 6);
	}
else{
	ExcelUtils.setCellData("Fail", 30, 7);
	ExcelUtils.setCellData(ExpectedValidationMessageforDescription, 30, 6);

	
}

WebElement ExpectedValidationMessageDescription = driver.findElement(By.xpath(".//*[@id='BaseProduct_InvXDescription-error']"));

if(ExpectedValidationMessageDescription.isDisplayed()){
	
	System.out.println("TextPrinted");
	CrossReferanceDescription.clear();
	
	Thread.sleep(2000);
	
	CrossReferanceDescription.sendKeys(ExcelUtils.getstringCellData(31, 4));
	
	ExcelUtils.getstringCellData(31, 4);
	ExcelUtils.setCellData("Pass", 31, 7);
	
	
}else{
	
	//ExcelUtils.getstringCellData(10, 4);
	ExcelUtils.setCellData("Fail", 31, 7);
	
	
}

}

 


public static void Bulk(WebDriver driver) throws Exception{
	
	  WebElement NonBulk = driver.findElement(By.xpath(".//*[@id='chkNonBulk']"));
	  
	  
	  if(NonBulk.isSelected()){
		   
		  WebElement  NonBulktype = driver.findElement(By.xpath(".//*[@id='tabProductDetails']/div/div/fieldset[1]/fieldset[2]/div[3]/div/span[1]/span/span[2]/span"));
		  
		  NonBulktype.click();
		  ExcelUtils.setCellData("Pass", 26, 7);
		  WebElement  NonBulktypeSelect = driver.findElement(By.xpath(".//*[@id='BaseProduct_NonFuelTypeId_listbox']/li[2]"));
		  
		  NonBulktypeSelect.click();
		  ExcelUtils.setCellData("Pass", 27, 7);
		 
		  Thread.sleep(3000);
		  /*
		  WebElement TruckMapping = driver.findElement(By.xpath("//a[contains(text(),'Product/Truck Mapping')]"));	  
		  
		  TruckMapping.click();
		  ExcelUtils.setCellData("Pass", 35, 7);
		  Thread.sleep(3000);
		  WebElement Search = driver.findElement(By.xpath(".//*[@id='TruckTypeAhead']"));
		  
		  
		  Search.sendKeys(ExcelUtils.getstringCellData(36, 4));
		  ExcelUtils.setCellData("Pass", 36, 7);
		  Search.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  
		  WebElement TruckCheckbox = driver.findElement(By.xpath(".//*[@id='ProductTrucksGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		  TruckCheckbox.click();
		  ExcelUtils.setCellData("Pass", 37, 7);
		  
		  */
		  WebElement Save = driver.findElement(By.xpath(".//*[@name='btnCreate'][@type='submit']"));
		  
		  
		  Save.click();
		  ExcelUtils.setCellData("Pass", 38, 7);
		  Thread.sleep(5000);
		  
		  WebElement  ExpectedSaveMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));	
			
		  if(ExpectedSaveMessage.isDisplayed()){
			  
			  System.out.println(ExpectedSaveMessage.getText());
			  
			  ExcelUtils.setCellData(ExpectedSaveMessage.getText(), 38, 6);
			  
			  ExcelUtils.setCellData("Pass", 38, 7);
			  
			  
		  
		  }else{
			  
             ExcelUtils.setCellData(ExpectedSaveMessage.getText(), 38, 6);
			  
			 ExcelUtils.setCellData("Fail", 38, 7);
			  

			  
		  }
		  

		  		  
	  }
	  
	  else
	  {
		  System.out.println("Clicking on the Product Sold as Tab");
		  
		WebElement  ProductSoldAs =driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[2]/div[2]/div/div/nav/ul/li[2]/a"));
			
		ProductSoldAs.click();
		Thread.sleep(3000);
		WebElement	ProductSoldAsSearchbox =driver.findElement(By.xpath("//*[@id='SoldAsTypeAhead']"));
		
//		ProductSoldAsSearchbox.sendKeys(ExcelUtils.getstringCellData(33, 4));
		//Thread.sleep(3000);
	//	WebElement	checkbox =driver.findElement(By.xpath(".//*[@id='SoldAsProductsGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		//checkbox.click();
		
	/*	
		
		WebElement	TruckMapping = driver.findElement(By.xpath(" //a[contains(text(),'Product/Truck Mapping')]"));
		
		
		
		
		TruckMapping.click();
		Thread.sleep(3000);
		
          WebElement Search = driver.findElement(By.xpath(".//*[@id='TruckTypeAhead']"));
		  
		  
		  Search.sendKeys(ExcelUtils.getstringCellData(36, 4));
		 
		  Search.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  
		  WebElement TruckCheckbox = driver.findElement(By.xpath(".//*[@id='ProductTrucksGrid']/div[2]/table/tbody/tr[1]/td[1]/input"));
		  TruckCheckbox.click();
		*/  
		  Thread.sleep(3000);
		  
		  WebElement Save = driver.findElement(By.xpath(".//*[@name='btnCreate'][@type='submit']"));
		  
		  
		  Save.click();
		  Thread.sleep(6000);
		  
		  
		  
		  WebElement  ExpectedSaveMessage = driver.findElement(By.xpath(".//*[@id='griddiv']/div/div/form/div/div/div[2]/div[1]/div/div/p"));	
			
		  if(ExpectedSaveMessage.isDisplayed()){
			  
			  System.out.println(ExpectedSaveMessage.getText());
			  
			  ExcelUtils.setCellData(ExpectedSaveMessage.getText(), 10, 6);
			  
			  ExcelUtils.setCellData("Pass", 10, 7);
			  
			  
		  
		  }else{
			  
             ExcelUtils.setCellData(ExpectedSaveMessage.getText(), 10, 6);
			  
			 ExcelUtils.setCellData("Fail", 10, 7);
			  

			  
		  }
		  
	  }
}

public static WebElement submit(WebDriver driver){
	submit = driver.findElement(By.xpath(".//*[@id='form0']/div/div/div/div/div/div/div[1]/div/div[2]/button"));	
	return submit;
	
	
}


}