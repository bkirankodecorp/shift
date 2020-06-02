package Truck_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Undelete_Functionality {

	private static int ColNum=5;

	public static void truck(WebDriver driver) throws Exception{

		Truck_Methods.create(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(ExcelUtils.getstringCellData(187, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(188, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delwarehouseselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(190, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(191, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delstateselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(193, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(194, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(195, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productmapping(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productcategoryheadercheckbox(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		driver.findElement(By.xpath(".//*[@id='tabProductMapping']")).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productheadercheckbox(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.undeletevalidationmessage1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.productmapping(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productcategoryheadercheckbox(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productheadercheckbox(driver).click();

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Truck_Methods.update(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.verifyundeleteupdationmesage1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(204, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.create(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(ExcelUtils.getstringCellData(206, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(207, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delwarehouseselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(209, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(210, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delstateselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(212, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(213, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(214, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productmapping(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productcategoryheadercheckbox(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
driver.findElement(By.xpath(".//*[@id='tabProductMapping']")).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.productheadercheckbox(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.undeletevalidationmessage2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.undelete(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		

		Truck_Methods.update(driver).click();

		Thread.sleep(10000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.verifyundeleteupdationmesage2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);






	}

}
