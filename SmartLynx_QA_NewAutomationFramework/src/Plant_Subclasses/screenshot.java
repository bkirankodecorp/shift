package Plant_Subclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	
	public static void CaptureScreenshot(WebDriver driver){
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			
			FileUtils.copyFile(src, new File("D:\\workspace\\SmartLynx_QA_NewAutomationFramework\\Ouput Screenshots\\Plant\\"+System.currentTimeMillis()+".png"));
		}
		catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	

}
