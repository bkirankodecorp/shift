package Truck_Subclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Edit_Fucntionality {
	
	private static int ColNum=5;
	
	public static void truck(WebDriver driver) throws Exception{


		
		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(106, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.search(driver).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		screenshot.CaptureScreenshot(driver);
	
		Truck_Methods.edit(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.jbusodometeroffset(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(108, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.warehouseidclick(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.editwarehouse(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.address(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(110, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.city(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(111, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.stateclick(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.editstate(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.zip(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(113, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.latitude(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(114, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.longitude(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(115, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.gross(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)", "");
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.meters(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.meterregistertypeactive(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.editregistertype(driver);
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.registernumberactive(driver));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.editregisternumberselect(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.metdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.defaultproductclick(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.defaultproductsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(121, ColNum));
		
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
		
		Truck_Methods.metersadd(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.registertype(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.registernumberactive(driver));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.addnewregisternumber(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.metdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		Truck_Methods.defaultproductclick(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.defaultproductsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(125, ColNum));
		
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
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.flushvolumeactive(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.flushvolume(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		Truck_Methods.flushvolume(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(129, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.reelsdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.reelsadd(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(131, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.reelsdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.flushvolumeactive(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.flushvolume(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(132, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.reelsdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.compartments(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.capacityactive(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.capacity(driver).clear();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.capacity(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(136, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.compdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.compartmentsadd(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(138, ColNum)));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.compdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.capacityactive(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.capacity(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(139, ColNum)));		
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.compdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.communications(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.netaddressactive(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.ssid(driver).clear();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.ssid(driver).sendKeys(ExcelUtils.getstringCellData(79, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.ssid(driver).sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.netaddress(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.netaddress(driver).sendKeys(ExcelUtils.getstringCellData(142, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		Truck_Methods.netaddress(driver).sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
	
		Truck_Methods.device(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.device(driver).sendKeys(ExcelUtils.getstringCellData(143, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.comdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.productmapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.editproductcategories(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.editproducts(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.terminalmapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.expand(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	Truck_Methods.termtopcheck(driver));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.expand(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.regionmapping(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.regionmappingsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(151, ColNum));
		
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
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.dispatchoptions(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.toemailaddress(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.toemailaddress(driver).sendKeys(ExcelUtils.getstringCellData(154, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.emailsubject(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.emailsubject(driver).sendKeys(ExcelUtils.getstringCellData(155, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.emailmessage(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.emailmessage(driver).sendKeys(ExcelUtils.getstringCellData(156, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.emailaddress(driver).clear();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.emailaddress(driver).sendKeys(ExcelUtils.getstringCellData(157, ColNum));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.dispatchdiv(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.update(driver).click();
		
		Thread.sleep(10000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.verifyupdationmesage(driver);
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		
		
		
		
	}
}