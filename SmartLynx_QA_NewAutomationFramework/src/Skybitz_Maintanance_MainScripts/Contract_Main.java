package Skybitz_Maintanance_MainScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utility.Constant;
import Utility.ExcelUtils;
import ContractFunctionalities.Contract;

@SuppressWarnings("unused")
public class Contract_Main {

	

	private static WebDriver driver;
		 
		public static void main(String[] args) throws Exception {
			
			
			
			
        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Contract");
        
        Thread.sleep(2000);
        
        Contract.Execute(driver);
       
 	}
	}


