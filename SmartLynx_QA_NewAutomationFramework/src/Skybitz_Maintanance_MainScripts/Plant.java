package Skybitz_Maintanance_MainScripts;

import org.testng.annotations.Test;

import Plant_Subclasses.screenshot;
import Utility.Constant;
import Utility.ExcelUtils;

import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Plant {

	private static WebDriver driver;

	@BeforeTest
	public void Open_Browser() throws Exception {

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




		//options.addArguments("--disable-extensions");


		driver = new ChromeDriver(options);

		screenshot.CaptureScreenshot(driver);

		driver.get(Constant.Url);


		Thread.sleep(2000);

		screenshot.CaptureScreenshot(driver);


	}



	@Test
	public void Main_Functionalities() throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Plant");

		Thread.sleep(2000);

		Plant_Subclasses.LogIn_page.login(driver);

		Plant_Subclasses.Plant_Methods.mouse(driver);

		Plant_Subclasses.Save_Functionality.plant(driver);

		Plant_Subclasses.Edit_Fucntionality.plant(driver);

		Plant_Subclasses.Delete_Functionality.plant(driver);

		Plant_Subclasses.Undelete_Functionality.plant(driver);

		Plant_Subclasses.AlreadyExistPlant_Functionality.plant(driver);

		Plant_Subclasses.FeildValidations_Functionality.plant(driver);


	}


	@AfterTest
	public void Quit_Browser() {

		driver.quit();
	}

}
