package Truck_Subclasses;



import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Shift_Subclasses.screenshot;
import Utility.ExcelUtils;

public class Save_Functionality {

	private static int ColNum=5;



	public static void truck(WebDriver driver) throws Exception{



		StopWatch pageLoad2 = new StopWatch();

		pageLoad2.start();
		
		Truck_Methods.create(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);

		wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("BaseTruck_TruckName")));

		pageLoad2.stop();
		//Get the time
		long pageLoadTime_ms2 = pageLoad2.getTime()-3000;

		long pageLoadTime_Seconds2 = pageLoadTime_ms2 / 1000;

		ExcelUtils.setCellData("Redirected to Create New Page in Shift Load Time: " + pageLoadTime_ms2 + " milliseconds", 11, 9);

		ExcelUtils.setCellData("Redirected to Create New Page in Shift  Load Time: " + pageLoadTime_Seconds2 + " seconds", 11, 10);

		System.out.println("Redirected to Create New Page in Shift  Load Time: " + pageLoadTime_ms2 + " milliseconds");

		System.out.println("Redirected to Create New Page in Shift  Load Time: " + pageLoadTime_Seconds2 + " seconds");

		

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.tag(driver).sendKeys(ExcelUtils.getstringCellData(13, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperhour(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(14, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.backofficetrucknumber(driver).sendKeys(ExcelUtils.getstringCellData(15, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucktypeclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucktypedropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucktypeselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.ticketcopies(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(19, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.unitofmeasureclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.unitofmeasuredropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.unitofmeasureselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.categoryclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.categorydropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.categoryselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaulttraileridclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaulttraileridsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.vin(driver).sendKeys(ExcelUtils.getstringCellData(28, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperunitofdistance(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(29, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.truckstatusclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.truckstatusdropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.truckstatusselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(33, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.alternativetrucknumber(driver).sendKeys(ExcelUtils.getstringCellData(34, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.loadedgrossweight(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(37, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(38, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(39, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.statesearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(42, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(43, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(44, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.truckhaspump(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.requirevehicleinspection(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.rrmanualdataentry(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.requireproductloading(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.meters(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metersadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.registertype(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
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

		Truck_Methods.defaultproductsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(59, ColNum));

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

		Truck_Methods.communications(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.communicationsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.ssid(driver).sendKeys(ExcelUtils.getstringCellData(79, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.ssid(driver).sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.netaddress(driver).sendKeys(ExcelUtils.getstringCellData(79, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.netaddress(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.device(driver).sendKeys(ExcelUtils.getstringCellData(82, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.comdiv(driver).click();

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

		Truck_Methods.terminalmapping(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.expand(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		/*String size=ExcelUtils.getstringCellData(89, ColNum);

		String query="//span[contains(text(),'" + size + "')]/preceding-sibling::span[@class='k-checkbox-label checkbox-span']";

		driver.findElement(By.xpath(query)).click();

		Thread.sleep(3000);*/
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	Truck_Methods.termtopcheck(driver));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	Truck_Methods.terminalmappingsecondstatecheckbox(driver));
		
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

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.dispatchoptions(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.email(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.print(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.toemailaddress(driver).sendKeys(ExcelUtils.getstringCellData(98, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailsubject(driver).sendKeys(ExcelUtils.getstringCellData(99, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailmessage(driver).sendKeys(ExcelUtils.getstringCellData(100, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailaddress(driver).sendKeys(ExcelUtils.getstringCellData(101, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.dispatchdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		StopWatch pageLoad = new StopWatch();
		
		pageLoad.start();

		Truck_Methods.save(driver).click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']//p")));

		pageLoad.stop();
		//Get the time
		long pageLoadTime_ms = pageLoad.getTime()-3000;
		
		long pageLoadTime_Seconds = pageLoadTime_ms / 1000;

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds", 104, 9);

		ExcelUtils.setCellData("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " milliseconds", 104, 10);

		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_ms + " milliseconds");
		
		System.out.println("Page redirected to Main Grid in Load Time: " + pageLoadTime_Seconds + " seconds");
		
		Truck_Methods.verifysavemesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

}

}
