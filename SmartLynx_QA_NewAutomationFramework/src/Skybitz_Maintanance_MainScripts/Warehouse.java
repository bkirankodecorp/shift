package Skybitz_Maintanance_MainScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Utility.Constant;
import Utility.ExcelUtils;
import Warehouse_Subclasses.screenshot;




public class Warehouse {
	
	private static WebDriver driver;
	
	 @BeforeTest
 public void openBrowser() throws Exception {
	  
	 
	System.setProperty("webdriver.chrome.driver",
					"E://New folder//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-web-security");
			options.addArguments("--start-maximized");
			options.addArguments("--no-proxy-server");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			
			  screenshot.CaptureScreenshot(driver);

			driver.get(Constant.Url);
			

	    Thread.sleep(2000);
	    
	    screenshot.CaptureScreenshot(driver);
	    
	 }
	
	
@Test
	public static void Main_Functionalitites() throws Exception {
		
		
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Warhouse");
    
    Thread.sleep(2000);
    
  Warehouse_Subclasses.LogIn_page.login(driver);
  
  Warehouse_Subclasses.Warehouse_Methods.mouse(driver);
  
 screenshot.CaptureScreenshot(driver);
  
 Warehouse_Subclasses.Save_Functionality.Warehouse(driver);
  
  Warehouse_Subclasses.Edit_Fucntionality.Warehouse(driver);
  
 Warehouse_Subclasses.Delete_Functionality.Warehouse(driver);
  
  Warehouse_Subclasses.Undelete_Functionality.Warehouse(driver);
  
  Warehouse_Subclasses.AlreadyExistWarehouse_Functionality.Warehouse(driver);
  
  Warehouse_Subclasses.FeildValidations_Functionality.Warehouse(driver);
  
}

@AfterTest
public void teardown()  {   
	
	//driver.quit();
}

	

}
