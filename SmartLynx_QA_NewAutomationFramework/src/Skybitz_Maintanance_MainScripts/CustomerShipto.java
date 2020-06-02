package Skybitz_Maintanance_MainScripts;

import org.testng.annotations.Test;

import Truck_Subclasses.screenshot;
import Utility.Constant;
import Utility.ExcelUtils;

import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class CustomerShipto {


	private static WebDriver driver;


	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"E://New folder//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		options.addArguments("--disable-web-security");
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		screenshot.CaptureScreenshot(driver);


		long start = System.currentTimeMillis();

		driver.get(Constant.Url);

		long finish = System.currentTimeMillis();

		long totalTime = finish - start; 

		System.out.println("Total Time for page load - "+totalTime); 


		Thread.sleep(2000);

		screenshot.CaptureScreenshot(driver);



	}



	@Test
	public void Main_Functionalities() throws Exception {


		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"CustomerShipTo");

		Thread.sleep(2000);

		WebElement username=driver.findElement(By.name("username"));

		if (username.isDisplayed()) {

			System.out.println("SLX Login Page Launched on Chrome....");

			ExcelUtils.setCellData("SLX Login Page Launched on Chrome....", 3,7);	

			ExcelUtils.setCellData("Pass", 3, 8);

		} else {

			ExcelUtils.setCellData("SLX Login Page is not Launched on Chrome....", 3,7);	

			ExcelUtils.setCellData("Fail", 3, 8);


		}


		CustomerShipTo_Subclasses.LogIn_page.login(driver);

		CustomerShipTo_Subclasses.CustomerShipTo_Methods.openshipto(driver);

		CustomerShipTo_Subclasses.Save_Functionality.customershipto(driver);

		CustomerShipTo_Subclasses.FeildValidations_Functionality.customershipto(driver);

		CustomerShipTo_Subclasses.Edit_Functionality.customershipto(driver);

		CustomerShipTo_Subclasses.Delete_Functionality.customershipto(driver);

		CustomerShipTo_Subclasses.Undelete_Functionality.customershipto(driver);

		CustomerShipTo_Subclasses.AlreadyExistTruck_Functionality.customershipto(driver);




	}

	@AfterTest
	public void quit_Browser() {

		// driver.quit();


	}

}
