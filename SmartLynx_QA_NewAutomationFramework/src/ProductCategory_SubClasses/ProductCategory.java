package ProductCategory_SubClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import ContractFunctionalities.Login_Page;
import Utility.ExcelUtils;

public class ProductCategory {

	public static void Execute(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
	
		String sUserName = ExcelUtils.getstringCellData(4 , 4);

		String sPassword = ExcelUtils.getstringCellData(5, 4);
		
		String Search = ExcelUtils.getstringCellData(6, 4);
		Login_Page.txtbx_Username(driver).sendKeys(sUserName);
	     ExcelUtils.setCellData("Pass", 4, 7); 
		Login_Page.txtbx_Password(driver).sendKeys(sPassword);
		ExcelUtils.setCellData("Pass", 5, 7); 
		Login_Page.btn_Login(driver).click();
		ExcelUtils.setCellData("Pass", 6, 7); 
		int MaxUserAutoClose = ExcelUtils.getintCellData(15, 4);
        int MaxPMServerAutoClose = ExcelUtils.getintCellData(16, 4); 
        String Edit_Descritpion = ExcelUtils.getstringCellData(19,4);
        
        int Edit_MaxUserAutoClose = ExcelUtils.getintCellData(21, 4);
        int Edit_MaxPMServerAutoClose = ExcelUtils.getintCellData(22, 4); 
        ProductCategory_Validation.mouse(driver);
       
		//Search 
		        ProductCategory_Validation.Search(driver).sendKeys(Search);
				
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Thread.sleep(4000);
		//Createnew button		/*
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);	
				ProductCategory_Validation.createnew(driver).click();
			
		//Description feild validation
				Thread.sleep(2000);
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				
				ProductCategory_Validation.Save(driver).click();
				
				Thread.sleep(2000);
				ProductCategory_Validation.FieldErrorMessage(driver);
				
				
				ProductCategory_Validation.Description(driver);
				
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			//	Thread.sleep(6000);
			//	ProductCategory_Validation.Save(driver);
			
//			Thread.sleep(9000);


			//positive validation		
			//	ProductCategory_Validation.ErrorDescription(driver);
		//MaxUserAutoClose validation
				Thread.sleep(2000);
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			    ProductCategory_Validation.MaxUserAutoClose(driver).sendKeys(String.valueOf( MaxUserAutoClose));
		//MaxPMServerAutoClose
			Thread.sleep(2000);

			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			 
			ProductCategory_Validation.MaxPMServerAutoClose(driver).sendKeys(String.valueOf(MaxPMServerAutoClose));
		//Savebutton	
			Thread.sleep(2000);
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			//ProductCategory_Validation.ErrorDescription(driver);
			
			Thread.sleep(2000);
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			ProductCategory_Validation.Save(driver).click();
			
			Thread.sleep(6000);
			ProductCategory_Validation.SaveMessage(driver);
		
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			
			Edit_ProductCategory.Search(driver).sendKeys(ExcelUtils.getstringCellData(19, 4));
			Edit_ProductCategory.Search(driver).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
		//page is redirected to main page and edit button is clicked		
			Edit_ProductCategory.Edit(driver).click();
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			Thread.sleep(2000);
		//updating the description field values	
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Edit_ProductCategory.Edit_Descritpion(driver).clear();
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				
				Edit_ProductCategory.Edit_Descritpion(driver).sendKeys(Edit_Descritpion);
		//updating the 	MaxUserAutoClose field values
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Thread.sleep(2000);
				Edit_ProductCategory.Edit_MaxUserAutoClose(driver).clear();
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				
				Edit_ProductCategory.Edit_MaxUserAutoClose(driver).sendKeys(String.valueOf(Edit_MaxUserAutoClose));
		//Updating MaxPMServerAutoClose	field values	
				Thread.sleep(2000);
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Edit_ProductCategory.Edit_MaxPMServerAutoClose(driver).clear();
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			
				Edit_ProductCategory.Edit_MaxPMServerAutoClose(driver).sendKeys(String.valueOf(Edit_MaxPMServerAutoClose));
		//Updatebutton		
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Thread.sleep(2000);
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Edit_ProductCategory.Update(driver).click();
				Thread.sleep(3000);
				Edit_ProductCategory.UpDateMessage(driver);
				//Existing values
				Thread.sleep(3000);
			Existingvaluesvalidation.existingvalues(driver);
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);	
				
				
		//Delete button       
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Thread.sleep(2000);
				Delete_ProductCategory.Search(driver).sendKeys(ExcelUtils.getstringCellData(27,4));
				Delete_ProductCategory.Search(driver).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				Delete_ProductCategory.Search(driver).sendKeys(Keys.ENTER);
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Thread.sleep(3000);
				Delete_ProductCategory.Delete(driver).click();
		// popup cancel button     
				
				Delete_ProductCategory.confirmationContent(driver);
				
				Thread.sleep(3000);
				
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				
				//Delete_ProductCategory.productCategoryconfirmationok(driver).click();
				Delete_ProductCategory.productCategoryconfirmationcancel(driver).click();
				 ExcelUtils.setCellData("Pass",27, 7);
					Thread.sleep(3000);
					Delete_ProductCategory.Search(driver).sendKeys(ExcelUtils.getstringCellData(27,4));
					Delete_ProductCategory.Search(driver).sendKeys(Keys.ENTER);
					Thread.sleep(3000);
					Delete_ProductCategory.Search(driver).sendKeys(Keys.ENTER);
					Thread.sleep(3000);
				 Delete_ProductCategory.Delete(driver).click();
					Thread.sleep(3000);
				Delete_ProductCategory.productCategoryconfirmationok(driver).click();
				 ExcelUtils.setCellData("Pass",29, 7); 
				ProductCatagory_ScreenShots.CaptureScreenshot(driver);
				Delete_ProductCategory.PropductCategoryDeleteMessage(driver);
				 ExcelUtils.setCellData("Pass",35, 7); 
		//Undeletevalidation
			
			Thread.sleep(3000);
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			UnDelete_Validation.UnDelete(driver);
			
			ProductCatagory_ScreenShots.CaptureScreenshot(driver);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
