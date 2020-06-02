package CustomerShipTo_Subclasses;

import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CustomerShipTo_Subclasses.screenshot;
import Utility.ExcelUtils;

public class CustomerShipTo_Methods {


	private static int ColNum=4;

	private static MouseHandler openshipto =null;

	private static WebElement create=null;

	private static WebElement shipto=null;

	private static WebElement shiptoacct=null;

	private static WebElement masteracctsearchicon=null;

	private static WebElement masteracctsearchbox=null;

	private static WebElement masteracctselect=null;

	private static WebElement masteracctok=null;

	private static WebElement masteracctcancel=null;

	private static WebElement name=null;

	private static WebElement name2=null;

	private static WebElement address1=null;

	private static WebElement address2=null;

	private static WebElement city=null;

	private static WebElement stateclick=null;

	private static List<WebElement> statesearch=null;

	private static WebElement zip=null;

	private static WebElement country=null;

	private static WebElement phone=null;

	private static WebElement faxtoname=null;

	private static WebElement fax=null;

	private static WebElement contact1name1=null;

	private static WebElement contact1phone1=null;

	private static WebElement contact1ext1=null;

	private static WebElement contact1email1=null;

	private static WebElement contact1emailtkt1click=null;

	private static WebElement contact1emailtkt1dropdownlist=null;

	private static WebElement contact1emailtkt1select=null;

	private static WebElement contact2name2=null;

	private static WebElement contact2phone2=null;

	private static WebElement contact2ext2=null;

	private static WebElement contact2email2=null;

	private static WebElement contact2emailtkt2click=null;

	private static WebElement contact2emailtkt2dropdownlist=null;

	private static WebElement contact2emailtkt2select=null;

	private static WebElement latitude=null;

	private static WebElement longitude=null;

	private static WebElement tktcopies=null;

	private static WebElement ordertypeclick=null;

	private static WebElement ordertypedropdownlist=null;

	private static WebElement ordertypeselect=null;

	private static WebElement deliveryfeeclick=null;

	private static List<WebElement> deliveryfeesearch=null;

	private static WebElement targetmarginreportclassclick=null;

	private static WebElement targetmarginreportclassselect=null;

	private static WebElement orderholdclick=null;

	private static List<WebElement> orderholdsearch=null;

	private static WebElement vendorcrossref=null;

	private static WebElement bsnflocname=null;

	private static WebElement avgdeltime=null;

	private static WebElement fuelradiusclick=null;

	private static WebElement fuelradiusdropdownlist=null;

	private static WebElement fuelradiusselect=null;

	private static WebElement salesrepname1searchicon=null;

	private static WebElement salesrepname1searchbox=null;

	private static WebElement salesrepname1select=null;

	private static WebElement salesrepname1ok=null;

	private static WebElement salesrepname1cancel=null;

	private static WebElement salesrepname1del=null;

	private static WebElement salesrepname2searchicon=null;

	private static WebElement salesrepname2searchbox=null;

	private static WebElement salesrepname2select=null;

	private static WebElement salesrepname2ok=null;

	private static WebElement salesrepname2cancel=null;

	private static WebElement salesrepname2del=null;

	private static WebElement userdef1=null;

	private static WebElement userdef2=null;

	private static WebElement userdef3=null;

	private static WebElement userdef4=null;

	private static WebElement signaturereq=null;

	private static WebElement  PrintTotalizersonTicket=null;

	private static WebElement StickReadingRequired=null;

	private static WebElement PrintPriceOnticket=null;

	private static WebElement poreq=null;

	private static WebElement pumpreq=null;

	private static WebElement notetypeclick=null;

	private static WebElement notetypedropdownlist=null;

	private static WebElement notetypeselect=null;

	private static WebElement targettypeselect=null;

	private static WebElement targettypeselect2=null;

	private static WebElement note=null;



	private static WebElement fleetvehicles=null;

	private static WebElement PrintUnfueledVehicles=null;

	private static WebElement  PrintUnfueledVehicleReasonCode=null;

	private static WebElement UnfueledReasonCoderequired=null;

	private static WebElement maxfueltankspervehicle=null;

	private static WebElement  SetNewVehiclesToTransient=null;

	private static WebElement OdometerRequired=null;

	private static WebElement  LockVehicleList=null;



	private static WebElement vehdetailsadd=null;

	private static WebElement vehdetailsfleetvehiclelink=null;

	private static WebElement vehnumber=null;

	private static WebElement vehfueltanks=null;

	private static WebElement vehcapacity=null;

	private static WebElement vehproductclick=null;

	private static WebElement vehproductsearch=null;

	private static WebElement vehproductselect=null;

	private static WebElement vehproductok=null;

	private static WebElement vehbarcode=null;

	private static WebElement vehtankcapacity=null;

	private static WebElement vehtankdes=null;

	private static WebElement model=null;

	private static WebElement year=null;

	private static WebElement vin=null;

	private static WebElement tag=null;

	private static WebElement vehuserdef1=null;

	private static WebElement vehuserdef2=null;

	private static WebElement vehuserdef3=null;

	private static WebElement vehuserdef4=null;

	private static WebElement vehcrossref=null;

	private static WebElement smartapmacaddress=null;

	private static WebElement manufacturer=null;

	private static WebElement vehtransient=null;

	private static WebElement reqodometer=null;

	private static WebElement fleetvehbarcodedetailsadd=null;

	private static WebElement fleetvehbarcodedetailsprodclick=null;

	private static WebElement fleetvehbarcodedetailsprodsearchbox=null;

	private static WebElement fleetvehbarcodedetailsprodselect=null;

	private static WebElement fleetvehbarcodedetailsprodok=null;

	private static WebElement fleetvehbarcodedetailsdiv=null;

	private static WebElement fleetvehbarcodedetailsbarcodeactive=null;

	private static WebElement fleetvehbarcodedetailsbarcode=null;

	private static WebElement fleetvehbarcodedetailscapacityactive=null;

	private static WebElement fleetvehbarcodedetailscapacity=null;

	private static WebElement fleetvehbarcodedetailstankdesactive=null;

	private static WebElement fleetvehbarcodedetailstankdes=null;



	private static WebElement deliverytanks=null;

	private static WebElement locktanklist=null;

	private static WebElement taxfeeprofile=null;

	private static WebElement taxfeeprofileactive=null;

	private static WebElement taxfeeprofileclick=null;

	private static WebElement taxfeeprofileselect=null;

	private static WebElement taxfeeprofileunassign=null;



	private static WebElement priceclassmap=null;

	private static WebElement priceclassactive=null;

	private static WebElement priceclassclick=null;

	private static WebElement priceclassselect=null;

	private static WebElement priceclassvaractive=null;

	private static WebElement priceclassvarinsert=null;

	private static WebElement priceclassvarperactive=null;

	private static WebElement priceclassvarperinsert=null;

	private static WebElement priceclassmapunassign=null;

	private static WebElement priceclassmapdiv=null;

	private static WebElement regionmap=null;

	private static WebElement regionmapsearchbox=null;

	private static WebElement manuallock=null;

	private static WebElement primaryactive=null;

	private static WebElement primarycheck=null;

	private static WebElement primarydiv=null;

	private static WebElement territoryactive=null;

	private static WebElement territoryclick=null;

	private static WebElement territorydropdownlist=null;

	private static WebElement territoryselect=null;

	private static WebElement regionmapunassign=null;

	private static WebElement regionmapautoupdate=null;



	private static WebElement defproductload=null;

	private static WebElement prodetdiv=null;

	private static WebElement productdetailsadd=null;

	private static WebElement prodetserach=null;

	private static WebElement Checkproduct=null;

	private static WebElement prodetallcheck=null;

	private static WebElement prodetindvcheck=null;

	private static WebElement prodetok=null;

	private static WebElement prodetcancel=null;



	private static WebElement estimatevolactive=null;

	private static WebElement estimatevolinsert=null;

	private static WebElement ordertouseactive=null;

	private static WebElement ordertouseclick=null;

	private static WebElement ordertouseforavgdropdownlist=null;

	private static WebElement ordertouseselect=null;

	private static WebElement monthstouseactive=null;

	private static WebElement monthstouseinsert=null;


	private static WebElement filter=null;

	private static WebElement filterok=null;

	private static WebElement defloadsadd=null;

	private static WebElement defloadsprodsearch=null;

	private static WebElement defloadsprodcheckall=null;

	private static WebElement defloadsprodindvcheck=null;

	private static WebElement defloadsprodok=null;

	private static WebElement defloadsprodcancel=null;

	private static WebElement producttoload=null;

	private static WebElement soldasproduct=null;

	private static WebElement soldasproductlistselect=null;

	private static WebElement soldasproductok=null;

	private static WebElement volumecellactive=null;

	private static WebElement volume=null;

	private static WebElement terminalcellactive=null;

	private static WebElement terminalclick=null;

	private static List<WebElement> terminalselect=null;
	
	private static List<WebElement> editterminalselect=null;

	private static WebElement suppliercellactive=null;

	private static WebElement supplierclick=null;

	private static WebElement supplierlist=null;

	private static List<WebElement> supplierselect=null;
	
	private static List<WebElement> editsupplierselect=null;

	private static WebElement vendorcellactive=null;

	private static WebElement vendorclick=null;

	private static WebElement vendorlist=null;

	private static List<WebElement> vendorselect=null;

	private static List<WebElement> editvendorselect=null;
	
	private static WebElement pincellactive=null;

	private static WebElement pin=null;

	private static WebElement internaltankidcellactive=null;

	private static WebElement internaltankid=null;

	private static WebElement find=null;

	private static WebElement contractsearchbox=null;

	private static WebElement contractok=null;

	private static WebElement contractselect=null;

	private static WebElement contractcancel=null;



	private static WebElement defaultloadsaddoption=null;

	private static WebElement defaultloadsaddoptionvolumeactive=null;

	private static WebElement defaultloadsaddoptionterminalcellactive=null;

	private static WebElement defaultloadsaddoptionterminalselect=null;

	private static WebElement defaultloadsaddoptionsuppliercellactive=null;

	private static WebElement defaultloadsaddoptionsupplierlist=null;

	private static WebElement defaultloadsaddoptionsupplierselect=null;

	private static WebElement defaultloadsaddoptionvendorcellactive=null;

	private static WebElement defaultloadsaddoptionvendorlist=null;

	private static WebElement defaultloadsaddoptionvendorselect=null;

	private static WebElement defaultloadsaddoptionpincellactive=null;

	private static WebElement defaultloadsaddoptioninternaltankidcellactive=null;

	private static WebElement defloadsaddoptionyes=null;



	private static WebElement receivinghours=null;

	private static WebElement receivinghoursadd=null;

	private static WebElement receivinghoursdaystartactive=null;

	private static List<WebElement> receivinghoursdaystartsearchbox=null;

	private static WebElement receivinghoursdiv=null;

	private static WebElement receivinghoursstarttimeactive=null;

	private static WebElement receivinghoursstarttimeinsert=null;

	private static WebElement receivinghoursendtimeactive=null;

	private static WebElement receivinghoursdayendclick=null;

	private static List<WebElement> receivinghoursdayendsearchbox=null;

	private static WebElement receivinghourstarttimeactive=null;

	private static WebElement receivinghoursendtimeinsert=null;

	private static WebElement receivinghoursdaystartlist=null;
	
	
	private static WebElement receivinghoursdayendlist=null;
	
	

	private static WebElement purchaseorder=null;

	private static WebElement purchaseorderadd=null;

	private static WebElement ponumber=null;

	private static WebElement purchaseorderdiv=null;

	private static WebElement purchaseorderdatefromactive=null;

	private static WebElement selectdatefrom=null;

	private static WebElement selectdateto=null;

	private static WebElement activatedateto=null;

	private static WebElement podiv=null;

	private static WebElement purchaseorderdatefromcaliconclick=null;

	private static WebElement selectyeardateto=null;

	private static WebElement datefrom=null;

	private static WebElement validselectdatefrom=null;
	
	private static WebElement validdatefromselect=null;

	private static WebElement purchaseorderdatefromcalmonthhead2=null;

	private static WebElement verifyallyearslist=null;

	

	private static WebElement datefromselect=null;

	private static WebElement datetoselect=null;

	private static WebElement validselectdateto=null;

	

	private static WebElement blankterritoryselect=null;

	private static WebElement validdatetoselect=null;

	

	private static WebElement purchaseorderdatefromcalpresentdaylink=null;

	private static WebElement purchaseorderdatetoactive=null;

	private static WebElement purchaseorderdatetoinsert=null;

	private static WebElement purchaseorderdatetocaliconclick=null;

	private static WebElement purchaseorderdatetocalprevicon=null;

	private static WebElement purchaseorderdatetocalnexticon=null;

	private static WebElement purchaseorderdatetocalmonthhead=null;

	private static WebElement verifycontract=null;

	private static WebElement verifyinvalidsavemesage=null;

	private static WebElement verifyblanksavemesage=null;

	private static WebElement purchaseorderdatetopresentdaylink=null;



	private static WebElement servicecharges=null;

	private static WebElement servicechargesadd=null;

	private static WebElement servicechargesdayclick=null;

	private static WebElement servicechargesdayselect=null;

	private static WebElement servicechargesdiv=null;

	private static WebElement servicechargesminvoldelactive=null;

	private static WebElement servicechargesminvoldelinsert=null;

	private static WebElement servicechargesnonbulkclick=null;

	private static WebElement servicechargesnonbulksearchbox=null;

	private static WebElement servicechargesnonbulkselect=null;

	private static WebElement servicechargesnonbulkok=null;

	private static WebElement servicechargesamountactive=null;

	private static WebElement servicechargesamountinsert=null;

	private static WebElement servicechargesdatefromactive=null;

	private static WebElement servicechargesdatefrominsert=null;

	private static WebElement servicechargesdatefromcaliconclick=null;

	private static WebElement servicechargesdatefromcalpresentdaylink=null;

	private static WebElement servicechargesdatetoactive=null;

	private static WebElement servicechargesdatetoinsert=null;

	private static WebElement servicechargesdatetocaliconclick=null;

	private static WebElement save=null;




	private static WebElement edit=null;

	private static List<WebElement> editstate=null;

	private static List<WebElement> editnotetype=null;

	private static List<WebElement> edittargettype=null;

	private static List<WebElement> editterritory=null;
	
	private static List<WebElement> editordertouseavg=null;
	
	private static WebElement editmonthstouseavg=null;
	
	

	private static List<WebElement> editreceivinghoursdaystartsearchbox=null;

	private static List<WebElement> editreceivinghoursdayendsearchbox=null;

	private static List<WebElement> addnewreceivinghoursdaystartsearchbox=null;

	private static List<WebElement> addnewreceivinghoursdayendsearchbox=null;

	private static WebElement addnewdatefromselect=null;
	
	private static WebElement addnewselectdatefrom=null;
	
	private static WebElement addnewselectyeardateto=null;
	
	private static WebElement addnewdatetoselect=null;
	
	private static WebElement addnewselectdateto=null;
	
	private static WebElement update=null;
	
	private static WebElement verifyupdatemesage=null;
	
	
	
	
	
	private static List<WebElement> delstate=null;
	
	private static List<WebElement> delterritory=null;
	
	private static WebElement delete=null;
	
	private static WebElement defaultloaddelete=null;
	
	private static WebElement deleteok=null;
	
	private static WebElement shiptodeleteok=null;
	
	private static WebElement loaddeleteok=null;
	
	private static WebElement deletecancel=null;
	
	private static WebElement loaddeletealertcontent=null;
	
	private static WebElement productdeletealertcontent=null;
	
	private static WebElement recevinghoursdeletealertcontent=null;
	
	private static WebElement purchaseorderdeletealertcontent=null;
	
	private static WebElement verifydeleteupdationmesage=null;
	
	private static WebElement shiptodeletealertcontent=null;

	private static WebElement verifysavemesage=null;

	private static WebElement closeconfirmationmessage=null;
	
	
	
	
	
	
	
	
	private static List<WebElement> undelstate=null;
	
	private static List<WebElement> undelterritory=null;
	
	private static List<WebElement> alreadyexistedterritory=null;
	
	private static WebElement undeletevalidationmessage1=null;
	
	private static WebElement undeletevalidationmessage2=null;
	
	private static WebElement undeletevalidationmessage3=null;
	
	private static WebElement verifyundeleteupdationmesage1=null;
	
	private static WebElement verifyundeleteupdationmesage2=null;
	
	private static WebElement verifyundeleteupdationmesage3=null;
	
	private static WebElement undeletecheckbox=null;
	
	
	
	
	private static List<WebElement> alreadyexistedstate=null;
	
	private static WebElement alreadyexistedvalidationmessage1=null;
	
	private static WebElement alreadyexistedvalidationmessage2=null;
	
	private static WebElement alreadyexistedvalidationmessage3=null;
	
	private static WebElement verifyalreadyexistedupdationmesage1=null;
	
	private static WebElement verifyalreadyexistedupdationmesage2=null;
	
	private static WebElement verifyalreadyexistedupdationmesage3=null;
	
	
	
	private static WebElement masteracctalertcontent=null;
	
	private static WebElement alertok=null;
	
	private static WebElement blankinputinshiptoacct=null;
	
	private static WebElement blankinputincustomer=null;
	
	private static WebElement blankinputinname=null;
	
	private static WebElement blankinputinaddress1=null;
	
	private static WebElement blankinputincity=null;
	
	private static WebElement blankinputinstate=null;
	
	private static WebElement blankinputinzip=null;
	
	private static WebElement blankinputinlatitude=null;
	
	private static WebElement blankinputinlongitude=null;
	
	private static WebElement atleastoneregionmustbesetprimarymapalert=null;
	
	private static WebElement territorymandatoryalert=null;
	
	private static WebElement blankinputindefaultproduct=null;
	
	private static WebElement defaultloadaddproductalert=null;
	
	private static WebElement blankinputindefaultload=null;
	
	private static WebElement selectproducttoloadfirstalert=null;
	
	private static WebElement blankinputinproductsoldas=null;
	
	private static WebElement blankinputindefaulloadvol=null;
	
	private static WebElement blankinputindefaulloadterminal=null;
	
	private static WebElement blankinputindefaulloadsupplier=null;
	
	private static WebElement blankinputindefaulloadvendor=null;
	
	private static WebElement nointernaltanksalert=null;
	
	private static WebElement mustselectinternaltankalert=null;
	
	private static WebElement deletedefaulproductalert=null;
	
	private static WebElement uncheckfilteralert=null;
	
	private static WebElement blankinputindaystart=null;
	
	private static WebElement blankinputinstarttime=null;
	
	private static WebElement alldatamandatoryinrecevinghoursalert=null;
	
	private static WebElement blankinputindayend=null;
	
	private static WebElement blankinputinendtime=null;
	
	private static WebElement starttimeexceedendtimealert=null;
	
	private static WebElement duplicatesrecordinreceivinghoursalert=null;
	
	private static WebElement blankinputinponumber=null;
	
	private static WebElement alreadyexistponumberalert=null;
	
	private static WebElement alldatamandatoryinpo=null;
	
	private static WebElement invaliddatefromalertinponumber=null;
	
	private static WebElement invaliddatetoalertinponumber=null;
	
	private static WebElement invalidshiptoacct=null;
	
	private static WebElement invalidname=null;
	
	private static WebElement invalidname2=null;
	
	private static WebElement invalidaddress1=null;
	
	private static WebElement invalidaddress2=null;
	
	private static WebElement invalidcity=null;
	
	private static WebElement invalidzip1=null;
	
	private static WebElement invalidzip2=null;
	
	private static WebElement invalidfaxtoname=null;
	
	private static WebElement invalidname1cont1=null;
	
	private static WebElement invalidemail1cont1=null;
	
	private static WebElement invalidname2cont2=null;
	
	private static WebElement invalidemail2cont2=null;
	
	private static WebElement invalidlatitude=null;
	
	private static WebElement invalidlongitude=null;
	
	private static WebElement invalidavddeliverytime=null;
	
	private static WebElement invalidponumber=null;
	
	
	
	
	
	
	

	private static WebElement back=null;

	private static WebElement sort=null;

	private static WebElement search=null;

	private static WebElement mainpagenavbuttons=null;



	public static MouseHandler openshipto(WebDriver driver) throws Exception{

		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(8, ColNum))).size();


		int ok_size1=driver.findElements(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).size();




		action.moveToElement(driver.findElements(By.xpath(ExcelUtils.getstringCellData(8, ColNum))).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		action.moveToElement(driver.findElements(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);



		driver.findElement(By.xpath("//a[@href='/SLMain/CustomerShipTo/GetCustomerShipTos']")).click();

		Thread.sleep(5000);
		
		WebElement mainpage=driver.findElement(By.linkText("ShipTo Acct #"));
		
		if(mainpage.isDisplayed()){
			
			
		 	
		ExcelUtils.setCellData("Page is redirected to Customer ShipTo Screen", 10,7);
		
		ExcelUtils.setCellData("Pass", 10, 8);
		
		System.out.println("Page is redirected to ShipTo Screen");
		
		Thread.sleep(3000);
		
		}
		
		else{
			
			ExcelUtils.setCellData("Page is not redirected to Truck Screen", 10,8);	
			
			ExcelUtils.setCellData("Fail", 10, 8);
			
		}



		return openshipto;


	}



	public static WebElement create(WebDriver driver) throws Exception{



		create=driver.findElement(By.id("btncreate"));

		create.click();


		return create;


	}

	public static WebElement shipto(WebDriver driver) throws Exception{

		shipto=driver.findElement(By.linkText("ShipTo"));

		return shipto;


	}
	public static WebElement alertok(WebDriver driver) throws Exception{

		alertok=driver.findElement(By.id("btnAlertOK"));


		return alertok;


	}


	public static WebElement shiptoacct(WebDriver driver) throws Exception{

		shiptoacct=driver.findElement(By.id("BaseCustomerShipTo_NumDesc"));


		return shiptoacct;


	}

	public static WebElement masteracctsearchicon(WebDriver driver) throws Exception{

		masteracctsearchicon=driver.findElement(By.id("ancrMasterAcc"));

		return masteracctsearchicon;

	}

	public static WebElement masteracctsearchbox(WebDriver driver) throws Exception{

		masteracctsearchbox=driver.findElement(By.id("txtSearchCustomerGrid"));

		return masteracctsearchbox;

	}

	public static WebElement masteracctselect(WebDriver driver) throws Exception{

		masteracctselect=driver.findElement(By.xpath("//div[@id='CustomerWindowGrid']//tr//td[1]"));

		return masteracctselect;

	}
	public static WebElement masteracctok(WebDriver driver) throws Exception{

		masteracctok=driver.findElement(By.id("btnCustWndOK"));

		return masteracctok;

	}

	public static WebElement masteracctcancel(WebDriver driver) throws Exception{

		masteracctcancel=driver.findElement(By.id("btnCustWndCancel"));

		return masteracctcancel;

	}



	public static WebElement name(WebDriver driver) throws Exception{

		name=driver.findElement(By.id("BaseCustomerShipTo_NameCode"));

		return name;

	}

	public static WebElement name2(WebDriver driver) throws Exception{

		name2=driver.findElement(By.id("BaseCustomerShipTo_Name2"));

		return name2;

	}
	public static WebElement address1(WebDriver driver) throws Exception{

		address1=driver.findElement(By.id("BaseCustomerShipTo_Address1"));

		return address1;

	}

	public static WebElement address2(WebDriver driver) throws Exception{

		address2=driver.findElement(By.id("BaseCustomerShipTo_Address2"));

		return address2;

	}

	public static WebElement city(WebDriver driver) throws Exception{

		city=driver.findElement(By.id("BaseCustomerShipTo_City"));

		return city;

	}
	public static WebElement stateclick(WebDriver driver) throws Exception{

		stateclick=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_State_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return stateclick;

	}

	public static List<WebElement> statesearch(WebDriver driver) throws Exception{

		statesearch=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_State_listbox']"));

		int ok_size=statesearch.size();

		Thread.sleep(3000);

		statesearch.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(23, 5));

		Thread.sleep(3000);

		statesearch.get(ok_size-1).sendKeys(Keys.ENTER);

		return statesearch;

	}

	public static WebElement zip(WebDriver driver) throws Exception{

		zip=driver.findElement(By.id("BaseCustomerShipTo_Zip"));

		return zip;

	}


	public static WebElement country(WebDriver driver) throws Exception{

		country=driver.findElement(By.id("BaseCustomerShipTo_ShipToCountry"));

		return country;

	}

	public static WebElement phone(WebDriver driver) throws Exception{

		phone=driver.findElement(By.id("BaseCustomerShipTo_Phone"));

		return phone;

	}

	public static WebElement faxtoname(WebDriver driver) throws Exception{

		faxtoname=driver.findElement(By.id("BaseCustomerShipTo_ShipToFaxToName"));

		return faxtoname;

	}
	public static WebElement fax(WebDriver driver) throws Exception{

		fax=driver.findElement(By.id("BaseCustomerShipTo_ShipToFax"));

		return fax;

	}

	public static WebElement contact1name1(WebDriver driver) throws Exception{

		contact1name1=driver.findElement(By.id("BaseCustomerShipTo_ContactName"));

		return contact1name1;

	}
	public static WebElement contact1phone1(WebDriver driver) throws Exception{

		contact1phone1=driver.findElement(By.id("BaseCustomerShipTo_ContactPhone"));

		return contact1phone1;

	}

	public static WebElement contact1ext1(WebDriver driver) throws Exception{

		contact1ext1=driver.findElement(By.id("BaseCustomerShipTo_ContactExt"));

		return contact1ext1;

	}

	public static WebElement contact1email1(WebDriver driver) throws Exception{

		contact1email1=driver.findElement(By.id("BaseCustomerShipTo_ContactEmail"));

		return contact1email1;

	}



	public static WebElement contact1emailtkt1click(WebDriver driver) throws Exception{

		contact1emailtkt1click=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_ShipToEmailTicketWhen_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return contact1emailtkt1click;

	}

	public static WebElement contact1emailtkt1dropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(".//*[@id='BaseCustomerShipTo_ShipToEmailTicketWhen_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Email Ticket When for Contact 1 Has Following Dropdown List \n"+e.getText(),33, 8);

			System.out.println("Email Ticket When for Contact 1 Has Following Dropdown List \n" + e.getText());

		}

		return contact1emailtkt1dropdownlist;

	}

	public static WebElement contact1emailtkt1select(WebDriver driver) throws Exception{


		List<WebElement> emailticketwhen1=driver.findElements(By.xpath("//ul[@id='BaseCustomerShipTo_ShipToEmailTicketWhen_listbox']//li"));


		for(WebElement ele:emailticketwhen1)
		{

			String emailticketwhen1select=ele.getText();

			if(emailticketwhen1select.equalsIgnoreCase(ExcelUtils.getstringCellData(34, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Email Ticket When is " + (ExcelUtils.getstringCellData(34, 5)),32, 8);

		System.out.println("Email Ticket When is " + (ExcelUtils.getstringCellData(34, 5)));

		return contact1emailtkt1select;

	}

	public static WebElement contact2name2(WebDriver driver) throws Exception{

		contact2name2=driver.findElement(By.id("BaseCustomerShipTo_ShipToContactName2"));

		return contact2name2;

	}

	public static WebElement contact2phone2(WebDriver driver) throws Exception{

		contact2phone2=driver.findElement(By.id("BaseCustomerShipTo_ShipToContactPhone2"));

		return contact2phone2;

	}

	public static WebElement contact2ext2(WebDriver driver) throws Exception{

		contact2ext2=driver.findElement(By.id("BaseCustomerShipTo_ShipToContactExt2"));

		return contact2ext2;

	}

	public static WebElement contact2email2(WebDriver driver) throws Exception{

		contact2email2=driver.findElement(By.id("BaseCustomerShipTo_ShipToContactEmail2"));

		return contact2email2;

	}
	public static WebElement contact2emailtkt2click(WebDriver driver) throws Exception{

		contact2emailtkt2click=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_ShipToEmailTicketWhen2_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return contact2emailtkt2click;

	}

	public static WebElement contact2emailtkt2dropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(".//*[@id='BaseCustomerShipTo_ShipToEmailTicketWhen2_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Email Ticket When Has Following Dropdown List \n"+e.getText(),40, 8);

			System.out.println("Email Ticket When Has Following Dropdown List \n" + e.getText());

		}

		return contact2emailtkt2dropdownlist;

	}


	public static WebElement contact2emailtkt2select(WebDriver driver) throws Exception{



		List<WebElement> emailticketwhen2=driver.findElements(By.xpath(".//*[@id='BaseCustomerShipTo_ShipToEmailTicketWhen2_listbox']//li"));


		for(WebElement ele:emailticketwhen2)
		{

			String emailticketwhen2select=ele.getText();

			if(emailticketwhen2select.equalsIgnoreCase(ExcelUtils.getstringCellData(41, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Email Ticket When is " + (ExcelUtils.getstringCellData(41, 5)),41, 8);

		System.out.println("Email Ticket When is " + (ExcelUtils.getstringCellData(41, 5)));

		return contact2emailtkt2select;

	}

	public static WebElement latitude(WebDriver driver) throws Exception{

		latitude=driver.findElement(By.id("BaseCustomerShipTo_Lat"));

		return latitude;

	}
	public static WebElement longitude(WebDriver driver) throws Exception{

		longitude=driver.findElement(By.id("BaseCustomerShipTo_Lon"));

		return longitude;

	}

	public static WebElement tktcopies(WebDriver driver) throws Exception{

		tktcopies=driver.findElement(By.id("BaseCustomerShipTo_TicketCopies"));

		return tktcopies;

	}
	public static WebElement ordertypeclick(WebDriver driver) throws Exception{

		ordertypeclick=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_DefaultOrderTypeId_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return ordertypeclick;

	}

	public static WebElement ordertypedropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(".//*[@id='BaseCustomerShipTo_DefaultOrderTypeId_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Order Type Has Following Dropdown List \n"+e.getText(),45, 8);

			System.out.println("Order Type Has Following Dropdown List \n" + e.getText());

		}

		return ordertypedropdownlist;

	}


	public static WebElement ordertypeselect(WebDriver driver) throws Exception{



		List<WebElement> ordertype=driver.findElements(By.xpath("//ul[@id='BaseCustomerShipTo_DefaultOrderTypeId_listbox']//li"));


		for(WebElement ele:ordertype)
		{

			String ordertypeselect=ele.getText();

			if(ordertypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(46, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Order Type is " + (ExcelUtils.getstringCellData(46, 5)),46, 8);

		System.out.println("Order Type When is " + (ExcelUtils.getstringCellData(46, 5)));

		return ordertypeselect;

	}
	public static WebElement deliveryfeeclick(WebDriver driver) throws Exception{

		deliveryfeeclick=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_ShipToDeliveryFeeProfileId_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return deliveryfeeclick;

	}

	public static List<WebElement> deliveryfeesearch(WebDriver driver) throws Exception{

		deliveryfeesearch=driver.findElements(By.xpath("//span[@class='k-list-filter']//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_ShipToDeliveryFeeProfileId_listbox']"));



		int ok_size=deliveryfeesearch.size();

		Thread.sleep(3000);

		deliveryfeesearch.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(41, 5));

		Thread.sleep(3000);

		deliveryfeesearch.get(ok_size-1).sendKeys(Keys.ENTER);



		return deliveryfeesearch;

	}

	public static WebElement targetmarginreportclassclick(WebDriver driver) throws Exception{

		targetmarginreportclassclick=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_ShipToMarginClassId_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return targetmarginreportclassclick;

	}




	public static WebElement targetmarginreportclassselect(WebDriver driver) throws Exception{



		List<WebElement> ordertype=driver.findElements(By.xpath("//ul[@id='BaseCustomerShipTo_DefaultOrderTypeId_listbox']//li"));


		for(WebElement ele:ordertype)
		{

			String ordertypeselect=ele.getText();

			if(ordertypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Order Type is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Order Type When is " + (ExcelUtils.getstringCellData(32, 5)));

		return targetmarginreportclassselect;

	}


	public static WebElement orderholdclick(WebDriver driver) throws Exception{

		orderholdclick=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_ShipToOrderHold_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return orderholdclick;

	}

	public static List<WebElement> orderholdsearch(WebDriver driver) throws Exception{

		orderholdsearch=driver.findElements(By.xpath("//span[@class='k-list-filter']//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_ShipToOrderHold_listbox']"));

		int ok_size=orderholdsearch.size();

		Thread.sleep(3000);

		orderholdsearch.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(48, 5));

		Thread.sleep(3000);

		orderholdsearch.get(ok_size-1).sendKeys(Keys.ENTER);



		return orderholdsearch;

	}

	public static WebElement vendorcrossref(WebDriver driver) throws Exception{

		vendorcrossref=driver.findElement(By.id("BaseCustomerShipTo_ShipToMansfieldXRef"));

		return vendorcrossref;

	}
	public static WebElement bsnflocname(WebDriver driver) throws Exception{

		bsnflocname=driver.findElement(By.id("BaseCustomerShipTo_ShipToBNSFLocationName"));

		return bsnflocname;

	}

	public static WebElement avgdeltime(WebDriver driver) throws Exception{

		avgdeltime=driver.findElement(By.id("BaseCustomerShipTo_ShipToAveDeliveryTime"));

		return avgdeltime;

	}
	public static WebElement fuelradiusclick(WebDriver driver) throws Exception{

		fuelradiusclick=driver.findElement(By.xpath("//span[@aria-owns='BaseCustomerShipTo_FuelingRadius_listbox']//span[@class='k-icon k-i-arrow-s'][contains(text(),'select')]"));

		return fuelradiusclick;

	}

	public static WebElement fuelradiusdropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(".//*[@id='BaseCustomerShipTo_FuelingRadius_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Order Type Has Following Dropdown List \n"+e.getText(),31, 8);

			System.out.println("Order Type Has Following Dropdown List \n" + e.getText());

		}

		return fuelradiusdropdownlist;

	}


	public static WebElement fuelradiusselect(WebDriver driver) throws Exception{

		fuelradiusselect=driver.findElement(By.xpath("//ul[@id='BaseCustomerShipTo_FuelingRadius_listbox']//li"));


		List<WebElement> fuelradius=driver.findElements(By.xpath("//ul[@id='BaseCustomerShipTo_FuelingRadius_listbox']//li"));


		for(WebElement ele:fuelradius)
		{

			String fuelradiusselect=ele.getText();

			if(fuelradiusselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();
				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("fuelradius is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("fuelradius is " + (ExcelUtils.getstringCellData(32, 5)));

		return fuelradiusselect;

	}

	public static WebElement salesrepname1searchicon(WebDriver driver) throws Exception{

		salesrepname1searchicon=driver.findElement(By.id("ancrFirstSalesRepUser"));

		return salesrepname1searchicon;

	}

	
	
	public static WebElement salesrepname1searchbox(WebDriver driver) throws Exception{

		salesrepname1searchbox=driver.findElement(By.id("txtSearchUserGrid"));

		return salesrepname1searchbox;

	}

	public static WebElement salesrepname1select(WebDriver driver) throws Exception{

		salesrepname1select=driver.findElement(By.xpath(".//*[@id='UserWindowGrid']/div[2]/table/tbody/tr/td[1]"));

		return salesrepname1select;

	}
	public static WebElement salesrepname1ok(WebDriver driver) throws Exception{

		salesrepname1ok=driver.findElement(By.id("btnUserWndOK"));

		return salesrepname1ok;

	}

	public static WebElement salesrepname1cancel(WebDriver driver) throws Exception{

		salesrepname1cancel=driver.findElement(By.id("btnUserWndCancel"));

		return salesrepname1cancel;

	}

	public static WebElement salesrepname1del(WebDriver driver) throws Exception{

		salesrepname1del=driver.findElement(By.id("btnClearUser1Data"));

		return salesrepname1del;

	}

	public static WebElement salesrepname2searchicon(WebDriver driver) throws Exception{

		salesrepname2searchicon=driver.findElement(By.id("ancrSecondSalesRepUser"));

		return salesrepname2searchicon;

	}

	public static WebElement salesrepname2searchbox(WebDriver driver) throws Exception{

		salesrepname2searchbox=driver.findElement(By.id("txtSearchUserGrid"));

		return salesrepname2searchbox;

	}

	public static WebElement salesrepname2select(WebDriver driver) throws Exception{

		salesrepname2select=driver.findElement(By.xpath(".//*[@id='UserWindowGrid']/div[2]/table/tbody/tr/td[1]"));

		return salesrepname2select;

	}
	public static WebElement salesrepname2ok(WebDriver driver) throws Exception{

		salesrepname2ok=driver.findElement(By.id("btnUserWndOK"));

		return salesrepname2ok;

	}

	public static WebElement salesrepname2cancel(WebDriver driver) throws Exception{

		salesrepname2cancel=driver.findElement(By.id("btnUserWndCancel"));

		return salesrepname2cancel;

	}




	public static WebElement salesrepname2del(WebDriver driver) throws Exception{

		salesrepname2del=driver.findElement(By.id("btnClearUser2Data"));

		return salesrepname2del;

	}

	public static WebElement userdef1(WebDriver driver) throws Exception{

		userdef1=driver.findElement(By.id("BaseCustomerShipTo_ShipToUser1"));

		return userdef1;

	}

	public static WebElement userdef2(WebDriver driver) throws Exception{

		userdef2=driver.findElement(By.id("BaseCustomerShipTo_ShipToUser2"));

		return userdef2;

	}

	public static WebElement userdef3(WebDriver driver) throws Exception{

		userdef3=driver.findElement(By.id("BaseCustomerShipTo_ShipToUser3"));

		return userdef3;

	}

	public static WebElement userdef4(WebDriver driver) throws Exception{

		userdef4=driver.findElement(By.id(""));

		return userdef4;

	}
	public static WebElement signaturereq(WebDriver driver) throws Exception{

		signaturereq=driver.findElement(By.id("BaseCustomerShipTo_ShipToRequireSignature"));

		return signaturereq;

	}
	public static WebElement PrintTotalizersonTicket(WebDriver driver) throws Exception{

		PrintTotalizersonTicket=driver.findElement(By.id("BaseCustomerShipTo_ShipToRequireSignature"));

		return PrintTotalizersonTicket;

	}

	public static WebElement StickReadingRequired(WebDriver driver) throws Exception{

		StickReadingRequired=driver.findElement(By.id("BaseCustomerShipTo_RequireStickReadings"));

		return StickReadingRequired;

	}

	public static WebElement PrintPriceOnticket(WebDriver driver) throws Exception{

		PrintPriceOnticket=driver.findElement(By.id("BaseCustomerShipTo_PrintPriceOnTicket"));

		return PrintPriceOnticket;

	}

	public static WebElement poreq(WebDriver driver) throws Exception{

		poreq=driver.findElement(By.id("BaseCustomerShipTo_PORequired"));

		return poreq;

	}

	public static WebElement pumpreq(WebDriver driver) throws Exception{

		pumpreq=driver.findElement(By.id("BaseCustomerShipTo_PumpRequired"));

		return pumpreq;

	}


	public static WebElement notetypeclick(WebDriver driver) throws Exception{

		notetypeclick=driver.findElement(By.xpath("//span[@aria-owns='NoteTypeDDL_listbox']//span[@class='k-icon k-i-arrow-60-down']"));

		return notetypeclick;

	}

	public static WebElement notetypedropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(".//*[@id='NoteTypeDDL_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Note Type Has Following Dropdown List \n"+e.getText(),64, 8);

			System.out.println("Note Type Has Following Dropdown List \n" + e.getText());

		}

		return notetypedropdownlist;

	}


	public static WebElement notetypeselect(WebDriver driver) throws Exception{



		List<WebElement> notetype=driver.findElements(By.xpath("//ul[@id='NoteTypeDDL_listbox']//li"));


		for(WebElement ele:notetype)
		{

			String notetypeselect=ele.getText();

			if(notetypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(65, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Note Type is " + (ExcelUtils.getstringCellData(65, 5)),65, 8);

		System.out.println("Note Type is " + (ExcelUtils.getstringCellData(65, 5)));

		return notetypeselect;

	}

	public static WebElement targettypeselect(WebDriver driver) throws Exception{



		List<WebElement> target=driver.findElements(By.xpath("//div[@id='TargetTypeGrid']//span"));


		for(WebElement ele:target)
		{

			String targetselect=ele.getText();

			if(targetselect.equalsIgnoreCase(ExcelUtils.getstringCellData(66, 5)))
			{
				ele.click();

				Thread.sleep(3000);

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Target Type is " + (ExcelUtils.getstringCellData(66, 5)),66, 8);

		System.out.println("Target Type is " + (ExcelUtils.getstringCellData(66, 5)));


		return targettypeselect;

	}

	public static WebElement targettypeselect2(WebDriver driver) throws Exception{

		targettypeselect2=driver.findElement(By.xpath(""));

		return targettypeselect2;

	}

	public static WebElement note(WebDriver driver) throws Exception{

		note=driver.findElement(By.id("txtNote"));

		return note;
	}


	public static WebElement fleetvehicles(WebDriver driver) throws Exception{

		fleetvehicles=driver.findElement(By.linkText(""));

		return fleetvehicles;

	}

	public static WebElement PrintUnfueledVehicles(WebDriver driver) throws Exception{

		PrintUnfueledVehicles=driver.findElement(By.id(""));

		return PrintUnfueledVehicles;
	}

	public static WebElement PrintUnfueledVehicleReasonCode(WebDriver driver) throws Exception{

		PrintUnfueledVehicleReasonCode=driver.findElement(By.id(""));

		return PrintUnfueledVehicleReasonCode;
	}

	public static WebElement UnfueledReasonCoderequired(WebDriver driver) throws Exception{

		UnfueledReasonCoderequired=driver.findElement(By.id(""));

		return UnfueledReasonCoderequired;
	}

	public static WebElement maxfueltankspervehicle(WebDriver driver) throws Exception{

		maxfueltankspervehicle=driver.findElement(By.id(""));

		return maxfueltankspervehicle;
	}

	public static WebElement SetNewVehiclesToTransient(WebDriver driver) throws Exception{

		SetNewVehiclesToTransient=driver.findElement(By.id(""));

		return SetNewVehiclesToTransient;
	}

	public static WebElement OdometerRequired(WebDriver driver) throws Exception{

		OdometerRequired=driver.findElement(By.id(""));

		return OdometerRequired;
	}

	public static WebElement LockVehicleList(WebDriver driver) throws Exception{

		LockVehicleList=driver.findElement(By.id(""));

		return LockVehicleList;
	}

	public static WebElement vehdetailsadd(WebDriver driver) throws Exception{

		vehdetailsadd=driver.findElement(By.linkText(""));

		return vehdetailsadd;
	}

	public static WebElement vehdetailsfleetvehiclelink(WebDriver driver) throws Exception{

		vehdetailsfleetvehiclelink=driver.findElement(By.id(""));

		return vehdetailsfleetvehiclelink;
	}





	public static WebElement vehnumber(WebDriver driver) throws Exception{

		vehnumber=driver.findElement(By.id(""));

		return vehnumber;
	}

	public static WebElement vehfueltanks(WebDriver driver) throws Exception{

		vehfueltanks=driver.findElement(By.id(""));

		return vehfueltanks;
	}

	public static WebElement vehcapacity(WebDriver driver) throws Exception{

		vehcapacity=driver.findElement(By.id(""));

		return vehcapacity;
	}

	public static WebElement vehproductclick(WebDriver driver) throws Exception{

		vehproductclick=driver.findElement(By.id(""));

		return vehproductclick;
	}

	public static WebElement vehproductsearch(WebDriver driver) throws Exception{

		vehproductsearch=driver.findElement(By.id(""));

		return vehproductsearch;
	}

	public static WebElement vehproductselect(WebDriver driver) throws Exception{

		vehproductselect=driver.findElement(By.xpath(""));

		return vehproductselect;
	}

	public static WebElement vehproductok(WebDriver driver) throws Exception{

		vehproductok=driver.findElement(By.id(""));

		return vehproductok;
	}


	public static WebElement vehbarcode(WebDriver driver) throws Exception{

		vehbarcode=driver.findElement(By.id(""));

		return vehbarcode;
	}

	public static WebElement vehtankcapacity(WebDriver driver) throws Exception{

		vehtankcapacity=driver.findElement(By.id(""));

		return vehtankcapacity;
	}

	public static WebElement vehtankdes(WebDriver driver) throws Exception{

		vehtankdes=driver.findElement(By.id(""));

		return vehtankdes;

	}

	public static WebElement model(WebDriver driver) throws Exception{

		model=driver.findElement(By.id(""));

		return model;
	}

	public static WebElement year(WebDriver driver) throws Exception{

		year=driver.findElement(By.id(""));

		return year;
	}

	public static WebElement vin(WebDriver driver) throws Exception{

		vin=driver.findElement(By.id(""));

		return vin;

	}
	public static WebElement tag(WebDriver driver) throws Exception{

		tag=driver.findElement(By.id(""));

		return tag;


	}

	public static WebElement vehuserdef1(WebDriver driver) throws Exception{

		vehuserdef1=driver.findElement(By.id(""));

		return vehuserdef1;


	}
	public static WebElement vehuserdef2(WebDriver driver) throws Exception{

		vehuserdef2=driver.findElement(By.id(""));

		return vehuserdef2;


	}
	public static WebElement vehuserdef3(WebDriver driver) throws Exception{

		vehuserdef3=driver.findElement(By.id(""));

		return vehuserdef3;


	}
	public static WebElement vehuserdef4(WebDriver driver) throws Exception{

		vehuserdef4=driver.findElement(By.id(""));

		return vehuserdef4;


	}

	public static WebElement vehcrossref(WebDriver driver) throws Exception{

		vehcrossref=driver.findElement(By.id(""));

		return vehcrossref;


	}
	public static WebElement smartapmacaddress(WebDriver driver) throws Exception{

		smartapmacaddress=driver.findElement(By.id(""));

		return smartapmacaddress;


	}
	public static WebElement manufacturer(WebDriver driver) throws Exception{

		manufacturer=driver.findElement(By.id(""));

		return manufacturer;


	}

	public static WebElement vehtransient(WebDriver driver) throws Exception{

		vehtransient=driver.findElement(By.id(""));

		return vehtransient;


	}
	public static WebElement reqodometer(WebDriver driver) throws Exception{

		reqodometer=driver.findElement(By.id(""));

		return reqodometer;


	}
	public static WebElement fleetvehbarcodedetailsadd(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsadd=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailsadd;


	}

	public static WebElement fleetvehbarcodedetailsprodclick(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsprodclick=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailsprodclick;
	}

	public static WebElement fleetvehbarcodedetailsprodsearchbox(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsprodsearchbox=driver.findElement(By.id(""));

		return fleetvehbarcodedetailsprodsearchbox;
	}

	public static WebElement fleetvehbarcodedetailsprodselect(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsprodselect=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailsprodselect;
	}

	public static WebElement fleetvehbarcodedetailsprodok(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsprodok=driver.findElement(By.id(""));

		return fleetvehbarcodedetailsprodok;
	}

	public static WebElement fleetvehbarcodedetailsbarcodeactive(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsbarcodeactive=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailsbarcodeactive;
	}

	public static WebElement fleetvehbarcodedetailsbarcode(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsbarcode=driver.findElement(By.name(""));

		return fleetvehbarcodedetailsbarcode;
	}

	public static WebElement fleetvehbarcodedetailscapacityactive(WebDriver driver) throws Exception{

		fleetvehbarcodedetailscapacityactive=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailscapacityactive;
	}

	public static WebElement fleetvehbarcodedetailscapacity(WebDriver driver) throws Exception{

		fleetvehbarcodedetailscapacity=driver.findElement(By.name(""));

		return fleetvehbarcodedetailscapacity;
	}

	public static WebElement fleetvehbarcodedetailstankdesactive(WebDriver driver) throws Exception{

		fleetvehbarcodedetailstankdesactive=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailstankdesactive;
	}

	public static WebElement fleetvehbarcodedetailstankdes(WebDriver driver) throws Exception{

		fleetvehbarcodedetailstankdes=driver.findElement(By.name(""));

		return fleetvehbarcodedetailstankdes;
	}



	public static WebElement fleetvehbarcodedetailsdiv(WebDriver driver) throws Exception{

		fleetvehbarcodedetailsdiv=driver.findElement(By.xpath(""));

		return fleetvehbarcodedetailsdiv;
	}

	public static WebElement deliverytanks(WebDriver driver) throws Exception{

		deliverytanks=driver.findElement(By.linkText(""));

		return deliverytanks;
	}

	public static WebElement locktanklist(WebDriver driver) throws Exception{

		locktanklist=driver.findElement(By.id(""));

		return locktanklist;


	}

	public static WebElement taxfeeprofile(WebDriver driver) throws Exception{

		taxfeeprofile=driver.findElement(By.linkText(""));

		return taxfeeprofile;
	}

	public static WebElement taxfeeprofileactive(WebDriver driver) throws Exception{

		taxfeeprofileactive=driver.findElement(By.xpath(""));

		return taxfeeprofileactive;
	}

	public static WebElement taxfeeprofileclick(WebDriver driver) throws Exception{

		taxfeeprofileclick=driver.findElement(By.xpath(""));

		return taxfeeprofileclick;
	}

	public static WebElement taxfeeprofileselect(WebDriver driver) throws Exception{

		taxfeeprofileselect=driver.findElement(By.xpath(""));

		List<WebElement> taxfeeprofile=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:taxfeeprofile)
		{

			String taxfeeprofileselect=ele.getText();

			if(taxfeeprofileselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Tax Fee Profile is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Tax Fee Profile is " + (ExcelUtils.getstringCellData(32, 5)));




		return taxfeeprofileselect;
	}
	public static WebElement taxfeeprofileunassign(WebDriver driver) throws Exception{

		taxfeeprofileunassign=driver.findElement(By.linkText(""));

		return taxfeeprofileunassign;
	}


	public static WebElement priceclassmap(WebDriver driver) throws Exception{

		priceclassmap=driver.findElement(By.linkText(""));

		return priceclassmap;
	}

	public static WebElement priceclassactive(WebDriver driver) throws Exception{

		priceclassactive=driver.findElement(By.xpath(""));

		return priceclassactive;
	}

	public static WebElement priceclassclick(WebDriver driver) throws Exception{

		priceclassclick=driver.findElement(By.xpath(""));

		return priceclassclick;
	}

	public static WebElement priceclassselect(WebDriver driver) throws Exception{



		List<WebElement> priceclass=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:priceclass)
		{

			String priceclassselect=ele.getText();

			if(priceclassselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Price Class is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Price Class is " + (ExcelUtils.getstringCellData(32, 5)));

		return priceclassselect;
	}

	public static WebElement priceclassvaractive(WebDriver driver) throws Exception{

		priceclassvaractive=driver.findElement(By.xpath(""));

		return priceclassvaractive;
	}

	public static WebElement priceclassvarinsert(WebDriver driver) throws Exception{

		priceclassvarinsert=driver.findElement(By.id(""));

		return priceclassvarinsert;
	}

	public static WebElement priceclassvarperactive(WebDriver driver) throws Exception{

		priceclassvarperactive=driver.findElement(By.xpath(""));

		return priceclassvarperactive;
	}

	public static WebElement priceclassvarperinsert(WebDriver driver) throws Exception{

		priceclassvarperinsert=driver.findElement(By.id(""));

		return priceclassvarperinsert;
	}

	public static WebElement priceclassmapunassign(WebDriver driver) throws Exception{

		priceclassmapunassign=driver.findElement(By.linkText(""));

		return priceclassmapunassign;
	}

	public static WebElement priceclassmapdiv(WebDriver driver) throws Exception{

		priceclassmapdiv=driver.findElement(By.xpath(""));

		return priceclassmapdiv;
	}



	public static WebElement regionmap(WebDriver driver) throws Exception{

		regionmap=driver.findElement(By.linkText("Region Map"));

		return regionmap;
	}

	public static WebElement manuallock(WebDriver driver) throws Exception{

		manuallock=driver.findElement(By.id("BaseCustomerShipTo_RegionLock"));

		return manuallock;
	}

	public static WebElement regionmapsearchbox(WebDriver driver) throws Exception{

		regionmapsearchbox=driver.findElement(By.id("txtSearchCustomerShipToRegionsGrid"));

		return regionmapsearchbox;
	}



	public static WebElement primaryactive(WebDriver driver) throws Exception{

		primaryactive=driver.findElement(By.xpath(""));

		return primaryactive;
	}

	public static WebElement primarycheck(WebDriver driver) throws Exception{

		primarycheck=driver.findElement(By.xpath("//div[@id='CustomerShipToRegionsGrid']//input"));

		return primarycheck;


	}

	public static WebElement primarydiv(WebDriver driver) throws Exception{

		primarydiv=driver.findElement(By.xpath(".//*[@id='tabRegionMap']/div/div/fieldset/div[4]"));

		return primarydiv;
	}

	public static WebElement territoryactive(WebDriver driver) throws Exception{

		territoryactive=driver.findElement(By.xpath("//div[@id='CustomerShipToRegionsGrid']/div[2]/table/tbody/tr/td[3]"));

		return territoryactive;
	}

	public static WebElement territoryclick(WebDriver driver) throws Exception{

		territoryclick=driver.findElement(By.xpath(""));

		return territoryclick;
	}

	public static WebElement territorydropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(74, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Territories are \n"+e.getText(),74, 8);

			System.out.println("Territories are List \n" + e.getText());

		}

		return territorydropdownlist;

	}


	public static WebElement territoryselect(WebDriver driver) throws Exception{



		List<WebElement> territory=driver.findElements(By.xpath("//ul[@id='TerritoryId_listbox']//li"));


		for(WebElement ele:territory)
		{

			String territoryselect=ele.getText();

			if(territoryselect.equalsIgnoreCase(ExcelUtils.getstringCellData(75, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(75, 5)),75, 7);
		
		ExcelUtils.setCellData("Pass", 75, 8);
		
		System.out.println("Territory is " + (ExcelUtils.getstringCellData(75, 5)));
		
		System.out.println("shipto has " + ExcelUtils.getstringCellData(70, 5) + "as primary Region");
		
		ExcelUtils.setCellData("shipto has  " + (ExcelUtils.getstringCellData(70, 5)) + "as primary Region",70, 7);
		
		ExcelUtils.setCellData("Pass", 70, 8);

		return territoryselect;
	}
	
	public static WebElement blankterritoryselect(WebDriver driver) throws Exception{



		List<WebElement> blankterritory=driver.findElements(By.xpath("//ul[@id='TerritoryId_listbox']//li"));


		for(WebElement ele:blankterritory)
		{

			String blterritoryselect=ele.getText();

			if(blterritoryselect.equalsIgnoreCase(ExcelUtils.getstringCellData(401, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(401, 5)),401, 7);
		
		ExcelUtils.setCellData("Pass", 401, 8);
		
		System.out.println("Territory is " + (ExcelUtils.getstringCellData(401, 5)));
		
		System.out.println("shipto has " + ExcelUtils.getstringCellData(401, 5) + "as primary Region");
		
		ExcelUtils.setCellData("shipto has  " + (ExcelUtils.getstringCellData(401, 5)) + "as primary Region",401, 7);
		
		ExcelUtils.setCellData("Pass", 401, 8);

		return blankterritoryselect;
	}

	public static WebElement regionmapunassign(WebDriver driver) throws Exception{

		regionmapunassign=driver.findElement(By.linkText("Un Assign"));

		return regionmapunassign;
	}


	public static WebElement regionmapautoupdate(WebDriver driver) throws Exception{

		regionmapautoupdate=driver.findElement(By.id(""));

		return regionmapautoupdate;


	}

	public static WebElement defproductload(WebDriver driver) throws Exception{

		defproductload=driver.findElement(By.linkText("Def. Product/Load"));

		return defproductload;


	}

	public static WebElement productdetailsadd(WebDriver driver) throws Exception{

		productdetailsadd=driver.findElement(By.xpath("//div[@id='CustomerShipToProductDefaultsGrid']//a[contains(text(),'Add')]"));

		return productdetailsadd;


	}

	public static WebElement prodetserach(WebDriver driver) throws Exception{

		prodetserach=driver.findElement(By.id("txtSearchProductGrid"));

		return prodetserach;


	}
	public static WebElement Checkproduct(WebDriver driver){

		//Checkproduct=driver.findElement(By.id("txtSearchProductGrid"));

		List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for ( WebElement el : els ) {
			if ( !el.isSelected() ) {
				el.click();
			}
		}

		return Checkproduct;


	}




	public static WebElement prodetallcheck(WebDriver driver) throws Exception{

		prodetallcheck=driver.findElement(By.xpath("//div[@id='ProductWindowGrid']//th//input"));

		return prodetallcheck;


	}

	public static WebElement prodetindvcheck(WebDriver driver) throws Exception{

		prodetindvcheck=driver.findElement(By.xpath(""));

		return prodetindvcheck;


	}

	public static WebElement prodetok(WebDriver driver) throws Exception{

		prodetok=driver.findElement(By.id("btnProdWndOK"));

		return prodetok;


	}

	public static WebElement prodetcancel(WebDriver driver) throws Exception{

		prodetcancel=driver.findElement(By.id(""));

		return prodetcancel;


	}



	public static WebElement estimatevolactive(WebDriver driver) throws Exception{

		estimatevolactive=driver.findElement(By.xpath(""));

		return estimatevolactive;
	}

	public static WebElement estimatevolinsert(WebDriver driver) throws Exception{

		estimatevolinsert=driver.findElement(By.id("DefaultEstimatedVolume"));

		return estimatevolinsert;
	}

	public static WebElement ordertouseactive(WebDriver driver) throws Exception{

		ordertouseactive=driver.findElement(By.xpath(""));

		return ordertouseactive;
	}

	public static WebElement ordertouseclick(WebDriver driver) throws Exception{

		ordertouseclick=driver.findElement(By.xpath(""));

		return ordertouseclick;
	}

	public static WebElement ordertouseforavgdropdownlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Order to Use for Avg. has following dropdown list \n"+e.getText(),31, 8);

			System.out.println("Order to Use for Avg. has following dropdown list \n" + e.getText());

		}

		return ordertouseforavgdropdownlist;

	}

	public static WebElement ordertouseselect(WebDriver driver) throws Exception{



		List<WebElement> ordertouseforavg=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:ordertouseforavg)
		{

			String ordertouseforavgselect=ele.getText();

			if(ordertouseforavgselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Order to Use for Avg. is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Order to Use for Avg. is " + (ExcelUtils.getstringCellData(32, 5)));

		return ordertouseselect;
	}


	public static WebElement monthstouseactive(WebDriver driver) throws Exception{

		monthstouseactive=driver.findElement(By.xpath(""));

		return monthstouseactive;
	}

	public static WebElement monthstouseinsert(WebDriver driver) throws Exception{

		monthstouseinsert=driver.findElement(By.id(""));

		return monthstouseinsert;
	}


	public static WebElement prodetdiv(WebDriver driver) throws Exception{

		prodetdiv=driver.findElement(By.xpath(".//*[@id='tabDefProductLoad']/div/div[1]/fieldset/div[3]"));

		return prodetdiv;
	}


	public static WebElement filter(WebDriver driver) throws Exception{

		filter=driver.findElement(By.xpath("//input[@class='FilterByContracts']"));

		return filter;
	}


	public static WebElement filterok(WebDriver driver) throws Exception{

		filterok=driver.findElement(By.xpath("//div[@id='dvfilterbyContractsformation']//button[contains(text(),'OK')]"));

		return filterok;
	}


	public static WebElement defloadsadd(WebDriver driver) throws Exception{

		defloadsadd=driver.findElement(By.xpath("//*[@id='CustomerShipToProductDefaultLoadPlansGrid_active_cell']/a[1]"));

		return defloadsadd;


	}

	public static WebElement defloadsprodsearch(WebDriver driver) throws Exception{

		defloadsprodsearch=driver.findElement(By.id("txtSearchProductGrid"));

		return defloadsprodsearch;


	}

	public static WebElement defloadsprodcheckall(WebDriver driver) throws Exception{

		defloadsprodcheckall=driver.findElement(By.xpath("//div[@id='ProductWindowGrid']//th//input"));

		return defloadsprodcheckall;


	}

	public static WebElement defloadsprodindvcheck(WebDriver driver) throws Exception{

		defloadsprodindvcheck=driver.findElement(By.xpath("//div[@id='ProductWindowGrid']//th//input"));

		return defloadsprodindvcheck;


	}

	public static WebElement defloadsprodok(WebDriver driver) throws Exception{

		defloadsprodok=driver.findElement(By.id("btnProdWndOK"));

		return defloadsprodok;


	}

	public static WebElement defloadsprodcancel(WebDriver driver) throws Exception{

		defloadsprodcancel=driver.findElement(By.id(""));

		return defloadsprodcancel;


	}

	public static WebElement producttoload(WebDriver driver) throws Exception{

		producttoload=driver.findElement(By.xpath("//div[@id='CustomerShipToProductDefaultLoadPlansGrid']//th//a[@href='#']"));

		return producttoload;


	}

	public static WebElement soldasproduct(WebDriver driver) throws Exception{

		soldasproduct=driver.findElement(By.xpath("//input[@value='...']"));

		return soldasproduct;


	}

	public static WebElement soldasproductlistselect(WebDriver driver) throws Exception{

		String value=ExcelUtils.getstringCellData(89, 5);

		List<WebElement> soldas=driver.findElements(By.xpath("//div[@id='ProductSoldAsWindowGrid']//td[contains(text(),'"+value+"')]"));


		for(WebElement ele:soldas)
		{

			String soldasselect=ele.getText();

			if(soldasselect.equalsIgnoreCase(value))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("soldas Product is " + (ExcelUtils.getstringCellData(89, 5)),89, 8);

		System.out.println("soldas Product is " + (ExcelUtils.getstringCellData(89, 5)));

		return soldasproductlistselect;
	}

	public static WebElement soldasproductok(WebDriver driver) throws Exception{

		soldasproductok=driver.findElement(By.id("btnProdWndOK"));

		return soldasproductok;


	}




	public static WebElement volumecellactive(WebDriver driver) throws Exception{

		volumecellactive=driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[4]"));

		return volumecellactive;


	}

	public static WebElement volume(WebDriver driver) throws Exception{

		volume=driver.findElement(By.id("Volume"));

		return volume;


	}

	public static WebElement terminalcellactive(WebDriver driver) throws Exception{

		terminalcellactive=driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[5]"));

		return terminalcellactive;


	}

	public static WebElement terminalclick(WebDriver driver) throws Exception{

		terminalclick=driver.findElement(By.xpath(""));

		return terminalclick;


	}

	public static List<WebElement> terminalselect(WebDriver driver) throws Exception{



		terminalselect=driver.findElements(By.xpath("//div[@id='TerminalId-list']//input[@aria-owns='TerminalId_listbox']"));

		int ok_size=terminalselect.size();

		Thread.sleep(3000);

		terminalselect.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(101, 5));

		Thread.sleep(3000);

		terminalselect.get(ok_size-1).sendKeys(Keys.ENTER);

		return terminalselect;


	}
	
	public static List<WebElement> editterminalselect(WebDriver driver) throws Exception{



		editterminalselect=driver.findElements(By.xpath("//div[@id='TerminalId-list']//input[@aria-owns='TerminalId_listbox']"));

		int ok_size=editterminalselect.size();

		Thread.sleep(3000);

		editterminalselect.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(172, 5));

		Thread.sleep(3000);

		editterminalselect.get(ok_size-1).sendKeys(Keys.ENTER);

		return editterminalselect;


	}
	public static WebElement suppliercellactive(WebDriver driver) throws Exception{

		suppliercellactive=driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[6]"));

		return suppliercellactive;


	}

	public static WebElement supplierclick(WebDriver driver) throws Exception{

		supplierclick=driver.findElement(By.xpath(""));

		return supplierclick;


	}


	public static WebElement supplierlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(".//*[@id='SupplierId_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Terminal has following Mapped Supplier List \n"+e.getText(),103, 8);

			System.out.println("Terminal has following Mapped Supplier List are \n" + e.getText());

		}

		return supplierlist;

	}


	public static List<WebElement> supplierselect(WebDriver driver) throws Exception{



		supplierselect=driver.findElements(By.xpath("//div[@id='SupplierId-list']//input[@aria-owns='SupplierId_listbox']"));

		int ok_size=supplierselect.size();

		Thread.sleep(3000);

		supplierselect.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(104, 5));

		Thread.sleep(3000);

		supplierselect.get(ok_size-1).sendKeys(Keys.ENTER);

		Thread.sleep(3000);



		return supplierselect;


	}
	
	public static List<WebElement> editsupplierselect(WebDriver driver) throws Exception{



		editsupplierselect=driver.findElements(By.xpath("//div[@id='SupplierId-list']//input[@aria-owns='SupplierId_listbox']"));

		int ok_size=editsupplierselect.size();

		Thread.sleep(3000);

		editsupplierselect.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(173, 5));

		Thread.sleep(3000);

		editsupplierselect.get(ok_size-1).sendKeys(Keys.ENTER);

		Thread.sleep(3000);



		return editsupplierselect;


	}

	public static WebElement vendorcellactive(WebDriver driver) throws Exception{

		vendorcellactive=driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[7]"));

		return vendorcellactive;


	}
	public static WebElement vendorclick(WebDriver driver) throws Exception{

		vendorclick=driver.findElement(By.xpath(""));

		return vendorclick;


	}





	public static WebElement vendorlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath("//ul[@id='VendorId_listbox']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Terminal and Supplier has following Mapped Vendor List \n"+e.getText(),106, 8);

			System.out.println("Terminal and Supplier has following Mapped Vendor List \n" + e.getText());

		}

		return vendorlist;

	}

	public static List<WebElement> vendorselect(WebDriver driver) throws Exception{

		vendorselect=driver.findElements(By.xpath("//div[@id='VendorId-list']//input[@aria-owns='VendorId_listbox']"));


		int ok_size=vendorselect.size();

		Thread.sleep(3000);

		vendorselect.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(107, 5));

		Thread.sleep(3000);

		vendorselect.get(ok_size-1).sendKeys(Keys.ENTER);

		return vendorselect;


	}

	public static List<WebElement> editvendorselect(WebDriver driver) throws Exception{

	 editvendorselect=driver.findElements(By.xpath("//div[@id='VendorId-list']//input[@aria-owns='VendorId_listbox']"));


		int ok_size=editvendorselect.size();

		Thread.sleep(3000);

		editvendorselect.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(174, 5));

		Thread.sleep(3000);

		editvendorselect.get(ok_size-1).sendKeys(Keys.ENTER);

		return editvendorselect;


	}
	
	public static WebElement pincellactive(WebDriver driver) throws Exception{

		pincellactive=driver.findElement(By.xpath("//td[8]"));

		return pincellactive;


	}

	public static WebElement pin(WebDriver driver) throws Exception{

		pin=driver.findElement(By.id("Pin"));

		return pin;

	}


	public static WebElement internaltankidcellactive(WebDriver driver) throws Exception{

		internaltankidcellactive=driver.findElement(By.xpath(""));

		return internaltankidcellactive;


	}

	public static WebElement internaltankid(WebDriver driver) throws Exception{

		internaltankid=driver.findElement(By.id(""));

		return internaltankid;

	}


	public static WebElement find(WebDriver driver) throws Exception{

		find=driver.findElement(By.linkText("Find..."));

		return find;


	}

	public static WebElement contractsearchbox(WebDriver driver) throws Exception{

		contractsearchbox=driver.findElement(By.id("txtSearchContractGrid"));

		return contractsearchbox;


	}



	public static WebElement contractok(WebDriver driver) throws Exception{

		contractok=driver.findElement(By.id("btnContWndOK"));
		
		contractok.click();
		
		Thread.sleep(3000);
		
		

		return contractok;

	}
	

	public static WebElement verifycontract(WebDriver driver) throws Exception{
		

		System.out.println(ExcelUtils.getstringCellData(168, 5) + " Number is selected as Contract for SoldAs Prodcut");
		
		ExcelUtils.setCellData("Contract Number  is " + ExcelUtils.getstringCellData(168, 5),168, 7);
	
		ExcelUtils.setCellData("Pass", 168, 8);	

		return verifycontract;

	}


	public static WebElement contractcancel(WebDriver driver) throws Exception{

		contractcancel=driver.findElement(By.id("btnContWndCancel"));

		return contractcancel;

	}


	public static WebElement contractselect(WebDriver driver) throws Exception{

		contractselect=driver.findElement(By.xpath(".//*[@id='ContractWindowGrid']/div[2]/table/tbody/tr[1]/td[4]"));
		
		

		return contractselect;

	}


	public static WebElement defloadsaddoptionyes(WebDriver driver) throws Exception{

		defloadsaddoptionyes=driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']//button[contains(text(),'Yes')]"));

		return defloadsaddoptionyes;


	}

	public static WebElement defaultloadsaddoption(WebDriver driver) throws Exception{

		defaultloadsaddoption=driver.findElement(By.id("btnAddOptions"));

		return defaultloadsaddoption;


	}

	public static WebElement defaultloadsaddoptionvolumeactive(WebDriver driver) throws Exception{

		defaultloadsaddoptionvolumeactive=driver.findElement(By.xpath(""));

		return defaultloadsaddoptionvolumeactive;


	}

	public static WebElement defaultloadsaddoptionterminalcellactive(WebDriver driver) throws Exception{

		defaultloadsaddoptionterminalcellactive=driver.findElement(By.xpath(""));

		return defaultloadsaddoptionterminalcellactive;


	}



	public static WebElement defaultloadsaddoptionterminalselect(WebDriver driver) throws Exception{



		List<WebElement> terminal=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:terminal)
		{

			String terminalselect=ele.getText();

			if(terminalselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Terminal  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Terminal is " + (ExcelUtils.getstringCellData(32, 5)));

		return defaultloadsaddoptionterminalselect;


	}
	public static WebElement defaultloadsaddoptionsuppliercellactive(WebDriver driver) throws Exception{

		defaultloadsaddoptionsuppliercellactive=driver.findElement(By.xpath(""));

		return defaultloadsaddoptionsuppliercellactive;


	}



	public static WebElement defaultloadsaddoptionsupplierlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Terminal has following Mapped Supplier List \n"+e.getText(),31, 8);

			System.out.println("Terminal has following Mapped Supplier List \n" + e.getText());

		}

		return defaultloadsaddoptionsupplierlist;

	}


	public static WebElement defaultloadsaddoptionsupplierselect(WebDriver driver) throws Exception{



		List<WebElement> supplier=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:supplier)
		{

			String supplierselect=ele.getText();

			if(supplierselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Supplier  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Supplier is " + (ExcelUtils.getstringCellData(32, 5)));

		return defaultloadsaddoptionsupplierselect;


	}

	public static WebElement defaultloadsaddoptionvendorcellactive(WebDriver driver) throws Exception{

		defaultloadsaddoptionvendorcellactive=driver.findElement(By.xpath(""));

		return defaultloadsaddoptionvendorcellactive;


	}



	public static WebElement defaultloadsaddoptionvendorlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(31, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Terminal and Supplier has following Mapped Vendor List \n"+e.getText(),31, 8);

			System.out.println("Terminal and Supplier has following Mapped Vendor List \n" + e.getText());

		}

		return defaultloadsaddoptionvendorlist;

	}

	public static WebElement defaultloadsaddoptionvendorselect(WebDriver driver) throws Exception{

		List<WebElement> vendor=driver.findElements(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));


		for(WebElement ele:vendor)
		{

			String vendorselect=ele.getText();

			if(vendorselect.equalsIgnoreCase(ExcelUtils.getstringCellData(32, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Vendor  is " + (ExcelUtils.getstringCellData(32, 5)),32, 8);

		System.out.println("Vendor is " + (ExcelUtils.getstringCellData(32, 5)));

		return defaultloadsaddoptionvendorselect;


	}

	public static WebElement defaultloadsaddoptionpincellactive(WebDriver driver) throws Exception{

		defaultloadsaddoptionpincellactive=driver.findElement(By.xpath(""));

		return defaultloadsaddoptionpincellactive;


	}



	public static WebElement defaultloadsaddoptioninternaltankidcellactive(WebDriver driver) throws Exception{

		defaultloadsaddoptioninternaltankidcellactive=driver.findElement(By.xpath(""));

		return defaultloadsaddoptioninternaltankidcellactive;


	}
	public static WebElement receivinghours(WebDriver driver) throws Exception{

		receivinghours=driver.findElement(By.linkText("Receiving Hours"));

		return receivinghours;


	}

	public static WebElement receivinghoursadd(WebDriver driver) throws Exception{

		receivinghoursadd=driver.findElement(By.xpath("//div[@id='CustomerShipToRecievingHoursGrid']//a[@class='k-button k-button-icontext k-grid-add SLTheme']"));

		return receivinghoursadd;


	}

	public static WebElement receivinghoursdaystartactive(WebDriver driver) throws Exception{

		receivinghoursdaystartactive=driver.findElement(By.xpath("//div[@id='CustomerShipToRecievingHoursGrid']/div[3]/table/tbody/tr/td[1]"));

		return receivinghoursdaystartactive;


	}
	

	public static WebElement receivinghoursdaystartlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(112, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Day Start has following List \n"+e.getText(),112, 8);

			System.out.println("Day Start has following List  \n" + e.getText());

		}

		return receivinghoursdaystartlist;

	}



	public static List<WebElement> receivinghoursdaystartsearchbox(WebDriver driver) throws Exception{

		receivinghoursdaystartsearchbox=driver.findElements(By.xpath("//div[@id='DayIDFrom-list']//input[@aria-owns='DayIDFrom_listbox']"));

		int ok_size=receivinghoursdaystartsearchbox.size();

		Thread.sleep(3000);

		receivinghoursdaystartsearchbox.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(113, 5));

		Thread.sleep(3000);

		receivinghoursdaystartsearchbox.get(ok_size-1).sendKeys(Keys.ENTER);
		
		System.out.println("Start Day is " + ExcelUtils.getstringCellData(113, 5));
		
		ExcelUtils.setCellData("Pass", 113, 8);

		return receivinghoursdaystartsearchbox;

	}

	public static WebElement receivinghoursstarttimeactive(WebDriver driver) throws Exception{

		receivinghoursstarttimeactive=driver.findElement(By.xpath("//div[@id='CustomerShipToRecievingHoursGrid']/div[3]/table/tbody/tr/td[2]"));

		return receivinghoursstarttimeactive;


	}

	public static WebElement receivinghoursstarttimeinsert(WebDriver driver) throws Exception{

		receivinghoursstarttimeinsert=driver.findElement(By.id("TimeFrom"));

		return receivinghoursstarttimeinsert;


	}

	public static WebElement receivinghoursendtimeactive(WebDriver driver) throws Exception{

		receivinghoursendtimeactive=driver.findElement(By.xpath("//div[@id='CustomerShipToRecievingHoursGrid']/div[3]/table/tbody/tr/td[4]"));

		return receivinghoursendtimeactive;


	}

	public static WebElement receivinghoursdayendclick(WebDriver driver) throws Exception{

		receivinghoursdayendclick=driver.findElement(By.xpath(""));

		return receivinghoursdayendclick;


	}
	
	public static WebElement receivinghoursdayendlist(WebDriver driver) throws Exception{

		By mySelector = By.xpath(ExcelUtils.getstringCellData(117, ColNum));

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			ExcelUtils.setCellData("Day End has following List \n"+e.getText(),117, 8);

			System.out.println("Day End has following List  \n" + e.getText());

		}

		return receivinghoursdayendlist;

	}


	public static List<WebElement> receivinghoursdayendsearchbox(WebDriver driver) throws Exception{

		receivinghoursdayendsearchbox=driver.findElements(By.xpath("//div[@id='DayIDTo-list']//input[@aria-owns='DayIDTo_listbox']"));

		int ok_size=receivinghoursdayendsearchbox.size();

		Thread.sleep(3000);

		receivinghoursdayendsearchbox.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(118, 5));

		Thread.sleep(3000);

		receivinghoursdayendsearchbox.get(ok_size-1).sendKeys(Keys.ENTER);
		
		System.out.println("End Day is " + ExcelUtils.getstringCellData(118, 5));
		
		ExcelUtils.setCellData("Pass", 118, 8);

		return receivinghoursdayendsearchbox;

	}




	public static WebElement receivinghourstarttimeactive(WebDriver driver) throws Exception{

		receivinghourstarttimeactive=driver.findElement(By.xpath("//div[@id='CustomerShipToRecievingHoursGrid']/div[3]/table/tbody/tr/td[2]"));

		return receivinghourstarttimeactive;


	}

	public static WebElement receivinghoursendtimeinsert(WebDriver driver) throws Exception{

		receivinghoursendtimeinsert=driver.findElement(By.id("TimeTo"));

		return receivinghoursendtimeinsert;


	}



	public static WebElement receivinghoursdiv(WebDriver driver) throws Exception{

		receivinghoursdiv=driver.findElement(By.xpath(".//*[@id='tabReceivingHours']/div/div/fieldset"));

		return receivinghoursdiv;


	}



	public static WebElement purchaseorder(WebDriver driver) throws Exception{

		purchaseorder=driver.findElement(By.linkText("Purchase Order"));

		return purchaseorder;


	}

	public static WebElement purchaseorderadd(WebDriver driver) throws Exception{

		purchaseorderadd=driver.findElement(By.xpath("//div[@id='CustomerShipToPurchaseOrdersGrid']//a[@class='k-button k-button-icontext k-grid-add SLTheme']"));

		return purchaseorderadd;


	}
	public static WebElement ponumber(WebDriver driver) throws Exception{

		ponumber=driver.findElement(By.id("PONumber"));

		return ponumber;


	}

	public static WebElement purchaseorderdiv(WebDriver driver) throws Exception{

		purchaseorderdiv=driver.findElement(By.xpath(".//*[@id='tabPurchaseOrder']/div/div/fieldset"));

		return purchaseorderdiv;


	}

	public static WebElement purchaseorderdatefromactive(WebDriver driver) throws Exception{

		purchaseorderdatefromactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(221, ColNum)));

		return purchaseorderdatefromactive;


	}


	public static WebElement purchaseorderdatefromcaliconclick(WebDriver driver) throws Exception{

		purchaseorderdatefromcaliconclick=driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));

		return purchaseorderdatefromcaliconclick;


	}




	public static WebElement purchaseorderdatefromcalmonthhead2(WebDriver driver) throws Exception{


		purchaseorderdatefromcalmonthhead2=driver.findElement(By.xpath("//a[@class='k-link k-nav-fast']"));

		for(int i=0;i<=2;i++){

			purchaseorderdatefromcalmonthhead2.click();

			Thread.sleep(3000);



		}

		return purchaseorderdatefromcalmonthhead2;

	}


	public static WebElement verifyallyearslist(WebDriver driver) throws Exception{

		By mySelector = By.xpath("//div[@class='k-widget k-calendar']//a[@class='k-link']");

		List<WebElement> myElements = driver.findElements(mySelector);

		for(WebElement e : myElements) {

			//ExcelUtils.setCellData("Total years are \n"+e.getText(),225, 8);

			System.out.println("Total Years Are \n" + e.getText());

		}

		return verifyallyearslist;

	}





	public static WebElement datefromselect(WebDriver driver) throws Exception{


		List<WebElement> maxyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:maxyears)

		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(129, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);


				break;
			}

		}

		List<WebElement> allyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));



		for(WebElement ele:allyears)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(130, 5))))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000); 

				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);


				break;
			}

		}




		List<WebElement> allmonths=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:allmonths)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(131, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );

				//Thread.sleep(3000);


				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);


				break;
			}

		}

		/*String date1=ExcelUtils.getstringCellData(126, 5);

		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getstringCellData(126, 5))))


			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);


				break;
			}

		}*/



		return datefromselect;


	}
	
	public static WebElement validdatefromselect(WebDriver driver) throws Exception{


		List<WebElement> maxyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:maxyears)

		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(129, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);


				break;
			}

		}

		List<WebElement> allyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));



		for(WebElement ele:allyears)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(130, 5))))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000); 

				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);


				break;
			}

		}




		List<WebElement> allmonths=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:allmonths)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(131, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );

				//Thread.sleep(3000);


				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);


				break;
			}

		}

		/*String date1=ExcelUtils.getstringCellData(126, 5);

		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getstringCellData(126, 5))))


			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);


				break;
			}

		}*/



		return validdatefromselect;


	}


	public static WebElement selectdatefrom(WebDriver driver) throws Exception{

		String date1=ExcelUtils.getstringCellData(132, 5);

		selectdatefrom=driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		return selectdatefrom;


	}

	public static WebElement validselectdatefrom(WebDriver driver) throws Exception{

		String date1=ExcelUtils.getstringCellData(547, 5);

		validselectdatefrom=driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		return validselectdatefrom;


	}
	public static WebElement datefrom(WebDriver driver) throws Exception{

		datefrom=driver.findElement(By.id("DateFrom"));

		return datefrom;


	}


	public static WebElement activatedateto(WebDriver driver) throws Exception{

		activatedateto=driver.findElement(By.xpath("//div[@id='CustomerShipToPurchaseOrdersGrid']/div[3]/table/tbody/tr/td[3]"));

		return activatedateto;


	}

	public static WebElement selectyeardateto(WebDriver driver) throws Exception{

		//String yearselect=ExcelUtils.getstringCellData(132, 5);

		//selectyeardateto=driver.findElement(By.xpath(ExcelUtils.getstringCellData(132, 5)));

		int ok_size=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a[contains(text(),'2017 - 2019')]")).size();

		driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a[contains(text(),'2017 - 2019')]")).get(ok_size-1).click();

		Thread.sleep(3000);

		return selectyeardateto;
	}



	public static WebElement datetoselect(WebDriver driver) throws Exception{

		List<WebElement> maxyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:maxyears)

		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(135, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);


				break;
			}

		}


		List<WebElement> allyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));



		for(WebElement ele:allyears)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(136, 5))))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000); 

				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);


				break;
			}

		}




		List<WebElement> allmonths=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:allmonths)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(137, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );

				//Thread.sleep(3000);


				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);


				break;
			}

		}

		/*String date1=ExcelUtils.getstringCellData(126, 5);

		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getstringCellData(126, 5))))


			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);


				break;
			}

		}*/


		return datetoselect;


	}
	
	public static WebElement validdatetoselect(WebDriver driver) throws Exception{

		List<WebElement> maxyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:maxyears)

		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(135, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);


				break;
			}

		}


		List<WebElement> allyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));



		for(WebElement ele:allyears)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(136, 5))))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000); 

				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);


				break;
			}

		}




		List<WebElement> allmonths=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:allmonths)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(137, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );

				//Thread.sleep(3000);


				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);


				break;
			}

		}

		/*String date1=ExcelUtils.getstringCellData(126, 5);

		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getstringCellData(126, 5))))


			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);


				break;
			}

		}*/


		return validdatetoselect;


	}

	public static WebElement selectdateto(WebDriver driver) throws Exception{

		String date1=ExcelUtils.getstringCellData(138, 5);

		selectdateto=driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		return selectdateto;


	}
	
	public static WebElement validselectdateto(WebDriver driver) throws Exception{

		String date1=ExcelUtils.getstringCellData(550, 5);

		validselectdateto=driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		return validselectdateto;


	}
	public static WebElement podiv(WebDriver driver) throws Exception{

		podiv=driver.findElement(By.xpath(".//*[@id='tabPurchaseOrder']/div/div/fieldset"));

		return podiv;


	}

	public static WebElement purchaseorderdatefromcalpresentdaylink(WebDriver driver) throws Exception{

		purchaseorderdatefromcalpresentdaylink=driver.findElement(By.xpath(""));

		return purchaseorderdatefromcalpresentdaylink;


	}

	public static WebElement purchaseorderdatetoactive(WebDriver driver) throws Exception{

		purchaseorderdatetoactive=driver.findElement(By.xpath(ExcelUtils.getstringCellData(230, ColNum)));

		return purchaseorderdatetoactive;


	}

	public static WebElement purchaseorderdatetoinsert(WebDriver driver) throws Exception{

		purchaseorderdatetoinsert=driver.findElement(By.id(""));

		return purchaseorderdatetoinsert;


	}

	public static WebElement purchaseorderdatetocaliconclick(WebDriver driver) throws Exception{

		purchaseorderdatetocaliconclick=driver.findElement(By.xpath(ExcelUtils.getstringCellData(231, ColNum)));

		return purchaseorderdatetocaliconclick;


	}

	public static WebElement purchaseorderdatetocalprevicon(WebDriver driver) throws Exception{

		purchaseorderdatetocalprevicon=driver.findElement(By.xpath(""));

		return purchaseorderdatetocalprevicon;


	}

	public static WebElement purchaseorderdatetocalnexticon(WebDriver driver) throws Exception{

		purchaseorderdatetocalnexticon=driver.findElement(By.xpath(""));

		return purchaseorderdatetocalnexticon;


	}

	public static WebElement purchaseorderdatetocalmonthhead(WebDriver driver) throws Exception{

		purchaseorderdatetocalmonthhead=driver.findElement(By.xpath(""));

		return purchaseorderdatetocalmonthhead;


	}


	public static WebElement purchaseorderdatetopresentdaylink(WebDriver driver) throws Exception{

		purchaseorderdatetopresentdaylink=driver.findElement(By.xpath(""));

		return purchaseorderdatetopresentdaylink;


	}



	public static WebElement servicecharges(WebDriver driver) throws Exception{

		servicecharges=driver.findElement(By.linkText(""));

		return servicecharges;


	}

	public static WebElement servicechargesadd(WebDriver driver) throws Exception{

		servicechargesadd=driver.findElement(By.xpath(""));

		return servicechargesadd;


	}

	public static WebElement servicechargesdayclick(WebDriver driver) throws Exception{

		servicechargesdayclick=driver.findElement(By.xpath(""));

		return servicechargesdayclick;


	}

	public static WebElement servicechargesdayselect(WebDriver driver) throws Exception{

		servicechargesdayselect=driver.findElement(By.xpath(""));

		return servicechargesdayselect;


	}

	public static WebElement servicechargesminvoldelactive(WebDriver driver) throws Exception{

		servicechargesminvoldelactive=driver.findElement(By.xpath(""));

		return servicechargesminvoldelactive;


	}

	public static WebElement servicechargesminvoldelinsert(WebDriver driver) throws Exception{

		servicechargesminvoldelinsert=driver.findElement(By.id(""));

		return servicechargesminvoldelinsert;


	}

	public static WebElement servicechargesnonbulkclick(WebDriver driver) throws Exception{

		servicechargesnonbulkclick=driver.findElement(By.xpath(""));

		return servicechargesnonbulkclick;


	}

	public static WebElement servicechargesnonbulksearchbox(WebDriver driver) throws Exception{

		servicechargesnonbulksearchbox=driver.findElement(By.id(""));

		return servicechargesnonbulksearchbox;


	}

	public static WebElement servicechargesnonbulkselect(WebDriver driver) throws Exception{

		servicechargesnonbulkselect=driver.findElement(By.xpath(""));

		return servicechargesnonbulkselect;


	}

	public static WebElement servicechargesnonbulkok(WebDriver driver) throws Exception{

		servicechargesnonbulkok=driver.findElement(By.id(""));

		return servicechargesnonbulkok;


	}

	public static WebElement servicechargesamountactive(WebDriver driver) throws Exception{

		servicechargesamountactive=driver.findElement(By.xpath(""));

		return servicechargesamountactive;


	}

	public static WebElement servicechargesamountinsert(WebDriver driver) throws Exception{

		servicechargesamountinsert=driver.findElement(By.id(""));

		return servicechargesamountinsert;


	}

	public static WebElement servicechargesdatefromactive(WebDriver driver) throws Exception{

		servicechargesdatefromactive=driver.findElement(By.xpath(""));

		return servicechargesdatefromactive;


	}

	public static WebElement servicechargesdatefrominsert(WebDriver driver) throws Exception{

		servicechargesdatefrominsert=driver.findElement(By.id(""));

		return servicechargesdatefrominsert;


	}

	public static WebElement servicechargesdatefromcaliconclick(WebDriver driver) throws Exception{

		servicechargesdatefromcaliconclick=driver.findElement(By.xpath(""));

		return servicechargesdatefromcaliconclick;


	}



	public static WebElement servicechargesdatefromcalpresentdaylink(WebDriver driver) throws Exception{

		servicechargesdatefromcalpresentdaylink=driver.findElement(By.xpath(""));

		return servicechargesdatefromcalpresentdaylink;


	}

	public static WebElement servicechargesdatetoactive(WebDriver driver) throws Exception{

		servicechargesdatetoactive=driver.findElement(By.xpath(""));

		return servicechargesdatetoactive;


	}

	public static WebElement servicechargesdatetoinsert(WebDriver driver) throws Exception{

		servicechargesdatetoinsert=driver.findElement(By.id(""));

		return servicechargesdatetoinsert;


	}

	public static WebElement servicechargesdatetocaliconclick(WebDriver driver) throws Exception{

		servicechargesdatetocaliconclick=driver.findElement(By.xpath(""));

		return servicechargesdatetocaliconclick;


	}





	public static WebElement servicechargesdiv(WebDriver driver){

		servicechargesdiv=driver.findElement(By.xpath(".//*[@id='tabServiceCharges']/div/div/fieldset"));

		return servicechargesdiv;


	}



	public static WebElement save(WebDriver driver) throws Exception{

		save=driver.findElement(By.name("btnCreate"));

		return save;


	}

	public static WebElement verifysavemesage(WebDriver driver) throws Exception{

		verifysavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(140, ColNum)));

		String save_conf_msg=verifysavemesage.getText();

		if(verifysavemesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 140,7);

			ExcelUtils.setCellData("Pass", 140,8);	

			System.out.println(verifysavemesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 140,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifysavemesage;


	}

	
	public static WebElement verifyblanksavemesage(WebDriver driver) throws Exception{

		verifyblanksavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(140, ColNum)));

		String save_conf_msg=verifyblanksavemesage.getText();

		if(verifyblanksavemesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 428,7);

			ExcelUtils.setCellData("Pass", 428,8);	

			System.out.println(verifyblanksavemesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 428,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyblanksavemesage;


	}
	
	public static WebElement verifyinvalidsavemesage(WebDriver driver) throws Exception{

		verifyinvalidsavemesage=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyinvalidsavemesage.getText();

		if(verifyinvalidsavemesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 552,7);

			ExcelUtils.setCellData("Pass", 552,8);	

			System.out.println(verifyinvalidsavemesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 552,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyinvalidsavemesage;


	}
	public static WebElement verifyupdatemesage(WebDriver driver) throws Exception{

		verifyupdatemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(205, ColNum)));

		String save_conf_msg=verifyupdatemesage.getText();

		if(verifyupdatemesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 205,7);

			ExcelUtils.setCellData("Pass", 205,8);	

			System.out.println(verifyupdatemesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 205,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyupdatemesage;


	}
	
	public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{

		closeconfirmationmessage=driver.findElement(By.linkText("×"));

		return closeconfirmationmessage;


	}
	public static WebElement search(WebDriver driver) throws Exception{

		search=driver.findElement(By.id("txtSearchCustomerShipToGrid"));

		return search;

	}

	public static WebElement edit(WebDriver driver) throws Exception{

		edit=driver.findElement(By.linkText("Edit"));

		return edit;

	}

	public static List<WebElement> editstate(WebDriver driver) throws Exception{

		editstate=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_State_listbox']"));

		int ok_size=editstate.size();

		Thread.sleep(3000);

		editstate.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(147, 5));

		Thread.sleep(3000);

		editstate.get(ok_size-1).sendKeys(Keys.ENTER);



		return editstate;

	}

	public static List<WebElement> editnotetype(WebDriver driver) throws Exception{



		List<WebElement> editnotetypeclick=driver.findElements(By.xpath("//ul[@id='NoteTypeDDL_listbox']//li"));


		for(WebElement ele:editnotetypeclick)
		{

			String editnotetypeselect=ele.getText();

			if(editnotetypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(151, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Note Type is " + (ExcelUtils.getstringCellData(151, 5)),151, 8);

		System.out.println("Note Type is " + (ExcelUtils.getstringCellData(151, 5)));

		return editnotetype;

	}

	public static List<WebElement> edittargettype(WebDriver driver) throws Exception{



		List<WebElement> edittargettypeclick=driver.findElements(By.xpath("//ul[@id='NoteTypeDDL_listbox']//li"));


		for(WebElement ele:edittargettypeclick)
		{

			String edittargettypeselect=ele.getText();

			if(edittargettypeselect.equalsIgnoreCase(ExcelUtils.getstringCellData(65, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Note Type is " + (ExcelUtils.getstringCellData(65, 5)),65, 8);

		System.out.println("Note Type is " + (ExcelUtils.getstringCellData(65, 5)));

		return edittargettype;

	}

	public static List<WebElement> editterritory(WebDriver driver) throws Exception{



		List<WebElement> editterritoryclick=driver.findElements(By.xpath("//ul[@id='TerritoryId_listbox']//li"));


		for(WebElement ele:editterritoryclick)
		{

			String editterritoryselect=ele.getText();

			if(editterritoryselect.equalsIgnoreCase(ExcelUtils.getstringCellData(158, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(158, 5)),158, 8);

		System.out.println("Territory is " + (ExcelUtils.getstringCellData(158, 5)));

		return editterritory;
	}
	
	public static List<WebElement> undelterritory(WebDriver driver) throws Exception{



		List<WebElement> undelterritoryclick=driver.findElements(By.xpath("//ul[@id='TerritoryId_listbox']//li"));


		for(WebElement ele:undelterritoryclick)
		{

			String undelterritoryclickselect=ele.getText();

			if(undelterritoryclickselect.equalsIgnoreCase(ExcelUtils.getstringCellData(251, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(158, 5)),158, 8);

		System.out.println("Territory is " + (ExcelUtils.getstringCellData(158, 5)));

		return undelterritory;
	}

	public static List<WebElement> editordertouseavg(WebDriver driver) throws Exception{

		editordertouseavg=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='NumberOfOrdersForAverage_listbox']"));

		int ok_size=editordertouseavg.size();

		Thread.sleep(3000);

		editordertouseavg.get(ok_size-1).sendKeys(String.valueOf(ExcelUtils.getintCellData(161, 5)));

		Thread.sleep(3000);

		editordertouseavg.get(ok_size-1).sendKeys(Keys.ENTER);



		return editordertouseavg;

	}

	public static WebElement editmonthstouseavg(WebDriver driver) throws Exception{

		editmonthstouseavg=driver.findElement(By.id("NumberOfMonthsForAverage"));


		return editmonthstouseavg;

	}


	public static List<WebElement> editreceivinghoursdaystartsearchbox(WebDriver driver) throws Exception{

		editreceivinghoursdaystartsearchbox=driver.findElements(By.xpath("//div[@id='DayIDFrom-list']//input[@aria-owns='DayIDFrom_listbox']"));

		int ok_size=editreceivinghoursdaystartsearchbox.size();

		Thread.sleep(3000);

		editreceivinghoursdaystartsearchbox.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(177, 5));

		Thread.sleep(3000);

		editreceivinghoursdaystartsearchbox.get(ok_size-1).sendKeys(Keys.ENTER);

		return editreceivinghoursdaystartsearchbox;

	}

	public static List<WebElement> editreceivinghoursdayendsearchbox(WebDriver driver) throws Exception{

		editreceivinghoursdayendsearchbox=driver.findElements(By.xpath("//div[@id='DayIDTo-list']//input[@aria-owns='DayIDTo_listbox']"));

		int ok_size=editreceivinghoursdayendsearchbox.size();

		Thread.sleep(3000);

		editreceivinghoursdayendsearchbox.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(179, 5));

		Thread.sleep(3000);

		editreceivinghoursdayendsearchbox.get(ok_size-1).sendKeys(Keys.ENTER);

		return editreceivinghoursdayendsearchbox;

	}

	public static List<WebElement> addnewreceivinghoursdaystartsearchbox(WebDriver driver) throws Exception{

		addnewreceivinghoursdaystartsearchbox=driver.findElements(By.xpath("//div[@id='DayIDFrom-list']//input[@aria-owns='DayIDFrom_listbox']"));

		int ok_size=addnewreceivinghoursdaystartsearchbox.size();

		Thread.sleep(3000);

		addnewreceivinghoursdaystartsearchbox.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(182, 5));

		Thread.sleep(3000);

		addnewreceivinghoursdaystartsearchbox.get(ok_size-1).sendKeys(Keys.ENTER);

		return addnewreceivinghoursdaystartsearchbox;

	}

	public static List<WebElement> addnewreceivinghoursdayendsearchbox(WebDriver driver) throws Exception{

		addnewreceivinghoursdayendsearchbox=driver.findElements(By.xpath("//div[@id='DayIDTo-list']//input[@aria-owns='DayIDTo_listbox']"));

		int ok_size=addnewreceivinghoursdayendsearchbox.size();

		Thread.sleep(3000);

		addnewreceivinghoursdayendsearchbox.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(184, 5));

		Thread.sleep(3000);

		addnewreceivinghoursdayendsearchbox.get(ok_size-1).sendKeys(Keys.ENTER);

		return addnewreceivinghoursdayendsearchbox;

	}

	public static WebElement addnewdatefromselect(WebDriver driver) throws Exception{


		List<WebElement> maxyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:maxyears)

		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(193, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);


				break;
			}

		}

		List<WebElement> allyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));



		for(WebElement ele:allyears)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(194, 5))))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000); 

				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);


				break;
			}

		}




		List<WebElement> allmonths=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:allmonths)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(195, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );

				//Thread.sleep(3000);


				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);


				break;
			}

		}

		/*String date1=ExcelUtils.getstringCellData(126, 5);

		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getstringCellData(126, 5))))


			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);


				break;
			}

		}*/



		return addnewdatefromselect;


	}
	
	public static WebElement addnewselectdatefrom(WebDriver driver) throws Exception{

		String date1=ExcelUtils.getstringCellData(196, 5);

		addnewselectdatefrom=driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		return addnewselectdatefrom;


	}
	
	public static WebElement addnewselectyeardateto(WebDriver driver) throws Exception{

		//String yearselect=ExcelUtils.getstringCellData(132, 5);

		//selectyeardateto=driver.findElement(By.xpath(ExcelUtils.getstringCellData(132, 5)));

		int ok_size=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a[contains(text(),'2018 - 2019')]")).size();

		driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a[contains(text(),'2018 - 2019')]")).get(ok_size-1).click();

		Thread.sleep(3000);

		return addnewselectyeardateto;
	}

	public static WebElement addnewdatetoselect(WebDriver driver) throws Exception{

		List<WebElement> maxyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:maxyears)

		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(200, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Year is in between " + ExcelUtils.getstringCellData(226, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is in between " + ExcelUtils.getstringCellData(226, 5),226,8);


				break;
			}

		}


		List<WebElement> allyears=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));



		for(WebElement ele:allyears)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getintCellData(201, 5))))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000); 

				//System.out.println("The Year is  " + ExcelUtils.getintCellData(227, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Year is  " + ExcelUtils.getintCellData(227, 5),227,8);


				break;
			}

		}




		List<WebElement> allmonths=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//a"));


		for(WebElement ele:allmonths)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(ExcelUtils.getstringCellData(202, 5)))

			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Month is " + ExcelUtils.getstringCellData(228, 5) );

				//Thread.sleep(3000);


				//ExcelUtils.setCellData("The Month is  " + ExcelUtils.getstringCellData(228, 5),228,8);


				break;
			}

		}

		/*String date1=ExcelUtils.getstringCellData(126, 5);

		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(String.valueOf(ExcelUtils.getstringCellData(126, 5))))


			{

				//CustomerShipTo_Methods.verifyallyearslist(driver);

				//Thread.sleep(3000);

				ele.click();

				Thread.sleep(3000);

				//System.out.println("The Date is " + ExcelUtils.getintCellData(229, 5) );

				//Thread.sleep(3000);

				//ExcelUtils.setCellData("The Date is in  " + ExcelUtils.getintCellData(229, 5),229,8);


				break;
			}

		}*/


		return addnewdatetoselect;


	}
	
	public static WebElement addnewselectdateto(WebDriver driver) throws Exception{

		String date1=ExcelUtils.getstringCellData(203, 5);

		addnewselectdateto=driver.findElement(By.xpath("//div[@class='k-widget k-calendar']//td//a[@title='"+date1+"']"));

		return addnewselectdateto;


	}
	
	public static WebElement update(WebDriver driver) throws Exception{

		update=driver.findElement(By.id("btnCreate"));

		return update;
	}

	
	public static WebElement delete(WebDriver driver) throws Exception{

		delete=driver.findElement(By.linkText("Delete"));

		return delete;

	}
	public static WebElement defaultloaddelete(WebDriver driver) throws Exception{

		defaultloaddelete=driver.findElement(By.xpath("//td[13]/a"));

		return defaultloaddelete;

	}

	public static WebElement loaddeleteok(WebDriver driver) throws Exception{

		

		loaddeleteok=driver.findElement(By.xpath("//div[@id='dvDirtyMultiRecordDeleteConfirmation']//button[contains(text(),'OK')]"));

		return loaddeleteok;


	}
	
public static WebElement deleteok(WebDriver driver) throws Exception{

		

		deleteok=driver.findElement(By.xpath("//div[@id='dvDirtyRecordDeleteConfirmation']//button[contains(text(),'OK')]"));

		return deleteok;


	}
	
public static WebElement shiptodeleteok(WebDriver driver) throws Exception{

	

	shiptodeleteok=driver.findElement(By.id("btnConfirmationOK"));

	return shiptodeleteok;


}
public static WebElement deletecancel(WebDriver driver) throws Exception{

		

	deletecancel=driver.findElement(By.xpath("//div[@id='dvDirtyRecordDeleteConfirmation']//button[contains(text(),'Cancel')]"));

		return deletecancel;


	}
	public static WebElement loaddeletealertcontent(WebDriver driver) throws Exception{

		loaddeletealertcontent=driver.findElement(By.id("dvDirtyMultiRecordDeleteConfirmationContent"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(213, 6);

		String actual_conf_msg=loaddeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 213,7);

			ExcelUtils.setCellData("Pass", 213,8);

			System.out.println(loaddeletealertcontent.getText() +" confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 213,8);

			System.out.println(loaddeletealertcontent.getText() +" confirmation message is not displayed and verified");


		}

		return loaddeletealertcontent;


	}
	
	public static WebElement productdeletealertcontent(WebDriver driver) throws Exception{

		productdeletealertcontent=driver.findElement(By.id("dvDirtyRecordDeleteConfirmationContent"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(216, 6);

		String actual_conf_msg=productdeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 216,7);

			ExcelUtils.setCellData("Pass", 216,8);

			System.out.println(productdeletealertcontent.getText() +"confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 216,8);

			System.out.println(productdeletealertcontent.getText() +"confirmation message is not displayed and verified");


		}

		return productdeletealertcontent;


	}
	
	public static WebElement recevinghoursdeletealertcontent(WebDriver driver) throws Exception{

		recevinghoursdeletealertcontent=driver.findElement(By.id("dvDirtyRecordDeleteConfirmationContent"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(220, 6);

		String actual_conf_msg=recevinghoursdeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 220,7);

			ExcelUtils.setCellData("Pass", 220,8);

			System.out.println(recevinghoursdeletealertcontent.getText() +"confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 220,8);

			System.out.println(recevinghoursdeletealertcontent.getText() +"confirmation message is not displayed and verified");


		}

		return recevinghoursdeletealertcontent;


	}
	public static WebElement purchaseorderdeletealertcontent(WebDriver driver) throws Exception{

		purchaseorderdeletealertcontent=driver.findElement(By.id("dvDirtyRecordDeleteConfirmationContent"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(224, 6);

		String actual_conf_msg=purchaseorderdeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 224,7);

			ExcelUtils.setCellData("Pass", 224,8);

			System.out.println(purchaseorderdeletealertcontent.getText() +"confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 224,8);

			System.out.println(purchaseorderdeletealertcontent.getText() +"confirmation message is not displayed and verified");


		}

		return purchaseorderdeletealertcontent;


	}
	
	
	public static WebElement verifydeleteupdationmesage(WebDriver driver) throws Exception{

		verifydeleteupdationmesage=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifydeleteupdationmesage.getText();

		if(verifydeleteupdationmesage.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 227,7);

			ExcelUtils.setCellData("Pass", 227,8);	

			System.out.println(verifydeleteupdationmesage.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 227,8);

			System.out.println(verifydeleteupdationmesage.getText() + " Confirmation message is not displayed");
		}

		return verifysavemesage;


	}
	
	public static WebElement shiptodeletealertcontent(WebDriver driver) throws Exception{

		shiptodeletealertcontent=driver.findElement(By.id("dvDeleteConfirmationContent"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(231, 6);

		String actual_conf_msg=shiptodeletealertcontent.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 231,7);

			ExcelUtils.setCellData("Pass", 231,8);

			System.out.println(shiptodeletealertcontent.getText() +"confirmation message is displayed and verified");


		}else{

			ExcelUtils.setCellData("Fail", 231,8);

			System.out.println(shiptodeletealertcontent.getText() +"confirmation message is not displayed and verified");


		}

		return shiptodeletealertcontent;


	}
	
	public static List<WebElement> delstate(WebDriver driver) throws Exception{

		delstate=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_State_listbox']"));

		int ok_size=delstate.size();

		Thread.sleep(3000);

		delstate.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(158, 5));

		Thread.sleep(3000);

		delstate.get(ok_size-1).sendKeys(Keys.ENTER);

		return delstate;

	}
	
	
	public static List<WebElement> undelstate(WebDriver driver) throws Exception{

		undelstate=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_State_listbox']"));

		int ok_size=undelstate.size();

		Thread.sleep(3000);

		undelstate.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(244, 5));

		Thread.sleep(3000);

		undelstate.get(ok_size-1).sendKeys(Keys.ENTER);

		return undelstate;

	}
	
	public static List<WebElement> alreadyexistedstate(WebDriver driver) throws Exception{

		alreadyexistedstate=driver.findElements(By.xpath("//input[@class='k-textbox'][@aria-owns='BaseCustomerShipTo_State_listbox']"));

		int ok_size=alreadyexistedstate.size();

		Thread.sleep(3000);

		alreadyexistedstate.get(ok_size-1).sendKeys(ExcelUtils.getstringCellData(311, 5));

		Thread.sleep(3000);

		alreadyexistedstate.get(ok_size-1).sendKeys(Keys.ENTER);

		return alreadyexistedstate;

	}
	public static List<WebElement> delterritory(WebDriver driver) throws Exception{



		List<WebElement> delterritoryclick=driver.findElements(By.xpath("//ul[@id='TerritoryId_listbox']//li"));


		for(WebElement ele:delterritoryclick)
		{

			String delterritoryclickselect=ele.getText();

			if(delterritoryclickselect.equalsIgnoreCase(ExcelUtils.getstringCellData(158, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(158, 5)),158, 8);

		System.out.println("Territory is " + (ExcelUtils.getstringCellData(158, 5)));

		return delterritory;
	}
	
	public static WebElement undeletevalidationmessage1(WebDriver driver) throws Exception{

		undeletevalidationmessage1=driver.findElement(By.xpath("//p[contains(text(),'A Customer Ship To with the entered Ship To Acct# and/or Name and/or Customer already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(253, 6);

		String actual_conf_msg=undeletevalidationmessage1.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 253,7);

			ExcelUtils.setCellData("Pass", 253,8);


			System.out.println(undeletevalidationmessage1.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 253,8);

			System.out.println("Undelete Validation message is not displayed");
		}
		return undeletevalidationmessage1;


	}
	
	
	public static WebElement verifyundeleteupdationmesage1(WebDriver driver) throws Exception{

		verifyundeleteupdationmesage1=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyundeleteupdationmesage1.getText();

		if(verifyundeleteupdationmesage1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 255,7);

			ExcelUtils.setCellData("Pass", 255,8);	

			System.out.println(verifyundeleteupdationmesage1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 255,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyundeleteupdationmesage1;


	}
	
	public static WebElement undeletevalidationmessage2(WebDriver driver) throws Exception{

		undeletevalidationmessage2=driver.findElement(By.xpath("//p[contains(text(),'A Customer Ship To with the entered Ship To Acct# and/or Name and/or Customer already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(275, 6);

		String actual_conf_msg=undeletevalidationmessage2.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 275,7);

			ExcelUtils.setCellData("Pass", 275,8);


			System.out.println(undeletevalidationmessage2.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 275,8);

			System.out.println("Undelete Validation message is not displayed");
		}
		return undeletevalidationmessage2;


	}
	
	public static WebElement verifyundeleteupdationmesage2(WebDriver driver) throws Exception{

		verifyundeleteupdationmesage2=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyundeleteupdationmesage2.getText();

		if(verifyundeleteupdationmesage2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 277,7);

			ExcelUtils.setCellData("Pass", 277,8);	

			System.out.println(verifyundeleteupdationmesage2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 277,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyundeleteupdationmesage2;


	}
	
	
	public static WebElement undeletevalidationmessage3(WebDriver driver) throws Exception{

		undeletevalidationmessage3=driver.findElement(By.xpath("//p[contains(text(),'A Customer Ship To with the entered Ship To Acct# and/or Name and/or Customer already exists in a deleted or disabled state. Please select to undelete/activate this record or create a new one.')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(297, 6);

		String actual_conf_msg=undeletevalidationmessage3.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 297,7);

			ExcelUtils.setCellData("Pass", 297,8);


			System.out.println(undeletevalidationmessage3.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 297,8);

			System.out.println("Undelete Validation message is not displayed");
		}
		return undeletevalidationmessage3;


	}
	
	public static WebElement verifyundeleteupdationmesage3(WebDriver driver) throws Exception{

		verifyundeleteupdationmesage3=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyundeleteupdationmesage3.getText();

		if(verifyundeleteupdationmesage3.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 300,7);

			ExcelUtils.setCellData("Pass", 300,8);	

			System.out.println(verifyundeleteupdationmesage3.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 300,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyundeleteupdationmesage3;


	}
	
	public static WebElement alreadyexistedvalidationmessage1(WebDriver driver) throws Exception{

		alreadyexistedvalidationmessage1=driver.findElement(By.xpath("//p[contains(text(),'A Customer Ship To with the entered Ship To Acct# and/or Name and/or Customer already exists. Please edit this one or create a new with unique values.')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(320, 6);

		String actual_conf_msg=alreadyexistedvalidationmessage1.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 320,7);

			ExcelUtils.setCellData("Pass", 320,8);


			System.out.println(alreadyexistedvalidationmessage1.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 320,8);

			System.out.println("alreadyexisted Validation message is not displayed");
		}
		return alreadyexistedvalidationmessage1;


	}
	
	
	public static WebElement verifyalreadyexistedupdationmesage1(WebDriver driver) throws Exception{

		verifyalreadyexistedupdationmesage1=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyalreadyexistedupdationmesage1.getText();

		if(verifyalreadyexistedupdationmesage1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 322,7);

			ExcelUtils.setCellData("Pass", 322,8);	

			System.out.println(verifyalreadyexistedupdationmesage1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 322,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyalreadyexistedupdationmesage1;


	}
	
	public static WebElement alreadyexistedvalidationmessage2(WebDriver driver) throws Exception{

		alreadyexistedvalidationmessage2=driver.findElement(By.xpath("//p[contains(text(),'A Customer Ship To with the entered Ship To Acct# and/or Name and/or Customer already exists. Please edit this one or create a new with unique values.')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(342, 6);

		String actual_conf_msg=alreadyexistedvalidationmessage2.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 342,7);

			ExcelUtils.setCellData("Pass", 342,8);


			System.out.println(alreadyexistedvalidationmessage2.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 342,8);

			System.out.println("alreadyexisted Validation message is not displayed");
		}
		return alreadyexistedvalidationmessage2;


	}
	
	
	public static WebElement verifyalreadyexistedupdationmesage2(WebDriver driver) throws Exception{

		verifyalreadyexistedupdationmesage2=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyalreadyexistedupdationmesage2.getText();

		if(verifyalreadyexistedupdationmesage2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 344,7);

			ExcelUtils.setCellData("Pass", 344,8);	

			System.out.println(verifyalreadyexistedupdationmesage2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 344,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyalreadyexistedupdationmesage2;


	}
	
	public static WebElement alreadyexistedvalidationmessage3(WebDriver driver) throws Exception{

		alreadyexistedvalidationmessage3=driver.findElement(By.xpath("//p[contains(text(),'A Customer Ship To with the entered Ship To Acct# and/or Name and/or Customer already exists. Please edit this one or create a new with unique values.')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(364, 6);

		String actual_conf_msg=alreadyexistedvalidationmessage3.getText();


		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 364,7);

			ExcelUtils.setCellData("Pass", 364,8);


			System.out.println(alreadyexistedvalidationmessage3.getText());


		}

		else{

			ExcelUtils.setCellData("Fail", 364,8);

			System.out.println("alreadyexisted Validation message is not displayed");
		}
		return alreadyexistedvalidationmessage3;


	}
	
	
	public static WebElement verifyalreadyexistedupdationmesage3(WebDriver driver) throws Exception{

		verifyalreadyexistedupdationmesage3=driver.findElement(By.xpath("//div[@class='alert alert-success']//p"));

		String save_conf_msg=verifyalreadyexistedupdationmesage3.getText();

		if(verifyalreadyexistedupdationmesage3.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(verifyalreadyexistedupdationmesage3.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return verifyalreadyexistedupdationmesage3;


	}
	
	public static List<WebElement> alreadyexistedterritory(WebDriver driver) throws Exception{



		List<WebElement> alreadyexistedterritoryclick=driver.findElements(By.xpath("//ul[@id='TerritoryId_listbox']//li"));


		for(WebElement ele:alreadyexistedterritoryclick)
		{

			String alreadyexistedtterritoryclickselect=ele.getText();

			if(alreadyexistedtterritoryclickselect.equalsIgnoreCase(ExcelUtils.getstringCellData(318, 5)))
			{
				ele.click();

				break;
			}

		}

		Thread.sleep(3000);

		ExcelUtils.setCellData("Territory is " + (ExcelUtils.getstringCellData(318, 5)),318, 8);

		System.out.println("Territory is " + (ExcelUtils.getstringCellData(318, 5)));

		return alreadyexistedterritory;
	}

	
	public static WebElement undeletecheckbox(WebDriver driver) throws Exception{

		undeletecheckbox=driver.findElement(By.id("BaseCustomerShipTo_IsRecordActive"));

		return undeletecheckbox;
	}
	
	public static WebElement masteracctalertcontent(WebDriver driver) throws Exception{

		masteracctalertcontent=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=masteracctalertcontent.getText();

		if(masteracctalertcontent.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 373,7);

			ExcelUtils.setCellData("Pass", 373,8);	

			System.out.println(masteracctalertcontent.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 373,8);

			System.out.println("Confirmation message is not displayed");
		}

		return masteracctalertcontent;


	}
	
	public static WebElement blankinputinshiptoacct(WebDriver driver) throws Exception{

		blankinputinshiptoacct=driver.findElement(By.id("BaseCustomerShipTo_NumDesc-error"));

		String save_conf_msg=blankinputinshiptoacct.getText();

		if(blankinputinshiptoacct.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 375,7);

			ExcelUtils.setCellData("Pass", 375,8);	

			System.out.println(blankinputinshiptoacct.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 375,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinshiptoacct;


	}
	
	public static WebElement blankinputincustomer(WebDriver driver) throws Exception{

		blankinputincustomer=driver.findElement(By.id("customerwinstatusalertMessage"));

		String save_conf_msg=blankinputincustomer.getText();

		if(blankinputincustomer.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 377,7);

			ExcelUtils.setCellData("Pass", 377,8);	

			System.out.println(blankinputincustomer.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 377,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputincustomer;


	}
	
	public static WebElement blankinputinname(WebDriver driver) throws Exception{

		blankinputinname=driver.findElement(By.id("BaseCustomerShipTo_NameCode-error"));

		String save_conf_msg=blankinputinname.getText();

		if(blankinputinname.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 379,7);

			ExcelUtils.setCellData("Pass", 379,8);	

			System.out.println(blankinputinname.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 379,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinname;


	}
	
	public static WebElement blankinputinaddress1(WebDriver driver) throws Exception{

		blankinputinaddress1=driver.findElement(By.id("BaseCustomerShipTo_Address1-error"));

		String save_conf_msg=blankinputinaddress1.getText();

		if(blankinputinaddress1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 381,7);

			ExcelUtils.setCellData("Pass", 381,8);	

			System.out.println(blankinputinaddress1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 381,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinaddress1;


	}
	
	public static WebElement blankinputincity(WebDriver driver) throws Exception{

		blankinputincity=driver.findElement(By.id("BaseCustomerShipTo_City-error"));

		String save_conf_msg=blankinputincity.getText();

		if(blankinputincity.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 383,7);

			ExcelUtils.setCellData("Pass", 383,8);	

			System.out.println(blankinputincity.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 383,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputincity;


	}
	
	public static WebElement blankinputinstate(WebDriver driver) throws Exception{

		blankinputinstate=driver.findElement(By.id("BaseCustomerShipTo_State-error"));

		String save_conf_msg=blankinputinstate.getText();

		if(blankinputinstate.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 385,7);

			ExcelUtils.setCellData("Pass", 385,8);	

			System.out.println(blankinputinstate.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 385,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinstate;


	}
	
	public static WebElement blankinputinzip(WebDriver driver) throws Exception{

		blankinputinzip=driver.findElement(By.id("BaseCustomerShipTo_Zip-error"));

		String save_conf_msg=blankinputinzip.getText();

		if(blankinputinzip.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 387,7);

			ExcelUtils.setCellData("Pass", 387,8);	

			System.out.println(blankinputinzip.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 387,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinzip;


	}
	
	public static WebElement blankinputinlatitude(WebDriver driver) throws Exception{

		blankinputinlatitude=driver.findElement(By.id("BaseCustomerShipTo_Lat-error"));

		String save_conf_msg=blankinputinlatitude.getText();

		if(blankinputinlatitude.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 389,7);

			ExcelUtils.setCellData("Pass", 389,8);	

			System.out.println(blankinputinlatitude.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 389,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinlatitude;


	}
	
	public static WebElement blankinputinlongitude(WebDriver driver) throws Exception{

		blankinputinlongitude=driver.findElement(By.id("BaseCustomerShipTo_Lon-error"));

		String save_conf_msg=blankinputinlongitude.getText();

		if(blankinputinlongitude.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 391,7);

			ExcelUtils.setCellData("Pass", 391,8);	

			System.out.println(blankinputinlongitude.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 391,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinlongitude;


	}
	
	public static WebElement atleastoneregionmustbesetprimarymapalert(WebDriver driver) throws Exception{

		atleastoneregionmustbesetprimarymapalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=atleastoneregionmustbesetprimarymapalert.getText();

		if(atleastoneregionmustbesetprimarymapalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 394,7);

			ExcelUtils.setCellData("Pass", 394,8);	

			System.out.println(atleastoneregionmustbesetprimarymapalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 394,8);

			System.out.println("Confirmation message is not displayed");
		}

		return atleastoneregionmustbesetprimarymapalert;


	}
	
	
	
	public static WebElement territorymandatoryalert(WebDriver driver) throws Exception{

		territorymandatoryalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=territorymandatoryalert.getText();

		if(territorymandatoryalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 400,7);

			ExcelUtils.setCellData("Pass", 400,8);	

			System.out.println(territorymandatoryalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 400,8);

			System.out.println("Confirmation message is not displayed");
		}

		return territorymandatoryalert;


	}
	
	public static WebElement blankinputindefaultproduct(WebDriver driver) throws Exception{

		blankinputindefaultproduct=driver.findElement(By.id("statusalertMessage"));

		String save_conf_msg=blankinputindefaultproduct.getText();

		if(blankinputindefaultproduct.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 490,7);

			ExcelUtils.setCellData("Pass", 490,8);	

			System.out.println(blankinputindefaultproduct.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 490,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindefaultproduct;


	}
	
	public static WebElement defaultloadaddproductalert(WebDriver driver) throws Exception{

		defaultloadaddproductalert=driver.findElement(By.id("statusalertMessage"));

		String save_conf_msg=defaultloadaddproductalert.getText();

		if(defaultloadaddproductalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(defaultloadaddproductalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return defaultloadaddproductalert;


	}
	
	public static WebElement blankinputindefaultload(WebDriver driver) throws Exception{

		blankinputindefaultload=driver.findElement(By.id("statusalertMessage"));

		String save_conf_msg=blankinputindefaultload.getText();

		if(blankinputindefaultload.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 498,7);

			ExcelUtils.setCellData("Pass", 498,8);	

			System.out.println(blankinputindefaultload.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 498,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindefaultload;


	}
	
	public static WebElement selectproducttoloadfirstalert(WebDriver driver) throws Exception{

		selectproducttoloadfirstalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=selectproducttoloadfirstalert.getText();

		if(selectproducttoloadfirstalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 501,7);

			ExcelUtils.setCellData("Pass", 501,8);	

			System.out.println(selectproducttoloadfirstalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 501,8);

			System.out.println("Confirmation message is not displayed");
		}

		return selectproducttoloadfirstalert;


	}
	
	public static WebElement blankinputinproductsoldas(WebDriver driver) throws Exception{

		blankinputinproductsoldas=driver.findElement(By.id("soldasstatusAlertMessage"));

		String save_conf_msg=blankinputinproductsoldas.getText();

		if(blankinputinproductsoldas.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 504,7);

			ExcelUtils.setCellData("Pass", 504,8);	

			System.out.println(blankinputinproductsoldas.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 504,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinproductsoldas;


	}
	
	public static WebElement blankinputindefaulloadvol(WebDriver driver) throws Exception{

		blankinputindefaulloadvol=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=blankinputindefaulloadvol.getText();

		if(blankinputindefaulloadvol.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 507,7);

			ExcelUtils.setCellData("Pass", 507,8);	

			System.out.println(blankinputindefaulloadvol.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 507,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindefaulloadvol;


	}
	
	public static WebElement blankinputindefaulloadterminal(WebDriver driver) throws Exception{

		blankinputindefaulloadterminal=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=blankinputindefaulloadterminal.getText();

		if(blankinputindefaulloadterminal.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 511,7);

			ExcelUtils.setCellData("Pass", 511,8);	

			System.out.println(blankinputindefaulloadterminal.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 511,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindefaulloadterminal;


	}
	
	public static WebElement blankinputindefaulloadsupplier(WebDriver driver) throws Exception{

		blankinputindefaulloadsupplier=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=blankinputindefaulloadsupplier.getText();

		if(blankinputindefaulloadsupplier.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 514,7);

			ExcelUtils.setCellData("Pass", 514,8);	

			System.out.println(blankinputindefaulloadsupplier.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 514,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindefaulloadsupplier;


	}
	
	public static WebElement blankinputindefaulloadvendor(WebDriver driver) throws Exception{

		blankinputindefaulloadvendor=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=blankinputindefaulloadvendor.getText();

		if(blankinputindefaulloadvendor.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 516,7);

			ExcelUtils.setCellData("Pass", 516,8);	

			System.out.println(blankinputindefaulloadvendor.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 516,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindefaulloadvendor;


	}
	
	public static WebElement nointernaltanksalert(WebDriver driver) throws Exception{

		nointernaltanksalert=driver.findElement(By.id("dvInternalTankInformationContent"));

		String save_conf_msg=nointernaltanksalert.getText();

		if(nointernaltanksalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(nointernaltanksalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return nointernaltanksalert;


	}
	
	public static WebElement mustselectinternaltankalert(WebDriver driver) throws Exception{

		mustselectinternaltankalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=mustselectinternaltankalert.getText();

		if(mustselectinternaltankalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(mustselectinternaltankalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return mustselectinternaltankalert;


	}
	
	public static WebElement deletedefaulproductalert(WebDriver driver) throws Exception{

		deletedefaulproductalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=deletedefaulproductalert.getText();

		if(deletedefaulproductalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(deletedefaulproductalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return deletedefaulproductalert;


	}
	
	public static WebElement uncheckfilteralert(WebDriver driver) throws Exception{

		uncheckfilteralert=driver.findElement(By.id("dvfilterbyContractsformationContent"));

		String save_conf_msg=uncheckfilteralert.getText();

		if(uncheckfilteralert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 494,7);

			ExcelUtils.setCellData("Pass", 494,8);	

			System.out.println(uncheckfilteralert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 494,8);

			System.out.println("Confirmation message is not displayed");
		}

		return uncheckfilteralert;


	}
	
	public static WebElement blankinputindaystart(WebDriver driver) throws Exception{

		blankinputindaystart=driver.findElement(By.id("DayIDFrom_validationMessage"));

		String save_conf_msg=blankinputindaystart.getText();

		if(blankinputindaystart.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 408,7);

			ExcelUtils.setCellData("Pass", 408,8);	

			System.out.println(blankinputindaystart.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 408,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindaystart;


	}
	
	public static WebElement blankinputinstarttime(WebDriver driver) throws Exception{

		blankinputinstarttime=driver.findElement(By.id("TimeFrom_validationMessage"));

		String save_conf_msg=blankinputinstarttime.getText();

		if(blankinputinstarttime.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 412,7);

			ExcelUtils.setCellData("Pass", 412,8);	

			System.out.println(blankinputinstarttime.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 412,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinstarttime;


	}
	
	public static WebElement alldatamandatoryinrecevinghoursalert(WebDriver driver) throws Exception{

		alldatamandatoryinrecevinghoursalert=driver.findElement(By.id("statusAlertMessage"));

		String save_conf_msg=alldatamandatoryinrecevinghoursalert.getText();

		if(alldatamandatoryinrecevinghoursalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 405,7);

			ExcelUtils.setCellData("Pass", 405,8);	

			System.out.println(alldatamandatoryinrecevinghoursalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 405,8);

			System.out.println("Confirmation message is not displayed");
		}

		return alldatamandatoryinrecevinghoursalert;


	}
	
	public static WebElement blankinputindayend(WebDriver driver) throws Exception{

		blankinputindayend=driver.findElement(By.id("DayIDTo_validationMessage"));

		String save_conf_msg=blankinputindayend.getText();

		if(blankinputindayend.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 415,7);

			ExcelUtils.setCellData("Pass", 415,8);	

			System.out.println(blankinputindayend.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 415,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputindayend;


	}
	
	public static WebElement blankinputinendtime(WebDriver driver) throws Exception{

		blankinputinendtime=driver.findElement(By.id("TimeTo_validationMessage"));

		String save_conf_msg=blankinputinendtime.getText();

		if(blankinputinendtime.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 418,7);

			ExcelUtils.setCellData("Pass", 418,8);	

			System.out.println(blankinputinendtime.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 418,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinendtime;


	}
	
	public static WebElement starttimeexceedendtimealert(WebDriver driver) throws Exception{

		starttimeexceedendtimealert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=starttimeexceedendtimealert.getText();

		if(starttimeexceedendtimealert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 366,7);

			ExcelUtils.setCellData("Pass", 366,8);	

			System.out.println(starttimeexceedendtimealert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 366,8);

			System.out.println("Confirmation message is not displayed");
		}

		return starttimeexceedendtimealert;


	}
	
	public static WebElement duplicatesrecordinreceivinghoursalert(WebDriver driver) throws Exception{

		duplicatesrecordinreceivinghoursalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=duplicatesrecordinreceivinghoursalert.getText();

		if(duplicatesrecordinreceivinghoursalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 531,7);

			ExcelUtils.setCellData("Pass", 531,8);	

			System.out.println(duplicatesrecordinreceivinghoursalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 531,8);

			System.out.println("Confirmation message is not displayed");
		}

		return duplicatesrecordinreceivinghoursalert;


	}
	
	public static WebElement blankinputinponumber(WebDriver driver) throws Exception{

		blankinputinponumber=driver.findElement(By.id("PONumber_validationMessage"));

		String save_conf_msg=blankinputinponumber.getText();

		if(blankinputinponumber.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 425,7);

			ExcelUtils.setCellData("Pass", 425,8);	

			System.out.println(blankinputinponumber.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 425,8);

			System.out.println("Confirmation message is not displayed");
		}

		return blankinputinponumber;


	}
	
	public static WebElement alldatamandatoryinpo(WebDriver driver) throws Exception{

		alldatamandatoryinpo=driver.findElement(By.id("statusAlertMessage"));

		String save_conf_msg=alldatamandatoryinpo.getText();

		if(alldatamandatoryinpo.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 423,7);

			ExcelUtils.setCellData("Pass", 423,8);	

			System.out.println(alldatamandatoryinpo.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 423,8);

			System.out.println("Confirmation message is not displayed");
		}

		return alldatamandatoryinpo;


	}
	
	public static WebElement alreadyexistponumberalert(WebDriver driver) throws Exception{

		alreadyexistponumberalert=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=alreadyexistponumberalert.getText();

		if(alreadyexistponumberalert.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 542,7);

			ExcelUtils.setCellData("Pass", 542,8);	

			System.out.println(alreadyexistponumberalert.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 542,8);

			System.out.println("Confirmation message is not displayed");
		}

		return alreadyexistponumberalert;


	}
	
	public static WebElement invaliddatefromalertinponumber(WebDriver driver) throws Exception{

		invaliddatefromalertinponumber=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=invaliddatefromalertinponumber.getText();

		if(invaliddatefromalertinponumber.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 546,7);

			ExcelUtils.setCellData("Pass", 546,8);	

			System.out.println(invaliddatefromalertinponumber.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 546,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invaliddatefromalertinponumber;


	}
	
	public static WebElement invaliddatetoalertinponumber(WebDriver driver) throws Exception{

		invaliddatetoalertinponumber=driver.findElement(By.id("dvAlertContent"));

		String save_conf_msg=invaliddatetoalertinponumber.getText();

		if(invaliddatetoalertinponumber.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 549,7);

			ExcelUtils.setCellData("Pass", 549,8);	

			System.out.println(invaliddatetoalertinponumber.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 549,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invaliddatetoalertinponumber;


	}
	
	public static WebElement invalidshiptoacct(WebDriver driver) throws Exception{

		invalidshiptoacct=driver.findElement(By.id("BaseCustomerShipTo_NumDesc-error"));

		String save_conf_msg=invalidshiptoacct.getText();

		if(invalidshiptoacct.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 448,7);

			ExcelUtils.setCellData("Pass", 448,8);	

			System.out.println(invalidshiptoacct.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 448,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidshiptoacct;


	}
	
	public static WebElement invalidname(WebDriver driver) throws Exception{

		invalidname=driver.findElement(By.id("BaseCustomerShipTo_NameCode-error"));

		String save_conf_msg=invalidname.getText();

		if(invalidname.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 451,7);

			ExcelUtils.setCellData("Pass", 451,8);	

			System.out.println(invalidname.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 451,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidname;


	}
	
	public static WebElement invalidname2(WebDriver driver) throws Exception{

		invalidname2=driver.findElement(By.id("BaseCustomerShipTo_Name2-error"));

		String save_conf_msg=invalidname2.getText();

		if(invalidname2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 453,7);

			ExcelUtils.setCellData("Pass", 453,8);	

			System.out.println(invalidname2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 453,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidname2;


	}
	
	public static WebElement invalidaddress1(WebDriver driver) throws Exception{

		invalidaddress1=driver.findElement(By.id("BaseCustomerShipTo_Address1-error"));

		String save_conf_msg=invalidaddress1.getText();

		if(invalidaddress1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 455,7);

			ExcelUtils.setCellData("Pass", 455,8);	

			System.out.println(invalidaddress1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 455,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidaddress1;


	}
	
	public static WebElement invalidaddress2(WebDriver driver) throws Exception{

		invalidaddress2=driver.findElement(By.id("BaseCustomerShipTo_Address2-error"));

		String save_conf_msg=invalidaddress2.getText();

		if(invalidaddress2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 457,7);

			ExcelUtils.setCellData("Pass", 457,8);	

			System.out.println(invalidaddress2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 457,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidaddress2;


	}
	
	public static WebElement invalidcity(WebDriver driver) throws Exception{

		invalidcity=driver.findElement(By.id("BaseCustomerShipTo_City-error"));

		String save_conf_msg=invalidcity.getText();

		if(invalidcity.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 459,7);

			ExcelUtils.setCellData("Pass", 459,8);	

			System.out.println(invalidcity.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 459,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidcity;


	}
	
	public static WebElement invalidzip1(WebDriver driver) throws Exception{

		invalidzip1=driver.findElement(By.id("BaseCustomerShipTo_Zip-error"));

		String save_conf_msg=invalidzip1.getText();

		if(invalidzip1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 462,7);

			ExcelUtils.setCellData("Pass", 462,8);	

			System.out.println(invalidzip1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 462,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidzip1;


	}
	
	public static WebElement invalidzip2(WebDriver driver) throws Exception{

		invalidzip2=driver.findElement(By.id("BaseCustomerShipTo_Zip-error"));

		String save_conf_msg=invalidzip2.getText();

		if(invalidzip2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 465,7);

			ExcelUtils.setCellData("Pass", 465,8);	

			System.out.println(invalidzip2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 465,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidzip2;


	}
	
	public static WebElement invalidfaxtoname(WebDriver driver) throws Exception{

		invalidfaxtoname=driver.findElement(By.id("BaseCustomerShipTo_ShipToFaxToName-error"));

		String save_conf_msg=invalidfaxtoname.getText();

		if(invalidfaxtoname.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 467,7);

			ExcelUtils.setCellData("Pass", 467,8);	

			System.out.println(invalidfaxtoname.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 467,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidfaxtoname;


	}
	
	public static WebElement invalidemail1cont1(WebDriver driver) throws Exception{

		invalidemail1cont1=driver.findElement(By.id("BaseCustomerShipTo_ContactEmail-error"));

		String save_conf_msg=invalidemail1cont1.getText();

		if(invalidemail1cont1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 471,7);

			ExcelUtils.setCellData("Pass", 471,8);	

			System.out.println(invalidemail1cont1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 471,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidemail1cont1;


	}
	
	public static WebElement invalidname1cont1(WebDriver driver) throws Exception{

		invalidname1cont1=driver.findElement(By.id("BaseCustomerShipTo_ContactName-error"));

		String save_conf_msg=invalidname1cont1.getText();

		if(invalidname1cont1.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 469,7);

			ExcelUtils.setCellData("Pass", 469,8);	

			System.out.println(invalidname1cont1.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 469,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidname1cont1;


	}
	
	public static WebElement invalidemail2cont2(WebDriver driver) throws Exception{

		invalidemail2cont2=driver.findElement(By.id("BaseCustomerShipTo_ShipToContactEmail2-error"));

		String save_conf_msg=invalidemail2cont2.getText();

		if(invalidemail2cont2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 475,7);

			ExcelUtils.setCellData("Pass", 475,8);	

			System.out.println(invalidemail2cont2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 475,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidemail2cont2;


	}
	
	public static WebElement invalidname2cont2(WebDriver driver) throws Exception{

		invalidname2cont2=driver.findElement(By.id("BaseCustomerShipTo_ShipToContactName2-error"));

		String save_conf_msg=invalidname2cont2.getText();

		if(invalidname2cont2.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 473,7);

			ExcelUtils.setCellData("Pass", 473,8);	

			System.out.println(invalidname2cont2.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 473,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidname2cont2;


	}
	
	public static WebElement invalidlatitude(WebDriver driver) throws Exception{

		invalidlatitude=driver.findElement(By.id("BaseCustomerShipTo_Lat-error"));

		String save_conf_msg=invalidlatitude.getText();

		if(invalidlatitude.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 477,7);

			ExcelUtils.setCellData("Pass", 477,8);	

			System.out.println(invalidlatitude.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 477,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidlatitude;


	}
	
	public static WebElement invalidlongitude(WebDriver driver) throws Exception{

		invalidlongitude=driver.findElement(By.id("BaseCustomerShipTo_Lon-error"));

		String save_conf_msg=invalidlongitude.getText();

		if(invalidlongitude.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 479,7);

			ExcelUtils.setCellData("Pass", 479,8);	

			System.out.println(invalidlongitude.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 479,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidlongitude;


	}
	
	public static WebElement invalidavddeliverytime(WebDriver driver) throws Exception{

		invalidavddeliverytime=driver.findElement(By.id("BaseCustomerShipTo_ShipToAveDeliveryTime-error"));

		String save_conf_msg=invalidavddeliverytime.getText();

		if(invalidavddeliverytime.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 481,7);

			ExcelUtils.setCellData("Pass", 481,8);	

			System.out.println(invalidavddeliverytime.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 481,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidavddeliverytime;


	}
	
	public static WebElement invalidponumber(WebDriver driver) throws Exception{

		invalidponumber=driver.findElement(By.id("PONumber_validationMessage"));

		String save_conf_msg=invalidponumber.getText();

		if(invalidponumber.isDisplayed()){

			ExcelUtils.setCellData(save_conf_msg, 537,7);

			ExcelUtils.setCellData("Pass", 537,8);	

			System.out.println(invalidponumber.getText());
		}
		else{

			ExcelUtils.setCellData("Fail", 537,8);

			System.out.println("Confirmation message is not displayed");
		}

		return invalidponumber;


	}
	
	
	
	
	public static WebElement back(WebDriver driver) throws Exception{

		back=driver.findElement(By.linkText(""));

		return back;
	}

	public static WebElement sort(WebDriver driver){

		sort=driver.findElement(By.linkText(""));

		return sort;


	}

	public static WebElement mainpagenavbuttons(WebDriver driver) throws Exception{

		//Last Page Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-e']")).click();

		Thread.sleep(3000);

		//First page Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-w']")).click();

		Thread.sleep(3000);

		//Next Page Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-e']")).click();

		Thread.sleep(3000);

		//Previous Page Click

		driver.findElement(By.xpath("//span[@class='k-icon k-i-arrow-w']")).click();

		Thread.sleep(3000);

		return mainpagenavbuttons;
	}
}