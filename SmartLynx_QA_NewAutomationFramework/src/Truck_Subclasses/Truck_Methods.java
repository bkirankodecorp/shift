package Truck_Subclasses;

import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utility.ExcelUtils;


public class Truck_Methods {


	private static int ColNum=4;

	private static MouseHandler mouse=null;

	private static WebElement create=null;

	private static WebElement trucknumber=null;

	private static WebElement tag=null;

	private static WebElement costperhour=null;

	private static WebElement backofficetrucknumber=null;

	private static WebElement trucktypeclick=null;

	private static WebElement trucktypedropdownlist=null;

	private static WebElement trucktypeselect=null;

	private static WebElement ticketcopies=null;

	private static WebElement unitofmeasureclick=null;

	private static WebElement unitofmeasuredropdownlist=null;

	private static WebElement unitofmeasureselect=null;

	private static WebElement categoryclick=null;

	private static WebElement categorydropdownlist=null;

	private static WebElement categoryselect=null;

	private static WebElement defaulttraileridclick=null;

	private static WebElement defaulttraileridsearchbox=null;

	private static WebElement vin=null;

	private static WebElement costperunitofdistance=null;

	private static WebElement truckstatusclick=null;

	private static WebElement truckstatusdropdownlist=null;

	private static WebElement truckstatusselect=null;

	private static WebElement jbusodometeroffset=null;

	private static WebElement alternativetrucknumber=null;

	private static WebElement warehouseidclick=null;

	private static WebElement warehouseidsearchbox=null;

	private static WebElement loadedgrossweight=null;

	private static WebElement address=null;

	private static WebElement city=null;

	private static WebElement stateclick=null;

	private static WebElement statesearchbox=null;

	private static WebElement zip=null;

	private static WebElement latitude=null;

	private static WebElement longitude=null;

	private static WebElement truckhaspump=null;

	private static WebElement requirevehicleinspection=null;

	private static WebElement rrmanualdataentry=null;

	private static WebElement requireproductloading=null;

	private static WebElement gross=null;

	private static WebElement net=null;



	private static WebElement meters=null;

	private static WebElement metersadd=null;

	private static List<WebElement> registertype=null;

	private static List<WebElement> editregistertype=null;

	private static WebElement meterregistertypeactive=null;

	private static WebElement registernumberdropdownlist=null;

	private static WebElement registernumberselect=null;

	private static WebElement registernumberactive=null;

	private static WebElement editregisternumberselect=null;

	private static WebElement addnewregisternumber=null;

	private static WebElement metdiv=null;

	private static WebElement defaultproductclick=null;

	private static WebElement defaultproductsearchbox=null;

	private static WebElement defaultproductselect=null;

	private static WebElement defaultproductok=null;

	private static WebElement typeactive=null;

	private static WebElement typeclick=null;

	private static WebElement typedropdownlist=null;

	private static WebElement typeselect=null;



	private static WebElement reels=null;

	private static WebElement reelsadd=null;

	private static WebElement reelsnumber=null;

	private static WebElement reelsdiv=null;

	private static WebElement flushvolumeactive=null;

	private static WebElement flushvolume=null;



	private static WebElement compartments=null;

	private static WebElement compartmentsadd=null;

	private static WebElement compartmentsnumber=null;

	private static WebElement compdiv=null;

	private static WebElement capacityactive=null;

	private static WebElement capacity=null;



	private static WebElement communications=null;

	private static WebElement communicationsadd=null;

	private static WebElement ssid=null;

	private static WebElement netaddress=null;

	private static WebElement comdiv=null;

	private static WebElement deviceactive=null;

	private static WebElement device=null;



	private static WebElement productmapping=null;

	private static WebElement productcategoryheadercheckbox=null;

	private static WebElement productheadercheckbox=null;



	private static WebElement terminalmapping=null;

	private static WebElement expand=null;

	private static List<WebElement> terminalmappingfirststatecheckbox=null;

	private static WebElement terminalmappingsecondstatecheckbox=null;

	private static WebElement termtopcheck=null;

	private static WebElement termmidarrowplus=null;

	private static WebElement termmidarrowminus=null;

	private static WebElement termmidILcheck=null;

	private static WebElement termbotarrowplus=null;

	private static WebElement termbotarrowminus=null;

	private static WebElement termbotcheck=null;



	private static WebElement regionmapping=null;

	private static WebElement regionmappingsearchbox=null;

	private static WebElement regionmappingheadercheckbox=null;

	private static WebElement regionmappingindividualcheck=null;





	private static WebElement dispatchoptions=null;

	private static WebElement email=null;

	private static WebElement print=null;

	private static WebElement toemailaddress=null;

	private static WebElement emailsubject=null;

	private static WebElement emailmessage=null;

	private static WebElement emailaddress=null;

	private static WebElement dispatchdiv=null;

	private static WebElement save=null;

	private static WebElement verifysavemesage=null;

	private static WebElement closeconfirmationmessage=null;

	private static WebElement verifysavemesageforinvalidinput=null;
	
	private static WebElement verifysavemesageforblankinput=null;
	
	

	private static WebElement search=null;

	private static WebElement edit=null;

	private static WebElement editwarehouse=null;

	private static WebElement editstate=null;

	private static WebElement metersnumberactive=null;

	private static WebElement edittype=null;

	private static WebElement addtype=null;

	private static WebElement reelsnumberactive=null;

	private static WebElement compartmentsnumberactive=null;

	private static WebElement netaddressactive=null;

	private static WebElement editproductcategories=null;

	private static WebElement editproducts=null;

	private static WebElement editterminalmapping=null;

	private static WebElement update=null;

	private static WebElement verifyupdationmesage=null;



	private static WebElement delete=null;

	private static WebElement deletealertcontent=null;

	private static WebElement metersrecorddeletealertcontent=null;

	private static WebElement deleteok=null;

	private static WebElement reelsrecorddeletealertcontent=null;

	private static WebElement compartmentsrecorddeletealertcontent=null;

	private static WebElement communicationsrecorddeletealertcontent=null;

	private static WebElement ok=null;

	private static WebElement cancel=null;

	private static WebElement delmsg=null;

	private static WebElement verifydeleteupdationmesage=null;


	private static WebElement delwarehouseselect=null;

	private static WebElement delstateselect=null;

	private static WebElement undeletevalidationmessage1=null;

	private static WebElement verifyundeleteupdationmesage1=null;

	private static WebElement undeletevalidationmessage2=null;

	private static WebElement undelete=null;

	private static WebElement verifyundeleteupdationmesage2=null;



	private static WebElement searchforalreadyexisttruck=null;

	private static WebElement alreadyexisttruckvalidationmessage=null;

	private static WebElement verifyalreadyexistupdationmesage=null;



	private static WebElement blankinputintrucknumber=null;

	private static WebElement blankinputinjbusodometeroffset=null;

	private static WebElement blankinputinwarehouseid=null;

	private static WebElement blankinputinaddress=null;

	private static WebElement blankinputincity=null;

	private static WebElement blankinputinstate=null;

	private static WebElement blankinputinzip=null;

	private static WebElement blankinputinlatitude=null;

	private static WebElement blankinputinlongitude=null;

	private static WebElement blankinputinmetersnumber=null;

	private static WebElement blankinputinfindproduct=null;

	private static WebElement blankinputinreelsnumber=null;

	private static WebElement blankinputincompartmentsnumber=null;

	private static WebElement blankinputincommunications=null;

	
	private static WebElement mapatleastoneproductalert=null;

	private static WebElement alertok=null;

	private static WebElement productmapalercontent=null;

	private static WebElement invalidinputinmeterregistertype=null;
	
	private static WebElement invalidinputinregisternumber=null;





	private static WebElement invalidinputintrucknumber=null;

	private static WebElement invalidinputincostperhour=null;

	private static WebElement invalidinputincostperunitofdistance=null;

	private static WebElement invalidinputinjbusodometeroffset=null;

	private static WebElement invalidinputinaddress=null;

	private static WebElement invalidinputincity=null;

	private static WebElement invalidinputinzip1=null;

	private static WebElement invalidinputinzip2=null;

	private static WebElement invalidinputinlatitude1=null;

	private static WebElement invalidinputinlatitude2=null;

	private static WebElement invalidinputinlongitude1=null;

	private static WebElement invalidinputinlongitude2=null;

	private static WebElement invalidinputinmetersnumber=null;

	private static WebElement invalidinputalertinmeternumber=null;

	private static WebElement invalidinputinreelsnumber=null;

	private static WebElement invalidinputalertinreelsnumber=null;

	private static WebElement invalidinputincompartmentsnumber=null;

	private static WebElement invalidinputalertincompartmentsnumber=null;

	private static WebElement invalidinputtoemailaddress=null;

	private static WebElement invalidinputemailaddress=null;

	private static WebElement selectpropanetruck=null;

	private static WebElement propanetruckvalidation=null;




	private static WebElement back=null;

	private static WebElement sort=null;

	private static WebElement pagenavbuttons=null;



	public static MouseHandler mouse(WebDriver driver) throws Exception{

		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(8, ColNum))).size();


		int ok_size1=driver.findElements(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).size();


		action.moveToElement(driver.findElements(By.xpath(ExcelUtils.getstringCellData(8, ColNum))).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		action.moveToElement(driver.findElements(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).click();

		Thread.sleep(5000);
		
		
		WebElement mainpage=driver.findElement(By.linkText("Truck Number"));
		
		if(mainpage.isDisplayed()){
			
			
		 	
		ExcelUtils.setCellData("Page is redirected to Truck Screen", 10,7);
		
		ExcelUtils.setCellData("Pass", 10, 8);
		
		System.out.println("Page is redirected to Truck Screen");
		
		Thread.sleep(3000);
		
		}
		
		else{
			
			ExcelUtils.setCellData("Page is not redirected to Truck Screen", 10,8);	
			
			ExcelUtils.setCellData("Fail", 10, 8);
			
		}

		return mouse;


	}



	public static WebElement create(WebDriver driver) throws Exception{



		create=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));

		create.click();


		return create;


	}

	public static WebElement trucknumber(WebDriver driver) throws Exception{

		trucknumber=driver.findElement(By.id(ExcelUtils.getstringCellData(12, ColNum)));


		return trucknumber;


	}

	public static WebElement tag(WebDriver driver) throws Exception{

		tag=driver.findElement(By.id(ExcelUtils.getstringCellData(13, ColNum)));

		return tag;

	}

	public static WebElement costperhour(WebDriver driver) throws Exception{

		costperhour=driver.findElement(By.id(ExcelUtils.getstringCellData(14, ColNum)));

		return costperhour;

	}

	public static WebElement backofficetrucknumber(WebDriver driver) throws Exception{

		backofficetrucknumber=driver.findElement(By.id(ExcelUtils.getstringCellData(15, ColNum)));

		return backofficetrucknumber;

	}

	public static WebElement trucktypeclick(WebDriver driver) throws Exception{

		trucktypeclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(16, ColNum)));



		return trucktypeclick;


	}


	public static WebElement trucktypedropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(17, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Truck Type Has Following Dropdown List \n"+e.getText(),17, 8);

			System.out.println("Truck Type Has Following Dropdown List \n" + e.getText());

		}

		return trucktypedropdownlist;

	}

	public static WebElement trucktypeselect(WebDriver driver) throws Exception{

		//trucktypeselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(18, ColNum)));




		/*	int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(18, ColNum))).size();

	Thread.sleep(3000);

	driver.findElements(By.xpath(ExcelUtils.getstringCellData(18, ColNum))).get(ok_size-1).click();

	Thread.sleep(3000);*/

		List<WebElement> trucktype=driver.findElements(By.xpath(ExcelUtils.getstringCellData(18, ColNum)));


		for(WebElement ele:trucktype)
		{

			String trucktypeselect=ele.getText();

			if(trucktypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(18, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Truck Type is " + (ExcelUtils.getstringCellData(18, 5)),18, 8);

		System.out.println("Truck Type is " + (ExcelUtils.getstringCellData(18, 5)));



		return trucktypeselect;

	}


	public static WebElement ticketcopies(WebDriver driver) throws Exception{

		ticketcopies=driver.findElement(By.id(ExcelUtils.getstringCellData(19, ColNum)));

		return ticketcopies;

	}


	public static WebElement unitofmeasureclick(WebDriver driver) throws Exception{

		unitofmeasureclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(20, ColNum)));

		return unitofmeasureclick;

	}

	public static WebElement unitofmeasuredropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(21, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Unit Of Measure Has Following Dropdown List \n"+e.getText(),21, 8);

			System.out.println("Unit Of Measure Has Following Dropdown List \n" + e.getText());

		}

		return unitofmeasuredropdownlist;

	}

	public static WebElement unitofmeasureselect(WebDriver driver) throws Exception{



		List<WebElement> unitofmeasure=driver.findElements(By.xpath(ExcelUtils.getstringCellData(22, ColNum)));


		for(WebElement ele:unitofmeasure)
		{

			String unitofmeasureselect=ele.getText();

			if(unitofmeasureselect.equalsIgnoreCase(ExcelUtils.getstringCellData(22, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Unit Of Measure is " + (ExcelUtils.getstringCellData(22, 5)),22, 8);

		System.out.println("Unit Of Measure is " + (ExcelUtils.getstringCellData(22, 5)));


		return unitofmeasureselect;

	}

	public static WebElement categoryclick(WebDriver driver) throws Exception{

		categoryclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(23, ColNum)));

		return categoryclick;

	}

	public static WebElement categorydropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(24, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Category Has Following Dropdown List \n"+e.getText(),24, 8);

			System.out.println("Category Has Following Dropdown List \n" + e.getText());

		}

		return categorydropdownlist;

	}

	public static WebElement categoryselect(WebDriver driver) throws Exception{



		List<WebElement> category=driver.findElements(By.xpath(ExcelUtils.getstringCellData(25, ColNum)));


		for(WebElement ele:category)
		{

			String categoryselect=ele.getText();

			if(categoryselect.equalsIgnoreCase(ExcelUtils.getstringCellData(25, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("category is " + (ExcelUtils.getstringCellData(25, 5)),25, 8);

		System.out.println("category is " + (ExcelUtils.getstringCellData(25, 5)));

		return categoryselect;

	}
	public static WebElement defaulttraileridclick(WebDriver driver) throws Exception{

		defaulttraileridclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(26, ColNum)));

		return defaulttraileridclick;

	}

	public static WebElement defaulttraileridsearchbox(WebDriver driver) throws Exception{

		defaulttraileridsearchbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(27, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(27, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(27, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(27, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(27, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);


		return defaulttraileridsearchbox;

	}

	public static WebElement vin(WebDriver driver) throws Exception{

		vin=driver.findElement(By.id(ExcelUtils.getstringCellData(28, ColNum)));

		return vin;

	}


	public static WebElement costperunitofdistance(WebDriver driver) throws Exception{

		costperunitofdistance=driver.findElement(By.id(ExcelUtils.getstringCellData(29, ColNum)));

		return costperunitofdistance;

	}

	public static WebElement truckstatusclick(WebDriver driver) throws Exception{

		truckstatusclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(30, ColNum)));

		return truckstatusclick;

	}

	public static WebElement truckstatusdropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Truck Status Has Following Dropdown List \n"+e.getText(),31, 8);

			System.out.println("Truck Status Has Following Dropdown List \n" + e.getText());

		}

		return truckstatusdropdownlist;

	}

	public static WebElement truckstatusselect(WebDriver driver) throws Exception{




		List<WebElement> truckstatus=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:truckstatus)
		{

			String truckstatusselect=ele.getText();

			if(truckstatusselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Truck Status is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Truck Status is " + (ExcelUtils.getstringCellData(32, 5)));


		return truckstatusselect;

	}

	public static WebElement jbusodometeroffset(WebDriver driver) throws Exception{

		jbusodometeroffset=driver.findElement(By.id(ExcelUtils.getstringCellData(33,ColNum)));



		return jbusodometeroffset;

	}
	public static WebElement alternativetrucknumber(WebDriver driver) throws Exception{

		alternativetrucknumber=driver.findElement(By.id(ExcelUtils.getstringCellData(34, ColNum)));

		return alternativetrucknumber;

	}

	public static WebElement warehouseidclick(WebDriver driver) throws Exception{

		warehouseidclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(35, ColNum)));

		return warehouseidclick;

	}
	public static WebElement warehouseidsearchbox(WebDriver driver) throws Exception{

		warehouseidsearchbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(36, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(36, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(36, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(36, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(36, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);

		return warehouseidsearchbox;

	}

	public static WebElement loadedgrossweight(WebDriver driver) throws Exception{

		loadedgrossweight=driver.findElement(By.id(ExcelUtils.getstringCellData(37, ColNum)));

		return loadedgrossweight;

	}

	public static WebElement address(WebDriver driver) throws Exception{

		address=driver.findElement(By.id(ExcelUtils.getstringCellData(38, ColNum)));

		return address;

	}

	public static WebElement city(WebDriver driver) throws Exception{

		city=driver.findElement(By.id(ExcelUtils.getstringCellData(39, ColNum)));

		return city;

	}

	public static WebElement stateclick(WebDriver driver) throws Exception{

		stateclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(40, ColNum)));

		return stateclick;

	}

	public static WebElement statesearchbox(WebDriver driver) throws Exception{

		statesearchbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(41, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(41, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(41, ColNum))).get(ok_size-1).sendKeys(Keys.DOWN);

		return statesearchbox;

	}

	public static WebElement zip(WebDriver driver) throws Exception{

		zip=driver.findElement(By.id(ExcelUtils.getstringCellData(42, ColNum)));

		return zip;

	}
	public static WebElement latitude(WebDriver driver) throws Exception{

		latitude=driver.findElement(By.id(ExcelUtils.getstringCellData(43, ColNum)));

		return latitude;

	}
	public static WebElement longitude(WebDriver driver) throws Exception{

		longitude=driver.findElement(By.id(ExcelUtils.getstringCellData(44, ColNum)));

		return longitude;

	}

	public static WebElement truckhaspump(WebDriver driver) throws Exception{

		truckhaspump=driver.findElement(By.id(ExcelUtils.getstringCellData(45, ColNum)));

		truckhaspump.click();

		WebElement truckhaspumplabel=driver.findElement(By.xpath("//label[@for='Truck_PumpAttached']"));

		ExcelUtils.setCellData(truckhaspumplabel.getText() + " Is Checked", 45, 8);

		System.out.println(truckhaspumplabel.getText() + " Is Checked");

		return truckhaspump;

	}

	public static WebElement requirevehicleinspection(WebDriver driver) throws Exception{

		requirevehicleinspection=driver.findElement(By.id(ExcelUtils.getstringCellData(46, ColNum)));

		requirevehicleinspection.click();

		WebElement requirevehicleinspectionlabel=driver.findElement(By.xpath("//label[@for='Truck_RequireInspection']"));

		ExcelUtils.setCellData(requirevehicleinspectionlabel.getText() + " Is Checked", 46, 8);

		System.out.println(requirevehicleinspectionlabel.getText() + " Is Checked");

		return requirevehicleinspection;

	}

	public static WebElement rrmanualdataentry(WebDriver driver) throws Exception{

		rrmanualdataentry=driver.findElement(By.id(ExcelUtils.getstringCellData(47, ColNum)));

		rrmanualdataentry.click();

		WebElement rrmanualdataentrylabel=driver.findElement(By.xpath("//label[@for='Truck_ManualEntry']"));

		ExcelUtils.setCellData(rrmanualdataentrylabel.getText() + " Is Checked", 47, 8);

		System.out.println(rrmanualdataentrylabel.getText() + " Is Checked");


		return rrmanualdataentry;

	}

	public static WebElement requireproductloading(WebDriver driver) throws Exception{

		requireproductloading=driver.findElement(By.id(ExcelUtils.getstringCellData(48, ColNum)));

		requireproductloading.click();

		WebElement requireproductloadinglabel=driver.findElement(By.xpath("//label[@for='Truck_RequireLoading']"));

		ExcelUtils.setCellData(requireproductloadinglabel.getText() + " Is Checked", 48, 8);

		System.out.println(requireproductloadinglabel.getText() + " Is Checked");

		return requireproductloading;

	}



	public static WebElement net(WebDriver driver) throws Exception{

		net=driver.findElement(By.xpath(ExcelUtils.getstringCellData(49, ColNum)));

		net.click();

		WebElement netlabel=driver.findElement(By.xpath(".//*[@id='tabTruckDetails']/div/div/fieldset[3]/div[5]/div/span[2]"));

		ExcelUtils.setCellData(netlabel.getText() + " Is Checked", 49, 8);

		System.out.println(netlabel.getText() + " Is Checked");

		return net;

	}

	public static WebElement meters(WebDriver driver) throws Exception{

		meters=driver.findElement(By.linkText(ExcelUtils.getstringCellData(50, ColNum)));

		return meters;

	}

	public static WebElement metersadd(WebDriver driver) throws Exception{

		metersadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(51, ColNum)));

		return metersadd;

	}
	public static List<WebElement> registertype(WebDriver driver) throws Exception{

		registertype=driver.findElements(By.xpath(ExcelUtils.getstringCellData(52, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(52, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(52, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(52, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(52, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);


		return registertype;

	}

	public static List<WebElement> editregistertype(WebDriver driver) throws Exception{

		editregistertype=driver.findElements(By.xpath(ExcelUtils.getstringCellData(119, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(119, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(119, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(119, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(119, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);


		return editregistertype;

	}


	public static WebElement registernumberdropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(55, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Register Number Has Following Dropdown List \n"+e.getText(),55, 8);

			System.out.println("Register Number Has Following Dropdown List \n" + e.getText());

		}

		return registernumberdropdownlist;

	}

	public static WebElement registernumberactive(WebDriver driver) throws Exception{

		registernumberactive=driver.findElement(By.xpath("//div[@id='TruckMetersGrid']/div[3]/table/tbody/tr/td[2]"));

		return registernumberactive;

	}

	public static WebElement meterregistertypeactive(WebDriver driver) throws Exception{

		meterregistertypeactive=driver.findElement(By.xpath("//div[@id='TruckMetersGrid']/div[3]/table/tbody/tr/td"));

		return meterregistertypeactive;

	}


	public static WebElement registernumberselect(WebDriver driver) throws Exception{




		List<WebElement> registernumberstatus=driver.findElements(By.xpath(ExcelUtils.getstringCellData(56, ColNum)));


		for(WebElement ele:registernumberstatus)
		{

			String registernumberselect=ele.getText();

			if(registernumberselect.equalsIgnoreCase(ExcelUtils.getstringCellData(56, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Register Number is " + (ExcelUtils.getstringCellData(56, 5)),56, 8);

		System.out.println("Register Number is " + (ExcelUtils.getstringCellData(56, 5)));


		return registernumberselect;

	}

	public static WebElement editregisternumberselect(WebDriver driver) throws Exception{




		List<WebElement> editregisternumberstatus=driver.findElements(By.xpath(ExcelUtils.getstringCellData(120, ColNum)));


		for(WebElement ele:editregisternumberstatus)
		{

			String editregisternumberselect=ele.getText();

			if(editregisternumberselect.equalsIgnoreCase(ExcelUtils.getstringCellData(120, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Register Number is " + (ExcelUtils.getstringCellData(120, 5)),120, 8);

		System.out.println("Register Number is " + (ExcelUtils.getstringCellData(120, 5)));


		return editregisternumberselect;

	}

	public static WebElement metdiv(WebDriver driver) throws Exception{

		metdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(54, ColNum)));

		return metdiv;

	}

	public static WebElement addnewregisternumber(WebDriver driver) throws Exception{




		List<WebElement> addeditregisternumberstatus=driver.findElements(By.xpath(ExcelUtils.getstringCellData(124, ColNum)));


		for(WebElement ele:addeditregisternumberstatus)
		{

			String addeditregisternumberselect=ele.getText();

			if(addeditregisternumberselect.equalsIgnoreCase(ExcelUtils.getstringCellData(124, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Register Number is " + (ExcelUtils.getstringCellData(124, 5)),124, 8);

		System.out.println("Register Number is " + (ExcelUtils.getstringCellData(124, 5)));


		return addnewregisternumber;

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

	public static WebElement typedropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(60, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Type Has Following Dropdown List \n"+e.getText(),60, 8);

			System.out.println("Type  Has Following Dropdown List \n" + e.getText());

		}

		return typedropdownlist;

	}
	public static WebElement typeselect(WebDriver driver) throws Exception{



		List<WebElement> type=driver.findElements(By.xpath(ExcelUtils.getstringCellData(61, ColNum)));


		for(WebElement ele:type)
		{

			String typeselect=ele.getText();

			if(typeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(61, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Type is " + (ExcelUtils.getstringCellData(61, 5)),61, 8);

		System.out.println("Type is " + (ExcelUtils.getstringCellData(61, 5)));

		return typeselect;

	}	

	public static WebElement reels(WebDriver driver) throws Exception{

		reels=driver.findElement(By.linkText("Reels"));

		return reels;

	}

	public static WebElement reelsadd(WebDriver driver) throws Exception{

		reelsadd=driver.findElement(By.xpath("//div[@id='TruckReelsGrid']//a[@class='k-button k-button-icontext k-grid-add SLTheme']"));

		return reelsadd;

	}
	public static WebElement reelsnumber(WebDriver driver) throws Exception{

		reelsnumber=driver.findElement(By.id("Number"));

		return reelsnumber;

	}

	public static WebElement reelsdiv(WebDriver driver) throws Exception{

		reelsdiv=driver.findElement(By.xpath("//*[@id='TruckReelsGrid']/div[3]"));

		return reelsdiv;

	}
	public static WebElement flushvolumeactive(WebDriver driver) throws Exception{

		flushvolumeactive=driver.findElement(By.xpath("//div[@id='TruckReelsGrid']/div[3]/table/tbody/tr/td[2]"));

		return flushvolumeactive;

	}

	public static WebElement flushvolume(WebDriver driver) throws Exception{

		flushvolume=driver.findElement(By.id(ExcelUtils.getstringCellData(68, ColNum)));

		return flushvolume;

	}

	public static WebElement compartments(WebDriver driver) throws Exception{

		compartments=driver.findElement(By.linkText(ExcelUtils.getstringCellData(70, ColNum)));

		return compartments;

	}

	public static WebElement compartmentsadd(WebDriver driver) throws Exception{

		compartmentsadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(71, ColNum)));

		return compartmentsadd;

	}
	public static WebElement compartmentsnumber(WebDriver driver) throws Exception{

		compartmentsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(72, ColNum)));

		return compartmentsnumber;

	}

	public static WebElement compdiv(WebDriver driver) throws Exception{

		compdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(73, ColNum)));

		return compdiv;

	}
	public static WebElement capacityactive(WebDriver driver) throws Exception{

		capacityactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(74, ColNum)));

		return capacityactive;

	}

	public static WebElement capacity(WebDriver driver) throws Exception{

		capacity=driver.findElement(By.id(ExcelUtils.getstringCellData(75, ColNum)));

		return capacity;

	}



	public static WebElement communications(WebDriver driver) throws Exception{

		communications=driver.findElement(By.linkText(ExcelUtils.getstringCellData(77, ColNum)));

		return communications;

	}

	public static WebElement communicationsadd(WebDriver driver) throws Exception{

		communicationsadd=driver.findElement(By.xpath(ExcelUtils.getstringCellData(78, ColNum)));

		return communicationsadd;

	}

	public static WebElement ssid(WebDriver driver) throws Exception{

		ssid=driver.findElement(By.id("SSID"));

		return ssid;

	}
	public static WebElement netaddress(WebDriver driver) throws Exception{

		netaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(79, ColNum)));

		return netaddress;

	}

	public static WebElement comdiv(WebDriver driver) throws Exception{

		comdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(80, ColNum)));

		return comdiv;

	}
	public static WebElement deviceactive(WebDriver driver) throws Exception{

		deviceactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(81, ColNum)));

		return deviceactive;

	}

	public static WebElement device(WebDriver driver) throws Exception{

		device=driver.findElement(By.id(ExcelUtils.getstringCellData(82, ColNum)));

		return device;

	}



	public static WebElement productmapping(WebDriver driver) throws Exception{

		productmapping=driver.findElement(By.linkText(ExcelUtils.getstringCellData(84, ColNum)));



		return productmapping;

	}





	public static WebElement productcategoryheadercheckbox(WebDriver driver) throws Exception{

		productcategoryheadercheckbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(85, ColNum)));

		return productcategoryheadercheckbox;

	}




	public static WebElement productheadercheckbox(WebDriver driver) throws Exception{

		productheadercheckbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(86, ColNum)));

		return productheadercheckbox;
	}


	public static WebElement terminalmapping(WebDriver driver) throws Exception{

		terminalmapping=driver.findElement(By.linkText(ExcelUtils.getstringCellData(87, ColNum)));

		return terminalmapping;

	}

	public static WebElement expand(WebDriver driver) throws Exception{

		expand=driver.findElement(By.id(ExcelUtils.getstringCellData(88, ColNum)));

		return expand;

	}

	public static List<WebElement> terminalmappingfirststatecheckbox(WebDriver driver) throws Exception{

		terminalmappingfirststatecheckbox=driver.findElements(By.xpath("//div/span[2]/span"));

		int ok_size=terminalmappingfirststatecheckbox.size();

		terminalmappingfirststatecheckbox.get(ok_size-1).click();

		Thread.sleep(3000);

		return terminalmappingfirststatecheckbox;
	}

	public static WebElement termtopcheck(WebDriver driver){

		termtopcheck=driver.findElement(By.xpath("//li/ul/li/div/span/span"));

		return termtopcheck;
	}

	public static WebElement terminalmappingsecondstatecheckbox(WebDriver driver) throws Exception{

		terminalmappingsecondstatecheckbox=driver.findElement(By.xpath("//li[2]/div/span[2]/span"));

		return terminalmappingsecondstatecheckbox;
	}

	public static WebElement termmidarrowplus(WebDriver driver){

		termmidarrowplus=driver.findElement(By.xpath("//li[@data-id='IL']//div[@class='k-mid']//span[@class='k-icon k-plus']"));

		return termmidarrowplus;
	}

	public static WebElement termmidILcheck(WebDriver driver){

		termmidILcheck=driver.findElement(By.xpath("//li[3]/ul/li/div/span/input"));

		return termmidILcheck;
	}

	public static WebElement termmidarrowminus(WebDriver driver){

		termmidarrowminus=driver.findElement(By.xpath("//li[@data-id='IL']//div[@class='k-mid']//span[@class='k-icon k-minus']"));

		return termmidarrowminus;
	}

	public static WebElement termbotarrowplus(WebDriver driver){

		termbotarrowplus=driver.findElement(By.xpath("//div[@class='k-bot']//span[@class='k-icon k-plus']"));

		return termbotarrowplus;
	}

	public static WebElement termbotcheck(WebDriver driver){

		termbotcheck=driver.findElement(By.xpath("//li[4]/ul/li/div/span/input"));

		return termbotcheck;
	}

	public static WebElement termbotarrowminus(WebDriver driver){

		termbotarrowminus=driver.findElement(By.xpath("//div[@class='k-bot']//span[@class='k-icon k-minus']"));

		return termbotarrowminus;
	}

	public static WebElement regionmapping(WebDriver driver) throws Exception{

		regionmapping=driver.findElement(By.linkText(ExcelUtils.getstringCellData(92, ColNum)));

		return regionmapping;

	}

	public static WebElement regionmappingsearchbox(WebDriver driver) throws Exception{

		regionmappingsearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(93, ColNum)));

		return regionmappingsearchbox;


	}

	public static WebElement regionmappingheadercheckbox(WebDriver driver) throws Exception{

		regionmappingheadercheckbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(94, ColNum)));

		return regionmappingheadercheckbox;
	}

	public static WebElement regionmappingindividualcheck(WebDriver driver){

		regionmappingindividualcheck=driver.findElement(By.xpath("//div[@id='RegionTrucksGrid']/div[2]/table/tbody/tr[1]/td/input"));

		return regionmappingindividualcheck;
	}

	public static WebElement dispatchoptions(WebDriver driver) throws Exception{

		dispatchoptions=driver.findElement(By.linkText(ExcelUtils.getstringCellData(95, ColNum)));

		return dispatchoptions;

	}
	public static WebElement email(WebDriver driver) throws Exception{

		email=driver.findElement(By.id(ExcelUtils.getstringCellData(96, ColNum)));

		return email;


	}

	public static WebElement print(WebDriver driver) throws Exception{

		print=driver.findElement(By.id(ExcelUtils.getstringCellData(97, ColNum)));

		return print;


	}

	public static WebElement toemailaddress(WebDriver driver) throws Exception{

		toemailaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(98, ColNum)));

		return toemailaddress;


	}

	public static WebElement emailsubject(WebDriver driver) throws Exception{

		emailsubject=driver.findElement(By.id(ExcelUtils.getstringCellData(99, ColNum)));

		return emailsubject;


	}
	public static WebElement emailmessage(WebDriver driver) throws Exception{

		emailmessage=driver.findElement(By.id(ExcelUtils.getstringCellData(100, ColNum)));

		return emailmessage;


	}
	public static WebElement emailaddress(WebDriver driver) throws Exception{

		emailaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(101, ColNum)));

		return emailaddress;


	}

	public static WebElement dispatchdiv(WebDriver driver) throws Exception{

		dispatchdiv=driver.findElement(By.xpath(ExcelUtils.getstringCellData(102, ColNum)));

		return dispatchdiv;
	}



	public static WebElement save(WebDriver driver) throws Exception{

		save=driver.findElement(By.id(ExcelUtils.getstringCellData(103, ColNum)));

		return save;


	}

	public static WebElement verifysavemesage(WebDriver driver) throws Exception{

		verifysavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(104, ColNum)));

		String save_conf_msg=verifysavemesage.getText();

		if(verifysavemesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 104,7);

			ExcelUtils.setCellData("Pass", 104,8);	

			System.out.println(verifysavemesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 104,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifysavemesage;


	}
	public static WebElement verifysavemesageforblankinput(WebDriver driver) throws Exception{

		verifysavemesageforblankinput=driver.findElement(By.xpath(ExcelUtils.getstringCellData(104, ColNum)));

		String save_conf_msg=verifysavemesageforblankinput.getText();

		if(verifysavemesageforblankinput.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 288,7);

			ExcelUtils.setCellData("Pass", 288,8);	

			System.out.println(verifysavemesageforblankinput.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 288,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifysavemesageforblankinput;


	}public static WebElement verifysavemesageforinvalidinput(WebDriver driver) throws Exception{

		verifysavemesageforinvalidinput=driver.findElement(By.xpath(ExcelUtils.getstringCellData(104, ColNum)));

		String save_conf_msg=verifysavemesageforinvalidinput.getText();

		if(verifysavemesageforinvalidinput.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(verifysavemesageforinvalidinput.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifysavemesageforinvalidinput;


	}

	public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{

		closeconfirmationmessage=driver.findElement(By.linkText(ExcelUtils.getstringCellData(105, ColNum)));

		return closeconfirmationmessage;


	}

	public static WebElement search(WebDriver driver) throws Exception{

		search=driver.findElement(By.id(ExcelUtils.getstringCellData(106, ColNum)));

		Thread.sleep(3000);




		return search;

	}


	public static WebElement edit(WebDriver driver) throws Exception{

		edit=driver.findElement(By.linkText(ExcelUtils.getstringCellData(107, ColNum)));

		return edit;


	}
	public static WebElement editwarehouse(WebDriver driver) throws Exception{

		editwarehouse=driver.findElement(By.xpath(ExcelUtils.getstringCellData(109, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(109, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(109, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(109, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(109, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);

		return editwarehouse;

	}

	public static WebElement editstate(WebDriver driver) throws Exception{

		editstate=driver.findElement(By.xpath(ExcelUtils.getstringCellData(112, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(112, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(112, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(112, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(112, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);

		return editstate;

	}

	public static WebElement gross(WebDriver driver) throws Exception{

		gross=driver.findElement(By.xpath(ExcelUtils.getstringCellData(116, ColNum)));

		gross.click();

		WebElement grosslabel=driver.findElement(By.xpath("//span[contains(text(),'Gross')]"));

		ExcelUtils.setCellData(grosslabel.getText() + " Is Checked", 116, 8);

		System.out.println(grosslabel.getText() + " Is Checked");

		return gross;

	}

	public static WebElement metersnumberactive(WebDriver driver) throws Exception{

		metersnumberactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(118, ColNum)));

		return metersnumberactive;

	}

	public static WebElement edittype(WebDriver driver) throws Exception{



		List<WebElement> type=driver.findElements(By.xpath(ExcelUtils.getstringCellData(121, ColNum)));


		for(WebElement ele:type)
		{

			String typeselect=ele.getText();

			if(typeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(121, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Edit Type is " + (ExcelUtils.getstringCellData(121, 5)),121, 8);

		System.out.println("Edit Type is " + (ExcelUtils.getstringCellData(121, 5)));

		return edittype;

	}

	public static WebElement addtype(WebDriver driver) throws Exception{



		List<WebElement> type=driver.findElements(By.xpath(ExcelUtils.getstringCellData(125, ColNum)));


		for(WebElement ele:type)
		{

			String typeselect=ele.getText();

			if(typeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(125, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("New Added Type is " + (ExcelUtils.getstringCellData(125, 5)),125, 8);

		System.out.println("New Added Type is " + (ExcelUtils.getstringCellData(125, 5)));

		return addtype;

	}

	public static WebElement reelsnumberactive(WebDriver driver) throws Exception{

		reelsnumberactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(127, ColNum)));

		return reelsnumberactive;

	}

	public static WebElement compartmentsnumberactive(WebDriver driver) throws Exception{

		compartmentsnumberactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(134, ColNum)));

		return compartmentsnumberactive;

	}

	public static WebElement netaddressactive(WebDriver driver) throws Exception{

		netaddressactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(141, ColNum)));

		return netaddressactive;

	}


	public static WebElement editproductcategories(WebDriver driver) throws Exception  {

		editproductcategories=driver.findElement(By.xpath(ExcelUtils.getstringCellData(145, ColNum)));

		return editproductcategories;
	}

	public static WebElement editproducts(WebDriver driver) throws Exception{

		editproducts=driver.findElement(By.xpath(ExcelUtils.getstringCellData(146, ColNum)));

		return editproducts;

	}

	public static WebElement editterminalmapping(WebDriver driver) throws Exception{

		editterminalmapping=driver.findElement(By.xpath(ExcelUtils.getstringCellData(149, ColNum)));

		return editterminalmapping;
	}


	public static WebElement update(WebDriver driver) throws Exception{

		update=driver.findElement(By.id(ExcelUtils.getstringCellData(158, ColNum)));

		return update;



	}

	public static WebElement verifyupdationmesage(WebDriver driver) throws Exception{

		verifyupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(159, ColNum)));

		String save_conf_msg=verifyupdationmesage.getText();

		if(verifyupdationmesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 159,7);

			ExcelUtils.setCellData("Pass", 159,8);	

			System.out.println(verifyupdationmesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 159,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyupdationmesage;


	}

	public static WebElement delete(WebDriver driver) throws Exception{

		delete=driver.findElement(By.linkText(ExcelUtils.getstringCellData(164, ColNum)));

		return delete;



	}

	public static WebElement metersrecorddeletealertcontent(WebDriver driver) throws Exception{

		metersrecorddeletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(165, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(165, 6);

		String actual_conf_msg=metersrecorddeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 165,7);

			ExcelUtils.setCellData("Pass", 165,8);

			System.out.println(metersrecorddeletealertcontent.getText() +" confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 165,8);

			System.out.println(metersrecorddeletealertcontent.getText() +" confirmation message is not displayed and verified");


		}

		return metersrecorddeletealertcontent;


	}

	public static WebElement reelsrecorddeletealertcontent(WebDriver driver) throws Exception{

		reelsrecorddeletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(169, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(169, 6);

		String actual_conf_msg=reelsrecorddeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 169,7);

			ExcelUtils.setCellData("Pass", 169,8);

			System.out.println(reelsrecorddeletealertcontent.getText() +" confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 169,8);

			System.out.println(reelsrecorddeletealertcontent.getText() +" confirmation message is not displayed and verified");


		}

		return reelsrecorddeletealertcontent;


	}
	public static WebElement compartmentsrecorddeletealertcontent(WebDriver driver) throws Exception{

		compartmentsrecorddeletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(173, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(173, 6);

		String actual_conf_msg=compartmentsrecorddeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 173,7);

			ExcelUtils.setCellData("Pass", 173,8);

			System.out.println(compartmentsrecorddeletealertcontent.getText() +" confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 173,8);

			System.out.println(compartmentsrecorddeletealertcontent.getText() +" confirmation message is not displayed and verified");


		}

		return compartmentsrecorddeletealertcontent;


	}

	public static WebElement communicationsrecorddeletealertcontent(WebDriver driver) throws Exception{

		communicationsrecorddeletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(177, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(177, 6);

		String actual_conf_msg=communicationsrecorddeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 177,7);

			ExcelUtils.setCellData("Pass", 177,8);

			System.out.println(communicationsrecorddeletealertcontent.getText() +" confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 177,8);

			System.out.println(communicationsrecorddeletealertcontent.getText() +" confirmation message is not displayed and verified");


		}

		return communicationsrecorddeletealertcontent;


	}


	public static WebElement deletealertcontent(WebDriver driver) throws Exception{

		deletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(184, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(184, 6);

		String actual_conf_msg=deletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 184,7);

			ExcelUtils.setCellData("Pass", 184,8);

			System.out.println(deletealertcontent.getText() +" confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 184,8);

			System.out.println(deletealertcontent.getText() +" confirmation message is not displayed and verified");


		}

		return deletealertcontent;


	}

	public static WebElement deleteok(WebDriver driver) throws Exception{

		deleteok=driver.findElement(By.xpath(ExcelUtils.getstringCellData(166, ColNum)));

		return deleteok;


	}
	public static WebElement verifydeleteupdationmesage(WebDriver driver) throws Exception{

		verifydeleteupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(180, ColNum)));

		String save_conf_msg=verifydeleteupdationmesage.getText();

		if(verifydeleteupdationmesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 180,7);

			ExcelUtils.setCellData("Pass", 180,8);	

			System.out.println(verifydeleteupdationmesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 180,8);

			System.out.println(verifydeleteupdationmesage.getText() + " Confirmation message is not displayed");
		}

		return verifysavemesage;


	}


	public static WebElement ok(WebDriver driver) throws Exception{

		ok=driver.findElement(By.id("btnConfirmationOK"));

		ok.click();

		return ok;


	}
	public static WebElement delmsg(WebDriver driver) throws Exception{

		delmsg=driver.findElement(By.xpath(ExcelUtils.getstringCellData(26, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(26, 6);

		String actual_conf_msg=delmsg.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 26,7);

			ExcelUtils.setCellData("Pass", 26,8);



			System.out.println(delmsg.getText()+ " confirmation message is displayed and verified");


		}else{
			
			System.out.println(delmsg.getText()+ " confirmation message is not displayed and verified");


		}

		return delmsg;


	}

	public static WebElement cancel(WebDriver driver){

		cancel=driver.findElement(By.xpath("//div[@id='dvDeleteConfirmation']//button[contains(text(),'Cancel')]"));

		return cancel;


	}

	public static WebElement delwarehouseselect(WebDriver driver) throws Exception{

		delwarehouseselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(189, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(189, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(189, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(189, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(189, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);

		return delwarehouseselect;

	}

	public static WebElement delstateselect(WebDriver driver) throws Exception{

		delstateselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(192, ColNum)));

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(192, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(192, ColNum))).get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(192, 5));

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(192, ColNum))).get(ok_size-1).sendKeys(Keys.ENTER);

		return delstateselect;

	}

	public static WebElement undeletevalidationmessage1(WebDriver driver) throws Exception{

		undeletevalidationmessage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(200, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(200, 6);

		String actual_conf_msg=undeletevalidationmessage1.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 200,7);

			ExcelUtils.setCellData("Pass", 200,8);


			System.out.println(undeletevalidationmessage1.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 200,8);

			System.out.println("Undelete Validation message is not displayed");
		}
		return undeletevalidationmessage1;


	}

	public static WebElement verifyundeleteupdationmesage1(WebDriver driver) throws Exception{

		verifyundeleteupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(202, ColNum)));

		String save_conf_msg=verifyundeleteupdationmesage1.getText();

		if(verifyundeleteupdationmesage1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 202,7);

			ExcelUtils.setCellData("Pass", 202,8);	

			System.out.println(verifyundeleteupdationmesage1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 202,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyundeleteupdationmesage1;


	}



	public static WebElement undeletevalidationmessage2(WebDriver driver) throws Exception{

		undeletevalidationmessage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(219, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(219, 6);

		String actual_conf_msg=undeletevalidationmessage2.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 219,7);

			ExcelUtils.setCellData("Pass", 219,8);


			System.out.println(undeletevalidationmessage2.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 219,8);

			System.out.println("Undelete Validation message is not displayed");
		}
		return undeletevalidationmessage2;


	}

	public static WebElement undelete(WebDriver driver) throws Exception{

		undelete=driver.findElement(By.id(ExcelUtils.getstringCellData(220, ColNum)));

		return undelete;




	}

	public static WebElement verifyundeleteupdationmesage2(WebDriver driver) throws Exception{

		verifyundeleteupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(222, ColNum)));

		String save_conf_msg=verifyundeleteupdationmesage2.getText();

		if(verifyundeleteupdationmesage2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 222,7);

			ExcelUtils.setCellData("Pass", 222,8);	

			System.out.println(verifyundeleteupdationmesage2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 222,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyundeleteupdationmesage2;


	}



	public static WebElement searchforalreadyexisttruck(WebDriver driver) throws Exception{


		WebElement existtruck=driver.findElement(By.xpath(".//*[@id='TruckGrid']/div[2]/table/tbody/tr/td[1]"));

		if(existtruck.isDisplayed()){

			ExcelUtils.setCellData("Truck Number "+existtruck.getText()+" is Already Existed", 224,8);	


			System.out.println("Truck Number "+existtruck.getText()+ " is Already Existed");


		}

		else{

			ExcelUtils.setCellData("Truck Number "+existtruck.getText()+ " is not Existed", 224,8);	

			System.out.println("Truck Number "+existtruck.getText()+ " is not Existed");

		}

		Thread.sleep(3000);



		return searchforalreadyexisttruck;

	}


	public static WebElement alreadyexisttruckvalidationmessage(WebDriver driver) throws Exception{



		alreadyexisttruckvalidationmessage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(239, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(239, 6);

		String actual_conf_msg=alreadyexisttruckvalidationmessage.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 239,7);

			ExcelUtils.setCellData("Pass", 239,8);

			System.out.println(alreadyexisttruckvalidationmessage.getText());

			Thread.sleep(3000);




		}
		else{

			ExcelUtils.setCellData("Fail", 239,8);

			System.out.println(alreadyexisttruckvalidationmessage.getText() + " validation message is not displayed");


		}


		return alreadyexisttruckvalidationmessage;
	}

	public static WebElement verifyalreadyexistupdationmesage(WebDriver driver) throws Exception{

		verifyalreadyexistupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(241, ColNum)));

		String save_conf_msg=verifyalreadyexistupdationmesage.getText();

		if(verifyalreadyexistupdationmesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 241,7);

			ExcelUtils.setCellData("Pass", 241,8);	

			System.out.println(verifyalreadyexistupdationmesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 241,8);

			System.out.println(verifyalreadyexistupdationmesage.getText() + " Confirmation message is not displayed");
		}

		return verifyalreadyexistupdationmesage;


	}



	public static WebElement blankinputintrucknumber(WebDriver driver) throws Exception{

		blankinputintrucknumber=driver.findElement(By.id(ExcelUtils.getstringCellData(248, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(248, 6);

		String actual_conf_msg=blankinputintrucknumber.getText();

		Assert.assertEquals(excpected_Cong_msg, actual_conf_msg);

		ExcelUtils.setCellData(actual_conf_msg, 248,7);

		ExcelUtils.setCellData("Pass", 248,8);

		System.out.println(blankinputintrucknumber.getText());




		return blankinputintrucknumber;


	}

	public static WebElement blankinputinjbusodometeroffset(WebDriver driver) throws Exception{

		blankinputinjbusodometeroffset=driver.findElement(By.id(ExcelUtils.getstringCellData(250, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(250, 6);

		String actual_conf_msg=blankinputinjbusodometeroffset.getText();

		Assert.assertEquals(excpected_Cong_msg, actual_conf_msg);


		ExcelUtils.setCellData(actual_conf_msg, 250,7);

		ExcelUtils.setCellData("Pass", 250,8);	

		System.out.println(blankinputinjbusodometeroffset.getText());





		return blankinputinjbusodometeroffset;

	}

	public static WebElement blankinputinwarehouseid(WebDriver driver) throws Exception{

		blankinputinwarehouseid=driver.findElement(By.id(ExcelUtils.getstringCellData(252, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(252, 6);

		String actual_conf_msg=blankinputinwarehouseid.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 252,7);

			ExcelUtils.setCellData("Pass", 252,8);	

			System.out.println(blankinputinwarehouseid.getText());


		}else{

			ExcelUtils.setCellData("Fail", 252,8);

			System.out.println(blankinputinwarehouseid.getText() + " validation messgae is not verified");
		}



		return blankinputinwarehouseid;

	}


	public static WebElement blankinputinaddress(WebDriver driver) throws Exception{

		blankinputinaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(254, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(254, 6);

		String actual_conf_msg=blankinputinaddress.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 254,7);

			ExcelUtils.setCellData("Pass", 254,8);	

			System.out.println(blankinputinaddress.getText());


		}else{

			ExcelUtils.setCellData("Fail", 254,8);

			System.out.println(blankinputinaddress.getText() + " validation messgae is not verified");
		}



		return blankinputinaddress;

	}


	public static WebElement blankinputincity(WebDriver driver) throws Exception{

		blankinputincity=driver.findElement(By.id(ExcelUtils.getstringCellData(256, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(256, 6);

		String actual_conf_msg=blankinputincity.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 256,7);

			ExcelUtils.setCellData("Pass", 256,8);	

			System.out.println(blankinputincity.getText());


		}else{

			ExcelUtils.setCellData("Fail", 256,8);

			System.out.println(blankinputincity.getText() + " validation messgae is not verified");
		}



		return blankinputincity;

	}

	public static WebElement blankinputinstate(WebDriver driver) throws Exception{

		blankinputinstate=driver.findElement(By.id(ExcelUtils.getstringCellData(258, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(258, 6);

		String actual_conf_msg=blankinputinstate.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 258,7);

			ExcelUtils.setCellData("Pass", 258,8);	

			System.out.println(blankinputinstate.getText());


		}else{

			ExcelUtils.setCellData("Fail", 258,8);

			System.out.println(blankinputinstate.getText() + " validation messgae is not verified");
		}



		return blankinputinstate;

	}

	public static WebElement blankinputinzip(WebDriver driver) throws Exception{

		blankinputinzip=driver.findElement(By.id(ExcelUtils.getstringCellData(260, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(260, 6);

		String actual_conf_msg=blankinputinzip.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 260,7);

			ExcelUtils.setCellData("Pass", 260,8);	

			System.out.println(blankinputinzip.getText());


		}else{

			ExcelUtils.setCellData("Fail", 260,8);

			System.out.println(blankinputinzip.getText() + " validation messgae is not verified");
		}



		return blankinputinzip;

	}

	public static WebElement blankinputinlatitude(WebDriver driver) throws Exception{

		blankinputinlatitude=driver.findElement(By.id(ExcelUtils.getstringCellData(262, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(262, 6);

		String actual_conf_msg=blankinputinlatitude.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 262,7);

			ExcelUtils.setCellData("Pass", 262,8);	

			System.out.println(blankinputinlatitude.getText());


		}else{

			ExcelUtils.setCellData("Fail", 262,8);

			System.out.println(blankinputinlatitude.getText() + " validation messgae is not verified");
		}



		return blankinputinlatitude;

	}

	public static WebElement blankinputinlongitude(WebDriver driver) throws Exception{

		blankinputinlongitude=driver.findElement(By.id(ExcelUtils.getstringCellData(264, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(264, 6);

		String actual_conf_msg=blankinputinlongitude.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 264,7);

			ExcelUtils.setCellData("Pass", 264,8);	

			System.out.println(blankinputinlongitude.getText());


		}else{

			ExcelUtils.setCellData("Fail", 264,8);

			System.out.println(blankinputinlongitude.getText() + " validation messgae is not verified");
		}



		return blankinputinlongitude;

	}

	public static WebElement blankinputinmetersnumber(WebDriver driver) throws Exception{

		blankinputinmetersnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(268, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(268, 6);

		String actual_conf_msg=blankinputinmetersnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 268,7);

			ExcelUtils.setCellData("Pass", 268,8);	

			System.out.println(blankinputinmetersnumber.getText());


		}else{

			ExcelUtils.setCellData("Fail", 268,8);

			System.out.println(blankinputinmetersnumber.getText() + " validation messgae is not verified");
		}



		return blankinputinmetersnumber;

	}

	public static WebElement blankinputinfindproduct(WebDriver driver) throws Exception{

		blankinputinfindproduct=driver.findElement(By.id(ExcelUtils.getstringCellData(272, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(272, 6);

		String actual_conf_msg=blankinputinfindproduct.getText();

		Assert.assertEquals(actual_conf_msg, excpected_Cong_msg);




		ExcelUtils.setCellData(actual_conf_msg, 272,7);

		ExcelUtils.setCellData("Pass", 272,8);	

		System.out.println(blankinputinfindproduct.getText());


		/*	Assert.assertNotEquals(actual_conf_msg, excpected_Cong_msg);

				ExcelUtils.setCellData("Fail", 83,8);

				System.out.println(blankinputinfindproduct.getText() + " validation messgae is not verified");*/




		return blankinputinfindproduct;

	}

	public static WebElement blankinputinreelsnumber(WebDriver driver) throws Exception{

		blankinputinreelsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(276, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(276, 6);

		String actual_conf_msg=blankinputinreelsnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 276,7);

			ExcelUtils.setCellData("Pass", 276,8);	

			System.out.println(blankinputinreelsnumber.getText());


		}else{

			ExcelUtils.setCellData("Fail", 276,8);

			System.out.println(blankinputinreelsnumber.getText() + " validation messgae is not verified");
		}



		return blankinputinreelsnumber;

	}

	public static WebElement blankinputincompartmentsnumber(WebDriver driver) throws Exception{

		blankinputincompartmentsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(280, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(280, 6);

		String actual_conf_msg=blankinputincompartmentsnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 280,7);

			ExcelUtils.setCellData("Pass", 280,8);	

			System.out.println(blankinputincompartmentsnumber.getText());


		}else{

			ExcelUtils.setCellData("Fail", 280,8);

			System.out.println(blankinputincompartmentsnumber.getText() + " validation messgae is not verified");
		}



		return blankinputincompartmentsnumber;

	}
	
	public static WebElement blankinputincommunications(WebDriver driver) throws Exception{

		blankinputincommunications=driver.findElement(By.id(ExcelUtils.getstringCellData(282, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(282, 6);

		String actual_conf_msg=blankinputincommunications.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 282,7);

			ExcelUtils.setCellData("Pass", 282,8);	

			System.out.println(blankinputincommunications.getText());


		}else{

			ExcelUtils.setCellData("Fail", 282,8);

			System.out.println(blankinputincommunications.getText() + " validation messgae is not verified");
		}



		return blankinputincommunications;

	}


	public static WebElement mapatleastoneproductalert(WebDriver driver) throws Exception{

		mapatleastoneproductalert=driver.findElement(By.id(ExcelUtils.getstringCellData(283, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(283, 6);

		String actual_conf_msg=mapatleastoneproductalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){


			ExcelUtils.setCellData(actual_conf_msg, 283,7);

			ExcelUtils.setCellData("Pass", 283,8);	

			System.out.println(mapatleastoneproductalert.getText());


		}else{

			ExcelUtils.setCellData("Fail", 283,8);

			System.out.println(mapatleastoneproductalert.getText() + " validation messgae is not verified");
		}



		return mapatleastoneproductalert;

	}



	public static WebElement invalidinputintrucknumber(WebDriver driver) throws Exception{

		invalidinputintrucknumber=driver.findElement(By.id(ExcelUtils.getstringCellData(300, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(300, 6);

		String actual_conf_msg=invalidinputintrucknumber.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 300,7);

			ExcelUtils.setCellData("Pass", 300,8);	


			System.out.println(invalidinputintrucknumber.getText());

		}

		else{

			ExcelUtils.setCellData("Fail", 300,8);

			System.out.println(invalidinputintrucknumber.getText() + " validation Message is not displayed and Verified");
		}


		return invalidinputintrucknumber;


	}	

	public static WebElement invalidinputincostperhour(WebDriver driver) throws Exception{

		invalidinputincostperhour=driver.findElement(By.id(ExcelUtils.getstringCellData(302, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(302, 6);

		String actual_conf_msg=invalidinputincostperhour.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 302,7);

			ExcelUtils.setCellData("Pass", 302,8);	

			System.out.println(invalidinputincostperhour.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 302,8);

			System.out.println(invalidinputincostperhour.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputincostperhour;


	}


	public static WebElement invalidinputincostperunitofdistance(WebDriver driver) throws Exception{

		invalidinputincostperunitofdistance=driver.findElement(By.id(ExcelUtils.getstringCellData(304, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(304, 6);

		String actual_conf_msg=invalidinputincostperunitofdistance.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 304,7);

			ExcelUtils.setCellData("Pass", 304,8);	

			System.out.println(invalidinputincostperunitofdistance.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 304,8);

			System.out.println(invalidinputincostperunitofdistance.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputincostperunitofdistance;


	}

	public static WebElement invalidinputinjbusodometeroffset(WebDriver driver) throws Exception{

		invalidinputinjbusodometeroffset=driver.findElement(By.id(ExcelUtils.getstringCellData(306, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(306, 6);

		String actual_conf_msg=invalidinputinjbusodometeroffset.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 306,7);

			ExcelUtils.setCellData("Pass", 306,8);	

			System.out.println(invalidinputinjbusodometeroffset.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 306,8);

			System.out.println(invalidinputinjbusodometeroffset.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinjbusodometeroffset;


	}

	public static WebElement invalidinputinaddress(WebDriver driver) throws Exception{

		invalidinputinaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(308, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(308, 6);

		String actual_conf_msg=invalidinputinaddress.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 308,7);

			ExcelUtils.setCellData("Pass", 308,8);	

			System.out.println(invalidinputinaddress.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 308,8);

			System.out.println(invalidinputinaddress.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinaddress;


	}

	public static WebElement invalidinputincity(WebDriver driver) throws Exception{

		invalidinputincity=driver.findElement(By.id(ExcelUtils.getstringCellData(310, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(310, 6);

		String actual_conf_msg=invalidinputincity.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 310,7);

			ExcelUtils.setCellData("Pass", 310,8);	

			System.out.println(invalidinputincity.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 310,8);

			System.out.println(invalidinputincity.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputincity;


	}

	public static WebElement invalidinputinzip1(WebDriver driver) throws Exception{

		invalidinputinzip1=driver.findElement(By.id(ExcelUtils.getstringCellData(312, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(312, 6);

		String actual_conf_msg=invalidinputinzip1.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 312,7);

			ExcelUtils.setCellData("Pass", 312,8);	

			System.out.println(invalidinputinzip1.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 312,8);

			System.out.println(invalidinputinzip1.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinzip1;


	}

	public static WebElement invalidinputinzip2(WebDriver driver) throws Exception{

		invalidinputinzip2=driver.findElement(By.id(ExcelUtils.getstringCellData(315, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(315, 6);

		String actual_conf_msg=invalidinputinzip2.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 315,7);

			ExcelUtils.setCellData("Pass", 315,8);	

			System.out.println(invalidinputinzip2.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 315,8);

			System.out.println(invalidinputinzip2.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinzip2;


	}

	public static WebElement invalidinputinlatitude1(WebDriver driver) throws Exception{

		invalidinputinlatitude1=driver.findElement(By.id(ExcelUtils.getstringCellData(317, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(317, 6);

		String actual_conf_msg=invalidinputinlatitude1.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 317,7);

			ExcelUtils.setCellData("Pass", 317,8);	

			System.out.println(invalidinputinlatitude1.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 317,8);

			System.out.println(invalidinputinlatitude1.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinlatitude1;


	}

	public static WebElement invalidinputinlatitude2(WebDriver driver) throws Exception{

		invalidinputinlatitude2=driver.findElement(By.id(ExcelUtils.getstringCellData(320, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(320, 6);

		String actual_conf_msg=invalidinputinlatitude2.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 320,7);

			ExcelUtils.setCellData("Pass", 320,8);	

			System.out.println(invalidinputinlatitude2.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 320,8);

			System.out.println(invalidinputinlatitude2.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinlatitude2;


	}

	public static WebElement invalidinputinlongitude1(WebDriver driver) throws Exception{

		invalidinputinlongitude1=driver.findElement(By.id(ExcelUtils.getstringCellData(322, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(322, 6);

		String actual_conf_msg=invalidinputinlongitude1.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 322,7);

			ExcelUtils.setCellData("Pass", 322,8);	

			System.out.println(invalidinputinlongitude1.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 322,8);

			System.out.println(invalidinputinlongitude1.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinlongitude1;


	}

	public static WebElement invalidinputinlongitude2(WebDriver driver) throws Exception{

		invalidinputinlongitude2=driver.findElement(By.id(ExcelUtils.getstringCellData(325, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(325, 6);

		String actual_conf_msg=invalidinputinlongitude2.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 325,7);

			ExcelUtils.setCellData("Pass", 325,8);	

			System.out.println(invalidinputinlongitude2.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 325,8);

			System.out.println(invalidinputinlongitude2.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinlongitude2;


	}

	public static WebElement invalidinputinmetersnumber(WebDriver driver) throws Exception{

		invalidinputinmetersnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(330, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(330, 6);

		String actual_conf_msg=invalidinputinmetersnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 330,7);

			ExcelUtils.setCellData("Pass", 330,8);	

			System.out.println(invalidinputinmetersnumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 330,8);

			System.out.println(invalidinputinmetersnumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinmetersnumber;


	}

	public static WebElement invalidinputalertinmeternumber(WebDriver driver) throws Exception{

		invalidinputalertinmeternumber=driver.findElement(By.id(ExcelUtils.getstringCellData(334, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(334, 6);

		String actual_conf_msg=invalidinputalertinmeternumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 334,7);

			ExcelUtils.setCellData("Pass", 334,8);	

			System.out.println(invalidinputalertinmeternumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 334,8);

			System.out.println(invalidinputalertinmeternumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputalertinmeternumber;


	}

	public static WebElement alertok(WebDriver driver) throws Exception{

		alertok=driver.findElement(By.id(ExcelUtils.getstringCellData(335, ColNum)));

		return alertok;


	}

	public static WebElement productmapalercontent(WebDriver driver) throws Exception{

		productmapalercontent=driver.findElement(By.id("dvAlertContent"));

		return productmapalercontent;


	}


	public static WebElement invalidinputinmeterregistertype(WebDriver driver) throws Exception{

		invalidinputinmeterregistertype=driver.findElement(By.id("RegisterType_validationMessage"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(329, 6);

		String actual_conf_msg=invalidinputinmeterregistertype.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 329,7);

			ExcelUtils.setCellData("Pass", 329,8);	

			System.out.println(invalidinputinmeterregistertype.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 329,8);

			System.out.println(invalidinputinmeterregistertype.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinmeterregistertype;


	}
	
	public static WebElement invalidinputinregisternumber(WebDriver driver) throws Exception{

		invalidinputinregisternumber=driver.findElement(By.id(ExcelUtils.getstringCellData(330, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(330, 6);

		String actual_conf_msg=invalidinputinregisternumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 330,7);

			ExcelUtils.setCellData("Pass", 330,8);	

			System.out.println(invalidinputinregisternumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 330,8);

			System.out.println(invalidinputinregisternumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinregisternumber;


	}
	public static WebElement invalidinputinreelsnumber(WebDriver driver) throws Exception{

		invalidinputinreelsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(340, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(340, 6);

		String actual_conf_msg=invalidinputinreelsnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 340,7);

			ExcelUtils.setCellData("Pass", 340,8);	

			System.out.println(invalidinputinreelsnumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 340,8);

			System.out.println(invalidinputinreelsnumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputinreelsnumber;


	}

	public static WebElement invalidinputalertinreelsnumber(WebDriver driver) throws Exception{

		invalidinputalertinreelsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(344, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(344, 6);

		String actual_conf_msg=invalidinputalertinreelsnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 344,7);

			ExcelUtils.setCellData("Pass", 344,8);	

			System.out.println(invalidinputalertinreelsnumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 344,8);

			System.out.println(invalidinputalertinreelsnumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputalertinreelsnumber;


	}

	public static WebElement invalidinputincompartmentsnumber(WebDriver driver) throws Exception{

		invalidinputincompartmentsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(350, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(350, 6);

		String actual_conf_msg=invalidinputincompartmentsnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 350,7);

			ExcelUtils.setCellData("Pass", 350,8);	

			System.out.println(invalidinputincompartmentsnumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 350,8);

			System.out.println(invalidinputincompartmentsnumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputincompartmentsnumber;


	}

	public static WebElement invalidinputalertincompartmentsnumber(WebDriver driver) throws Exception{

		invalidinputalertincompartmentsnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(354, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(354, 6);

		String actual_conf_msg=invalidinputalertincompartmentsnumber.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 354,7);

			ExcelUtils.setCellData("Pass", 354,8);	

			System.out.println(invalidinputalertincompartmentsnumber.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 354,8);

			System.out.println(invalidinputalertincompartmentsnumber.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputalertincompartmentsnumber;


	}
	public static WebElement invalidinputtoemailaddress(WebDriver driver) throws Exception{

		invalidinputtoemailaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(361, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(361, 6);

		String actual_conf_msg=invalidinputtoemailaddress.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 361,7);

			ExcelUtils.setCellData("Pass", 361,8);	

			System.out.println(invalidinputtoemailaddress.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 361,8);

			System.out.println(invalidinputtoemailaddress.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputtoemailaddress;


	}
	public static WebElement invalidinputemailaddress(WebDriver driver) throws Exception{

		invalidinputemailaddress=driver.findElement(By.id(ExcelUtils.getstringCellData(363, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(363, 6);

		String actual_conf_msg=invalidinputemailaddress.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 363,7);

			ExcelUtils.setCellData("Pass", 363,8);	

			System.out.println(invalidinputemailaddress.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 363,8);

			System.out.println(invalidinputemailaddress.getText() + " validation Message is not displayed and Verified");
		}

		return invalidinputemailaddress;


	}

	public static WebElement propanetruckvalidation(WebDriver driver) throws Exception{

		propanetruckvalidation=driver.findElement(By.id(ExcelUtils.getstringCellData(375, ColNum)));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(375, 6);

		String actual_conf_msg=propanetruckvalidation.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 375,7);

			ExcelUtils.setCellData("Pass", 375,8);	


			System.out.println(propanetruckvalidation.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 375,8);

			System.out.println(propanetruckvalidation.getText() + " validation Message is not displayed and Verified");
		}

		return propanetruckvalidation;


	}

	public static WebElement selectpropanetruck(WebDriver driver) throws Exception{

		//trucktypeselect=driver.findElement(By.xpath(ExcelUtils.getstringCellData(18, ColNum)));




		/*	int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(18, ColNum))).size();

		Thread.sleep(3000);

		driver.findElements(By.xpath(ExcelUtils.getstringCellData(18, ColNum))).get(ok_size-1).click();

		Thread.sleep(3000);*/

		List<WebElement> trucktype=driver.findElements(By.xpath(ExcelUtils.getstringCellData(371, ColNum)));


		for(WebElement ele:trucktype)
		{

			String trucktypeselect=ele.getText();

			if(trucktypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(371, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Truck Type is " + (ExcelUtils.getstringCellData(371, 5)),371, 8);

		System.out.println("Truck Type is " + (ExcelUtils.getstringCellData(371, 5)));



		return selectpropanetruck;

	}
	public static WebElement sort(WebDriver driver){

		sort=driver.findElement(By.linkText("Name"));

		return sort;


	}
	public static WebElement back(WebDriver driver) throws Exception{

		back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(288, ColNum)));

		return back;
	}


	public static WebElement pagenavbuttons(WebDriver driver) throws Exception{

		//Last Page Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-e']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//First Page Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-w']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Next PAge Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-e']")).click();

		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);

		//Previous Page Click


		driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-w']")).click();


		Thread.sleep(3000);

		screenshot.CaptureScreenshot(driver);


		return pagenavbuttons;


	}



}
