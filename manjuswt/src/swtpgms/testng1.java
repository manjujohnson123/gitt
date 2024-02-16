package swtpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class testng1 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\SWT\\Desktop\\sele\\chromedriver.exe";
	public WebDriver driver ;
	@BeforeTest
	public void launchBrowser() {
	System.out.println("launching chrome browser");
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Welcome: Mercury Tours";
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, expectedTitle);
	
	}
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
  }


