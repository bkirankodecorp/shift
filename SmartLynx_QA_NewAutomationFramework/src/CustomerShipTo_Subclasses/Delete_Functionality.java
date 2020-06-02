package CustomerShipTo_Subclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.ExcelUtils;

public class Delete_Functionality {
	
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
		
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.salesrepname1searchicon(driver));
		
		Thread.sleep(3000);
		
		CustomerShipTo_Methods.salesrepname1del(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.salesrepname2del(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.defproductload(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.producttoload(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CustomerShipTo_Methods.defaultloadsaddoption(driver));
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.defaultloaddelete(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.loaddeletealertcontent(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.loaddeleteok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollLow, 0)");

		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.delete(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.productdeletealertcontent(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.deleteok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.receivinghours(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.delete(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.recevinghoursdeletealertcontent(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.deleteok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.purchaseorder(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.delete(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.purchaseorderdeletealertcontent(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.deleteok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.update(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.verifydeleteupdationmesage(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.closeconfirmationmessage(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(142, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.ENTER);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.delete(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.shiptodeletealertcontent(driver);
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.shiptodeleteok(driver).click();
		
		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);
		
		CustomerShipTo_Methods.search(driver).sendKeys(Keys.CONTROL,"a");

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		CustomerShipTo_Methods.search(driver).sendKeys(Keys.DELETE);

		Thread.sleep(3000);
		
		
		CustomerShipTo_Methods.search(driver).sendKeys(ExcelUtils.getstringCellData(142, ColNum));

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
			
			String actualdeletedshipto=ExcelUtils.getstringCellData(142, ColNum);

			if(expecteddeletedshipto.equals(actualdeletedshipto)){

				ExcelUtils.setCellData("ShipTo is not Deleted Successfully", 236,7);

				ExcelUtils.setCellData("Fail", 236,8);

				System.out.println("ShipTo is not deleted");

				Thread.sleep(3000);
			}

		} catch (Exception e) {

			ExcelUtils.setCellData("ShipTo Deleted Successfully", 236,7);

			ExcelUtils.setCellData("Pass", 236,8);

			System.out.println("ShipTo Deleted Successfully");
			
			Thread.sleep(3000);



		}


		
		
		
	
	

}
}