package Warehouse_Subclasses;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;



	



public class Warehouse_Methods {
	
	
	private static int ColNum=4;
	
	private static MouseHandler mouse=null;
	
	private static MouseHandler mouse2=null;
	
	private static WebElement create=null;
	
	private static WebElement name=null;
	
	private static WebElement description=null;
	
	private static WebElement save=null;
	
	private static WebElement verifysavemesage=null;
	
	private static WebElement closeconfirmationmessage=null;
	
	private static WebElement search=null;
	
	private static WebElement searchforalreadyexistwarehouse=null;
	
	private static WebElement edit=null;
	
	private static WebElement update=null;
	
	private static WebElement verifyupdationmesage=null;
	
	private static WebElement delete=null;
	
	private static WebElement ok=null;
	
	private static WebElement cancel=null;
	
	private static WebElement delmsg=null;
	
	private static WebElement delmsgconf=null;
	
	private static WebElement undelerrormsg=null;
	
	private static WebElement undelete=null;
	
	private static WebElement verifyundeleteupdationmesage1=null;
	
	private static WebElement verifyundeleteupdationmesage2=null;
	
	private static WebElement alreadyexistfile=null;
	
	private static WebElement verifyalreadyexistupdationmesage=null;
	
	private static WebElement blankinputname=null;
	
	private static WebElement blankinputdes=null;
	
	private static WebElement invalidnameinput=null;
	
	private static WebElement invaliddesinput=null;
	
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
		
		return mouse;
		
		
	}
	
public static MouseHandler mouse2(WebDriver driver) throws Exception{
		
		WebElement element=driver.findElement(By.xpath(ExcelUtils.getstringCellData(8, ColNum)));
		
		WebElement element1=driver.findElement(By.xpath("//a[@href='/SLMain/Warehouse/GetAllWarehouses']"));
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(element1).click().build().perform();
		
		
		
		return mouse2;
		
		
	}
	
	public static WebElement create(WebDriver driver) throws Exception{
		
		
		
		create=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		create.click();
		
		
		return create;
		
		
	}
	
	public static WebElement name(WebDriver driver) throws Exception{
		
		name=driver.findElement(By.id(ExcelUtils.getstringCellData(12, ColNum)));
		
		
		return name;
		
		
	}
	
	public static WebElement description(WebDriver driver) throws Exception{
		
		description=driver.findElement(By.id(ExcelUtils.getstringCellData(13, ColNum)));
		
		return description;
		
	}
	
	
	
	public static WebElement save(WebDriver driver) throws Exception{
		
		save=driver.findElement(By.id(ExcelUtils.getstringCellData(14, ColNum)));
		
		return save;
		
		
	}
	
public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{
		
	closeconfirmationmessage=driver.findElement(By.linkText(ExcelUtils.getstringCellData(16, ColNum)));
		
		return closeconfirmationmessage;
		
		
	}
	
	public static WebElement search(WebDriver driver) throws Exception{
		
		search=driver.findElement(By.id(ExcelUtils.getstringCellData(17, ColNum)));
		
		Thread.sleep(3000);
		
		
		
		
		return search;
		
	}
public static WebElement searchforalreadyexistwarehouse(WebDriver driver) throws Exception{
		
		
		WebElement existwarehouse=driver.findElement(By.xpath(".//*[@id='WarehouseGrid']/div[2]/table/tbody/tr/td[1]"));
			
			if(existwarehouse.isDisplayed()){
				
				ExcelUtils.setCellData("warehouse Name "+existwarehouse.getText()+" is Already Existed", 44,8);	
				
				
				System.out.println("warehouse Name "+existwarehouse.getText()+ " is Already Existed");
				
				
			}
			
			else{
				
				ExcelUtils.setCellData("warehouse Name "+existwarehouse.getText()+ " is not Existed", 44,8);	
				
				System.out.println("warehouse Name "+existwarehouse.getText()+ " is not Existed");
				
			}
			
			Thread.sleep(3000);
			
			
			
			return searchforalreadyexistwarehouse;
			
		}


public static WebElement edit(WebDriver driver) throws Exception{
	
	edit=driver.findElement(By.linkText(ExcelUtils.getstringCellData(18, ColNum)));
	
	return edit;
	
	
}

public static WebElement update(WebDriver driver) throws Exception{
	
	update=driver.findElement(By.id(ExcelUtils.getstringCellData(20, ColNum)));
	
	return update;
	
	
	
}

public static WebElement delete(WebDriver driver) throws Exception{
	
	 delete=driver.findElement(By.linkText(ExcelUtils.getstringCellData(24, ColNum)));
	 
	 return delete;
	
	
	
}

public static WebElement delmsgconf(WebDriver driver) throws Exception{
	
	delmsgconf=driver.findElement(By.id(ExcelUtils.getstringCellData(25, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(25, 6);
	
	String actual_conf_msg=delmsgconf.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 25,7);
	 	
	 	ExcelUtils.setCellData("Pass", 25,8);
		
		System.out.println("Are you sure you want to delete this Warehouse? confirmation message is displayed and verified");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 25,8);
		
		System.out.println("message not displayed");
		

	}
	
	return delmsgconf;
	
	
}


public static WebElement ok(WebDriver driver) throws Exception{
	
	ok=driver.findElement(By.id(ExcelUtils.getstringCellData(26, ColNum)));
	
	WebElement element=driver.findElement(By.xpath("//div[@class='k-grid-content']"));
	
	Thread.sleep(3000);
	
	if(element.getSize() != null){
		
		ExcelUtils.setCellData("Warehouse Deleted Successfully", 26,7);
	 	
	 	ExcelUtils.setCellData("Pass", 26,8);
		
		System.out.println("Warehouse Deleted Successfully");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 26,8);
		
		System.out.println("warehouse is not deleted");
	}
	
	
	
	
	return ok;
	
	
}
public static WebElement delmsg(WebDriver driver) throws Exception{
	
	delmsg=driver.findElement(By.xpath(ExcelUtils.getstringCellData(26, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(26, 6);
	
	String actual_conf_msg=delmsgconf.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 26,7);
	 	
	 	ExcelUtils.setCellData("Pass", 26,8);
		
		
		
		System.out.println("Warehouse deleted successfully confirmation message is displayed and verified");
		
		
	}else{
		System.out.println("Warehouse deleted successfully confirmation message not displayed");
		

	}
	
	return delmsg;
	
	
}

public static WebElement cancel(WebDriver driver){
	
	cancel=driver.findElement(By.xpath("//div[@id='dvDeleteConfirmation']//button[contains(text(),'Cancel')]"));
	
	
	
	return cancel;
	
	
}

public static WebElement undelerrormsg(WebDriver driver) throws Exception{
	
	undelerrormsg=driver.findElement(By.xpath(ExcelUtils.getstringCellData(33, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(33, 6);
	
	String actual_conf_msg=undelerrormsg.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 33,7);
	 	
	 	ExcelUtils.setCellData("Pass", 33,8);
		
		
		System.out.println(undelerrormsg.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 33,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undelerrormsg;
	
	
}

public static WebElement undelete(WebDriver driver) throws Exception{
	
	 undelete=driver.findElement(By.id(ExcelUtils.getstringCellData(42, ColNum)));
	 
	 return undelete;
	
	
	
	
}


public static WebElement alreadyexistfile(WebDriver driver) throws Exception{
		
		
		
		alreadyexistfile=driver.findElement(By.xpath(ExcelUtils.getstringCellData(48, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(48, 6);
		
		String actual_conf_msg=alreadyexistfile.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 48,7);
		 	
		 	ExcelUtils.setCellData("Pass", 48,8);
			
			System.out.println(alreadyexistfile.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 48,8);
			
			System.out.println("Already exisit name validation message is not displayed");
			
			
		}
		
		
		return alreadyexistfile;
	}
	
	
	
public static WebElement blankinputname(WebDriver driver) throws Exception{
	
	blankinputname=driver.findElement(By.id(ExcelUtils.getstringCellData(55, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(55, 6);
	
	String actual_conf_msg=blankinputname.getText();
	
	
	
		
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 55,7);
	 	
	 	ExcelUtils.setCellData("Pass", 55,8);
		
		System.out.println(blankinputname.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 55,8);
		
		System.out.println("Name is required validation message is not verified");
	}
	
	return blankinputname;
	
	
}
	
public static WebElement blankinputdes(WebDriver driver) throws Exception{
		
		blankinputdes=driver.findElement(By.id(ExcelUtils.getstringCellData(57, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(57, 6);
		
		String actual_conf_msg=blankinputdes.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 57,7);
			 	
			 	ExcelUtils.setCellData("Pass", 57,8);	
			 
				System.out.println(blankinputdes.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 57,8);
				
				System.out.println("Description is required validation messgae is not verified");
			}
		 
		 
		
		 return blankinputdes;
		
	}

public static WebElement invalidnameinput(WebDriver driver) throws Exception{
	
	invalidnameinput=driver.findElement(By.id(ExcelUtils.getstringCellData(64, ColNum)));
	
String excpected_Cong_msg=ExcelUtils.getstringCellData(64, 6);
	
	String actual_conf_msg=invalidnameinput.getText();
		
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		 ExcelUtils.setCellData(actual_conf_msg, 64,7);
		 	
		 	ExcelUtils.setCellData("Pass", 64,8);	
		
		
		System.out.println(invalidnameinput.getText());
		
		}
	
	else{
		
		ExcelUtils.setCellData("Fail", 64,8);
		
		System.out.println("Must not contain special characters validation Message is not displayed and Verified");
	}
	
	
	return invalidnameinput;
	
	
}	
	
public static WebElement invaliddesinput(WebDriver driver) throws Exception{
	
	invaliddesinput=driver.findElement(By.id(ExcelUtils.getstringCellData(66, ColNum)));
		
	String excpected_Cong_msg=ExcelUtils.getstringCellData(66, 6);
	
	String actual_conf_msg=invaliddesinput.getText();
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			 ExcelUtils.setCellData(actual_conf_msg, 66,7);
			 	
			 	ExcelUtils.setCellData("Pass", 66,8);	
			
			System.out.println(invaliddesinput.getText());
			
			
			screenshot.CaptureScreenshot(driver);
			
			
			
		}
		
		else{
			
			ExcelUtils.setCellData("Fail", 66,8);
			
			System.out.println("Allows only #-%/.()'validation Message is not displayed and Verified");
		}
		
		return invaliddesinput;
		
		
	}




public static WebElement verifysavemesage(WebDriver driver) throws Exception{
	
	verifysavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(15, ColNum)));
	
	String save_conf_msg=verifysavemesage.getText();
	
	if(verifysavemesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 15,7);
		 	
		 	ExcelUtils.setCellData("Pass", 15,8);	
		
		System.out.println(verifysavemesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 15,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifysavemesage;
	
	
}


public static WebElement verifyupdationmesage(WebDriver driver) throws Exception{
	
	verifyupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(21, ColNum)));
	
	String save_conf_msg=verifyupdationmesage.getText();
	
	if(verifyupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 21,7);
		 	
		 	ExcelUtils.setCellData("Pass", 21,8);	
		
		System.out.println(verifyupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 21,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyupdationmesage;
	
	
}

public static WebElement verifyundeleteupdationmesage1(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(35, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage1.getText();
	
	if(verifyundeleteupdationmesage1.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 35,7);
		 	
		 	ExcelUtils.setCellData("Pass", 35,8);	
		
		System.out.println(verifyundeleteupdationmesage1.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 35,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage1;
	
	
}

public static WebElement verifyundeleteupdationmesage2(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(43, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage2.getText();
	
	if(verifyundeleteupdationmesage2.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 43,7);
		 	
		 	ExcelUtils.setCellData("Pass", 43,8);	
		
		System.out.println(verifyundeleteupdationmesage2.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 43,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage2;
	
	
}
public static WebElement verifyalreadyexistupdationmesage(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(51, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage.getText();
	
	if(verifyalreadyexistupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 51,7);
		 	
		 	ExcelUtils.setCellData("Pass", 51,8);	
		
		System.out.println(verifyalreadyexistupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 51,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage;
	
	
}

	
public static WebElement sort(WebDriver driver){
	
	sort=driver.findElement(By.linkText("Name"));
	
	return sort;
	
	
}
public static WebElement back(WebDriver driver) throws Exception{
	
	back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(59, ColNum)));
	
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
