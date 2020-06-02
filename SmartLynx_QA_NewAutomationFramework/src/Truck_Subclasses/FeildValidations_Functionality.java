package Truck_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utility.ExcelUtils;

public class FeildValidations_Functionality {

	private static int ColNum=5;

	public static void truck(WebDriver driver) throws Exception{

		Truck_Methods.create(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		/*Truck_Methods.mapatleastoneproductalert(driver);

		Thread.sleep(3000);

		Truck_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);*/

		Truck_Methods.trucknumber(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputintrucknumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(ExcelUtils.getstringCellData(249, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinjbusodometeroffset(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(251, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinwarehouseid(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		Truck_Methods.warehouseidsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinaddress(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(255, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputincity(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(257, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delstateselect(driver);

		Thread.sleep(3000);

		Truck_Methods.zip(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinzip(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(261, ColNum)));

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

		Truck_Methods.meters(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metersadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinmetersnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//span[@aria-owns='RegisterType_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

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

		Truck_Methods.defaultproductok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinfindproduct(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.defaultproductsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(273, ColNum));

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

		/*Truck_Methods.reels(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputinreelsnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(277, ColNum)));

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

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.blankinputincompartmentsnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(281, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);*/

		Truck_Methods.communications(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.communicationsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.blankinputincommunications(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='TruckCommunicationsGrid']/div[3]/table/tbody/tr/td")));

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

		Truck_Methods.save(driver).click();

		Thread.sleep(10000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.verifysavemesageforblankinput(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


















		//Invalid Input Verification and Validation

		Truck_Methods.create(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(290, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperhour(driver).sendKeys(ExcelUtils.getstringCellData(291, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperunitofdistance(driver).sendKeys(ExcelUtils.getstringCellData(292, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(ExcelUtils.getstringCellData(293, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(294, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(295, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(296, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);	

		screenshot.CaptureScreenshot(driver);

		System.out.println(Truck_Methods.productmapalercontent(driver).getText());

		Thread.sleep(3000);

		Truck_Methods.alertok(driver).click();

		Thread.sleep(3000);

		Truck_Methods.trucknumber(driver).click();

		Thread.sleep(3000);


		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputintrucknumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucknumber(driver).sendKeys(ExcelUtils.getstringCellData(301, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperhour(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputincostperhour(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperhour(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperhour(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(303, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperunitofdistance(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputincostperunitofdistance(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.costperunitofdistance(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(305, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputinjbusodometeroffset(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.jbusodometeroffset(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(307, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.warehouseidclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.warehouseidsearchbox(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.address(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputinaddress(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.address(driver).sendKeys(ExcelUtils.getstringCellData(309, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputincity(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(311, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.delstateselect(driver);

		Thread.sleep(3000);

		Truck_Methods.zip(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputinzip1(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(313, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputinzip2(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(316, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.meters(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metersadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.metersadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputinmeterregistertype(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//span[@aria-owns='RegisterType_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.registertype(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Truck_Methods.registernumberactive(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.metersadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.invalidinputinregisternumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//span[@aria-owns='RegisterId_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.registernumberselect(driver);

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

		Truck_Methods.metdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reels(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(339, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputinreelsnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(341, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.flushvolume(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(68, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(343, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputalertinreelsnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(346, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.reelsnumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.flushvolume(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(68, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartments(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(349, ColNum)));	

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputincompartmentsnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(351, ColNum)));	

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.capacity(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(75, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		Truck_Methods.compartmentsadd(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(353, ColNum)));	

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputalertincompartmentsnumber(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).clear();


		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(356, ColNum)));	

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.compartmentsnumber(driver).sendKeys(Keys.TAB);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.capacity(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(75, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.dispatchoptions(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.email(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.toemailaddress(driver).sendKeys(ExcelUtils.getstringCellData(358, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailaddress(driver).sendKeys(ExcelUtils.getstringCellData(359, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.alertok(driver).click();

		Thread.sleep(3000);

		Truck_Methods.toemailaddress(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputtoemailaddress(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.toemailaddress(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.toemailaddress(driver).sendKeys(ExcelUtils.getstringCellData(362, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailaddress(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.invalidinputemailaddress(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailaddress(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.emailaddress(driver).sendKeys(ExcelUtils.getstringCellData(364, ColNum));

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

		Truck_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		Truck_Methods.verifysavemesageforinvalidinput(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		
		
		
		
		
		
		//Propane Truck Validation

		Truck_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(368, ColNum));

		Thread.sleep(3000);

		Truck_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		Truck_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		Truck_Methods.edit(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.trucktypeclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.selectpropanetruck(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.update(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.propanetruckvalidation(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)", "");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		Truck_Methods.net(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)", "");

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
