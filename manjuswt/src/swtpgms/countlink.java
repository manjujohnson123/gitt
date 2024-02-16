  package swtpgms;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\sele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		driver.get(homepage);
		System.out.println("total link count " +driver.findElements(By.tagName("a")).size());
		//WebElement head=driver.FindElement(By.id(“//id header”));      
		//System.out.println("total link in head " +driver.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.id("pageFooter"));
		System.out.println("total link in footer" +driver.findElements(By.tagName("a")).size());
	}

}
 