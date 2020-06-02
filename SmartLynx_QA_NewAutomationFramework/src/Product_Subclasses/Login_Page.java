package Product_Subclasses;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import Utility.ExcelUtils;
import org.openqa.selenium.WebElement;

public class Login_Page {

public static WebElement Element = null;

public static WebElement txtbx_UserName(WebDriver driver) throws Exception{

Element = driver.findElement(By.name("username"));
ExcelUtils.setCellData("Pass", 3, 7);

return Element;

}

 public static WebElement txtbx_Password(WebDriver driver) throws Exception{

 Element = driver.findElement(By.name("password"));
 ExcelUtils.setCellData("Pass", 4, 7);
 return Element;
 }

 public static WebElement btn_LogIn(WebDriver driver) throws Exception{

 Element = driver.findElement(By.name("login"));
 ExcelUtils.setCellData("Pass", 5, 7);
 return Element;
 
 
 
 

}

}