package Truck_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import Utility.ExcelUtils;

public class Delete_Functionality {

	private static int ColNum=5;

	public static void truck(WebDriver driver) throws Exception{


		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(161, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.edit(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.meters(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delete(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metersrecorddeletealertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.deleteok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reels(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delete(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsrecorddeletealertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.deleteok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartments(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delete(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsrecorddeletealertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.deleteok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.communications(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delete(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.communicationsrecorddeletealertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.deleteok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.update(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.verifydeleteupdationmesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(182, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delete(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.deletealertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.ok(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(182, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

try {

			if(driver.findElement(By.xpath(".//*[@id='TruckGrid']/div[2]/table/tbody/tr[1]/td[1]")).isDisplayed()){

				ExcelUtils.setCellData("Truck is not Deleted Successfully", 185,7);

				ExcelUtils.setCellData("Fail", 185,8);
				
				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				System.out.println("Truck is not deleted");


			}

		} catch (Exception e) {

			ExcelUtils.setCellData("Truck Deleted Successfully", 185,7);

			ExcelUtils.setCellData("Pass", 185,8);
			
			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			System.out.println("Truck Deleted Successfully");



		}












	}
}