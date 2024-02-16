package stmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe";
	    public WebDriver driver; 
	    public String expected = null;
	    public String actual = null;
	
	
	
@Test(priority=0)
public void register() {
	  driver.findElement(By.linkText("REGISTER")).click() ;
   expected = "Register: Mercury Tours";
   actual = driver.getTitle();
   Assert.assertEquals(actual, expected);
	 
}
@Test(priority=1)
public void support() {
   driver.findElement(By.linkText("SUPPORT")).click() ;
   expected = "Under Construction: Mercury Tours";
   actual = driver.getTitle();
   Assert.assertEquals(actual, expected);
}

@BeforeMethod
public void beforeMethod() {
	  String expectedTitle = "Welcome: Mercury Tours";
   String actualTitle = driver.getTitle();
   Assert.assertEquals(actualTitle, expectedTitle);
	  
}

@AfterMethod
public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click() ;
}

@BeforeTest
public void beforeTest() {
	  
	  System.out.println("launching chromebrowser"); 
   System.setProperty("webdriver.chrome.driver", driverPath);
   driver= new ChromeDriver();
   driver.get(baseUrl);
}

@AfterTest
public void afterTest() {
	  driver.close();
}
}