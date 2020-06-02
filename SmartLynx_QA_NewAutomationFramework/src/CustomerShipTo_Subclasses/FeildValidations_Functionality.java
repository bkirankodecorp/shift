package CustomerShipTo_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {

	private static int ColNum=5;

	public static void customershipto(WebDriver driver) throws Exception{



		//Balnk Input Verification and validation

		CustomerShipTo_Methods.create(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctalertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinshiptoacct(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(376, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputincustomer(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(378, ColNum));

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

		CustomerShipTo_Methods.name(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinname(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(380, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinaddress1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(382, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputincity(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(384, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.statesearch(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinzip(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(388, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinlatitude(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(390, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinlongitude(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(392, ColNum)));

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.atleastoneregionmustbesetprimarymapalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alertok(driver).click();


		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(397, ColNum));

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

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.territorymandatoryalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.territoryactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankterritoryselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghours(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alldatamandatoryinrecevinghoursalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputindaystart(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//span[@aria-owns='DayIDFrom_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdaystartsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursstarttimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinstarttime(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(413, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputindayend(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//span[@aria-owns='DayIDTo_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdayendsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursendtimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinendtime(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(419, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.purchaseorder(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.purchaseorderadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alldatamandatoryinpo(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.blankinputinponumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.ponumber(driver).sendKeys(ExcelUtils.getstringCellData(426, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyblanksavemesage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);




		
		
		
		
		
		




		//Invalid Input Field Level Verification and Validation
		
		CustomerShipTo_Methods.create(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(431, ColNum)));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(432, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.name2(driver).sendKeys(ExcelUtils.getstringCellData(433, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(434, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address2(driver).sendKeys(ExcelUtils.getstringCellData(435, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(436, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(437, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.faxtoname(driver).sendKeys(ExcelUtils.getstringCellData(438, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1name1(driver).sendKeys(ExcelUtils.getstringCellData(439, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1email1(driver).sendKeys(ExcelUtils.getstringCellData(440, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2name2(driver).sendKeys(ExcelUtils.getstringCellData(441, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2email2(driver).sendKeys(ExcelUtils.getstringCellData(442, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.latitude(driver).sendKeys(ExcelUtils.getstringCellData(443, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.longitude(driver).sendKeys(ExcelUtils.getstringCellData(443, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.avgdeltime(driver).sendKeys(ExcelUtils.getstringCellData(443, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.masteracctalertcontent(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.shiptoacct(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidshiptoacct(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.shiptoacct(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(449, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(450, ColNum));

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

		CustomerShipTo_Methods.name(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.invalidname(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.name(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(452, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.name2(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidname2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.name2(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.name2(driver).sendKeys(ExcelUtils.getstringCellData(454, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address1(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidaddress1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address1(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(456, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address2(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidaddress2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address2(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.address2(driver).sendKeys(ExcelUtils.getstringCellData(458, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.city(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidcity(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.city(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(460, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.statesearch(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidzip1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(463, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidzip2(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(466, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.faxtoname(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidfaxtoname(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.faxtoname(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.faxtoname(driver).sendKeys(ExcelUtils.getstringCellData(468, ColNum));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1name1(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidname1cont1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1name1(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1name1(driver).sendKeys(ExcelUtils.getstringCellData(470, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1email1(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidemail1cont1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1email1(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact1email1(driver).sendKeys(ExcelUtils.getstringCellData(472, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2name2(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidname2cont2(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2name2(driver).clear();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2name2(driver).sendKeys(ExcelUtils.getstringCellData(474, ColNum));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2email2(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidemail2cont2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2email2(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.contact2email2(driver).sendKeys(ExcelUtils.getstringCellData(476, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.latitude(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidlatitude(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.latitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(478, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.longitude(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidlongitude(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.longitude(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(480, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.avgdeltime(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidavddeliverytime(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.avgdeltime(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.avgdeltime(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(482, ColNum)));
		
		Thread.sleep(3000);

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

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(484, ColNum));

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
		
		CustomerShipTo_Methods.prodetok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputindefaultproduct(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.prodetserach(driver).sendKeys(ExcelUtils.getstringCellData(491, ColNum));

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

		CustomerShipTo_Methods.filter(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.filter(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.uncheckfilteralert(driver);

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
		
		CustomerShipTo_Methods.defloadsprodok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputindefaultload(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.defloadsprodsearch(driver).sendKeys(ExcelUtils.getstringCellData(499, ColNum));

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
		
		CustomerShipTo_Methods.find(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.selectproducttoloadfirstalert(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.soldasproduct(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.soldasproductok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputinproductsoldas(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.soldasproductlistselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.soldasproductok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputindefaulloadvol(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.volumecellactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.volume(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(92, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputindefaulloadterminal(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.terminalcellactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.terminalselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputindefaulloadsupplier(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.suppliercellactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		

		CustomerShipTo_Methods.supplierselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.blankinputindefaulloadvendor(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();;", CustomerShipTo_Methods.vendorcellactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		

		CustomerShipTo_Methods.vendorselect(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.receivinghours(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		
		CustomerShipTo_Methods.receivinghoursdaystartsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursstarttimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(522, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

	

		CustomerShipTo_Methods.receivinghoursdayendsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursendtimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(524, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.receivinghoursadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdaystartsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursstarttimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(527, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursstarttimeinsert(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		

		CustomerShipTo_Methods.receivinghoursdayendsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.receivinghoursendtimeactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursendtimeinsert(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(529, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.receivinghoursdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.duplicatesrecordinreceivinghoursalert(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.delete(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.deleteok(driver).click();
		
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.purchaseorder(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.purchaseorderadd(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(535, ColNum)));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		driver.findElement(By.xpath(".//*[@id='tabPurchaseOrder']/div/div/fieldset")).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invalidponumber(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).clear();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).sendKeys(ExcelUtils.getstringCellData(538, ColNum));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.purchaseorderadd(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).sendKeys(ExcelUtils.getstringCellData(540, ColNum));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		driver.findElement(By.xpath(".//*[@id='tabPurchaseOrder']/div/div/fieldset")).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		
		CustomerShipTo_Methods.alreadyexistponumberalert(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		
		
		CustomerShipTo_Methods.ponumber(driver).clear();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).sendKeys(ExcelUtils.getstringCellData(544, ColNum));
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.ponumber(driver).sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		
		
		driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='Wednesday, August 15, 2018']")).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.invaliddatefromalertinponumber(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	driver.findElement(By.xpath("//div[@id='CustomerShipToPurchaseOrdersGrid']/div[3]/table/tbody/tr/td[2]")));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.validselectdatefrom(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.activatedateto(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='Wednesday, August 15, 2018']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.invaliddatetoalertinponumber(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.alertok(driver).click();
		
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.activatedateto(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",	CustomerShipTo_Methods.purchaseorderdatefromcaliconclick(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.validselectdateto(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.save(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.verifyinvalidsavemesage(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		

	}




}
