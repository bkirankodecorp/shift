package Truck_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class AlreadyExistTruck_Functionality {

	private static int ColNum=5;

	public static void truck(WebDriver driver) throws Exception{


		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(224, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.searchforalreadyexisttruck(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.create(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(ExcelUtils.getstringCellData(226, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(227, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(229, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(230, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.statesearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(232, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(233, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(234, ColNum)));

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

		Truck_Methods.alreadyexisttruckvalidationmessage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.meters(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metersadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.registertype(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.registernumberactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.registernumberdropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.registernumberselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(55, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductsearchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductsearchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductselect(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reels(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(65, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);





		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.flushvolumeactive(driver));


		Truck_Methods.flushvolume(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(68, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartments(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(72, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);




		//((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.capacityactive(driver));



		Truck_Methods.capacity(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(75, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.regionmapping(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.regionmappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(93, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.regionmappingsearchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.regionmappingsearchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.regionmappingheadercheckbox(driver).click();

		Thread.sleep(3000);

		Truck_Methods.update(driver).click();

		Thread.sleep(10000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.verifyalreadyexistupdationmesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);














	}

}
