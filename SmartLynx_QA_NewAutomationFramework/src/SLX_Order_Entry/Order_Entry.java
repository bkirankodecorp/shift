package SLX_Order_Entry;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Shift_Subclasses.screenshot;
import Utility.Constant;

public class Order_Entry {


	private static WebDriver driver=null;



	@SuppressWarnings({ "resource", })
	@Test
	public static void main() throws Exception {

		System.out.println("Launching Google Chrome Driver....");

		System.setProperty("webdriver.chrome.driver",
				"E://New folder//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		options.addArguments("--disable-web-security");
		options.addArguments("--start-maximized");
		options.addArguments("--no-proxy-server");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		screenshot.CaptureScreenshot(driver);
		driver.get(Constant.Url);

		Thread.sleep(3000);



		screenshot.CaptureScreenshot(driver);

		SLX_Order_Entry.LogIn_page.login(driver);

		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath("//span[contains(text(),'Dispatch')]")).size();


		int ok_size1=driver.findElements(By.xpath("//a[@href='/SLMain/DPScheduler/Scheduler']")).size();


		action.moveToElement(driver.findElements(By.xpath("//span[contains(text(),'Dispatch')]")).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		action.moveToElement(driver.findElements(By.xpath("//a[@href='/SLMain/DPScheduler/Scheduler']")).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//a[@href='/SLMain/DPScheduler/Scheduler']")).click();

		Thread.sleep(20000);

		screenshot.CaptureScreenshot(driver);







		try
		{

			String excelFilePath = "C://Users//svcs//Dropbox//QA//TestData (Single Iteration and Bulk Upload)\\Maintenance Screens Bulk Data.xlsx";
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));


			XSSFWorkbook ExcelWSheet = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = ExcelWSheet.getSheet("Truck");






			int rowCount = sheet.getLastRowNum();

			int noOfColumns = sheet.getRow(0).getLastCellNum();

			System.out.println("No.of Rows are : " + rowCount);

			System.out.println("No.Of Columns are: " + noOfColumns);




			for (int i=1; i<=1 ; i++)

				//for(int j=0;j<=noOfColumns;j--)

			{

				try{

					if(driver.findElement(By.id("dvAlertContent")).isDisplayed()){


						Thread.sleep(5000);

						driver.findElement(By.id("btnAlertOK")).click();

						Thread.sleep(5000);

						driver.findElement(By.linkText("New Order")).click();

						Thread.sleep(10000);

						driver.findElement(By.id("ancrAddCustomerShipto")).click();

						Thread.sleep(3000);

						driver.findElement(By.id("txtSearchCustomerShiptoGrid")).sendKeys("10RYSH");

						Thread.sleep(3000);

						driver.findElement(By.id("txtSearchCustomerShiptoGrid")).sendKeys(Keys.CONTROL,"a");

						Thread.sleep(3000);

						driver.findElement(By.id("txtSearchCustomerShiptoGrid")).sendKeys(Keys.ENTER);

						Thread.sleep(3000);

						driver.findElement(By.xpath(".//*[@id='CustomerShiptoWindowGrid']/div[2]/table/tbody/tr/td[1]")).click();

						Thread.sleep(3000);

						driver.findElement(By.id("btnCustShiptoWndOK")).click();

						Thread.sleep(5000);

						driver.findElement(By.xpath("//span[@aria-owns='ProductTransaction_OrderTypeId_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

						Thread.sleep(3000);

						List<WebElement> ordertype=driver.findElements(By.xpath("//ul[@id='ProductTransaction_OrderTypeId_listbox']//li"));


						for(WebElement ele:ordertype)
						{

							String ordertypeselect=ele.getText();

							if(ordertypeselect.equalsIgnoreCase("TANK"))
							{
								ele.click();

								break;
							}
						}


						Thread.sleep(3000);

						driver.findElement(By.xpath("//span[@aria-owns='ProductTransaction_ScheduleId_listbox']//span[@class='k-icon k-i-arrow-60-down']")).click();

						Thread.sleep(3000);

						List<WebElement> prioritytype=driver.findElements(By.xpath("//ul[@id='BaseProductTransaction_ScheduleId_listbox']//li"));


						for(WebElement ele:prioritytype)
						{

							String prioritytypeselect=ele.getText();

							if(prioritytypeselect.equalsIgnoreCase("Critical"))
							{
								ele.click();

								break;
							}
						}


						Thread.sleep(3000);

						driver.findElement(By.id("ProductTransaction_TicketCopies")).sendKeys("2");

						Thread.sleep(3000);

						driver.findElement(By.id("ProductTransaction_CustomerPO")).sendKeys("12");

						Thread.sleep(3000);

						/*driver.findElement(By.xpath("//span[@aria-owns='BaseProductTransaction_RegionId_listbox']//span[contains(text(),'select')]")).click();

						Thread.sleep(3000);

						int ok_size2=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseProductTransaction_RegionId_listbox']")).size();

						Thread.sleep(3000);

						driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseProductTransaction_RegionId_listbox']")).get(ok_size2-1).sendKeys("Region");

						Thread.sleep(3000);

						driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseProductTransaction_RegionId_listbox']")).get(ok_size2-1).sendKeys(Keys.ENTER);

						Thread.sleep(3000);*/

						driver.findElement(By.id("ProductTransaction_RequireStickReadings")).click();

						Thread.sleep(3000);

						driver.findElement(By.id("ProductTransaction_COD")).click();

						Thread.sleep(3000);

						driver.findElement(By.id("ProductTransaction_PumpCharge")).click();

						Thread.sleep(3000);

						List<WebElement>product=driver.findElements(By.xpath("//div[@id='BaseProductTransactionDetailsGrid']/div[2]/table/tbody/tr/td[5]"));

						Thread.sleep(3000);

						System.out.println("Customer has" +product.size()+ "Default products");

						for(int i1=1;i1<=product.size();i1++){

							System.out.println(product.size());


							((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='BaseProductTransactionDetailsGrid']/div[2]/table/tbody/tr["+i1+"]/td[5]")));

							Thread.sleep(3000);

							driver.findElement(By.id("PresetQty")).clear();

							Thread.sleep(3000);

							driver.findElement(By.id("PresetQty")).sendKeys("12.2");

							Thread.sleep(3000);

							driver.findElement(By.xpath(".//*[@id='MainPageContent']/div[4]/div/fieldset/div[3]")).click();

							Thread.sleep(3000);

						}



						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[@aria-owns='BaseProductTransaction_DeliveredByUserId_listbox']//span[contains(text(),'select')]")));

						Thread.sleep(3000);

						driver.findElement(By.xpath("//span[@aria-owns='BaseProductTransaction_AssignedShiftId_listbox']//span[contains(text(),'select')]")).click();

						Thread.sleep(3000);

						List<WebElement> shift=driver.findElements(By.xpath("//ul[@id='BaseProductTransaction_AssignedShiftId_listbox']//li"));


						for(WebElement ele:shift)
						{

							String shiftselect=ele.getText();

							if(shiftselect.equalsIgnoreCase("S1"))
							{
								ele.click();

								break;
							}
						}

						Thread.sleep(3000);

						driver.findElement(By.id("btnOrderEntrySave")).click();

						Thread.sleep(3000);


						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@id='OrderWellGrid']//input[@class='orderwellgrid-header-checkbox']")));

						Thread.sleep(3000);

						driver.findElement(By.xpath("//div[@id='OrderWellGrid']//input[@class='orderwellgrid-header-checkbox']")).click();

						Thread.sleep(3000);

						WebElement orderwell=driver.findElement(By.xpath(".//*[@id='OrderWellGrid']/div[2]/table/tbody/tr[1]/td[2]"));

						WebElement scheduler=driver.findElement(By.xpath(".//*[@id='DispatchScheduler']/table/tbody/tr[2]/td[2]/div/table/tbody/tr[5]/td[16]"));

						Actions builder= new Actions(driver);

						Action draganddrop=builder.clickAndHold(orderwell).moveToElement(scheduler).release(scheduler).build();

						Thread.sleep(5000);

						draganddrop.perform();

						Thread.sleep(5000);

						driver.findElement(By.id("btnYesConfirmationPopup")).click();

						Thread.sleep(3000);

						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//div[@id='OrderWellGrid']//input[@class='orderwellgrid-header-checkbox']")));

						Thread.sleep(3000);

						driver.findElement(By.id("txtFilterTrucks")).sendKeys("truck07,");

						Thread.sleep(3000);

						driver.findElement(By.id("txtFilterTrucks")).sendKeys(Keys.CONTROL,"a");

						Thread.sleep(3000);

						driver.findElement(By.id("txtFilterTrucks")).sendKeys(Keys.ENTER);

						Thread.sleep(3000);


						WebElement salesorder= driver.findElement(By.xpath("//div[@class='movie-template k-block']"));

						WebElement dispatch= driver.findElement(By.xpath(".//*[@id='DispatchSchedulerContextMenu']/li[1]/span"));

						WebElement dispatchitem=driver.findElement(By.xpath("//ul[@id='DispatchSchedulerContextMenu']//span[contains(text(),'Dispatch All Items for Resource')]"));



						Actions sales= new Actions(driver);

						sales.contextClick(salesorder).build().perform();

						Thread.sleep(3000);

						int ok_size3= driver.findElements(By.xpath(".//*[@id='DispatchSchedulerContextMenu']/li[1]/span")).size();


						int ok_size4=driver.findElements(By.xpath("//ul[@id='DispatchSchedulerContextMenu']//span[contains(text(),'Dispatch All Items for Resource')]")).size();


						sales.moveToElement(driver.findElements(By.xpath(".//*[@id='DispatchSchedulerContextMenu']/li[1]/span")).get(ok_size3-1)).build().perform();

						Thread.sleep(5000);

						screenshot.CaptureScreenshot(driver);

						sales.moveToElement(driver.findElements(By.xpath("//ul[@id='DispatchSchedulerContextMenu']//span[contains(text(),'Dispatch All Items for Resource')]")).get(ok_size4-1)).build().perform();

						Thread.sleep(5000);

						screenshot.CaptureScreenshot(driver);

						driver.findElement(By.xpath("//ul[@id='DispatchSchedulerContextMenu']//span[contains(text(),'Dispatch All Items for Resource')]")).click();

						Thread.sleep(5000);

						screenshot.CaptureScreenshot(driver);






					}


				}

				catch (Exception e) {


					System.out.println(e.getMessage());


				}





				try{ 


					if(Order_Entry_Methods.alreadyexistfile(driver).isDisplayed()){





					}
				}  

				catch (Exception e) 
				{


				}

				try{

					if(Order_Entry_Methods.undeletefile(driver).isDisplayed()){




					}


				}

				catch (Exception e) {

				}

				try{

					if(Order_Entry_Methods.propanetruckvalidation(driver).isDisplayed()){


					}


				}

				catch (Exception e) {

				}


				try{


					if(Order_Entry_Methods.mapatleastoneproductalert(driver).isDisplayed()){





					}

				}

				catch (Exception e) {

				}


				inputStream.close();			

			}



		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


}
