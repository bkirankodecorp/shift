package TankOnboarding_SubClasses;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TankOnboarding_SubClasses.screenshot;
import Utility.ExcelUtils;

public class TankOnboarding_Methods {



	private static WebElement username=null;

	private static WebElement password=null;

	private static WebElement login=null;

	private static MouseHandler tankonboardingmenu=null;

	private static WebElement organizationuserid=null;

	private static WebElement organizationpassword=null;

	private static WebElement getcorporates=null;

	private static WebElement corporatesretrivedconfirmationmessage=null;

	private static WebElement organizatioidandpasswordretrievedvalidation=null;

	private static WebElement organizationidfromtank=null;

	private static WebElement parenbtcorporatename=null;

	private static WebElement parentcorporatevalidation=null;

	private static WebElement organizationidfromtankvalidation=null;

	private static WebElement synctypeclick=null;

	private static WebElement onboardingadminuseremail=null;

	private static WebElement childcorporatesheadercheckbox=null;

	private static WebElement childcorporatesdiv=null;

	private static WebElement childcorporatesactive=null;

	private static WebElement optionalchildcorporatesemail=null;
	
	private static WebElement invalidchildcorporateemailalert=null;
	
	private static WebElement duplicateemailsalert=null;

	private static WebElement save=null;
	
	private static WebElement successfullcreationparentandchilscorporatevalidation=null;

	private static WebElement invalidemailalert=null;

	private static WebElement alertok=null;

	private static MouseHandler logout=null;

	private static WebElement corporatescreationsuccessfullmessage=null;

	private static WebElement blankorganizationuseridandpasswordalert=null;

	private static WebElement blankonboardingadminemailalert=null;

	private static WebElement corporatesdoesntexistorganizationuseridandpasswordalert=null;

	private static WebElement invalidorganizationuseridandpasswordalert=null;

	





	public static WebElement username(WebDriver driver) throws Exception{

		username=driver.findElement(By.name("username"));

		return username;


	}

	public static WebElement password(WebDriver driver) throws Exception{

		password=driver.findElement(By.name("password"));

		return password;


	}


	public static WebElement login(WebDriver driver) throws Exception{

		login=driver.findElement(By.id("login"));

		login.click();

		Thread.sleep(3000);

		if(driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).isDisplayed()){


			System.out.println("User LoggedIn Successfull");

		}
		else{

			System.out.println("User LoggedIn Unsuccessfull");

		}

		return login;


	}




	public static MouseHandler tankonboardingmenu(WebDriver driver) throws Exception{


		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath("//span[contains(text(),'Admin')]")).size();


		int ok_size1=driver.findElements(By.xpath("//a[@href='/SLMain/TankOnBoarding/TankOnBoarding']")).size();


		action.moveToElement(driver.findElements(By.xpath("//span[contains(text(),'Admin')]")).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		action.moveToElement(driver.findElements(By.xpath("//a[@href='/SLMain/TankOnBoarding/TankOnBoarding']")).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//a[@href='/SLMain/TankOnBoarding/TankOnBoarding']")).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		if(TankOnboarding_Methods.getcorporates(driver).isDisplayed()){


			ExcelUtils.setCellData("Page is Redirected to Tank OnBoarding Screen", 10,8);	

			System.out.println("Page is Redirected to Tank OnBoarding Screen");


		}

		else

		{

			ExcelUtils.setCellData("Page is not Redirected to Tank OnBoarding Screen", 10,8);	

			System.out.println("Page is not Redirected to Tank OnBoarding Screen");


		}



		return tankonboardingmenu;


	}

	public static WebElement organizationuserid(WebDriver driver) throws Exception{

		organizationuserid=driver.findElement(By.id("txtOrganiztaionUserId"));

		return organizationuserid;


	}

	public static WebElement organizationpassword(WebDriver driver) throws Exception{

		organizationpassword=driver.findElement(By.id("txtOrganizationPassword"));

		return organizationpassword;


	}

	public static WebElement organizationidfromtank(WebDriver driver) throws Exception{

		organizationidfromtank=driver.findElement(By.id("txtOrganizationId"));

		return organizationidfromtank;


	}


	public static WebElement parenbtcorporatename(WebDriver driver) throws Exception{

		parenbtcorporatename=driver.findElement(By.id("txtCorporateName"));

		return parenbtcorporatename;


	}

	public static WebElement parentcorporatevalidation(WebDriver driver) throws Exception{

		parentcorporatevalidation=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Parent Corporate Name is required')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(30, 6);

		String actual_conf_msg=parentcorporatevalidation.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 30,7);

			ExcelUtils.setCellData("Pass", 30,8);	

			System.out.println(parentcorporatevalidation.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 30,8);

			System.out.println(parentcorporatevalidation.getText() + " validation Message is not displayed and Verified");
		}


		return parentcorporatevalidation;


	}

	public static WebElement organizationidfromtankvalidation(WebDriver driver) throws Exception{

		organizationidfromtankvalidation=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Organization Id from Tank is required')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(34, 6);

		String actual_conf_msg=organizationidfromtankvalidation.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 34,7);

			ExcelUtils.setCellData("Pass", 34,8);	

			System.out.println(organizationidfromtankvalidation.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 34,8);

			System.out.println(organizationidfromtankvalidation.getText() + " validation Message is not displayed and Verified");
		}


		return organizationidfromtankvalidation;


	}

	public static WebElement getcorporates(WebDriver driver) throws Exception{

		getcorporates=driver.findElement(By.id("btnGetCorporates"));

		

		return getcorporates;


	}

	public static WebElement corporatesretrivedconfirmationmessage(WebDriver driver) throws Exception{

		corporatesretrivedconfirmationmessage=driver.findElement(By.id("spanSuccessMessage"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(340, 6);

		String actual_conf_msg=TankOnboarding_Methods.corporatescreationsuccessfullmessage(driver).getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 340,7);

			ExcelUtils.setCellData("Pass", 340,8);	

			System.out.println(TankOnboarding_Methods.corporatescreationsuccessfullmessage(driver).getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 340,8);

			System.out.println(TankOnboarding_Methods.corporatescreationsuccessfullmessage(driver).getText() + " validation Message is not displayed and Verified");
		}


		return corporatesretrivedconfirmationmessage;


	}


	public static WebElement organizatioidandpasswordretrievedvalidation(WebDriver driver) throws Exception{

		organizatioidandpasswordretrievedvalidation=driver.findElement(By.xpath(".//*[@id='spanSuccessMessage']"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(26, 6);

		String actual_conf_msg=organizatioidandpasswordretrievedvalidation.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 26,7);

			ExcelUtils.setCellData("Pass", 26,8);	

			System.out.println(organizatioidandpasswordretrievedvalidation.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{
			
			ExcelUtils.setCellData(actual_conf_msg, 26,7);

			ExcelUtils.setCellData("Fail", 26,8);

			System.out.println(organizatioidandpasswordretrievedvalidation.getText() + " validation Message is not displayed and Verified");
		}


		return organizatioidandpasswordretrievedvalidation;


	}

	public static WebElement synctypeclick(WebDriver driver) throws Exception{

		synctypeclick=driver.findElement(By.xpath("//span[@aria-owns='ddlSyncType_listbox']//span[contains(text(),'select')]"));

		return synctypeclick;


	}

	public static WebElement onboardingadminuseremail(WebDriver driver) throws Exception{

		onboardingadminuseremail=driver.findElement(By.id("txtParentUserName"));

		return onboardingadminuseremail;


	}

	public static WebElement childcorporatesheadercheckbox(WebDriver driver) throws Exception{

		childcorporatesheadercheckbox=driver.findElement(By.id("childcorporatesheadercheckbox"));

		return childcorporatesheadercheckbox;


	}

	public static WebElement childcorporatesdiv(WebDriver driver) throws Exception{

		childcorporatesdiv=driver.findElement(By.xpath(".//*[@id='tabLink_Org_Corp']/div[1]/div/div[2]/div[2]/div/div[1]"));

		return childcorporatesdiv;


	}

	public static WebElement childcorporatesactive(WebDriver driver) throws Exception{

		childcorporatesactive=driver.findElement(By.xpath("//span[@aria-owns='ddlSyncType_listbox']//span[contains(text(),'select')]"));

		return childcorporatesactive;


	}

	public static WebElement optionalchildcorporatesemail(WebDriver driver) throws Exception{

		optionalchildcorporatesemail=driver.findElement(By.id("HazMatMessage"));

		return optionalchildcorporatesemail;


	}

	public static WebElement save(WebDriver driver) throws Exception{

		save=driver.findElement(By.id("btnCreate"));

		return save;


	}

	public static WebElement invalidemailalert(WebDriver driver) throws Exception{

		invalidemailalert=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Not a valid e-mail address')]"));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(41, 6);

		String actual_conf_msg=invalidemailalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 41,7);

			ExcelUtils.setCellData("Pass", 41,8);	

			System.out.println(invalidemailalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 41,8);

			System.out.println(invalidemailalert.getText() + " validation Message is not displayed and Verified");
		}


		return invalidemailalert;


	}
	
	public static WebElement invalidchildcorporateemailalert(WebDriver driver) throws Exception{

		invalidchildcorporateemailalert=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Not a valid e-mail address')]"));
		
		String excpected_Cong_msg=ExcelUtils.getstringCellData(53, 6);

		String actual_conf_msg=invalidchildcorporateemailalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 53,7);

			ExcelUtils.setCellData("Pass", 53,8);	

			System.out.println(invalidchildcorporateemailalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 53,8);

			System.out.println(invalidchildcorporateemailalert.getText() + " validation Message is not displayed and Verified");
		}


		return invalidchildcorporateemailalert;


	}

	public static WebElement blankorganizationuseridandpasswordalert(WebDriver driver) throws Exception{

		blankorganizationuseridandpasswordalert=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Organization UserId and Password are required')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(14, 6);

		String actual_conf_msg=blankorganizationuseridandpasswordalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 14,7);

			ExcelUtils.setCellData("Pass", 14,8);	

			System.out.println(blankorganizationuseridandpasswordalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 14,8);

			System.out.println(blankorganizationuseridandpasswordalert.getText() + " validation Message is not displayed and Verified");
		}




		return blankorganizationuseridandpasswordalert;


	}

	public static WebElement blankonboardingadminemailalert(WebDriver driver) throws Exception{

		blankonboardingadminemailalert=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Onboarding Admin User Email is required')]"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(37, 6);

		String actual_conf_msg=blankonboardingadminemailalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 37,7);

			ExcelUtils.setCellData("Pass", 37,8);	

			System.out.println(blankonboardingadminemailalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 37,8);

			System.out.println(blankonboardingadminemailalert.getText() + " validation Message is not displayed and Verified");
		}




		return blankonboardingadminemailalert;


	}

	public static WebElement corporatesdoesntexistorganizationuseridandpasswordalert(WebDriver driver) throws Exception{

		//String size="Corporates doesn't exist for given Organization UserId and Organization Password.";

		corporatesdoesntexistorganizationuseridandpasswordalert=driver.findElement(By.xpath("//div[@id='dvAlertContent']"));


		String excpected_Cong_msg=ExcelUtils.getstringCellData(19, 6);

		String actual_conf_msg=corporatesdoesntexistorganizationuseridandpasswordalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 19,7);

			ExcelUtils.setCellData("Pass", 19,8);	

			System.out.println(corporatesdoesntexistorganizationuseridandpasswordalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 19,8);

			System.out.println(corporatesdoesntexistorganizationuseridandpasswordalert.getText() + " validation Message is not displayed and Verified");
		}


		return corporatesdoesntexistorganizationuseridandpasswordalert;


	}

	public static WebElement invalidorganizationuseridandpasswordalert(WebDriver driver) throws Exception{

		//String size="Corporates doesn't exist for given Organization UserId and Organization Password.";

		invalidorganizationuseridandpasswordalert=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Invalid Organization UserId or Organization Password')]"));


		String excpected_Cong_msg=ExcelUtils.getstringCellData(47, 6);

		String actual_conf_msg=invalidorganizationuseridandpasswordalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 47,7);

			ExcelUtils.setCellData("Pass", 47,8);	

			System.out.println(invalidorganizationuseridandpasswordalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 47,8);

			System.out.println(invalidorganizationuseridandpasswordalert.getText() + " validation Message is not displayed and Verified");
		}


		return invalidorganizationuseridandpasswordalert;


	}

	public static WebElement duplicateemailsalert(WebDriver driver) throws Exception{

		duplicateemailsalert=driver.findElement(By.xpath("//div[@id='dvAlertContent'][contains(text(),'Duplicate Emails are not allowed.')]"));
		

		String excpected_Cong_msg=ExcelUtils.getstringCellData(57, 6);

		String actual_conf_msg=duplicateemailsalert.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 57,7);

			ExcelUtils.setCellData("Pass", 57,8);	

			System.out.println(duplicateemailsalert.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 57,8);

			System.out.println(duplicateemailsalert.getText() + " validation Message is not displayed and Verified");
		}


		return duplicateemailsalert;


	}

	public static WebElement alertok(WebDriver driver) throws Exception{

		alertok=driver.findElement(By.id("btnAlertOK"));

		return alertok;


	}

	public static WebElement corporatescreationsuccessfullmessage(WebDriver driver) throws Exception{


		corporatescreationsuccessfullmessage=driver.findElement(By.id("childCorpStatMessage"));

		String excpected_Cong_msg=ExcelUtils.getstringCellData(62, 6);

		String actual_conf_msg=corporatescreationsuccessfullmessage.getText();

		if(excpected_Cong_msg.equals(actual_conf_msg)){

			ExcelUtils.setCellData(actual_conf_msg, 62,7);

			ExcelUtils.setCellData("Pass", 62,8);

			System.out.println(corporatescreationsuccessfullmessage.getText());


			screenshot.CaptureScreenshot(driver);



		}

		else{

			ExcelUtils.setCellData("Fail", 62,8);

			System.out.println(corporatescreationsuccessfullmessage.getText() + " validation Message is not displayed and Verified");
		}


		return corporatescreationsuccessfullmessage;


	}
	
	public static MouseHandler logout(WebDriver driver) throws Exception{


		Actions action= new Actions(driver);

		int ok_size=driver.findElements(By.xpath(" //span[@class='fa fa-angle-down img-circle']")).size();


		int ok_size1=driver.findElements(By.xpath("//a[@href='/SLMain/Home/Signout']")).size();


		action.moveToElement(driver.findElements(By.xpath(" //span[@class='fa fa-angle-down img-circle']")).get(ok_size-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		action.moveToElement(driver.findElements(By.xpath("//a[@href='/SLMain/Home/Signout']")).get(ok_size1-1)).build().perform();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		driver.findElement(By.xpath("//a[@href='/SLMain/Home/Signout']")).click();

		Thread.sleep(5000);

		screenshot.CaptureScreenshot(driver);

		if(TankOnboarding_Methods.username(driver).isDisplayed()){


			System.out.println("User Logged out Successfull and Page is Redirected to Login Screen");
		}

		else

		{
			System.out.println("User Logged out unSuccessfull and Page is not Redirected to Login Screen");


		}


		return logout;


	}



}
