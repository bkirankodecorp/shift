package Product_Subclasses;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Product_Subclasses.Delete_Product;
import Product_Subclasses.Edit_Product;
import Product_Subclasses.Login_Page;
import Product_Subclasses.Product_ExistingValues;
import Product_Subclasses.Product_ScreenShots;
import Product_Subclasses.Product_Undelete;
import Product_Subclasses.Product_Validation;
import Utility.ExcelUtils;


public class Product {

 private static WebDriver driver = null;


 public static void Execute(WebDriver driver) throws Exception {	
 
	 
String UserName = ExcelUtils.getstringCellData( 3, 4);
// sending the User Name
Login_Page.txtbx_UserName(driver).sendKeys(UserName);
Thread.sleep(3000);

System.out.println(UserName);
Product_ScreenShots.CaptureScreenshot(driver);
String Password = ExcelUtils.getstringCellData( 4, 4);
// sending the Password
Login_Page.txtbx_Password(driver).sendKeys(Password);
Thread.sleep(3000);
Product_ScreenShots.CaptureScreenshot(driver);
//clicking on the login button
Login_Page.btn_LogIn(driver).click();
Thread.sleep(3000);
Product_ScreenShots.CaptureScreenshot(driver);
// Mouse handler
Product_Validation.mouse(driver);
Thread.sleep(3000);

Product_ScreenShots.CaptureScreenshot(driver);
Product_Validation.Search(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// searchbox 

//String Search = ExcelUtils.getstringCellData(4, 7);
//Product_Validation.Search(driver).sendKeys(Search);

//Product_ScreenShots.CaptureScreenshot(driver);


// create new Product
Thread.sleep(2000);
Product_Validation.button(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);

Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
// clicking on the save button to Verify Error Message
Product_ScreenShots.CaptureScreenshot(driver);
Product_Validation.submit(driver).click();
ExcelUtils.setCellData("Pass", 9, 7);




//Product_Validation.ToolTipsMessage(driver);



Product_ScreenShots.CaptureScreenshot(driver);
// checking the Field level validations
Product_Validation.FieldErrorMessage(driver);
//String Name = sheet.getRow(1).getCell(3).getStringCellValue();
//Product_Validation.Name(driver).sendKeys(Name);


Product_Validation.Name(driver);
Product_ScreenShots.CaptureScreenshot(driver);
String Description = ExcelUtils.getstringCellData(16, 4);
// Validating the Deescription field
Product_Validation.Description(driver);
Thread.sleep(2000);
Product_Validation.submit(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
//Product_Validation.ErrormessageDescription(driver);
Product_ScreenShots.CaptureScreenshot(driver);
//clicking on the Dropdown
Product_Validation.ProductCategorydropdown(driver).click();
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// Searching the for the enetered state input sent from Excel sheet
String ProductCategoryinput = ExcelUtils.getstringCellData( 19, 4);
Product_Validation.ProductCategoryinput(driver).sendKeys(ProductCategoryinput);
Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
Product_Validation.ProductCategoryinput(driver).sendKeys(Keys.ENTER);
Thread.sleep(6000);
// Validating the Meter Claibration
/*
Product_Validation.Meter(driver).click();
Product_Validation.Meter(driver).clear();
Thread.sleep(3000);
Product_Validation.Meter(driver).sendKeys(ExcelUtils.getstringCellData(20, 4));
ExcelUtils.setCellData("Pass", 20, 7);
//Clicking on the ProductMode dropdown and selecting them from dropdownlist
Thread.sleep(2000);
Product_Validation.ProductMode(driver).click();
Thread.sleep(3000);
Product_Validation.ProductModeSelect(driver).click();
//Clicking the HazMat Message and Selecting the Dropdownvalue from dropdownlist

Thread.sleep(2000);
Product_Validation.HazmatMessageDropDown(driver).click();
Thread.sleep(3000);
Product_Validation.HazmatMessageDropDownSelect(driver).click();

//Clicking the IRS Message and Selecting the Dropdownvalue from dropdownlist
Thread.sleep(3000);
Product_Validation.IRSMessagedropdown(driver).click();
Thread.sleep(2000);
Product_Validation.IRSMessagedropdownSelect(driver).click();
*/
//Clicking on the EPA Disclaimer 
Thread.sleep(3000);
Product_Validation.EPA(driver).click();
Thread.sleep(2000);
Product_Validation.EPA(driver).clear();
Thread.sleep(2000);

Product_Validation.EPA(driver).sendKeys(ExcelUtils.getstringCellData(25, 4));
//Inserting the values Crossrefernce Name Feild  
Thread.sleep(3000);
Product_Validation.CrossReferanceName(driver).sendKeys(ExcelUtils.getstringCellData(29, 4));
// Crossrefernce Description validation 
Thread.sleep(4000);
Product_Validation.CrossReferanceDescription(driver);

Thread.sleep(6000);
Product_Validation.Bulk(driver);
//clicking on the Unit of measure dropdown


// clicking on the save button

Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
// Save Message



//Edit Screen Functions

Thread.sleep(5000);

Product_ScreenShots.CaptureScreenshot(driver);
// cicking on the Edit button
Edit_Product.Editbutton(driver).click();
Thread.sleep(2000);
// Editing the Description field
Product_ScreenShots.CaptureScreenshot(driver);
Edit_Product.EditDescription(driver).click();
Thread.sleep(2000);
// clearing the Description feild
Product_ScreenShots.CaptureScreenshot(driver);
Edit_Product.EditDescription(driver).clear();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);



//Product_Validation.ProductCategoryinput(driver).sendKeys(ProductCategoryinput);
Edit_Product.EditDescription(driver).sendKeys(ExcelUtils.getstringCellData(41, 4));
Thread.sleep(3000);
Product_ScreenShots.CaptureScreenshot(driver);
// Different State Input
Edit_Product.EditProductCategorydropdown(driver).click();
Thread.sleep(3000);
Product_ScreenShots.CaptureScreenshot(driver);
Edit_Product.EditProductCategoryinput(driver);
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);

Edit_Product.EditUnitOfMeasuresselect(driver).click();
Thread.sleep(5000);

Edit_Product.EditUnitOfMeasuresselectone(driver);

//Checking the Product Category is bulk or non bulk.
Edit_Product.Bulk(driver);

// product Sold as Tab



Thread.sleep(2000);
Product_ScreenShots.CaptureScreenshot(driver);
// clicking on the UpDate button
//Edit_Product.Update(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(3000);
// update Message
Edit_Product.UpdateMessage(driver);

// Delete popup handler


Delete_Product.search(driver);

Thread.sleep(3000);
Delete_Product.Delete(driver).click();
Product_ScreenShots.CaptureScreenshot(driver);
Thread.sleep(2000);
// message in the alert box
Delete_Product.confirmationContent(driver);
Product_ScreenShots.CaptureScreenshot(driver);
// clicking on the cancel button
Delete_Product.confirmationcancel(driver);
Thread.sleep(2000);
// Product should be Present when clicked on the Cancel button we search the Productin the Grid
Delete_Product.search(driver);
Thread.sleep(5000);
// ClIcking on the Delete button 
Delete_Product.Delete(driver).click();

Thread.sleep(3000);
// clicking on the OK button so product can be deleted
Delete_Product.confirmationok(driver);
Thread.sleep(3000);
// Searching for the Deleted Product
Delete_Product.search(driver);
Thread.sleep(3000);


// Existing Value Functionalaties
Product_ScreenShots.CaptureScreenshot(driver);
Product_ExistingValues.ExistingValues(driver);
Thread.sleep(2000);

// Undelete fucntionality
Product_Undelete.Undelete(driver);
Product_ScreenShots.CaptureScreenshot(driver);

}
}