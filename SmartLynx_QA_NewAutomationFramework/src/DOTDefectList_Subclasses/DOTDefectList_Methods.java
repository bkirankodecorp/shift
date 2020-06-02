package DOTDefectList_Subclasses;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;

public class DOTDefectList_Methods {
	
	
	private static int ColNum=4;
	
	private static MouseHandler mouse=null;
	
	private static MouseHandler mouse2=null;
	
	private static WebElement create=null;
	
	private static WebElement description=null;
	
	private static WebElement save=null;
	
	private static WebElement verifysavemesage=null;
	
	private static WebElement closeconfirmationmessage=null;
	
	private static WebElement search=null;
	
	private static WebElement edit=null;
	
	private static WebElement update=null;
	
	private static WebElement verifyupdationmesage=null;
	
	private static WebElement delete=null;
	
	private static WebElement deletealertcontent=null;
	
	private static WebElement ok=null;
	
	private static WebElement cancel=null;
	
	private static WebElement delmsg=null;
	
	private static WebElement searchforalreadyexistdotdefeclist=null;
	
	private static WebElement alreadyexistdotdefectlistvalidationmessage=null;
	
	private static WebElement verifyalreadyexistupdationmesage=null;
	
	private static WebElement blankinputindescription=null;
	
	private static WebElement savemessage=null;
	
	private static WebElement invalidinputindescripiton=null;
	
	private static WebElement back=null;
	
	private static WebElement sort=null;
	
	private static WebElement pagenavbuttons=null;
	
	
	
	public static MouseHandler mouse(WebDriver driver) throws Exception{
		
		WebElement element=driver.findElement(By.xpath(ExcelUtils.getstringCellData(8, ColNum)));
		
		WebElement element1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(9, ColNum)));
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).moveToElement(element1).build().perform();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
		element1.click();
		
		Thread.sleep(3000);
		
		screenshot.CaptureScreenshot(driver);
		
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
	
	
	
public static WebElement description(WebDriver driver) throws Exception{
		
		description=driver.findElement(By.id(ExcelUtils.getstringCellData(12, ColNum)));
		
		return description;
		
	}
	
	
	
	public static WebElement save(WebDriver driver) throws Exception{
		
		save=driver.findElement(By.name(ExcelUtils.getstringCellData(13, ColNum)));
		
		return save;
		
		
	}
	
	public static WebElement verifysavemesage(WebDriver driver) throws Exception{
		
		verifysavemesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(14, ColNum)));
		
		String save_conf_msg=verifysavemesage.getText();
		
		if(verifysavemesage.isDisplayed()){
			
			 ExcelUtils.setCellData(save_conf_msg, 14,7);
			 	
			 	ExcelUtils.setCellData("Pass", 14,8);	
			
			System.out.println(verifysavemesage.getText());
		}
		else{
			
			ExcelUtils.setCellData("Fail", 14,8);
			
			System.out.println("Confirmation message is not displayed");
		}
		
		return verifysavemesage;
		
		
	}

	
public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{
		
	closeconfirmationmessage=driver.findElement(By.linkText(ExcelUtils.getstringCellData(15, ColNum)));
		
		return closeconfirmationmessage;
		
		
	}
	
	public static WebElement search(WebDriver driver) throws Exception{
		
		search=driver.findElement(By.id(ExcelUtils.getstringCellData(16, ColNum)));
		
		Thread.sleep(3000);
		
		
		
		
		return search;
		
	}


public static WebElement edit(WebDriver driver) throws Exception{
	
	edit=driver.findElement(By.linkText(ExcelUtils.getstringCellData(17, ColNum)));
	
	return edit;
	
	
}

public static WebElement update(WebDriver driver) throws Exception{
	
	update=driver.findElement(By.name(ExcelUtils.getstringCellData(19, ColNum)));
	
	return update;
	
	
	
}

public static WebElement verifyupdationmesage(WebDriver driver) throws Exception{
	
	verifyupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(20, ColNum)));
	
	String save_conf_msg=verifyupdationmesage.getText();
	
	if(verifyupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 20,7);
		 	
		 	ExcelUtils.setCellData("Pass", 20,8);	
		
		System.out.println(verifyupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 20,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyupdationmesage;
	
	
}

public static WebElement delete(WebDriver driver) throws Exception{
	
	 delete=driver.findElement(By.linkText(ExcelUtils.getstringCellData(32, ColNum)));
	 
	 return delete;
	
	
	
}

public static WebElement deletealertcontent(WebDriver driver) throws Exception{
	
	deletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(33, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(33, 6);
	
	String actual_conf_msg=deletealertcontent.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 33,7);
	 	
	 	ExcelUtils.setCellData("Pass", 33,8);
		
		System.out.println(deletealertcontent.getText() +"confirmation message is displayed and verified");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 33,8);
		
		System.out.println(deletealertcontent.getText() +"confirmation message is not displayed and verified");
		

	}
	
	return deletealertcontent;
	
	
}


public static WebElement ok(WebDriver driver) throws Exception{
	
	ok=driver.findElement(By.id(ExcelUtils.getstringCellData(34, ColNum)));
	
	WebElement element=driver.findElement(By.xpath("//div[@class='k-grid-content']"));
	
	Thread.sleep(3000);
	
	if(element.getSize() != null){
		
		ExcelUtils.setCellData("DOT Defect List Record Deleted Successfully", 25,7);
	 	
	 	ExcelUtils.setCellData("Pass", 34,8);
		
		System.out.println("DOT Defect List Record Deleted Successfully");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 34,8);
		
		System.out.println("DOT Defect List Record is not deleted");
	}
	
	
	
	
	return ok;
	
	
}
public static WebElement delmsg(WebDriver driver) throws Exception{
	
	delmsg=driver.findElement(By.xpath(ExcelUtils.getstringCellData(26, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(26, 6);
	
	String actual_conf_msg=delmsg.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 26,7);
	 	
	 	ExcelUtils.setCellData("Pass", 26,8);
		
		
		
		System.out.println(delmsg.getText()+" confirmation message is displayed and verified");
		
		
	}else{
		System.out.println(delmsg.getText()+" confirmation message is not displayed and verified");
		

	}
	
	return delmsg;
	
	
}

public static WebElement cancel(WebDriver driver){
	
	cancel=driver.findElement(By.xpath("//div[@id='dvDeleteConfirmation']//button[contains(text(),'Cancel')]"));
	
	
	
	return cancel;
	
	
}





public static WebElement searchforalreadyexistdotdefeclist(WebDriver driver) throws Exception{
	
	
WebElement existdotdefectlist=driver.findElement(By.xpath(".//*[@id='DOTDefectListGrid']/div[2]/table/tbody/tr/td[1]"));
	
	if(existdotdefectlist.isDisplayed()){
		
		ExcelUtils.setCellData("dotdefectlist ID "+existdotdefectlist.getText()+" is Already Existed", 22,8);	
		
		
		System.out.println("dotdefectlist ID "+existdotdefectlist.getText()+ " is Already Existed");
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("dotdefectlist ID "+existdotdefectlist.getText()+ " is not Existed", 22,8);	
		
		System.out.println("dotdefectlist  ID "+existdotdefectlist.getText()+ " is not Existed");
		
	}
	
	Thread.sleep(3000);
	
	
	
	return searchforalreadyexistdotdefeclist;
	
}


public static WebElement alreadyexistdotdefectlistvalidationmessage(WebDriver driver) throws Exception{
		
		
		
	alreadyexistdotdefectlistvalidationmessage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(26, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(26, 6);
		
		String actual_conf_msg=alreadyexistdotdefectlistvalidationmessage.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 26,7);
		 	
		 	ExcelUtils.setCellData("Pass", 26,8);
			
			System.out.println(alreadyexistdotdefectlistvalidationmessage.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 26,8);
			
			System.out.println("Already exisit name validation message is not displayed");
			
			
		}
		
		
		return alreadyexistdotdefectlistvalidationmessage;
	}

public static WebElement verifyalreadyexistupdationmesage(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(29, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage.getText();
	
	if(verifyalreadyexistupdationmesage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 29,7);
		 	
		 	ExcelUtils.setCellData("Pass", 29,8);	
		
		System.out.println(verifyalreadyexistupdationmesage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 29,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage;
	
	
}

	
	

	
public static WebElement blankinputindescription(WebDriver driver) throws Exception{
		
	blankinputindescription=driver.findElement(By.id(ExcelUtils.getstringCellData(38, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(38, 6);
		
		String actual_conf_msg=blankinputindescription.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 38,7);
			 	
			 	ExcelUtils.setCellData("Pass", 8,8);	
			 
				System.out.println(blankinputindescription.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 38,8);
				
				System.out.println(blankinputindescription.getText() + " validation messgae is not verified");
			}
		 
		 
		
		 return blankinputindescription;
		
	}

public static WebElement savemessage(WebDriver driver) throws Exception{
	
	savemessage=driver.findElement(By.xpath(ExcelUtils.getstringCellData(41, ColNum)));
	
	String save_conf_msg=savemessage.getText();
	
	if(savemessage.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 41,7);
		 	
		 	ExcelUtils.setCellData("Pass", 41,8);	
		
		System.out.println(savemessage.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 41,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return savemessage;
	
	
}
	
public static WebElement invalidinputindescripiton(WebDriver driver) throws Exception{
	
	invalidinputindescripiton=driver.findElement(By.id(ExcelUtils.getstringCellData(46, ColNum)));
		
	String excpected_Cong_msg=ExcelUtils.getstringCellData(46, 6);
	
	String actual_conf_msg=invalidinputindescripiton.getText();
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			 ExcelUtils.setCellData(actual_conf_msg, 46,7);
			 	
			 	ExcelUtils.setCellData("Pass", 46,8);	
			
			System.out.println(invalidinputindescripiton.getText());
			
			
			screenshot.CaptureScreenshot(driver);
			
			
			
		}
		
		else{
			
			ExcelUtils.setCellData("Fail", 46,8);
			
			System.out.println(invalidinputindescripiton.getText() + " validation Message is not displayed and Verified");
		}
		
		return invalidinputindescripiton;
		
		
	}





	
public static WebElement sort(WebDriver driver){
	
	sort=driver.findElement(By.linkText("Name"));
	
	return sort;
	
	
}
public static WebElement back(WebDriver driver) throws Exception{
	
	back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(49, ColNum)));
	
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
