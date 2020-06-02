package TankOnboarding_SubClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import TankOnboarding_SubClasses.screenshot;
import Utility.ExcelUtils;

public class Save_Functionality {

	private static int ColNum=5;



	public static void tankonboarding(WebDriver driver) throws Exception{





		TankOnboarding_Methods.organizationuserid(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.getcorporates(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.blankorganizationuseridandpasswordalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationuserid(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(16, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).sendKeys(ExcelUtils.getstringCellData(17, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.getcorporates(driver).click();

		Thread.sleep(10000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.corporatesdoesntexistorganizationuseridandpasswordalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationuserid(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationuserid(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(23, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).sendKeys(ExcelUtils.getstringCellData(24, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.getcorporates(driver).click();

		Thread.sleep(10000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizatioidandpasswordretrievedvalidation(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationidfromtank(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.parenbtcorporatename(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.parentcorporatevalidation(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.parenbtcorporatename(driver).sendKeys((ExcelUtils.getstringCellData(32, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationidfromtankvalidation(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationidfromtank(driver).sendKeys(String.valueOf(String.valueOf(ExcelUtils.getintCellData(35, ColNum))));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.blankonboardingadminemailalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.onboardingadminuseremail(driver).sendKeys(ExcelUtils.getstringCellData(39, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.invalidemailalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.onboardingadminuseremail(driver).sendKeys(ExcelUtils.getstringCellData(43, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		TankOnboarding_Methods.organizationuserid(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationuserid(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(44, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).sendKeys(ExcelUtils.getstringCellData(45, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.invalidorganizationuseridandpasswordalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationuserid(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationuserid(driver).sendKeys(String.valueOf(ExcelUtils.getintCellData(49, ColNum)));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.organizationpassword(driver).sendKeys(ExcelUtils.getstringCellData(50, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.childcorporatesheadercheckbox(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='ChildCorporatesGrid']/div[2]/table/tbody/tr/td[3]")));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.optionalchildcorporatesemail(driver).sendKeys(ExcelUtils.getstringCellData(52, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.invalidchildcorporateemailalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='ChildCorporatesGrid']/div[2]/table/tbody/tr/td[3]")));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.optionalchildcorporatesemail(driver).sendKeys(ExcelUtils.getstringCellData(55, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.duplicateemailsalert(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.alertok(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='ChildCorporatesGrid']/div[2]/table/tbody/tr/td[3]")));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.optionalchildcorporatesemail(driver).clear();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.optionalchildcorporatesemail(driver).sendKeys(ExcelUtils.getstringCellData(59, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.childcorporatesdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='ChildCorporatesGrid']/div[2]/table/tbody/tr[2]/td[3]")));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.optionalchildcorporatesemail(driver).sendKeys(ExcelUtils.getstringCellData(60, ColNum));

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.childcorporatesdiv(driver).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.save(driver).click();

		Thread.sleep(20000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.corporatescreationsuccessfullmessage(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		TankOnboarding_Methods.logout(driver);

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


	}

}
