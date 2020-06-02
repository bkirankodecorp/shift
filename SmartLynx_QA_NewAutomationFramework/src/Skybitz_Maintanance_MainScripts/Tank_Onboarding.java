package Skybitz_Maintanance_MainScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TankOnboarding_SubClasses.TankOnboarding_Methods;
import TankOnboarding_SubClasses.screenshot;
import Utility.Constant;
import Utility.ExcelUtils;





public class Tank_Onboarding {

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


		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Tank Onboarding");

		Thread.sleep(3000);

		TankOnboarding_SubClasses.LogIn_page.login(driver);

		Thread.sleep(3000);
		
		TankOnboarding_SubClasses.TankOnboarding_Methods.tankonboardingmenu(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_SubClasses.Save_Functionality.tankonboarding(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

	}

	@AfterTest
	public void teardown()  {   

		driver.quit();
	}



}
