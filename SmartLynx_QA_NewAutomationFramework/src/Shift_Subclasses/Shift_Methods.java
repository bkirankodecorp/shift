package Shift_Subclasses;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utility.ExcelUtils;

public class Shift_Methods {
	
	
	private static int ColNum=4;
	
	private static MouseHandler mouse=null;
	
	private static MouseHandler mouse2=null;
	
	private static WebElement create=null;
	
	private static WebElement shift=null;
	
	private static WebElement description=null;
	
	private static WebElement starttime=null;
	
	private static WebElement endtime=null;
	
	private static WebElement showscheduleuntil=null;
	
	private static WebElement save=null;
	
	private static WebElement verifysavemesage=null;
	
	private static WebElement closeconfirmationmessage=null;
	
	private static WebElement alertcontent=null;
	
	private static WebElement alertok=null;
	
	private static WebElement verifyalertsavemesage=null;
	
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
	
	private static WebElement undelete=null;
	
	private static WebElement undeletevalidationmessage2=null;
	
	private static WebElement verifyundeleteupdationmesage2=null;
	
	private static WebElement searchforalreadyexistshift=null;
	
	private static WebElement alreadyexistfile=null;
	
	private static WebElement verifyalreadyexistupdationmesage=null;
	
	private static WebElement blankinputinshift=null;
	
	private static WebElement blankinputindescription=null;
	
	private static WebElement blankinputinstarttime=null;
	
	private static WebElement blankinputinendtime=null;
	
	private static WebElement blankinputinshowscheduleuntil=null;
	
	private static WebElement invalidinputinshift=null;
	
	private static WebElement invalidinputindescription=null;
	
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
		
		WebElement element=driver.findElement(By.xpath(ExcelUtils.getstringCellData(4, ColNum)));
		
		WebElement element1=driver.findElement(By.xpath("//a[@style='padding-left:400px;'][@href='https://www.p2pfuel.com/SLMain/Warehouse/GetAllWarehouses']"));
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(element1).click().build().perform();
		
		
		
		return mouse2;
		
		
	}
	
	public static WebElement create(WebDriver driver) throws Exception{
		
		
		
		create=driver.findElement(By.id(ExcelUtils.getstringCellData(11, ColNum)));
		
		return create;
		
		
	}
	
	public static WebElement shift(WebDriver driver) throws Exception{
		
		shift=driver.findElement(By.id(ExcelUtils.getstringCellData(12, ColNum)));
		
		
		return shift;
		
		
	}
	
	public static WebElement description(WebDriver driver) throws Exception{
		
		description=driver.findElement(By.id(ExcelUtils.getstringCellData(13, ColNum)));
		
		return description;
		
	}
	
	
	public static WebElement starttime(WebDriver driver) throws Exception{
		
		starttime=driver.findElement(By.id(ExcelUtils.getstringCellData(14, ColNum)));
		 
		 return starttime;
		
		
		
	}
	
	
public static WebElement endtime(WebDriver driver) throws Exception{
		
	endtime=driver.findElement(By.id(ExcelUtils.getstringCellData(15, ColNum)));
		
		return endtime;
		
		
	}

public static WebElement showscheduleuntil(WebDriver driver) throws Exception{
	
	showscheduleuntil=driver.findElement(By.id(ExcelUtils.getstringCellData(16, ColNum)));
		
		return showscheduleuntil;
		
		
	}
	





	public static WebElement save(WebDriver driver) throws Exception{
		
		save=driver.findElement(By.id(ExcelUtils.getstringCellData(17, ColNum)));
		
		return save;
		
		
	}
	
	public static WebElement verifysavemesage(WebDriver driver) throws Exception{
		
		verifysavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(18, ColNum)));
		
		String save_conf_msg=verifysavemesage.getText();
		
		if(verifysavemesage.isDisplayed()){
			
			 ExcelUtils.setCellData(save_conf_msg, 18,7);
			 	
			 	ExcelUtils.setCellData("Pass", 18,8);	
			
			System.out.println(verifysavemesage.getText());
			
		}
		
		else{
			
			
			ExcelUtils.setCellData("Fail", 21,8);
			
			System.out.println("Confirmation message is not displayed");
		}
		
		return verifysavemesage;
		
		
	}

	
public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{
		
	closeconfirmationmessage=driver.findElement(By.linkText(ExcelUtils.getstringCellData(19, ColNum)));
		
		return closeconfirmationmessage;
		
		
	}


public static WebElement alertcontent(WebDriver driver) throws Exception{
	
	alertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(27, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(27, 6);
	
	String actual_conf_msg=alertcontent.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 27,7);
	 	
	 	ExcelUtils.setCellData("Pass", 27,8);
		
		System.out.println(alertcontent.getText());
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 27,8);
		
		System.out.println("Alert is not displayed");
		

	}
	 
	 return alertcontent;
	
	
	
}

public static WebElement alertok(WebDriver driver) throws Exception{
	
	alertok=driver.findElement(By.id(ExcelUtils.getstringCellData(28, ColNum)));
	 
	 return alertok;
	
	
	
}

public static WebElement verifyalertsavemesage(WebDriver driver) throws Exception{
	
	verifyalertsavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(31, ColNum)));
	
	String save_conf_msg=verifyalertsavemesage.getText();
	
	if(verifyalertsavemesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 31,7);
		 	
		 	ExcelUtils.setCellData("Pass", 31,8);	
		
		System.out.println(verifyalertsavemesage.getText());
		
	}
	
	else{
		
		
		ExcelUtils.setCellData("Fail", 31,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalertsavemesage;
	
	
}

	public static WebElement search(WebDriver driver) throws Exception{
		
		search=driver.findElement(By.id(ExcelUtils.getstringCellData(33, ColNum)));
		
		Thread.sleep(3000);		
		
		
		return search;
		
	}


public static WebElement edit(WebDriver driver) throws Exception{
	
	WebElement select=driver.findElement(By.xpath(".//*[@id='ShiftGrid']/div[2]/table/tbody/tr/td[1]"));
	
	System.out.println(select.getText());
	
	edit=driver.findElement(By.xpath(".//*[@id='ShiftGrid']/div[2]/table/tbody/tr/td[1]/a"));
	
	edit.click();
	
	
	
	return edit;
	
	
}

public static WebElement update(WebDriver driver) throws Exception{
	
	update=driver.findElement(By.id(ExcelUtils.getstringCellData(39, ColNum)));
	
	return update;
	
	
	
}

public static WebElement verifyupdationmesage(WebDriver driver) throws Exception{
	
	verifyupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(40, ColNum)));
	
	String save_conf_msg=verifyupdationmesage.getText();
	
	if(verifyupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 40,7);
		 	
		 	ExcelUtils.setCellData("Pass", 40,8);	
		
		System.out.println(verifyupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 40,8);
		
		System.out.println(verifyupdationmesage.getText() +"Confirmation message is not displayed");
	}
	
	return verifyupdationmesage;
	
	
}

public static WebElement delete(WebDriver driver) throws Exception{
	
	 delete=driver.findElement(By.linkText(ExcelUtils.getstringCellData(43, ColNum)));
	 
	 return delete;
	
	
	
}

public static WebElement delmsgcont(WebDriver driver) throws Exception{
	
	delmsgcont=driver.findElement(By.id(ExcelUtils.getstringCellData(44, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(44, 6);
	
	String actual_conf_msg=delmsgcont.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 44,7);
	 	
	 	ExcelUtils.setCellData("Pass", 44,8);
		
		System.out.println(delmsgcont.getText());
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 44,8);
		
		System.out.println("message not displayed");
		

	}
	
	return delmsgcont;
	
	
}


public static WebElement ok(WebDriver driver) throws Exception{
	
	ok=driver.findElement(By.id(ExcelUtils.getstringCellData(45, ColNum)));
	
	return ok;
	
	
}
public static WebElement deleteconfirmedmesssgae(WebDriver driver) throws Exception{
	
WebElement element=driver.findElement(By.xpath("//div[@class='k-grid-content']"));
	
	Thread.sleep(3000);
	
	if(element.getSize() != null){
		
		ExcelUtils.setCellData("Shift Deleted Successfully", 45,7);
	 	
	 	ExcelUtils.setCellData("Pass", 45,8);
		
		System.out.println("Shift Deleted Successfully");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 45,8);
		
		System.out.println("Shift is not deleted");
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
	
	undeletevalidationmessage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(54, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(54, 6);
	
	String actual_conf_msg=undeletevalidationmessage1.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 54,7);
	 	
	 	ExcelUtils.setCellData("Pass", 54,8);
		
		
		System.out.println(undeletevalidationmessage1.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 54,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage1;
	
	
}
public static WebElement verifyundeleteupdationmesage1(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(56, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage1.getText();
	
	if(verifyundeleteupdationmesage1.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 56,7);
		 	
		 	ExcelUtils.setCellData("Pass", 56,8);	
		
		System.out.println(verifyundeleteupdationmesage1.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 56,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage1;
	
	
}

public static WebElement undeletevalidationmessage2(WebDriver driver) throws Exception{
	
	undeletevalidationmessage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(65, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(65, 6);
	
	String actual_conf_msg=undeletevalidationmessage2.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 65,7);
	 	
	 	ExcelUtils.setCellData("Pass", 65,8);
		
		
		System.out.println(undeletevalidationmessage2.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 65,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage2;
	
	
}

public static WebElement undelete(WebDriver driver) throws Exception{
	
	 undelete=driver.findElement(By.id(ExcelUtils.getstringCellData(66, ColNum)));
	 
	 return undelete;
	
	
	
	
}

public static WebElement verifyundeleteupdationmesage2(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(68, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage2.getText();
	
	if(verifyundeleteupdationmesage2.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 68,7);
		 	
		 	ExcelUtils.setCellData("Pass", 68,8);	
		
		System.out.println(verifyundeleteupdationmesage2.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 68,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage2;
	
	
}

public static WebElement searchforalreadyexistshift(WebDriver driver) throws Exception{
	
	searchforalreadyexistshift=driver.findElement(By.id(ExcelUtils.getstringCellData(70, ColNum)));
	
	WebElement existshiftid=driver.findElement(By.xpath(".//*[@id='ShiftGrid']/div[2]/table/tbody/tr/td[1]"));
	
	if(existshiftid.isDisplayed()){
		
		ExcelUtils.setCellData("Shift ID "+existshiftid.getText()+" is Already Existed", 70,8);	
		
		
		System.out.println("Shift ID "+existshiftid.getText()+ " is Already Existed");
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Shift ID "+existshiftid.getText()+ " is not Existed", 70,8);	
		
		System.out.println("Shift ID "+existshiftid.getText()+ " is not Existed");
		
	}
	
	Thread.sleep(3000);
	
	
	
	return searchforalreadyexistshift;
	
}



public static WebElement alreadyexistfile(WebDriver driver) throws Exception{
		
		
		
	alreadyexistfile=driver.findElement(By.xpath(ExcelUtils.getstringCellData(78, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(78, 6);
		
		String actual_conf_msg=alreadyexistfile.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 78,7);
		 	
		 	ExcelUtils.setCellData("Pass", 78,8);
			
			System.out.println(alreadyexistfile.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 78,8);
			
			System.out.println(alreadyexistfile.getText() + "Validation Message is not displayed");
			
			
		}
		
		
		return alreadyexistfile;
	}
	
public static WebElement verifyalreadyexistupdationmesage(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(84, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage.getText();
	
	if(verifyalreadyexistupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 84,7);
		 	
		 	ExcelUtils.setCellData("Pass", 84,8);	
		
		System.out.println(verifyalreadyexistupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 84,8);
		
		System.out.println(verifyalreadyexistupdationmesage.getText() + "Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage;
	
	
}


public static WebElement blankinputinshift(WebDriver driver) throws Exception{
	
	blankinputinshift=driver.findElement(By.id(ExcelUtils.getstringCellData(91, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(91, 6);
	
	String actual_conf_msg=blankinputinshift.getText();
	
	
	
		
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 91,7);
	 	
	 	ExcelUtils.setCellData("Pass", 91,8);
		
		System.out.println(blankinputinshift.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 91,8);
		
		System.out.println(blankinputinshift.getText() + " validation message is not verified");
	}
	
	return blankinputinshift;
	
	
}
	
public static WebElement blankinputindescription(WebDriver driver) throws Exception{
		
	blankinputindescription=driver.findElement(By.id(ExcelUtils.getstringCellData(93, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(93, 6);
		
		String actual_conf_msg=blankinputindescription.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 93,7);
			 	
			 	ExcelUtils.setCellData("Pass", 93,8);	
			 
				System.out.println(blankinputindescription.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 93,8);
				
				System.out.println(blankinputindescription.getText() + " validation messgae is not verified");
			}
		 
		 
		
		 return blankinputindescription;
		
	}

public static WebElement blankinputinstarttime(WebDriver driver) throws Exception{
	
	blankinputinstarttime=driver.findElement(By.xpath(ExcelUtils.getstringCellData(95, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(95, 6);
		
		String actual_conf_msg=blankinputinstarttime.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 95,7);
			 	
			 	ExcelUtils.setCellData("Pass", 95,8);	
			 
				System.out.println(blankinputinstarttime.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 95,8);
				
				System.out.println(blankinputinstarttime.getText() + " validation messgae is not verified");
			}
		 
		 
		
		 return blankinputinstarttime;
		
	}

public static WebElement blankinputinendtime(WebDriver driver) throws Exception{
	
	blankinputinendtime=driver.findElement(By.xpath(ExcelUtils.getstringCellData(97, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(97, 6);
		
		String actual_conf_msg=blankinputinendtime.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 97,7);
			 	
			 	ExcelUtils.setCellData("Pass", 97,8);	
			 
				System.out.println(blankinputinendtime.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 97,8);
				
				System.out.println(blankinputinendtime.getText() + " validation messgae is not verified");
			}
		 
		 
		
		 return blankinputinendtime;
		
	}

public static WebElement blankinputinshowscheduleuntil(WebDriver driver) throws Exception{
	
	blankinputinshowscheduleuntil=driver.findElement(By.xpath(ExcelUtils.getstringCellData(99, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(99, 6);
		
		String actual_conf_msg=blankinputinshowscheduleuntil.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 99,7);
			 	
			 	ExcelUtils.setCellData("Pass", 99,8);	
			 
				System.out.println(blankinputinshowscheduleuntil.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 99,8);
				
				System.out.println(blankinputinshowscheduleuntil.getText() + " validation messgae is not verified");
			}
		 
		 
		
		 return blankinputinshowscheduleuntil;
		
	}

public static WebElement invalidinputinshift(WebDriver driver) throws Exception{
	
	invalidinputinshift=driver.findElement(By.id(ExcelUtils.getstringCellData(109, ColNum)));
	
String excpected_Cong_msg=ExcelUtils.getstringCellData(109, 6);
	
	String actual_conf_msg=invalidinputinshift.getText();
		
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		 ExcelUtils.setCellData(actual_conf_msg, 109,7);
		 	
		 	ExcelUtils.setCellData("Pass", 109,8);	
		
		
		System.out.println(invalidinputinshift.getText());
		
}
	
	else{
		
		ExcelUtils.setCellData("Fail", 109,8);
		
		System.out.println(invalidinputinshift.getText() + " validation Message is not displayed and Verified");
	}
	
	
	return invalidinputinshift;
	
	
}	
	
public static WebElement invalidinputindescription(WebDriver driver) throws Exception{
	
	invalidinputindescription=driver.findElement(By.id(ExcelUtils.getstringCellData(111, ColNum)));
		
	String excpected_Cong_msg=ExcelUtils.getstringCellData(111, 6);
	
	String actual_conf_msg=invalidinputindescription.getText();
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			 ExcelUtils.setCellData(actual_conf_msg, 111,7);
			 	
			 	ExcelUtils.setCellData("Pass", 111,8);	
			
			System.out.println(invalidinputindescription.getText());
			
			
			screenshot.CaptureScreenshot(driver);
			
			
			
		}
		
		else{
			
			ExcelUtils.setCellData("Fail", 111,8);
			
			System.out.println(invalidinputindescription.getText() + " validation Message is not displayed and Verified");
		}
		
		return invalidinputindescription;
		
		
	}

public static WebElement sort(WebDriver driver){
	
	sort=driver.findElement(By.linkText("Name"));
	
	return sort;
	
	
}
public static WebElement back(WebDriver driver) throws Exception{
	
	back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(101, ColNum)));
	
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
