package SLX_Order_Entry;

import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Order_Entry_Methods {




	private static MouseHandler mouse=null;

	private static WebElement create=null;

	private static WebElement trucknumber=null;

	private static WebElement trucktypeclick=null;

	private static WebElement unitofmeasureclick=null;

	private static WebElement defaulttraileridclick=null;

	private static List<WebElement> defaulttraileridsearchbox=null;

	private static WebElement jbusodometeroffset=null;

	private static WebElement warehouseidclick=null;

	private static List<WebElement> warehouseidsearchbox=null;

	private static WebElement address=null;

	private static WebElement city=null;

	private static WebElement stateclick=null;

	private static List<WebElement> statesearchbox=null;

	private static WebElement zip=null;

	private static WebElement latitude=null;

	private static WebElement longitude=null;

	private static WebElement net=null;





	private static WebElement meters=null;

	private static WebElement metersadd=null;

	private static WebElement metnumber=null;

	private static WebElement metdiv=null;

	private static WebElement defaultproductclick=null;

	private static WebElement defaultproductsearchbox=null;

	private static WebElement defaultproductselect=null;

	private static WebElement defaultproductok=null;

	private static WebElement typeactive=null;

	private static WebElement typeclick=null;




	private static WebElement compartments=null;

	private static WebElement compartmentsadd=null;

	private static WebElement compartmentsnumber=null;

	private static WebElement compdiv=null;

	private static WebElement capacity=null;


	private static WebElement productmapping=null;

	private static WebElement productcategoryheadercheckbox=null;

	private static WebElement productheadercheckbox=null;

	private static WebElement regionmapping=null;

	private static WebElement regionmappingsearchbox=null;

	private static WebElement regionmappingheadercheckbox=null;



	private static WebElement searchbox=null;

	private static WebElement propanetruckvalidation=null;


	private static WebElement save=null;

	private static WebElement closeconfirmationmessage=null;

	private static WebElement alreadyexistfile=null;

	private static WebElement undeletefile=null;

	private static WebElement undelete=null;

	private static WebElement update=null;
	
	private static WebElement mapatleastoneproductalert=null;
	
	private static WebElement alertok=null;
	
	private static WebElement productmapalercontent=null;


	private static WebElement back=null;





	public static MouseHandler mouse(WebDriver driver) throws Exception{


		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath("//span[contains(text(),'Dispatch')]")).size();


		int ok_size1=driver.findElements(By.xpath("//a[@href='/SLMain/DispatchPlanner/DispatchScheduler']")).size();


		action.moveToElement(driver.findElements(By.xpath("//span[contains(text(),'Dispatch')]")).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		action.moveToElement(driver.findElements(By.xpath("//a[@href='/SLMain/DispatchPlanner/DispatchScheduler']")).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//a[@href='/SLMain/DispatchPlanner/DispatchScheduler']")).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		if(Order_Entry_Methods.searchbox(driver).isDisplayed()){


			System.out.println("Page is Redirected to Truck Screen");
		}

		else

		{
			System.out.println("Page is not Redirected to Truck Screen");


		}


		return mouse;


	}



	public static WebElement create(WebDriver driver) throws Exception{



		create=driver.findElement(By.id("btncreate"));

		create.click();


		return create;


	}

	public static WebElement trucknumber(WebDriver driver) throws Exception{

		trucknumber=driver.findElement(By.id("BaseTruck_TruckName"));


		return trucknumber;


	}

	public static WebElement trucktypeclick(WebDriver driver) throws Exception{

		trucktypeclick=driver.findElement(By.xpath("//span[@aria-owns='BaseTruck_TruckTypeId_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return trucktypeclick;


	}

	public static WebElement unitofmeasureclick(WebDriver driver) throws Exception{

		unitofmeasureclick=driver.findElement(By.xpath("//span[@aria-owns='BaseTruck_UnitOfMeasure_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return unitofmeasureclick;

	}
	public static WebElement defaulttraileridclick(WebDriver driver) throws Exception{

		defaulttraileridclick=driver.findElement(By.xpath("//span[@aria-owns='BaseTruck_DefaultTrailerId_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return defaulttraileridclick;

	}

	public static List<WebElement> defaulttraileridsearchbox(WebDriver driver) throws Exception{

		defaulttraileridsearchbox=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseTruck_DefaultTrailerId_listbox']"));




		return defaulttraileridsearchbox;

	}


	public static WebElement jbusodometeroffset(WebDriver driver) throws Exception{

		jbusodometeroffset=driver.findElement(By.id("BaseTruck_JbusOdometerOffset"));

		return jbusodometeroffset;

	}

	public static WebElement warehouseidclick(WebDriver driver) throws Exception{

		warehouseidclick=driver.findElement(By.xpath("//span[@aria-owns='BaseTruck_WarehouseId_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return warehouseidclick;

	}

	public static List<WebElement> warehouseidsearchbox(WebDriver driver) throws Exception{

		warehouseidsearchbox=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseTruck_WarehouseId_listbox']"));



		return warehouseidsearchbox;

	}

	public static WebElement address(WebDriver driver) throws Exception{

		address=driver.findElement(By.id("HomeBase_Address"));

		return address;

	}

	public static WebElement city(WebDriver driver) throws Exception{

		city=driver.findElement(By.id("HomeBase_City"));

		return city;

	}

	public static WebElement searchbox(WebDriver driver) throws Exception{

		searchbox=driver.findElement(By.id("txtFilterTrucks"));

		return searchbox;

	}

	public static WebElement stateclick(WebDriver driver) throws Exception{

		stateclick=driver.findElement(By.xpath("//span[@aria-owns='HomeBase_State_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return stateclick;

	}

	public static List<WebElement> statesearchbox(WebDriver driver) throws Exception{

		statesearchbox=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='HomeBase_State_listbox']"));



		return statesearchbox;

	}

	public static WebElement zip(WebDriver driver) throws Exception{

		zip=driver.findElement(By.id("HomeBase_Zip"));

		return zip;

	}
	public static WebElement latitude(WebDriver driver) throws Exception{

		latitude=driver.findElement(By.id("HomeBase_Latitude"));

		return latitude;

	}
	public static WebElement longitude(WebDriver driver) throws Exception{

		longitude=driver.findElement(By.id("HomeBase_Longitude"));

		return longitude;

	}


	public static WebElement net(WebDriver driver) throws Exception{

		net=driver.findElement(By.xpath("//input[@id='BaseTruck_GrossNet'][@value='False']"));

		return net;
	}

	public static WebElement meters(WebDriver driver) throws Exception{

		meters=driver.findElement(By.linkText("Meters"));

		return meters;

	}

	public static WebElement metersadd(WebDriver driver) throws Exception{

		metersadd=driver.findElement(By.xpath("//div[@id='TruckMetersGrid']//a[@class='k-button k-button-icontext k-grid-add SLTheme']"));

		return metersadd;

	}
	public static WebElement metnumber(WebDriver driver) throws Exception{

		metnumber=driver.findElement(By.id("Number"));

		return metnumber;

	}

	public static WebElement metdiv(WebDriver driver) throws Exception{

		metdiv=driver.findElement(By.xpath(".//*[@id='tabTruckMeter']/div/div[1]/fieldset"));

		return metdiv;

	}


	public static WebElement defaultproductclick(WebDriver driver) throws Exception{

		defaultproductclick=driver.findElement(By.xpath("//div[@id='TruckMetersGrid']//input[@value='...']"));

		return defaultproductclick;

	}

	public static WebElement defaultproductsearchbox(WebDriver driver) throws Exception{

		defaultproductsearchbox=driver.findElement(By.id("txtSearchProductGrid"));

		return defaultproductsearchbox;

	}


	public static WebElement defaultproductselect(WebDriver driver) throws Exception{

		defaultproductselect=driver.findElement(By.xpath("//div[@id='ProductWindowGrid']//tr[@role='row']//td[2]"));

		return defaultproductselect;

	}

	public static WebElement defaultproductok(WebDriver driver) throws Exception{

		defaultproductok=driver.findElement(By.id("btnProdWndOK"));

		return defaultproductok;

	}


	public static WebElement typeactive(WebDriver driver) throws Exception{

		typeactive=driver.findElement(By.xpath("//div[@id='TruckMetersGrid']/div[3]/table/tbody/tr/td[3]"));

		return typeactive;

	}

	public static WebElement typeclick(WebDriver driver) throws Exception{

		typeclick=driver.findElement(By.xpath("//span[@aria-owns='Type_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return typeclick;

	}


	public static WebElement compartments(WebDriver driver) throws Exception{

		compartments=driver.findElement(By.linkText("Compartments"));

		return compartments;

	}

	public static WebElement compartmentsadd(WebDriver driver) throws Exception{

		compartmentsadd=driver.findElement(By.xpath("//div[@id='TruckCompartmentsGrid']//a[@class='k-button k-button-icontext k-grid-add SLTheme']"));

		return compartmentsadd;

	}
	public static WebElement compartmentsnumber(WebDriver driver) throws Exception{

		compartmentsnumber=driver.findElement(By.id("Number"));

		return compartmentsnumber;

	}

	public static WebElement compdiv(WebDriver driver) throws Exception{

		compdiv=driver.findElement(By.xpath(".//*[@id='tabTruckCompartment']/div/div[1]/fieldset"));

		return compdiv;

	}


	public static WebElement capacity(WebDriver driver) throws Exception{

		capacity=driver.findElement(By.id("Capacity"));

		return capacity;

	}
	public static WebElement productmapping(WebDriver driver) throws Exception{

		productmapping=driver.findElement(By.linkText("Product Mapping"));



		return productmapping;

	}





	public static WebElement productcategoryheadercheckbox(WebDriver driver) throws Exception{

		productcategoryheadercheckbox=driver.findElement(By.xpath("//div[@id='TruckProductCategoriesGrid']//input[@class='grid-header-checkboxProduct']"));

		return productcategoryheadercheckbox;

	}




	public static WebElement productheadercheckbox(WebDriver driver) throws Exception{

		productheadercheckbox=driver.findElement(By.xpath("//div[@id='TruckProductsGrid']//input[@class='grid-header-checkbox prodctHeaderChangeevent']"));

		return productheadercheckbox;
	}
	public static WebElement regionmapping(WebDriver driver) throws Exception{

		regionmapping=driver.findElement(By.linkText("Region Mapping"));

		return regionmapping;

	}

	public static WebElement regionmappingsearchbox(WebDriver driver) throws Exception{

		regionmappingsearchbox=driver.findElement(By.id("RegionTypeAhead"));

		return regionmappingsearchbox;


	}

	public static WebElement regionmappingheadercheckbox(WebDriver driver) throws Exception{

		regionmappingheadercheckbox=driver.findElement(By.xpath("//div[@id='RegionTrucksGrid']//th[@class='k-header SLTheme']//input"));

		return regionmappingheadercheckbox;
	}

	public static WebElement save(WebDriver driver) throws Exception{

		save=driver.findElement(By.id("btnCreate"));

		return save;


	}

	public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{

		closeconfirmationmessage=driver.findElement(By.linkText("×"));

		return closeconfirmationmessage;


	}


	public static WebElement alreadyexistfile(WebDriver driver) throws Exception{

		alreadyexistfile=driver.findElement(By.xpath("//p[contains(text(),'A Truck with the entered Name already exists. Please edit this one or create a new with unique value.')]"));

		return alreadyexistfile;


	}

	public static WebElement undeletefile(WebDriver driver) throws Exception{

		undeletefile=driver.findElement(By.xpath("//p[contains(text(),'A Truck with the entered Name already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]"));

		return undeletefile;


	}
	public static WebElement undelete(WebDriver driver) throws Exception{

		undelete=driver.findElement(By.id("BaseTruck_IsRecordActive"));

		return undelete;


	}

	public static WebElement update(WebDriver driver) throws Exception{

		update=driver.findElement(By.id("btnCreate"));

		return update;

	}
	public static WebElement propanetruckvalidation(WebDriver driver) throws Exception{

		propanetruckvalidation=driver.findElement(By.id("statusAlertMessage"));

		return propanetruckvalidation;


	}
	
	public static WebElement mapatleastoneproductalert(WebDriver driver) throws Exception{

		mapatleastoneproductalert=driver.findElement(By.id("dvAlertContent"));

		return mapatleastoneproductalert;


	}
	
	public static WebElement alertok(WebDriver driver) throws Exception{
		
		alertok=driver.findElement(By.id("btnAlertOK"));
			
			return alertok;
			
			
		}
	
	public static WebElement back(WebDriver driver) throws Exception{

		back=driver.findElement(By.linkText("Back"));

		return back;

	}	


}
