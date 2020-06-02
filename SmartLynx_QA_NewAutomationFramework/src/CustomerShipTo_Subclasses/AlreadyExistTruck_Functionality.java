package CustomerShipTo_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class AlreadyExistTruck_Functionality {

	private static int ColNum=5;

	public static void customershipto(WebDriver driver) throws Exception{


		// Enter Already Existed Ship To Acct and Master Acct and Enter New Ship To Name


		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(306, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(307, ColNum));

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

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(308, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(309, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(310, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alreadyexistedstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(312, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(313, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(314, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(316, ColNum));

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

		CustomerShipTo_Methods.alreadyexistedterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alreadyexistedvalidationmessage1(driver);
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyalreadyexistedupdationmesage1(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Verify if Ship To is Activated or Undeleted

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(324, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);



		try {

			WebElement deletedshipto=driver.findElement(By.xpath(".//*[@id='CustomerShipToGrid']/div[2]/table/tbody/tr[1]/td[1]"));

			String expecteddeletedshipto=deletedshipto.getText();

			String actualdeletedshipto=ExcelUtils.getstringCellData(324, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData(ExcelUtils.getstringCellData(324, ColNum) + " ShipTo is Already Existed", 325,7);

				ExcelUtils.setCellData("Pass", 325,8);

				System.out.println(ExcelUtils.getstringCellData(324, ColNum) + " ShipTo is Already Existed");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData(ExcelUtils.getstringCellData(324, ColNum) + " ShipTo is not Already Existed", 325,7);

			ExcelUtils.setCellData("Fail", 325,8);

			System.out.println(ExcelUtils.getstringCellData(324, ColNum) + " ShipTo is not Already Existed");

			Thread.sleep(3000);



		}


		// Enter Already Existed Master Acct and ShipTo Name and Enter New ShipTo Acct



		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(328, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(329, ColNum));

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

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(330, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(331, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(332, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alreadyexistedstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(334, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(335, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(336, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(338, ColNum));

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

		CustomerShipTo_Methods.alreadyexistedterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alreadyexistedvalidationmessage2(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyalreadyexistedupdationmesage2(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Verify if Ship To is Activated or Undeleted

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(346, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);



		try {

			WebElement deletedshipto=driver.findElement(By.xpath(".//*[@id='CustomerShipToGrid']/div[2]/table/tbody/tr[1]/td[1]"));

			String expecteddeletedshipto=deletedshipto.getText();

			String actualdeletedshipto=ExcelUtils.getstringCellData(346, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData(ExcelUtils.getstringCellData(346, ColNum) + " ShipTo is Already Existed", 347,7);

				ExcelUtils.setCellData("Pass", 347,8);

				System.out.println(ExcelUtils.getstringCellData(346, ColNum) + " ShipTo is Already Existed");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData(ExcelUtils.getstringCellData(346, ColNum) + " ShipTo is not Already Existed", 347,7);

			ExcelUtils.setCellData("Fail", 347,8);

			System.out.println(ExcelUtils.getstringCellData(346, ColNum) + " ShipTo is not Already Existed");

			Thread.sleep(3000);



		}



		// Enter ALL Already Existed Master Acct, ShipTo Name and ShipTo Acct



		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(350, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(351, ColNum));

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

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(352, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(353, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(354, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alreadyexistedstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(356, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(357, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(358, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(360, ColNum));

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

		CustomerShipTo_Methods.alreadyexistedterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.alreadyexistedvalidationmessage3(driver);
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyalreadyexistedupdationmesage3(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Verify if Ship To is Activated or Undeleted

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(368, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);



		try {

			WebElement deletedshipto=driver.findElement(By.xpath(".//*[@id='CustomerShipToGrid']/div[2]/table/tbody/tr[1]/td[1]"));

			String expecteddeletedshipto=deletedshipto.getText();

			String actualdeletedshipto=ExcelUtils.getstringCellData(368, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData(ExcelUtils.getstringCellData(368, ColNum) + " ShipTo is Already Existed", 369,7);

				ExcelUtils.setCellData("Pass", 369,8);

				System.out.println(ExcelUtils.getstringCellData(368, ColNum) + " ShipTo is Already Existed");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData(ExcelUtils.getstringCellData(368, ColNum) + " ShipTo is not Already Existed", 369,7);

			ExcelUtils.setCellData("Fail", 369,8);

			System.out.println(ExcelUtils.getstringCellData(368, ColNum) + " ShipTo is not Already Existed");

			Thread.sleep(3000);



		}



		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);














	}

}
