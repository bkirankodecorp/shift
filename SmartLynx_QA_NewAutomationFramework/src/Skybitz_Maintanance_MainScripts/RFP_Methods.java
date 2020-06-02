package Skybitz_Maintanance_MainScripts;

import java.util.List;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utility.ExcelUtils;

public class RFP_Methods {

	private static MouseHandler createrfpmenu =null;

	private static WebElement create=null;

	private static WebElement rfpname=null;

	private static WebElement slastartdate=null;

	private static WebElement slaenddate=null;

	private static WebElement notes=null;

	private static WebElement round1enddate=null;

	private static WebElement termsandconditions=null;

	private static WebElement equipmentfilling=null;

	private static WebElement addproduct=null;

	private static WebElement productcategoryclick=null;

	private static List<WebElement> productcategoryselect=null;

	private static WebElement productsubcategory1click=null;

	private static List<WebElement> productsubcategory1select=null;

	private static WebElement productsubcatoegory2click=null;

	private static List<WebElement> productsubcategory2select=null;

	private static WebElement genericproductclick=null;

	private static List<WebElement> genericproductselect=null;

	private static WebElement productclick=null;	

	private static List<WebElement> productselect=null;	

	private static WebElement usageperiodclick=null;

	private static List<WebElement> usageperiodselect=null;

	private static WebElement estimatedgalsperperiod=null;

	private static WebElement estimateddeliveriesperperiod=null;

	private static WebElement unittypeclick=null;

	private static List<WebElement> unittypeselect=null;

	private static WebElement unitstobefueled=null;

	private static WebElement additiverequired=null;

	private static WebElement currentroundbenchmarktarget=null;

	private static WebElement update=null;

	private static WebElement editpricingbasis=null;

	private static WebElement pricingbasistypeclick=null;

	private static List<WebElement> pricingbasistypeselect=null;

	private static WebElement countryclick=null;

	private static List<WebElement> countryselect=null;

	private static WebElement stateorprovinceclick=null;

	private static List<WebElement> stateselect=null;

	private static WebElement cityclick=null;

	private static List<WebElement> cityselect=null;

	private static WebElement pricingbasisclick=null;

	private static List<WebElement> pricingbasisselect=null;

	private static WebElement pricebasistimestampclick=null;

	private static List<WebElement> pricebasistimestampselect=null;

	private static WebElement daybasisiclick=null;

	private static List<WebElement> daybasisselect=null;

	private static WebElement indexproductclick=null;

	private static List<WebElement> indexproductselect=null;

	private static WebElement paymentterms=null;

	private static List<WebElement> serviceschedulepatterncheckbox=null;

	private static WebElement deliveryhours=null;

	private static WebElement deliveryhoursto=null;

	private static WebElement settlethrough=null;

	private static WebElement ltlmeteredtank=null;

	private static WebElement tanksize=null;

	private static WebElement ltlproductedit=null;

	private static WebElement ltlpaymentterms=null;

	private static List<WebElement> ltlserviceschedulepatterncheckbox=null;

	private static WebElement ltldeliveryhours=null;

	private static WebElement ltldeliveryhoursto=null;

	private static WebElement ltlsettlethrough=null;

	private static WebElement ftlnonmeteredtank=null;

	private static WebElement ftladdproduct=null;

	private static WebElement ftlproductedit=null;

	private static WebElement ftlpaymentterms=null;

	private static List<WebElement> ftlserviceschedulepatterncheckbox=null;

	private static WebElement ftldeliveryhours=null;

	private static WebElement ftldeliveryhoursto=null;

	private static WebElement ftlsettlethrough=null;

	private static WebElement saveterms=null;

	private static WebElement modifytermssave=null;

	private static WebElement division=null;

	private static List<WebElement> ranking=null;

	private static WebElement allowforwarding=null;

	private static WebElement next=null;
	
	private static WebElement documents=null;

	private static WebElement choosefile=null;

	private static WebElement upload=null;
	
	private static WebElement documentpermissions=null;
	
	private static WebElement documentclose=null;

	private static WebElement notesicon=null;

	private static WebElement notes1=null;

	private static WebElement permissions=null;

	private static WebElement selectuser=null;

	private static WebElement selectusersave=null;



	private static WebElement notessave=null;

	private static WebElement notesclose=null;

	private static List<WebElement> modify=null;

	private static WebElement getsellers=null;

	private static List<WebElement> sellercheckbox=null;
	
	private static List<WebElement> forwardsellercheckbox=null;

	private static WebElement rfpsave=null;

	private static WebElement draftsearchbox=null;

	private static WebElement openrfpsearchbox=null;

	private static WebElement roundenddate=null;

	private static WebElement back=null;

	private static WebElement saveandsend=null;

	private static WebElement saveandsendalertcontent=null;

	private static WebElement saveandsendalertok=null;

	private static WebElement sellerserachbox=null;

	private static WebElement respondtotandc=null;

	private static WebElement freightperdelivery=null;

	private static WebElement fuelsurcharge=null;

	private static WebElement ltlfreightperdelivery=null;

	private static WebElement ltlfuelsurcharge=null;

	private static WebElement ftlfreightperdelivery=null;

	private static WebElement ftlfuelsurcharge=null;

	private static WebElement calculate=null;

	private static WebElement marginpergal=null;

	private static WebElement equipedit=null;

	private static WebElement equippricingbasisedit=null;

	private static WebElement ltledit=null;

	private static WebElement ltlpricingbasisedit=null;

	private static WebElement ftledit=null;

	private static WebElement ftlpricingbasisedit=null;

	private static WebElement respondtermssave=null;

	private static WebElement respondtermssubmit=null;

	private static WebElement rejectrfp=null;

	private static WebElement saverfpdraftseller=null;

	private static WebElement sellerdraftsearchbox=null;

	private static WebElement forwardrfp=null;

	private static WebElement sharerfp=null;

	private static WebElement forwardenddate=null;

	private static WebElement viewworkbench=null;

	private static WebElement publishchangestotandc=null;

	private static WebElement publishtobuyercal=null;
	
	private static WebElement logout=null;
	
	
	private static WebElement firstname=null;
	
	private static WebElement lastname=null;
	
	private static WebElement username=null;
	
	private static WebElement password=null;
	
	private static WebElement email=null;
	
	private static WebElement roles=null;
	
	private static WebElement save=null;
	
	private static WebElement usersearchbox=null;
	
	private static List<WebElement> notificationsettings=null;
	
	private static WebElement addemail=null;
	
	private static WebElement sharerfpemail=null;
	
	private static WebElement sendsharerfp=null;


	public static WebElement firstname(WebDriver driver){

		firstname=driver.findElement(By.id("Firstname"));

		return firstname;


	}
	
	public static WebElement lastname(WebDriver driver){

		lastname=driver.findElement(By.id("Lastname"));

		return lastname;


	}
	
	public static WebElement username(WebDriver driver){

		username=driver.findElement(By.id("Username"));

		return username;


	}
	
	public static WebElement password(WebDriver driver){

		password=driver.findElement(By.id("Password"));

		return password;


	}
	
	public static WebElement email(WebDriver driver){

		email=driver.findElement(By.id("createRFP_Name"));

		return email;


	}

	
	public static WebElement roles(WebDriver driver){

		roles=driver.findElement(By.id("roles"));

		return roles;


	}

	public static WebElement save(WebDriver driver){

		save=driver.findElement(By.id("btnSubmit"));

		return save;


	}

	public static WebElement usersearchbox(WebDriver driver){

		usersearchbox=driver.findElement(By.id("txtSearchUser"));

		return usersearchbox;


	}
	
	public static List<WebElement> notificationsettings(WebDriver driver){

		notificationsettings=driver.findElements(By.xpath("//input[@id='strCheckNotificationSettings']//input[@type='checkbox']"));

		return notificationsettings;


	}


	public static MouseHandler createrfpmenu(WebDriver driver) throws Exception{

		WebElement element=driver.findElement(By.linkText("RFP"));

		WebElement element1=driver.findElement(By.xpath("//a[@href='http://dev.veri-fuel.com:8082/FCH.Main/RFP/ReviewRFP']"));

		Actions action=new Actions(driver);

		action.moveToElement(element).build().perform();

		Thread.sleep(3000);

		//screenshot.CaptureScreenshot(driver);

		action.moveToElement(element1).build().perform();

		Thread.sleep(3000);

		//screenshot.CaptureScreenshot(driver);

		element1.click();

		Thread.sleep(3000);

		//screenshot.CaptureScreenshot(driver);

		if(driver.findElement(By.linkText("Create")).isDisplayed()){

			ExcelUtils.setCellData("Page Redirected to RFP", 10,7);	

			System.out.println("Page Redirected to RFP");

		}

		else
		{

			ExcelUtils.setCellData("Page is not Redirected to RFP", 10,7);	

			System.out.println("Page is not Redirected to RFP");

		}

		return createrfpmenu;


	}



	public static WebElement create(WebDriver driver){

		create=driver.findElement(By.linkText("Create"));

		create.click();


		return create;


	}



	public static WebElement rfpname(WebDriver driver){

		rfpname=driver.findElement(By.id("createRFP_Name"));

		return rfpname;


	}

	public static WebElement slastartdate(WebDriver driver){

		slastartdate=driver.findElement(By.id("createRFP_StartDate"));

		return slastartdate;


	}

	public static WebElement slaenddate(WebDriver driver){

		slaenddate=driver.findElement(By.id("createRFP_EndDate"));

		return slaenddate;


	}


	public static WebElement notes(WebDriver driver){

		notes=driver.findElement(By.id("createRFP_Description"));

		return notes;


	}

	public static WebElement round1enddate(WebDriver driver){

		round1enddate=driver.findElement(By.id("createRFP_RFPEndDate"));

		return round1enddate;


	}

	public static WebElement termsandconditions(WebDriver driver){

		termsandconditions=driver.findElement(By.xpath("//button[@class='btn btn-xs btn-info waves-effect waves-light js-open-modal']"));

		return termsandconditions;


	}

	public static WebElement addproduct(WebDriver driver){

		addproduct=driver.findElement(By.linkText("Add Product"));

		return addproduct;


	}

	public static WebElement productcategoryclick(WebDriver driver){

		productcategoryclick=driver.findElement(By.xpath("//span[@aria-owns='ProductCateId_listbox']//span[contains(text(),'select')]"));

		return productcategoryclick;


	}

	public static List<WebElement> productcategoryselect(WebDriver driver){

		productcategoryselect=driver.findElements(By.xpath("//ul[@id='ProductCateId_listbox']//li"));

		return productcategoryselect;


	}

	public static WebElement productsubcategory1click(WebDriver driver){

		productsubcategory1click=driver.findElement(By.xpath("//span[@aria-owns='SubCategory1_listbox']//span[contains(text(),'select')]"));

		return productsubcategory1click;


	}

	public static List<WebElement> productsubcategory1select(WebDriver driver){

		productsubcategory1select=driver.findElements(By.xpath("//ul[@id='SubCategory1_listbox']//li"));

		return productsubcategory1select;


	}

	public static WebElement productsubcatoegory2click(WebDriver driver){

		productsubcatoegory2click=driver.findElement(By.xpath("//span[@aria-owns='SubCategory2_listbox']//span[contains(text(),'select')]"));

		return productsubcatoegory2click;


	}

	public static List<WebElement> productsubcategory2select(WebDriver driver){

		productsubcategory2select=driver.findElements(By.xpath("//ul[@id='SubCategory2_listbox']//li"));

		return productsubcategory2select;


	}

	public static WebElement genericproductclick(WebDriver driver){

		genericproductclick=driver.findElement(By.xpath("//span[@aria-owns='GenericName_listbox']//span[contains(text(),'select')]"));

		return genericproductclick;


	}

	public static List<WebElement> genericproductselect(WebDriver driver){

		genericproductselect=driver.findElements(By.xpath("//ul[@id='GenericName_listbox']//li"));

		return genericproductselect;


	}

	public static WebElement productclick(WebDriver driver){

		productclick=driver.findElement(By.xpath("//span[@aria-owns='ProductID_listbox']//span[contains(text(),'select')]"));

		return productclick;


	}

	public static List<WebElement> productselect(WebDriver driver){

		productselect=driver.findElements(By.xpath("//ul[@id='ProductID_listbox']//li"));

		return productselect;


	}

	public static WebElement usageperiodclick(WebDriver driver){

		usageperiodclick=driver.findElement(By.xpath("//span[@aria-owns='GallonsPeriod_listbox']//span[contains(text(),'select')]"));

		return usageperiodclick;


	}

	public static List<WebElement> usageperiodselect(WebDriver driver){

		usageperiodselect=driver.findElements(By.xpath("//ul[@id='GallonsPeriod_listbox']//li"));

		return usageperiodselect;


	}

	public static WebElement estimatedgalsperperiod(WebDriver driver){

		estimatedgalsperperiod=driver.findElement(By.id("EstimatedGallons"));

		return estimatedgalsperperiod;


	}

	public static WebElement estimateddeliveriesperperiod(WebDriver driver){

		estimateddeliveriesperperiod=driver.findElement(By.id("DeliveriesPerPeriod"));

		return estimateddeliveriesperperiod;


	}

	public static WebElement unittypeclick(WebDriver driver){

		unittypeclick=driver.findElement(By.xpath("//span[@aria-owns='UnitTypeID_listbox']//span[contains(text(),'select')]"));

		return unittypeclick;


	}

	public static List<WebElement> unittypeselect(WebDriver driver){

		unittypeselect=driver.findElements(By.xpath("//ul[@id='UnitTypeID_listbox']//li"));

		return unittypeselect;


	}

	public static WebElement unitstobefueled(WebDriver driver){

		unitstobefueled=driver.findElement(By.id("EstimatedAssets"));

		return unitstobefueled;


	}

	public static WebElement additiverequired(WebDriver driver){

		additiverequired=driver.findElement(By.id("IsAdditive"));

		return additiverequired;


	}

	public static WebElement currentroundbenchmarktarget(WebDriver driver){

		currentroundbenchmarktarget=driver.findElement(By.id("TargetLow"));

		return currentroundbenchmarktarget;


	}

	public static WebElement update(WebDriver driver){

		update=driver.findElement(By.linkText("Update"));

		return update;


	}

	public static WebElement editpricingbasis(WebDriver driver){

		editpricingbasis=driver.findElement(By.xpath("//*[@id='PriceIndexGrid']/div[3]/table/tbody/tr/td[1]/a"));

		return editpricingbasis;


	}

	public static WebElement pricingbasistypeclick(WebDriver driver){

		pricingbasistypeclick=driver.findElement(By.xpath("//span[@aria-owns='PricingBasisID_listbox']//span[contains(text(),'select')]"));

		return pricingbasistypeclick;


	}

	public static List<WebElement> pricingbasistypeselect(WebDriver driver){

		pricingbasistypeselect=driver.findElements(By.xpath("//ul[@id='PricingBasisID_listbox']//li"));

		return pricingbasistypeselect;


	}

	public static WebElement countryclick(WebDriver driver){

		countryclick=driver.findElement(By.xpath("//span[@aria-owns='CountryID_listbox']//span[contains(text(),'select')]"));

		return countryclick;


	}

	public static List<WebElement> countryselect(WebDriver driver){

		countryselect=driver.findElements(By.xpath("//ul[@id='CountryID_listbox']//li"));

		return countryselect;


	}

	public static WebElement stateorprovinceclick(WebDriver driver){

		stateorprovinceclick=driver.findElement(By.xpath("//span[@aria-owns='StateID_listbox']//span[contains(text(),'select')]"));

		return stateorprovinceclick;


	}

	public static List<WebElement> stateselect(WebDriver driver){

		stateselect=driver.findElements(By.xpath("//ul[@id='StateID_listbox']//li"));

		return stateselect;


	}

	public static WebElement cityclick(WebDriver driver){

		cityclick=driver.findElement(By.xpath("//span[@aria-owns='RackID_listbox']//span[contains(text(),'select')]"));

		return cityclick;


	}

	public static List<WebElement> cityselect(WebDriver driver){

		cityselect=driver.findElements(By.xpath("//ul[@id='RackID_listbox']//li"));

		return cityselect;


	}

	public static WebElement pricingbasisclick(WebDriver driver){

		pricingbasisclick=driver.findElement(By.xpath("//span[@aria-owns='IndexID_listbox']//span[contains(text(),'select')]"));

		return pricingbasisclick;


	}

	public static List<WebElement> pricingbasisselect(WebDriver driver){

		pricingbasisselect=driver.findElements(By.xpath("//ul[@id='IndexID_listbox']//li"));

		return pricingbasisselect;


	}

	public static WebElement pricebasistimestampclick(WebDriver driver){

		pricebasistimestampclick=driver.findElement(By.xpath("//span[@aria-owns='FileType_listbox']//span[contains(text(),'select')]"));

		return pricebasistimestampclick;


	}

	public static List<WebElement> pricebasistimestampselect(WebDriver driver){

		pricebasistimestampselect=driver.findElements(By.xpath("//ul[@id='FileType_listbox']//li"));

		return pricebasistimestampselect;


	}

	public static WebElement daybasisiclick(WebDriver driver){

		daybasisiclick=driver.findElement(By.xpath("//span[@aria-owns='DayBasisID_listbox']//span[contains(text(),'select')]"));

		return daybasisiclick;


	}

	public static List<WebElement> daybasisselect(WebDriver driver){

		daybasisselect=driver.findElements(By.xpath("//ul[@id='DayBasisID_listbox']//li"));

		return daybasisselect;


	}

	public static WebElement indexproductclick(WebDriver driver){

		indexproductclick=driver.findElement(By.xpath("//span[@aria-owns='IndexProductId_listbox']//span[contains(text(),'select')]"));

		return indexproductclick;


	}

	public static List<WebElement> indexproductselect(WebDriver driver){

		indexproductselect=driver.findElements(By.xpath("//ul[@id='IndexProductId_listbox']//li"));

		return indexproductselect;


	}

	public static WebElement paymentterms(WebDriver driver){

		paymentterms=driver.findElement(By.id("price_PaymentTermsID"));

		return paymentterms;


	}

	public static List<WebElement> serviceschedulepatterncheckbox(WebDriver driver){

		serviceschedulepatterncheckbox=driver.findElements(By.xpath("//table[@id='tblService']//input[@type='checkbox']"));

		return serviceschedulepatterncheckbox;


	}

	public static WebElement deliveryhours(WebDriver driver){

		deliveryhours=driver.findElement(By.id("DeliveryHoursFrom"));

		return deliveryhours;


	}

	public static WebElement deliveryhoursto(WebDriver driver){

		deliveryhoursto=driver.findElement(By.id("DeliveryHoursTo"));

		return deliveryhoursto;


	}

	public static WebElement settlethrough(WebDriver driver){

		settlethrough=driver.findElement(By.id("price_BillingAgencyID"));

		return settlethrough;


	}

	public static WebElement ltlmeteredtank(WebDriver driver){

		ltlmeteredtank=driver.findElement(By.linkText("LTL Metered Tank"));

		return ltlmeteredtank;


	}

	public static WebElement equipmentfilling(WebDriver driver){

		equipmentfilling=driver.findElement(By.linkText("EQUIPMENT Fueling"));

		return equipmentfilling;


	}

	public static WebElement tanksize(WebDriver driver){

		tanksize=driver.findElement(By.id("TankSize"));

		return tanksize;


	}

	public static WebElement ltlproductedit(WebDriver driver){

		ltlproductedit=driver.findElement(By.xpath("//*[@id='PriceIndexLTLGrid']/div[3]/table/tbody/tr/td[1]/a"));

		return ltlproductedit;


	}

	public static WebElement ltlpaymentterms(WebDriver driver){

		ltlpaymentterms=driver.findElement(By.id("LTLprice_PaymentTermsID"));

		return ltlpaymentterms;


	}

	public static List<WebElement> ltlserviceschedulepatterncheckbox(WebDriver driver){

		ltlserviceschedulepatterncheckbox=driver.findElements(By.xpath("//table[@id='tblLTLService']//input[@type='checkbox']"));

		return ltlserviceschedulepatterncheckbox;


	}

	public static WebElement ltldeliveryhours(WebDriver driver){

		ltldeliveryhours=driver.findElement(By.id("LTLDeliveryHoursFrom"));

		return ltldeliveryhours;


	}

	public static WebElement ltldeliveryhoursto(WebDriver driver){

		ltldeliveryhoursto=driver.findElement(By.id("LTLDeliveryHoursTo"));

		return ltldeliveryhoursto;


	}

	public static WebElement ltlsettlethrough(WebDriver driver){

		ltlsettlethrough=driver.findElement(By.id("LTLprice_BillingAgencyID"));

		return ltlsettlethrough;


	}


	public static WebElement ftlnonmeteredtank(WebDriver driver){

		ftlnonmeteredtank=driver.findElement(By.linkText("FTL Non-Metered Tank"));

		return ftlnonmeteredtank;


	}

	public static WebElement ftladdproduct(WebDriver driver){

		ftladdproduct=driver.findElement(By.xpath("//a[@href='/FCH.Main/RFP/Products_Read?ProductsFTLGrid-mode=insert']"));

		return ftladdproduct;


	}

	public static WebElement ftlproductedit(WebDriver driver){

		ftlproductedit=driver.findElement(By.xpath("//*[@id='PriceIndexFTLGrid']/div[3]/table/tbody/tr/td[1]/a"));

		return ftlproductedit;


	}

	public static WebElement ftlpaymentterms(WebDriver driver){

		ftlpaymentterms=driver.findElement(By.id("FTLprice_PaymentTermsID"));

		return ftlpaymentterms;


	}

	public static List<WebElement> ftlserviceschedulepatterncheckbox(WebDriver driver){

		ftlserviceschedulepatterncheckbox=driver.findElements(By.xpath("//table[@id='tblFTLService']//input[@type='checkbox']"));

		return ftlserviceschedulepatterncheckbox;


	}

	public static WebElement ftldeliveryhours(WebDriver driver){

		ftldeliveryhours=driver.findElement(By.id("FTLDeliveryHoursFrom"));

		return ftldeliveryhours;


	}

	public static WebElement ftldeliveryhoursto(WebDriver driver){

		ftldeliveryhoursto=driver.findElement(By.id("FTLDeliveryHoursTo"));

		return ftldeliveryhoursto;


	}

	public static WebElement ftlsettlethrough(WebDriver driver){

		ftlsettlethrough=driver.findElement(By.id("FTLprice_BillingAgencyID"));

		return ftlsettlethrough;


	}


	public static WebElement saveterms(WebDriver driver){

		saveterms=driver.findElement(By.id("btnSave"));

		return saveterms;


	}

	public static WebElement modifytermssave(WebDriver driver){

		modifytermssave=driver.findElement(By.id("btnUpdate"));

		return modifytermssave;


	}
	public static WebElement division(WebDriver driver){

		division=driver.findElement(By.id("divisions"));

		return division;


	}

	public static List<WebElement> ranking(WebDriver driver){

		ranking=driver.findElements(By.id("Ranking"));

		return ranking;


	}

	public static WebElement allowforwarding(WebDriver driver){

		allowforwarding=driver.findElement(By.id("createRFP_AllowForwarding"));

		return allowforwarding;


	}

	public static WebElement next(WebDriver driver){

		next=driver.findElement(By.id("btnNext"));

		return next;


	}
	
	public static WebElement documents(WebDriver driver){

		documents=driver.findElement(By.id("btnPopupBrowsFile"));

		return documents;


	}
	
	public static WebElement choosefile(WebDriver driver){

		choosefile=driver.findElement(By.id("ctlUpload"));

		return choosefile;


	}
	
	public static WebElement upload(WebDriver driver){

		upload=driver.findElement(By.id("btnupload"));

		return upload;


	}
	
	public static WebElement documentclose(WebDriver driver){

		documentclose=driver.findElement(By.id("btnFileClose"));

		return documentclose;


	}

	public static WebElement notesicon(WebDriver driver){

		notesicon=driver.findElement(By.id("btnNotes"));

		return notesicon;


	}

	public static WebElement notes1(WebDriver driver){

		notes1=driver.findElement(By.id("Notes"));

		return notes1;


	}

	public static WebElement permissions(WebDriver driver){

		permissions=driver.findElement(By.id("NotePermissionId"));

		return permissions;


	}
	
	public static WebElement documentpermissions(WebDriver driver){

		documentpermissions=driver.findElement(By.id("DocPermissionId"));

		return documentpermissions;


	}

	public static WebElement selectuser(WebDriver driver){

		selectuser=driver.findElement(By.name("checkedFiles"));

		return selectuser;


	}


	public static WebElement selectusersave(WebDriver driver){

		selectusersave=driver.findElement(By.id("btnsellerswndSave"));

		return selectusersave;


	}

	public static WebElement notessave(WebDriver driver){

		notessave=driver.findElement(By.id("btnNotesSave"));

		return notessave;


	}

	public static WebElement notesclose(WebDriver driver){

		notesclose=driver.findElement(By.id("btnNotesClose"));

		return notesclose;


	}
	public static List<WebElement> modify(WebDriver driver){

		modify=driver.findElements(By.xpath("//*[@id='CustomerGrid']/div[2]/table/tbody/tr[1]/td[9]/a"));

		return modify;


	}

	public static WebElement getsellers(WebDriver driver){

		getsellers=driver.findElement(By.id("btnGetVendor"));

		return getsellers;


	}

	public static List<WebElement> sellercheckbox(WebDriver driver){

		sellercheckbox=driver.findElements(By.xpath("//div[@id='checkboxContainer']//input[@type='checkbox']"));

		return sellercheckbox;


	}
	
	public static List<WebElement> forwardsellercheckbox(WebDriver driver){

		forwardsellercheckbox=driver.findElements(By.xpath("//div[@id='checkboxContainer']//input[@type='checkbox']"));

		return forwardsellercheckbox;


	}

	public static WebElement rfpsave(WebDriver driver){

		rfpsave=driver.findElement(By.id("btnsavesubmit"));

		return rfpsave;


	}

	public static WebElement draftsearchbox(WebDriver driver){

		draftsearchbox=driver.findElement(By.id("draftRFPSearch"));

		return draftsearchbox;


	}

	public static WebElement openrfpsearchbox(WebDriver driver){

		openrfpsearchbox=driver.findElement(By.id("txtSearch"));

		return openrfpsearchbox;


	}

	public static WebElement roundenddate(WebDriver driver){

		roundenddate=driver.findElement(By.id("createRFP_RFPEndDate"));

		return roundenddate;


	}

	public static WebElement back(WebDriver driver){

		back=driver.findElement(By.linkText("Back"));

		return back;


	}

	public static WebElement saveandsend(WebDriver driver){

		saveandsend=driver.findElement(By.id("btnsubmit"));

		return saveandsend;


	}

	public static WebElement saveandsendalertcontent(WebDriver driver) throws Exception{

		saveandsendalertcontent=driver.findElement(By.id("divpopupmessages"));

		return saveandsendalertcontent;


	}

	public static WebElement saveandsendalertok(WebDriver driver){

		saveandsendalertok=driver.findElement(By.id("btnOK"));

		return saveandsendalertok;


	}

	public static WebElement sellerserachbox(WebDriver driver) throws Exception{

		sellerserachbox=driver.findElement(By.id("txtSearch"));

		return sellerserachbox;


	}

	public static WebElement respondtotandc(WebDriver driver) throws Exception{

		respondtotandc=driver.findElement(By.xpath("//button[@class='btn btn-xs btn-info btn-back waves-effect waves-light js-open-modal termsandconditions rfp-btn']"));

		return respondtotandc;


	}

	public static WebElement freightperdelivery(WebDriver driver) throws Exception{

		freightperdelivery=driver.findElement(By.id("Terms_FreightPerDelivery"));

		return freightperdelivery;


	}

	public static WebElement fuelsurcharge(WebDriver driver) throws Exception{

		fuelsurcharge=driver.findElement(By.id("Terms_FuelSurchargeRate"));

		return fuelsurcharge;


	}

	public static WebElement ltlfreightperdelivery(WebDriver driver) throws Exception{

		ltlfreightperdelivery=driver.findElement(By.id("LTLTerms_FreightPerDelivery"));

		return ltlfreightperdelivery;


	}

	public static WebElement ltlfuelsurcharge(WebDriver driver) throws Exception{

		ltlfuelsurcharge=driver.findElement(By.id("LTLTerms_FuelSurchargeRate"));

		return ltlfuelsurcharge;


	}

	public static WebElement ftlfreightperdelivery(WebDriver driver) throws Exception{

		ftlfreightperdelivery=driver.findElement(By.id("FTLTerms_FreightPerDelivery"));

		return ftlfreightperdelivery;


	}

	public static WebElement ftlfuelsurcharge(WebDriver driver) throws Exception{

		ftlfuelsurcharge=driver.findElement(By.id("FTLTerms_FuelSurchargeRate"));

		return ftlfuelsurcharge;


	}

	public static WebElement calculate(WebDriver driver) throws Exception{

		calculate=driver.findElement(By.id("btnCalculate"));

		return calculate;


	}

	public static WebElement marginpergal(WebDriver driver) throws Exception{

		marginpergal=driver.findElement(By.id("MarginPerGallon"));

		return marginpergal;


	}

	public static WebElement equipedit(WebDriver driver) throws Exception{

		equipedit=driver.findElement(By.xpath("//div[@id='ProductsGrid']//a"));

		return equipedit;


	}


	public static WebElement equippricingbasisedit(WebDriver driver) throws Exception{

		equippricingbasisedit=driver.findElement(By.xpath("//div[@id='PriceIndexGrid']//a"));

		return equippricingbasisedit;


	}


	public static WebElement ltledit(WebDriver driver) throws Exception{

		ltledit=driver.findElement(By.xpath("//div[@id='ProductsLTLGridModify']//a"));

		return ltledit;


	}


	public static WebElement ltlpricingbasisedit(WebDriver driver) throws Exception{

		ltlpricingbasisedit=driver.findElement(By.xpath("//div[@id='PriceIndexLTLGrid']//a"));

		return ltlpricingbasisedit;


	}


	public static WebElement ftledit(WebDriver driver) throws Exception{

		ftledit=driver.findElement(By.xpath("//div[@id='ProductsFTLGridModify']//a"));

		return ftledit;


	}


	public static WebElement ftlpricingbasisedit(WebDriver driver) throws Exception{

		ftlpricingbasisedit=driver.findElement(By.xpath("//div[@id='PriceIndexFTLGrid']//a"));

		return ftlpricingbasisedit;


	}

	public static WebElement respondtermssave(WebDriver driver) throws Exception{

		respondtermssave=driver.findElement(By.id("btnSave"));

		return respondtermssave;


	}

	public static WebElement respondtermssubmit(WebDriver driver) throws Exception{

		respondtermssubmit=driver.findElement(By.id("btnAccept"));

		return respondtermssubmit;


	}

	public static WebElement saverfpdraftseller(WebDriver driver) throws Exception{

		saverfpdraftseller=driver.findElement(By.id("btnDraft"));

		return saverfpdraftseller;


	}



	public static WebElement rejectrfp(WebDriver driver) throws Exception{

		rejectrfp=driver.findElement(By.id("btnReject"));

		return rejectrfp;


	}

	public static WebElement sellerdraftsearchbox(WebDriver driver) throws Exception{

		sellerdraftsearchbox=driver.findElement(By.id("MarginPerGallon"));

		return sellerdraftsearchbox;


	}


	public static WebElement viewworkbench(WebDriver driver) throws Exception{

		viewworkbench=driver.findElement(By.id("viewwork"));

		return viewworkbench;


	}

	public static WebElement publishchangestotandc(WebDriver driver) throws Exception{

		publishchangestotandc=driver.findElement(By.id("Terms_IsSellerPublishtoNxtRnd"));

		return publishchangestotandc;


	}

	public static WebElement publishtobuyercal(WebDriver driver) throws Exception{

		publishtobuyercal=driver.findElement(By.id("Terms_IsPublishtoBuyerWB"));

		return publishtobuyercal;


	}


	public static WebElement forwardrfp(WebDriver driver) throws Exception{

		forwardrfp=driver.findElement(By.xpath("//a[@class='clsfwd btn btn-option btn-back btn-xs waves-effect waves-light btn-forward']"));

		return forwardrfp;


	}

	public static WebElement sharerfp(WebDriver driver) throws Exception{

		sharerfp=driver.findElement(By.xpath("//a[@class='btn btn-share btn-back btn-xs waves-effect waves-light btn-option']"));

		return sharerfp;


	}


	public static WebElement sharerfpemail(WebDriver driver) throws Exception{

		sharerfpemail=driver.findElement(By.name("DynamicTextBox"));

		return sharerfpemail;


	}
	

	public static WebElement sendsharerfp(WebDriver driver) throws Exception{

		sendsharerfp=driver.findElement(By.id("btnSend"));

		return sendsharerfp;


	}

	public static WebElement addemail(WebDriver driver) throws Exception{

		addemail=driver.findElement(By.id("btnAdd"));

		return addemail;


	}

	public static WebElement forwardenddate(WebDriver driver) throws Exception{

		forwardenddate=driver.findElement(By.id("createRFP_ForwardEndDate"));

		return forwardenddate;


	}
	
	public static WebElement logout(WebDriver driver) throws Exception{

		logout=driver.findElement(By.id("//a[@href='http://dev.fuelclearinghouse.com:8082/FCH.Main/Account/Logout']"));

		return logout;


	}



}
