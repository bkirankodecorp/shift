package CustomerShipTo_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Undelete_Functionality {

	private static int ColNum=5;

	public static void customershipto(WebDriver driver) throws Exception{



		// Enter Deleted Ship To Acct and Master Acct and Enter New Ship To Name


		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(239, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(240, ColNum));

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

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(241, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(242, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(243, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undelstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(245, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(246, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(247, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(249, ColNum));

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

		CustomerShipTo_Methods.undelterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undeletevalidationmessage1(driver);
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyundeleteupdationmesage1(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Verify if Ship To is Activated or Undeleted

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(257, ColNum));

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

			String actualdeletedshipto=ExcelUtils.getstringCellData(257, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData("ShipTo is UnDeleted or Activated", 258,7);

				ExcelUtils.setCellData("Fail", 258,8);

				System.out.println("ShipTo is Undeleted or Activated");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData("ShipTo is not UnDeleted or Activated", 258,7);

			ExcelUtils.setCellData("Pass", 258,8);

			System.out.println("ShipTo is not UnDeleted or Activated");

			Thread.sleep(3000);



		}


		// Enter Deleted Master Acct and ShipTo Name and Enter New ShipTo Acct



		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(261, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(262, ColNum));

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

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(263, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(264, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(265, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undelstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(267, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(268, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(269, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(271, ColNum));

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

		CustomerShipTo_Methods.undelterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undeletevalidationmessage2(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyundeleteupdationmesage2(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Verify if Ship To is Activated or Undeleted

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(279, ColNum));

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

			String actualdeletedshipto=ExcelUtils.getstringCellData(279, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData("ShipTo is UnDeleted or Activated", 280,7);

				ExcelUtils.setCellData("Fail", 280,8);

				System.out.println("ShipTo is Undeleted or Activated");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData("ShipTo is not UnDeleted or Activated", 280,7);

			ExcelUtils.setCellData("Pass", 280,8);

			System.out.println("ShipTo is not UnDeleted or Activated");

			Thread.sleep(3000);



		}



		// Enter ALL Deleted Master Acct and ShipTo Name and ShipTo Acct



		CustomerShipTo_Methods.create(driver);

		Thread.sleep(7000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.shiptoacct(driver).sendKeys(ExcelUtils.getstringCellData(283, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchicon(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.masteracctsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(284, ColNum));

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

		CustomerShipTo_Methods.name(driver).sendKeys(ExcelUtils.getstringCellData(285, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.address1(driver).sendKeys(ExcelUtils.getstringCellData(286, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.city(driver).sendKeys(ExcelUtils.getstringCellData(287, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.stateclick(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undelstate(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.zip(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(289, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.contact2name2(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.latitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(290, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);



		CustomerShipTo_Methods.longitude(driver).sendKeys(String.valueOf(ExcelUtils.getdoubleCellData(291, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.regionmap(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		CustomerShipTo_Methods.regionmapsearchbox(driver).sendKeys(ExcelUtils.getstringCellData(293, ColNum));

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

		CustomerShipTo_Methods.undelterritory(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.primarydiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.save(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undeletevalidationmessage3(driver);
		
		Thread.sleep(3000);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.undeletecheckbox(driver));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.undeletecheckbox(driver).click();
		

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		
		
		CustomerShipTo_Methods.update(driver).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.verifyundeleteupdationmesage3(driver);
		
		Thread.sleep(3000);

		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Verify if Ship To is Activated or Undeleted

		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(302, ColNum));

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

			String actualdeletedshipto=ExcelUtils.getstringCellData(302, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData("ShipTo is UnDeleted or Activated", 303,7);

				ExcelUtils.setCellData("Pass", 303,8);

				System.out.println("ShipTo is Undeleted or Activated");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData("ShipTo is not UnDeleted or Activated", 303,7);

			ExcelUtils.setCellData("Fail", 303,8);

			System.out.println("ShipTo is not UnDeleted or Activated");

			Thread.sleep(3000);



		}



		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);






	}

}
