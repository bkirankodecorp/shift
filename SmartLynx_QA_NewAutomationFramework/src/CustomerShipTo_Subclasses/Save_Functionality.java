package CustomerShipTo_Subclasses;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Save_Functionality {

	private static int ColNum=5;



	public static void customershipto(WebDriver driver) throws Exception{

		Thread.sleep(3000);

		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(12, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(14, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctselect(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(17, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.name2(driver).sendKeys(ExcelUtils.getstringCellData(18, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(19, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address2(driver).sendKeys(ExcelUtils.getstringCellData(20, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(21, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.statesearch(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(24, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.phone(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(25, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.faxtoname(driver).sendKeys(ExcelUtils.getstringCellData(26, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.fax(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(27, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact1name1(driver).sendKeys(ExcelUtils.getstringCellData(28, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact1phone1(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(29, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact1ext1(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(30, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact1email1(driver).sendKeys(ExcelUtils.getstringCellData(31, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact2name2(driver).sendKeys(ExcelUtils.getstringCellData(35, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact2phone2(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(36, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact2ext2(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(37, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contact2email2(driver).sendKeys(ExcelUtils.getstringCellData(38, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(42, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(43, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.ordertypeclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.ordertypedropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.ordertypeselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.orderholdclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.orderholdsearch(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.vendorcrossref(driver).sendKeys(ExcelUtils.getstringCellData(49, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.avgdeltime(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(50, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname1searchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname1searchbox(driver).sendKeys(ExcelUtils.getstringCellData(52, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname1searchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname1searchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname1select(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname1ok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname2searchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname2searchbox(driver).sendKeys(ExcelUtils.getstringCellData(56, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname2searchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname2searchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname2select(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.salesrepname2ok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.signaturereq(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.StickReadingRequired(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.poreq(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.pumpreq(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.notetypeclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.notetypedropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.notetypeselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath(".//*[@id='tabshipTo']/div/div/fieldset[8]")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath(".//*[@id='TargetTypeGrid']/div[2]/table/tbody/tr[1]/td/span")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		/*CustomerShipTo_Methods.targettypeselect(driver);

		Thread.sleep(3000);*/

		CustomerShipTo_Methods.note(driver).sendKeys(ExcelUtils.getstringCellData(67, ColNum));

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.manuallock(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(70, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarycheck(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.territoryactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.territorydropdownlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.territoryselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defproductload(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.productdetailsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Add Default Product (Bulk Product)

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(ExcelUtils.getstringCellData(78, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetallcheck(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Add Default Product (Non-Bulk Product)

		CustomerShipTo_Methods.productdetailsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(ExcelUtils.getstringCellData(80, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetallcheck(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		for(int i=1; i<=2;i++){

			((JavascriptExecutor)driver).executeScript("arguments[0].click();",	driver.findElement(By.xpath("//div[@id='CustomerShipToProductDefaultsGrid']/div[3]/table/tbody/tr["+i+"]/td[4]")));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.estimatevolinsert(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(83, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.prodetdiv(driver).click();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);
		}

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.filter(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.filter(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.filterok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("btnAddOptions")));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Add Default load

		CustomerShipTo_Methods.producttoload(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defloadsprodsearch(driver).sendKeys(ExcelUtils.getstringCellData(86, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defloadsprodsearch(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defloadsprodsearch(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defloadsprodcheckall(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defloadsprodok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.soldasproduct(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.soldasproductlistselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.soldasproductok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.volumecellactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.volume(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(92, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.find(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contractsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(94, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contractsearchbox(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contractsearchbox(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		try {

			if(CustomerShipTo_Methods.contractselect(driver).isDisplayed()){

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				CustomerShipTo_Methods.contractselect(driver).click();

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				CustomerShipTo_Methods.contractok(driver).click();

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.pincellactive(driver));

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				CustomerShipTo_Methods.pin(driver).clear();

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				CustomerShipTo_Methods.pin(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(109, ColNum)));

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

			}


		} catch (Exception e) {

			CustomerShipTo_Methods.contractcancel(driver).click();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.terminalcellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.terminalselect(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.suppliercellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.supplierlist(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.supplierselect(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.vendorcellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.vendorlist(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.vendorselect(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.pincellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.pin(driver).clear();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.pin(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(109, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

		}


		CustomerShipTo_Methods.receivinghours(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdaystartlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdaystartsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursstarttimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(115, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdayendlist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdayendsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursendtimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(120, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.purchaseorder(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.purchaseorderadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.ponumber(driver).sendKeys(ExcelUtils.getstringCellData(123, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.ponumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.purchaseorderdatefromcalmonthhead2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.datefromselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.selectdatefrom(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.podiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.activatedateto(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.purchaseorderdatefromcalmonthhead2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyallyearslist(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.selectyeardateto(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.datetoselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.selectdateto(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.podiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(10000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifysavemesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
	}
}
