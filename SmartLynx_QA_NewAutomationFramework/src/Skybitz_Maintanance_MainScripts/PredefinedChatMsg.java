package Skybitz_Maintanance_MainScripts;

import org.testng.annotations.Test;

import PredefinedChatMsg_Subclasses.screenshot;
import Utility.Constant;
import Utility.ExcelUtils;

import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class PredefinedChatMsg {
	
	private static WebDriver driver;
	
	
	 @BeforeTest
	  public void Open_Browser() throws Exception {
		 
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
  public void Main_Functionalities() throws Exception {
	  
	  	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"PredefinedChatMsg");
	    
	    Thread.sleep(2000);
	    
	    PredefinedChatMsg_Subclasses.LogIn_page.login(driver);
	    
	    PredefinedChatMsg_Subclasses.PredefinedChatMsg_Methods.mouse(driver);
	    
	    PredefinedChatMsg_Subclasses.Save_Functionality.predefinedchatmsg(driver);
	    
	    PredefinedChatMsg_Subclasses.Edit_Fucntionality.predefinedchatmsg(driver);
	    
	    PredefinedChatMsg_Subclasses.AlreadyExistDOTDefectList_Functionality.predefinedchatmsg(driver);
	    
	    PredefinedChatMsg_Subclasses.Delete_Functionality.predefinedchatmsg(driver);
	    
	    PredefinedChatMsg_Subclasses.FeildValidations_Functionality.predefinedchatmsg(driver);
	    
	  
	  
	  
	  
  }
 

  @AfterTest
  public void Quit_Browser() {
	  
	  driver.quit();
  }

}
