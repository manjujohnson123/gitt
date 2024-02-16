package swtpgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\sele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		System.out.println("Title is " +driver.getTitle());
		String expected="Log in to Facebook";
		String actual=driver.getTitle();
		if(expected.contentEquals(actual))
		{
		System.out.println("test case passed");
		}
		else
		{
		System.out.println("test case failed");
		}

	}

}
