package SLX_Order_Entry;

import org.openqa.selenium.*;




public class LogIn_page {

	public static WebElement login = null;



	public static WebElement login(WebDriver driver) throws Exception{

		driver.findElement(By.name("username")).sendKeys("spladmin");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		driver.findElement(By.name("password")).sendKeys("P@ssw0rd");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		WebElement mainpage=driver.findElement(By.xpath("//span[contains(text(),'Maintenance')]"));

		if(mainpage.isDisplayed()){


			System.out.println("User Logged-in Successfully");

			Thread.sleep(3000);

		}

		else{

			System.out.println("User Logged-In Unsuccessfull");

		}

		return login;

	}

}