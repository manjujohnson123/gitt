package ppjkk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yuyui {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	driver.findElement(By.id("email")).sendKeys("ytrfyhhjg");
	driver.findElement(By.id("pass")).sendKeys("2435");
	driver.findElement(By.id("loginbutton")).click();

}
