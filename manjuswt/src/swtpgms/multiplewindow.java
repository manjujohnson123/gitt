package swtpgms;

import java.util.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindow {
	public void Multi() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\sele\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.findElement(By.linkText("Forgotten account?")).click();
			Set<String> a=driver.getWindowHandles();
			Iterator<String> it=a.iterator();
			while(it.hasNext())
			{
			String childwindow=it.next();
			driver.switchTo().window(childwindow);
			}
		}
			catch(Exception exception)
			{
				System.out.println(exception);
			}

			
		
	}

	public static void main(String[] args) {
		multiplewindow obj=new multiplewindow();
		obj.Multi();
		
	}

}
