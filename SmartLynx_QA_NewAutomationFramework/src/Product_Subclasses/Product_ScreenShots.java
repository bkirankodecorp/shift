package Product_Subclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Product_ScreenShots {
	
	 
	 public static void CaptureScreenshot(WebDriver driver){
	  
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  try{
	   
	   FileUtils.copyFile(src, new File("C://Users//kode18//workspace//SmartLynxQa//Product//"+System.currentTimeMillis()+".png"));
	  }
	  catch (IOException e) {
	   
	   System.out.println(e.getMessage());

	  }
	  
	  
	  
	  
	 }
	 	

}