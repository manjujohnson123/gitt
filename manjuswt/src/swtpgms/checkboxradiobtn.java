package swtpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxradiobtn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\sele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		//Radio Button 1 is selected
		radio1.click();
		System.out.println("Radio Button Option 1 Selected");
		//Radio Button 1 is deselected and Radio Button 2 is selected
		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
		// Selecting CheckBox
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		// This will Toggle the Checkbox
		option1.click();
		// Check whether the Checkbox is toggled on
		if (option1.isSelected()) {
		System.out.println("Checkbox is Toggled On");
		} else {
		System.out.println("Checkbox is Toggled Off");
		}

	}

}
