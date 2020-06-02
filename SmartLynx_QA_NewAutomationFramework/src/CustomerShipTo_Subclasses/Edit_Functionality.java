package CustomerShipTo_Subclasses;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class Edit_Functionality {

	private static int ColNum=5;



	public static void customershipto(WebDriver driver) throws Exception{

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(142, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.edit(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.name(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(144, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(145, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(146, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.editstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(148, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(149, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(150, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.notetypeclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.editnotetype(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath(".//*[@id='tabshipTo']/div/div/fieldset[8]")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath(".//*[@id='TargetTypeGrid']/div[2]/table/tbody/tr[1]/td/span")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.note(driver).sendKeys(ExcelUtils.getstringCellData(153, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapunassign(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(156, ColNum));

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

		CustomerShipTo_Methods.editterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defproductload(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		//Edit Estimated volumes, Order to use and Months to Use

		

			((JavascriptExecutor)driver).executeScript("arguments[0].click();",	driver.findElement(By.xpath("//div[@id='CustomerShipToProductDefaultsGrid']/div[3]/table/tbody/tr[1]/td[4]")));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.estimatevolinsert(driver).clear();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.estimatevolinsert(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(160, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.estimatevolinsert(driver).sendKeys(Keys.TAB);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.editordertouseavg(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.prodetdiv(driver).click();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);
		

		//Add Bulk Product

		CustomerShipTo_Methods.productdetailsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.prodetserach(driver).sendKeys(ExcelUtils.getstringCellData(163, ColNum));

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

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.defaultloadsaddoption(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Add Default load options

		CustomerShipTo_Methods.defaultloadsaddoption(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defloadsaddoptionyes(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.find(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.contractsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(168, ColNum));

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

				CustomerShipTo_Methods.contractok(driver);

				screenshot.CaptureScreenshot(driver);
				
				CustomerShipTo_Methods.verifycontract(driver);
				
				((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.pincellactive(driver));

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				CustomerShipTo_Methods.pin(driver).clear();

				Thread.sleep(3000);

				screenshot.CaptureScreenshot(driver);

				CustomerShipTo_Methods.pin(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(170, ColNum)));

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

			CustomerShipTo_Methods.editterminalselect(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.suppliercellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.editsupplierselect(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.vendorcellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.editvendorselect(driver);

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.pincellactive(driver));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.pin(driver).clear();

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			CustomerShipTo_Methods.pin(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(175, ColNum)));

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

			Thread.sleep(3000);

			screenshot.CaptureScreenshot(driver);

		}

		CustomerShipTo_Methods.receivinghours(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursdaystartactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.editreceivinghoursdaystartsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghourstarttimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(178, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.editreceivinghoursdayendsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursendtimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(180, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		CustomerShipTo_Methods.addnewreceivinghoursdaystartsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursstarttimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(183, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.addnewreceivinghoursdayendsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursendtimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(185, ColNum)));

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

		CustomerShipTo_Methods.ponumber(driver).sendKeys(ExcelUtils.getstringCellData(188, ColNum));

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

		CustomerShipTo_Methods.addnewdatefromselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.addnewselectdatefrom(driver).click();

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

		CustomerShipTo_Methods.addnewselectyeardateto(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.addnewdatetoselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		CustomerShipTo_Methods.addnewselectdateto(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.podiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyupdatemesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);










	}
}
