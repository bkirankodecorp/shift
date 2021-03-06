package Supplier_Subclasses;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CustomerShipTo_Subclasses.screenshot;
import Utility.ExcelUtils;



	



public class Supplier_Methods {
	
	
	private static int ColNum=4;
	
	private static MouseHandler mouse=null;
	
	private static MouseHandler mouse2=null;
	
	private static WebElement create=null;
	
	private static WebElement number=null;
	
	private static WebElement name=null;
	
	private static WebElement terminalmapping=null;
	
	private static WebElement terminalmappingsearchbox=null;
	
	private static WebElement terminalmappingcheckbox=null;
	
	private static WebElement vendormapping=null;
	
	private static WebElement vendormappingsearchbox=null;
	
	private static WebElement vendormappingcheckbox=null;
	
	private static WebElement save=null;
	
	private static WebElement verifysavemesage=null;
	
	private static WebElement closeconfirmationmessage=null;
	
	private static WebElement search=null;
	
	private static WebElement edit=null;
	
	private static WebElement update=null;
	
	private static WebElement verifyupdationmesage=null;
	
	private static WebElement delete=null;
	
	private static WebElement delmsgcont=null;
	
	private static WebElement ok=null;
	
	private static WebElement deleteconfirmedmesssgae=null;
	
	private static WebElement cancel=null;
	
	private static WebElement delmsgconf=null;
	
	private static WebElement undeletevalidationmessage1=null;
	
	private static WebElement verifyundeleteupdationmesage1=null;
	
	private static WebElement undeletevalidationmessage2=null;
	
	private static WebElement verifyundeleteupdationmesage2=null;
	
	private static WebElement undeletevalidationmessage3=null;
	
	private static WebElement undelete=null;
	
	private static WebElement verifyundeleteupdationmesage3=null;
	
	private static WebElement searchforalreadyexistsupplier=null;
	
	private static WebElement alreadyexistfile1=null;
	
	private static WebElement verifyalreadyexistupdationmesage1=null;
	
	private static WebElement alreadyexistfile2=null;
	
	private static WebElement verifyalreadyexistupdationmesage2=null;
	
	private static WebElement alreadyexistfile3=null;
	
	private static WebElement verifyalreadyexistupdationmesage3=null;
	
	private static WebElement blankinputinnumber=null;
	
	private static WebElement blankinputinname=null;
	
	private static WebElement invalidinputinnumber=null;
	
	private static WebElement invalidinputinname=null;
	
	private static WebElement back=null;
	
	private static WebElement sort=null;
	
	private static WebElement pagenavbuttons=null;
	
	
	
	public static MouseHandler mouse(WebDriver driver) throws Exception{
		
		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath(ExcelUtils.getstringCellData(8, ColNum))).size();


		int ok_size1=driver.findElements(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).size();




		action.moveToElement(driver.findElements(By.xpath(ExcelUtils.getstringCellData(8, ColNum))).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		action.moveToElement(driver.findElements(By.xpath(ExcelUtils.getstringCellData(9, ColNum))).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);



		driver.findElement(By.xpath("//a[@href='/SLMain/Supplier/GetAllSuppliers']")).click();

		Thread.sleep(5000);
		
		WebElement mainpage=driver.findElement(By.linkText("Name"));
		
		if(mainpage.isDisplayed()){
			
			
		 	
		ExcelUtils.setCellData("Page is redirected to Supplier", 10,7);
		
		ExcelUtils.setCellData("Pass", 10, 8);
		
		System.out.println("Page is redirected to Supplier Screen");
		
		Thread.sleep(3000);
		
		}
		
		else{
			
			ExcelUtils.setCellData("Page is not redirected to Supplier Screen", 10,8);	
			
			ExcelUtils.setCellData("Fail", 10, 8);
			
		}
		
		
		return mouse;
		
		
	}
	
public static MouseHandler mouse2(WebDriver driver) throws Exception{
		
		WebElement element=driver.findElement(By.xpath(ExcelUtils.getstringCellData(4, ColNum)));
		
		WebElement element1=driver.findElement(By.xpath("//a[@style='padding-left:400px;'][@href='https://www.p2pfuel.com/SLMain/Warehouse/GetAllWarehouses']"));
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(element1).click().build().perform();
		
		
		
		return mouse2;
		
		
	}
	
	public static WebElement create(WebDriver driver) throws Exception{
		
		
		
		create=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		create.click();
		
		
		return create;
		
		
	}
	
	public static WebElement number(WebDriver driver) throws Exception{
		
		number=driver.findElement(By.id(ExcelUtils.getstringCellData(12, ColNum)));
		
		
		return number;
		
		
	}
	
	public static WebElement name(WebDriver driver) throws Exception{
		
		name=driver.findElement(By.id(ExcelUtils.getstringCellData(13, ColNum)));
		
		return name;
		
	}
	
	
	public static WebElement terminalmapping(WebDriver driver) throws Exception{
		
		terminalmapping=driver.findElement(By.linkText(ExcelUtils.getstringCellData(14, ColNum)));
		 
		 return terminalmapping;
		
		
		
	}
	
	
public static WebElement terminalmappingsearchbox(WebDriver driver) throws Exception{
		
	terminalmappingsearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(15, ColNum)));
		
		return terminalmappingsearchbox;
		
		
	}

public static WebElement terminalmappingcheckbox(WebDriver driver) throws Exception{
	
	terminalmappingcheckbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(16, ColNum)));
		
		return terminalmappingcheckbox;
		
		
	}
	

public static WebElement vendormapping(WebDriver driver) throws Exception{
	
	vendormapping=driver.findElement(By.linkText(ExcelUtils.getstringCellData(17, ColNum)));
	 
	 return vendormapping;
	
	
	
}


public static WebElement vendormappingsearchbox(WebDriver driver) throws Exception{
	
	vendormappingsearchbox=driver.findElement(By.id(ExcelUtils.getstringCellData(18, ColNum)));
	
	return vendormappingsearchbox;
	
	
}

public static WebElement vendormappingcheckbox(WebDriver driver) throws Exception{

	vendormappingcheckbox=driver.findElement(By.xpath(ExcelUtils.getstringCellData(19, ColNum)));
	
	return vendormappingcheckbox;
	
	
}
	public static WebElement save(WebDriver driver) throws Exception{
		
		save=driver.findElement(By.id(ExcelUtils.getstringCellData(20, ColNum)));
		
		return save;
		
		
	}
	
	public static WebElement verifysavemesage(WebDriver driver) throws Exception{
		
		verifysavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(21, ColNum)));
		
		String save_conf_msg=verifysavemesage.getText();
		
		if(verifysavemesage.isDisplayed()){
			
			 ExcelUtils.setCellData(save_conf_msg, 21,7);
			 	
			 	ExcelUtils.setCellData("Pass", 21,8);	
			
			System.out.println(verifysavemesage.getText());
			
		}
		
		else{
			
			
			ExcelUtils.setCellData("Fail", 21,8);
			
			System.out.println("Confirmation message is not displayed");
		}
		
		return verifysavemesage;
		
		
	}

	
public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{
		
	closeconfirmationmessage=driver.findElement(By.linkText(ExcelUtils.getstringCellData(22, ColNum)));
		
		return closeconfirmationmessage;
		
		
	}
	
	public static WebElement search(WebDriver driver) throws Exception{
		
		search=driver.findElement(By.id(ExcelUtils.getstringCellData(23, ColNum)));
		
		Thread.sleep(3000);
		
		
		
		return search;
		
	}


public static WebElement edit(WebDriver driver) throws Exception{
	
	edit=driver.findElement(By.linkText(ExcelUtils.getstringCellData(24, ColNum)));
	
	return edit;
	
	
}

public static WebElement update(WebDriver driver) throws Exception{
	
	update=driver.findElement(By.id(ExcelUtils.getstringCellData(32, ColNum)));
	
	return update;
	
	
	
}

public static WebElement verifyupdationmesage(WebDriver driver) throws Exception{
	
	verifyupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(33, ColNum)));
	
	String save_conf_msg=verifyupdationmesage.getText();
	
	if(verifyupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 33,7);
		 	
		 	ExcelUtils.setCellData("Pass", 33,8);	
		
		System.out.println(verifyupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 33,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyupdationmesage;
	
	
}

public static WebElement delete(WebDriver driver) throws Exception{
	
	 delete=driver.findElement(By.linkText(ExcelUtils.getstringCellData(36, ColNum)));
	 
	 return delete;
	
	
	
}

public static WebElement delmsgcont(WebDriver driver) throws Exception{
	
	delmsgcont=driver.findElement(By.id(ExcelUtils.getstringCellData(37, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(37, 6);
	
	String actual_conf_msg=delmsgcont.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 37,7);
	 	
	 	ExcelUtils.setCellData("Pass", 37,8);
		
		System.out.println(delmsgcont.getText());
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 37,8);
		
		System.out.println("message not displayed");
		

	}
	
	return delmsgcont;
	
	
}


public static WebElement ok(WebDriver driver) throws Exception{
	
	ok=driver.findElement(By.id(ExcelUtils.getstringCellData(38, ColNum)));
	
	return ok;
	
	
}
public static WebElement deleteconfirmedmesssgae(WebDriver driver) throws Exception{
	
WebElement element=driver.findElement(By.xpath("//div[@class='k-grid-content']"));
	
	Thread.sleep(3000);
	
	if(element.getSize() != null){
		
		ExcelUtils.setCellData("Supplier Deleted Successfully", 38,7);
	 	
	 	ExcelUtils.setCellData("Pass", 38,8);
		
		System.out.println("Supplier Deleted Successfully");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 38,8);
		
		System.out.println("Supplier is not deleted");
	}
	
	
	return deleteconfirmedmesssgae;
	
	
}

public static WebElement delmsgconf(WebDriver driver) throws Exception{
	
	delmsgconf=driver.findElement(By.xpath(ExcelUtils.getstringCellData(25, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(25, 6);
	
	String actual_conf_msg=delmsgconf.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 25,7);
	 	
	 	ExcelUtils.setCellData("Pass", 25,8);
		
		
		
		System.out.println("Warehouse deleted successfully confirmation message is displayed and verified");
		
		
	}else{
		System.out.println("Warehouse deleted successfully confirmation message not displayed");
		

	}
	
	return delmsgconf;
	
	
}

public static WebElement cancel(WebDriver driver){
	
	cancel=driver.findElement(By.xpath("//div[@id='dvDeleteConfirmation']//button[contains(text(),'Cancel')]"));
	
	
	
	return cancel;
	
	
}

public static WebElement undeletevalidationmessage1(WebDriver driver) throws Exception{
	
	undeletevalidationmessage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(44, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(44, 6);
	
	String actual_conf_msg=undeletevalidationmessage1.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 44,7);
	 	
	 	ExcelUtils.setCellData("Pass", 44,8);
		
		
		System.out.println(undeletevalidationmessage1.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 44,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage1;
	
	
}
public static WebElement verifyundeleteupdationmesage1(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(46, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage1.getText();
	
	if(verifyundeleteupdationmesage1.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 46,7);
		 	
		 	ExcelUtils.setCellData("Pass", 46,8);	
		
		System.out.println(verifyundeleteupdationmesage1.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 46,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage1;
	
	
}

public static WebElement undeletevalidationmessage2(WebDriver driver) throws Exception{
	
	undeletevalidationmessage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(52, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(52, 6);
	
	String actual_conf_msg=undeletevalidationmessage2.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 52,7);
	 	
	 	ExcelUtils.setCellData("Pass", 52,8);
		
		
		System.out.println(undeletevalidationmessage2.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 52,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage2;
	
	
}

public static WebElement verifyundeleteupdationmesage2(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(54, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage2.getText();
	
	if(verifyundeleteupdationmesage2.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 54,7);
		 	
		 	ExcelUtils.setCellData("Pass", 54,8);	
		
		System.out.println(verifyundeleteupdationmesage2.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 54,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage2;
	
	
}
public static WebElement undeletevalidationmessage3(WebDriver driver) throws Exception{
	
	undeletevalidationmessage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(60, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(60, 6);
	
	String actual_conf_msg=undeletevalidationmessage3.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 60,7);
	 	
	 	ExcelUtils.setCellData("Pass", 60,8);
		
		
		System.out.println(undeletevalidationmessage3.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 60,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage3;
	
	
}
public static WebElement undelete(WebDriver driver) throws Exception{
	
	 undelete=driver.findElement(By.id(ExcelUtils.getstringCellData(61, ColNum)));
	 
	 return undelete;
	
	
	
	
}

public static WebElement verifyundeleteupdationmesage3(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(63, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage3.getText();
	
	if(verifyundeleteupdationmesage3.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 63,7);
		 	
		 	ExcelUtils.setCellData("Pass", 63,8);	
		
		System.out.println(verifyundeleteupdationmesage3.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 63,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage3;
	
	
}

public static WebElement searchforalreadyexistsupplier(WebDriver driver) throws Exception{
	
	
WebElement existsupplier=driver.findElement(By.xpath(".//*[@id='SupplierGrid']/div[2]/table/tbody/tr/td[2]"));
	
	if(existsupplier.isDisplayed()){
		
		ExcelUtils.setCellData("Supplier ID "+existsupplier.getText()+" is Already Existed", 65,8);	
		
		
		System.out.println("Supplier ID "+existsupplier.getText()+ " is Already Existed");
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Supplier ID "+existsupplier.getText()+ " is not Existed", 65,8);	
		
		System.out.println("Supplier ID "+existsupplier.getText()+ " is not Existed");
		
	}
	
	Thread.sleep(3000);
	
	
	
	return searchforalreadyexistsupplier;
	
}


public static WebElement alreadyexistfile1(WebDriver driver) throws Exception{
		
		
		
	alreadyexistfile1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(70, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(70, 6);
		
		String actual_conf_msg=alreadyexistfile1.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 70,7);
		 	
		 	ExcelUtils.setCellData("Pass", 70,8);
			
			System.out.println(alreadyexistfile1.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 70,8);
			
			System.out.println(alreadyexistfile1.getText() + "Validation Message is not displayed");
			
			
		}
		
		
		return alreadyexistfile1;
	}
	
public static WebElement verifyalreadyexistupdationmesage1(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(72, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage1.getText();
	
	if(verifyalreadyexistupdationmesage1.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 72,7);
		 	
		 	ExcelUtils.setCellData("Pass", 72,8);	
		
		System.out.println(verifyalreadyexistupdationmesage1.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 72,8);
		
		System.out.println(verifyalreadyexistupdationmesage1.getText() + "Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage1;
	
	
}

public static WebElement alreadyexistfile2(WebDriver driver) throws Exception{
		
		alreadyexistfile2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(78, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(78, 6);
		
		String actual_conf_msg=alreadyexistfile2.getText();
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 78,7);
		 	
		 	ExcelUtils.setCellData("Pass", 78,8);
			
			System.out.println(alreadyexistfile2.getText());
			
			Thread.sleep(3000);
			
			}
		else{
			
			ExcelUtils.setCellData("Fail", 78,8);
			
			System.out.println("Already exisit name validation message is not displayed");
			
			}
		
		
		return alreadyexistfile2;
	}

public static WebElement verifyalreadyexistupdationmesage2(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(80, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage2.getText();
	
	if(verifyalreadyexistupdationmesage2.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 80,7);
		 	
		 	ExcelUtils.setCellData("Pass", 80,8);	
		
		System.out.println(verifyalreadyexistupdationmesage2.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 80,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage2;
	
	
}

public static WebElement alreadyexistfile3(WebDriver driver) throws Exception{
	
	alreadyexistfile3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(86, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(86, 6);
	
	String actual_conf_msg=alreadyexistfile3.getText();
	
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 86,7);
	 	
	 	ExcelUtils.setCellData("Pass", 86,8);
		
		System.out.println(alreadyexistfile3.getText());
		
		Thread.sleep(3000);
		
		}
	else{
		
		ExcelUtils.setCellData("Fail", 86,8);
		
		System.out.println("Already exisit name validation message is not displayed");
		
		}
	
	
	return alreadyexistfile3;
}
	
public static WebElement verifyalreadyexistupdationmesage3(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(90, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage3.getText();
	
	if(verifyalreadyexistupdationmesage3.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 90,7);
		 	
		 	ExcelUtils.setCellData("Pass", 90,8);	
		
		System.out.println(verifyalreadyexistupdationmesage3.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 90,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage3;
	
	
}
public static WebElement blankinputinnumber(WebDriver driver) throws Exception{
	
	blankinputinnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(94, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(94, 6);
	
	String actual_conf_msg=blankinputinnumber.getText();
	
	
	
		
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 94,7);
	 	
	 	ExcelUtils.setCellData("Pass", 94,8);
		
		System.out.println(blankinputinnumber.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 94,8);
		
		System.out.println("Name is required validation message is not verified");
	}
	
	return blankinputinnumber;
	
	
}
	
public static WebElement blankinputinname(WebDriver driver) throws Exception{
		
	blankinputinname=driver.findElement(By.id(ExcelUtils.getstringCellData(96, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(96, 6);
		
		String actual_conf_msg=blankinputinname.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 96,7);
			 	
			 	ExcelUtils.setCellData("Pass", 96,8);	
			 
				System.out.println(blankinputinname.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 96,8);
				
				System.out.println("Description is required validation messgae is not verified");
			}
		 
		 
		
		 return blankinputinname;
		
	}

public static WebElement invalidinputinnumber(WebDriver driver) throws Exception{
	
	invalidinputinnumber=driver.findElement(By.id(ExcelUtils.getstringCellData(103, ColNum)));
	
String excpected_Cong_msg=ExcelUtils.getstringCellData(103, 6);
	
	String actual_conf_msg=invalidinputinnumber.getText();
		
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		 ExcelUtils.setCellData(actual_conf_msg, 103,7);
		 	
		 	ExcelUtils.setCellData("Pass", 103,8);	
		
		
		System.out.println(invalidinputinnumber.getText());
		
}
	
	else{
		
		ExcelUtils.setCellData("Fail", 103,8);
		
		System.out.println("Must not contain special characters validation Message is not displayed and Verified");
	}
	
	
	return invalidinputinnumber;
	
	
}	
	
public static WebElement invalidinputinname(WebDriver driver) throws Exception{
	
	invalidinputinname=driver.findElement(By.id(ExcelUtils.getstringCellData(105, ColNum)));
		
	String excpected_Cong_msg=ExcelUtils.getstringCellData(105, 6);
	
	String actual_conf_msg=invalidinputinname.getText();
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			 ExcelUtils.setCellData(actual_conf_msg, 105,7);
			 	
			 	ExcelUtils.setCellData("Pass", 105,8);	
			
			System.out.println(invalidinputinname.getText());
			
			
			screenshot.CaptureScreenshot(driver);
			
			
			
		}
		
		else{
			
			ExcelUtils.setCellData("Fail", 105,8);
			
			System.out.println("Allows only #-%/.()'validation Message is not displayed and Verified");
		}
		
		return invalidinputinname;
		
		
	}

public static WebElement sort(WebDriver driver){
	
	sort=driver.findElement(By.linkText("Name"));
	
	return sort;
	
	
}
public static WebElement back(WebDriver driver) throws Exception{
	
	back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(98, ColNum)));
	
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
