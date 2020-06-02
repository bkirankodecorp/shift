package Skybitz_Maintanance_MainScripts;

import org.testng.annotations.Test;

import Orderhold_Subclasses.screenshot;
import Utility.Constant;
import Utility.ExcelUtils;

import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Orderhold {
	
	
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
  public void Main_Functionalitites() throws Exception {
	  
	  ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Orderhold");
	  
	  Orderhold_Subclasses.LogIn_page.login(driver);
	  
	  Orderhold_Subclasses.Orderhold_Methods.mouse(driver);
	  
	  Orderhold_Subclasses.Save_Functionality.orderhold(driver);
	  
	  Orderhold_Subclasses.Edit_Fucntionality.orderhold(driver);
	  
	  Orderhold_Subclasses.AlreadyExistOrderhold_Functionality.orderhold(driver);
	  
	  Orderhold_Subclasses.Delete_Functionality.orderhold(driver);
	  
	  Orderhold_Subclasses.FeildValidations_Functionality.orderhold(driver);
	  
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  
  }

}
