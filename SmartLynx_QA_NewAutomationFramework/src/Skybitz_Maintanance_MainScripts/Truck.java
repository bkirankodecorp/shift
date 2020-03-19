package Skybitz_Maintanance_MainScripts;

import org.testng.annotations.Test;

import Truck_Subclasses.screenshot;
import Utility.Constant;
import Utility.ExcelUtils;

import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Truck {


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

		System.out.println("Google Chrome Launched....");





	}



	@Test
	public void Main_Functionalities() throws Exception {



		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Truck");

		Thread.sleep(2000);

		StopWatch pageLoad = new StopWatch();
		pageLoad.start();

		driver.get(Constant.Url);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

		pageLoad.stop();
		//Get the time
		long pageLoadTime_ms = pageLoad.getTime();
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;

		ExcelUtils.setCellData("SLX URL Load Time: " + pageLoadTime_ms + " milliseconds", 4, 9);
		ExcelUtils.setCellData("SLX URL Load Time: " + pageLoadTime_Seconds + " seconds", 4, 10);
		System.out.println("SLX URL Load Time: " + pageLoadTime_ms + " milliseconds");
		System.out.println("SLX URL Load Time: " + pageLoadTime_Seconds + " seconds");


		WebElement username=driver.findElement(By.name("username"));

		if (username.isDisplayed()) {

			System.out.println("SLX Login Page Launched on Chrome....");

			ExcelUtils.setCellData("SLX Login Page Launched on Chrome....", 3,7);	

			ExcelUtils.setCellData("Pass", 3, 8);

		} else {

			ExcelUtils.setCellData("SLX Login Page is not Launched on Chrome....", 3,7);	

			ExcelUtils.setCellData("Fail", 3, 8);


		}


		Truck_Subclasses.LogIn_page.login(driver); 

		Truck_Subclasses.Truck_Methods.mouse(driver);

		StopWatch pageLoad1 = new StopWatch();
		pageLoad1.start();


		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("btncreate")));

		pageLoad1.stop();
		//Get the time
		long pageLoadTime_ms1 = pageLoad1.getTime();
		long pageLoadTime_Seconds1 = pageLoadTime_ms1 / 1000;

		ExcelUtils.setCellData("Redirected to Shift Page Load Time: " + pageLoadTime_ms1 + " milliseconds", 10, 9);

		ExcelUtils.setCellData("Redirected to Shift Page Load Time: " + pageLoadTime_Seconds1 + " seconds", 10, 10);

		System.out.println("Redirected to Shift Page Load Time: " + pageLoadTime_ms1 + " milliseconds");
		System.out.println("Redirected to Shift Page Load Time: " + pageLoadTime_Seconds1 + " seconds");

		Truck_Subclasses.Save_Functionality.truck(driver);

		Truck_Subclasses.FeildValidations_Functionality.truck(driver);

		/*Truck_Subclasses.Edit_Fucntionality.truck(driver);

		Truck_Subclasses.Delete_Functionality.truck(driver);

		Truck_Subclasses.Undelete_Functionality.truck(driver);

		Truck_Subclasses.AlreadyExistTruck_Functionality.truck(driver);
		 */





	}


	@AfterTest
	public void Quit_Browser() {

		// driver.quit();

	}

}
