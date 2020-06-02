package Plant_Subclasses;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.ExcelUtils;

public class Plant_Methods {
	
	
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
	
	private static WebElement edit=null;
	
	private static WebElement update=null;
	
	private static WebElement verifyupdationmesage=null;
	
	private static WebElement delete=null;
	
	private static WebElement deletealertcontent=null;
	
	private static WebElement ok=null;
	
	private static WebElement cancel=null;
	
	private static WebElement delmsg=null;
	
	private static WebElement undeletevalidationmessage1=null;
	
	private static WebElement verifyundeleteupdationmesage1=null;
	
	private static WebElement undeletevalidationmessage2=null;
	
	private static WebElement verifyundeleteupdationmesage2=null;
	
	private static WebElement undeletevalidationmessage3=null;
	
	private static WebElement undelete=null;
	
	private static WebElement verifyundeleteupdationmesage3=null;
	
	private static WebElement searchforalreadyexistplant=null;
	
	private static WebElement alreadyexistplantvalidationmessage1=null;
	
	private static WebElement verifyalreadyexistupdationmesage1=null;
	
	private static WebElement alreadyexistplantvalidationmessage2=null;
	
	private static WebElement verifyalreadyexistupdationmesage2=null;
	
	private static WebElement alreadyexistplantvalidationmessage3=null;
	
	private static WebElement verifyalreadyexistupdationmesage3=null;
	
	private static WebElement blankinputinname=null;
	
	private static WebElement blankinputindescription=null;
	
	private static WebElement invalidinputinname=null;
	
	private static WebElement invalidinputindescripiton=null;
	
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
		
		create.click();
		
		screenshot.CaptureScreenshot(driver);
		
		
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

	
public static WebElement closeconfirmationmessage(WebDriver driver) throws Exception{
		
	closeconfirmationmessage=driver.findElement(By.linkText(ExcelUtils.getstringCellData(16, ColNum)));
		
		return closeconfirmationmessage;
		
		
	}
	
	public static WebElement search(WebDriver driver) throws Exception{
		
		search=driver.findElement(By.id(ExcelUtils.getstringCellData(17, ColNum)));
		
		Thread.sleep(3000);
		
		
		
		
		return search;
		
	}


public static WebElement edit(WebDriver driver) throws Exception{
	
	edit=driver.findElement(By.linkText(ExcelUtils.getstringCellData(18, ColNum)));
	
	return edit;
	
	
}

public static WebElement update(WebDriver driver) throws Exception{
	
	update=driver.findElement(By.id(ExcelUtils.getstringCellData(20, ColNum)));
	
	return update;
	
	
	
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

public static WebElement delete(WebDriver driver) throws Exception{
	
	 delete=driver.findElement(By.linkText(ExcelUtils.getstringCellData(24, ColNum)));
	 
	 return delete;
	
	
	
}

public static WebElement deletealertcontent(WebDriver driver) throws Exception{
	
	deletealertcontent=driver.findElement(By.id(ExcelUtils.getstringCellData(25, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(25, 6);
	
	String actual_conf_msg=deletealertcontent.getText();
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 25,7);
	 	
	 	ExcelUtils.setCellData("Pass", 25,8);
		
		System.out.println(deletealertcontent.getText() +"confirmation message is displayed and verified");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 25,8);
		
		System.out.println(deletealertcontent.getText() +"confirmation message is not displayed and verified");
		

	}
	
	return deletealertcontent;
	
	
}


public static WebElement ok(WebDriver driver) throws Exception{
	
	ok=driver.findElement(By.id(ExcelUtils.getstringCellData(26, ColNum)));
	
	WebElement element=driver.findElement(By.xpath("//div[@class='k-grid-content']"));
	
	Thread.sleep(3000);
	
	if(element.getSize() != null){
		
		ExcelUtils.setCellData("Plant Deleted Successfully", 26,7);
	 	
	 	ExcelUtils.setCellData("Pass", 26,8);
		
		System.out.println("Plant Deleted Successfully");
		
		
	}else{
		
		ExcelUtils.setCellData("Fail", 26,8);
		
		System.out.println("Plant is not deleted");
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

public static WebElement undeletevalidationmessage1(WebDriver driver) throws Exception{
	
	undeletevalidationmessage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(32, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(32, 6);
	
	String actual_conf_msg=undeletevalidationmessage1.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 32,7);
	 	
	 	ExcelUtils.setCellData("Pass", 32,8);
		
		
		System.out.println(undeletevalidationmessage1.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 32,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage1;
	
	
}

public static WebElement verifyundeleteupdationmesage1(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(34, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage1.getText();
	
	if(verifyundeleteupdationmesage1.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 34,7);
		 	
		 	ExcelUtils.setCellData("Pass", 34,8);	
		
		System.out.println(verifyundeleteupdationmesage1.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 34,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage1;
	
	
}

public static WebElement undeletevalidationmessage2(WebDriver driver) throws Exception{
	
	undeletevalidationmessage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(40, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(40, 6);
	
	String actual_conf_msg=undeletevalidationmessage2.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 40,7);
	 	
	 	ExcelUtils.setCellData("Pass", 40,8);
		
		
		System.out.println(undeletevalidationmessage2.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 40,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage2;
	
	
}

public static WebElement verifyundeleteupdationmesage2(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(42, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage2.getText();
	
	if(verifyundeleteupdationmesage2.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 42,7);
		 	
		 	ExcelUtils.setCellData("Pass", 42,8);	
		
		System.out.println(verifyundeleteupdationmesage2.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 42,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage2;
	
	
}

public static WebElement undeletevalidationmessage3(WebDriver driver) throws Exception{
	
	undeletevalidationmessage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(48, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(48, 6);
	
	String actual_conf_msg=undeletevalidationmessage3.getText();
	

	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 48,7);
	 	
	 	ExcelUtils.setCellData("Pass", 48,8);
		
		
		System.out.println(undeletevalidationmessage3.getText());
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Fail", 48,8);
		
		System.out.println("Undelete Validation message is not displayed");
	}
	return undeletevalidationmessage3;
	
	
}

public static WebElement undelete(WebDriver driver) throws Exception{
	
	 undelete=driver.findElement(By.id(ExcelUtils.getstringCellData(49, ColNum)));
	 
	 return undelete;
	
	
	
	
}

public static WebElement verifyundeleteupdationmesage3(WebDriver driver) throws Exception{
	
	verifyundeleteupdationmesage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(51, ColNum)));
	
	String save_conf_msg=verifyundeleteupdationmesage3.getText();
	
	if(verifyundeleteupdationmesage3.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 51,7);
		 	
		 	ExcelUtils.setCellData("Pass", 51,8);	
		
		System.out.println(verifyundeleteupdationmesage3.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 51,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyundeleteupdationmesage3;
	
	
}

public static WebElement searchforalreadyexistplant(WebDriver driver) throws Exception{
	
	
WebElement existplant=driver.findElement(By.xpath(".//*[@id='PlantGrid']/div[2]/table/tbody/tr/td[1]"));
	
	if(existplant.isDisplayed()){
		
		ExcelUtils.setCellData("Plant ID "+existplant.getText()+" is Already Existed", 53,8);	
		
		
		System.out.println("Plant ID "+existplant.getText()+ " is Already Existed");
		
		
	}
	
	else{
		
		ExcelUtils.setCellData("Plant ID "+existplant.getText()+ " is not Existed", 53,8);	
		
		System.out.println("Plant  ID "+existplant.getText()+ " is not Existed");
		
	}
	
	Thread.sleep(3000);
	
	
	
	return searchforalreadyexistplant;
	
}


public static WebElement alreadyexistplantvalidationmessage1(WebDriver driver) throws Exception{
		
		
		
	alreadyexistplantvalidationmessage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(58, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(58, 6);
		
		String actual_conf_msg=alreadyexistplantvalidationmessage1.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 58,7);
		 	
		 	ExcelUtils.setCellData("Pass", 58,8);
			
			System.out.println(alreadyexistplantvalidationmessage1.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 58,8);
			
			System.out.println("Already exisit name validation message is not displayed");
			
			
		}
		
		
		return alreadyexistplantvalidationmessage1;
	}

public static WebElement verifyalreadyexistupdationmesage1(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage1=driver.findElement(By.xpath(ExcelUtils.getstringCellData(60, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage1.getText();
	
	if(verifyalreadyexistupdationmesage1.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 60,7);
		 	
		 	ExcelUtils.setCellData("Pass", 60,8);	
		
		System.out.println(verifyalreadyexistupdationmesage1.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 60,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage1;
	
	
}
public static WebElement alreadyexistplantvalidationmessage2(WebDriver driver) throws Exception{
	
	
	
	alreadyexistplantvalidationmessage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(66, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(66, 6);
		
		String actual_conf_msg=alreadyexistplantvalidationmessage2.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 66,7);
		 	
		 	ExcelUtils.setCellData("Pass", 66,8);
			
			System.out.println(alreadyexistplantvalidationmessage2.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 66,8);
			
			System.out.println("Already exisit name validation message is not displayed");
			
			
		}
		
		
		return alreadyexistplantvalidationmessage2;
	}

public static WebElement verifyalreadyexistupdationmesage2(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage2=driver.findElement(By.xpath(ExcelUtils.getstringCellData(68, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage2.getText();
	
	if(verifyalreadyexistupdationmesage2.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 68,7);
		 	
		 	ExcelUtils.setCellData("Pass", 68,8);	
		
		System.out.println(verifyalreadyexistupdationmesage2.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 68,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage2;
	
	
}
public static WebElement alreadyexistplantvalidationmessage3(WebDriver driver) throws Exception{
	
	
	
	alreadyexistplantvalidationmessage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(74, ColNum)));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(74, 6);
		
		String actual_conf_msg=alreadyexistplantvalidationmessage3.getText();
		
		
		
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			ExcelUtils.setCellData(actual_conf_msg, 74,7);
		 	
		 	ExcelUtils.setCellData("Pass", 74,8);
			
			System.out.println(alreadyexistplantvalidationmessage3.getText());
			
			Thread.sleep(3000);
			
			
			
			
}
		else{
			
			ExcelUtils.setCellData("Fail", 74,8);
			
			System.out.println("Already exisit name validation message is not displayed");
			
			
		}
		
		
		return alreadyexistplantvalidationmessage3;
	}

public static WebElement verifyalreadyexistupdationmesage3(WebDriver driver) throws Exception{
	
	verifyalreadyexistupdationmesage3=driver.findElement(By.xpath(ExcelUtils.getstringCellData(77, ColNum)));
	
	String save_conf_msg=verifyalreadyexistupdationmesage3.getText();
	
	if(verifyalreadyexistupdationmesage3.isDisplayed()){
		
		 ExcelUtils.setCellData(save_conf_msg, 77,7);
		 	
		 	ExcelUtils.setCellData("Pass", 77,8);	
		
		System.out.println(verifyalreadyexistupdationmesage3.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 77,8);
		
		System.out.println("Confirmation message is not displayed");
	}
	
	return verifyalreadyexistupdationmesage3;
	
	
}
	
	
	
public static WebElement blankinputinname(WebDriver driver) throws Exception{
	
	blankinputinname=driver.findElement(By.id(ExcelUtils.getstringCellData(81, ColNum)));
	
	String excpected_Cong_msg=ExcelUtils.getstringCellData(81, 6);
	
	String actual_conf_msg=blankinputinname.getText();
	
	
	
		
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		ExcelUtils.setCellData(actual_conf_msg, 81,7);
	 	
	 	ExcelUtils.setCellData("Pass", 81,8);
		
		System.out.println(blankinputinname.getText());
	}
	else{
		
		ExcelUtils.setCellData("Fail", 81,8);
		
		System.out.println("Name is required validation message is not verified");
	}
	
	return blankinputinname;
	
	
}
	
public static WebElement blankinputindescription(WebDriver driver) throws Exception{
		
	blankinputindescription=driver.findElement(By.id(ExcelUtils.getstringCellData(83, ColNum)));
		 
		String excpected_Cong_msg=ExcelUtils.getstringCellData(83, 6);
		
		String actual_conf_msg=blankinputindescription.getText();
		 
		 if(excpected_Cong_msg.equals(actual_conf_msg)){
				
				
			 ExcelUtils.setCellData(actual_conf_msg, 83,7);
			 	
			 	ExcelUtils.setCellData("Pass", 83,8);	
			 
				System.out.println(blankinputindescription.getText());
				
				
			}else{
				
				ExcelUtils.setCellData("Fail", 83,8);
				
				System.out.println(blankinputindescription.getText() + " validation messgae is not verified");
			}
		 
		 
		
		 return blankinputindescription;
		
	}

public static WebElement invalidinputinname(WebDriver driver) throws Exception{
	
	invalidinputinname=driver.findElement(By.id(ExcelUtils.getstringCellData(90, ColNum)));
	
String excpected_Cong_msg=ExcelUtils.getstringCellData(90, 6);
	
	String actual_conf_msg=invalidinputinname.getText();
		
	
	if(excpected_Cong_msg.equals(actual_conf_msg)){
		
		 ExcelUtils.setCellData(actual_conf_msg, 90,7);
		 	
		 	ExcelUtils.setCellData("Pass", 90,8);	
		
		
		System.out.println(invalidinputinname.getText());
		
		}
	
	else{
		
		ExcelUtils.setCellData("Fail", 90,8);
		
		System.out.println(invalidinputinname.getText() + " validation Message is not displayed and Verified");
	}
	
	
	return invalidinputinname;
	
	
}	
	
public static WebElement invalidinputindescripiton(WebDriver driver) throws Exception{
	
	invalidinputindescripiton=driver.findElement(By.id(ExcelUtils.getstringCellData(92, ColNum)));
		
	String excpected_Cong_msg=ExcelUtils.getstringCellData(92, 6);
	
	String actual_conf_msg=invalidinputindescripiton.getText();
		
		if(excpected_Cong_msg.equals(actual_conf_msg)){
			
			 ExcelUtils.setCellData(actual_conf_msg, 92,7);
			 	
			 	ExcelUtils.setCellData("Pass", 92,8);	
			
			System.out.println(invalidinputindescripiton.getText());
			
			
			screenshot.CaptureScreenshot(driver);
			
			
			
		}
		
		else{
			
			ExcelUtils.setCellData("Fail", 92,8);
			
			System.out.println(invalidinputindescripiton.getText() + " validation Message is not displayed and Verified");
		}
		
		return invalidinputindescripiton;
		
		
	}





	
public static WebElement sort(WebDriver driver){
	
	sort=driver.findElement(By.linkText("Name"));
	
	return sort;
	
	
}
public static WebElement back(WebDriver driver) throws Exception{
	
	back=driver.findElement(By.linkText(ExcelUtils.getstringCellData(85, ColNum)));
	
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
