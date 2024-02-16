package Shpjt;

import java.io.*;

import java.net.*;

import java.util.Iterator;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class allpgms {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWT\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://demo.shcollege.online/login";
		driver.get(homepage);
		//title
		System.out.println("Title is" +driver.getTitle());
		//login
		driver.findElement(By.id("UserName")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("KI#pw143shTvra");
		//check box
		WebElement option1 = driver.findElement(By.id("RememberMe"));
		option1.click();
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button")).click();
		//screenshot
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\SWT\\Desktop\\manjuswt\\sh.jpeg"));
		//count
		System.out.println("total link count " +driver.findElements(By.tagName("a")).size());
		//broke
		
		String url=null;
		HttpsURLConnection huc=null;
		int respcode=200;
		driver.manage().window().maximize();
		
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
		url=it.next().getAttribute("href");
		System.out.println(url);
		if(url==null || url.isEmpty())
		{
		System.out.println("url is not configured or its empty");
		continue;
		}
		if(!url.startsWith(homepage))
		{
		System.out.println("url belongs to another domain");
		continue;
		}
		try{
		huc=(HttpsURLConnection)(new URL(url).openConnection());
		huc.setRequestMethod("HEAD");
		huc.connect();
		respcode=huc.getResponseCode();
		if(respcode>=400)
		{
		System.out.println(url+ "is a broken link");
		}
		else
		{
		System.out.println(url+ "is a valid link");
		}
		}catch(MalformedURLException e){
		e.printStackTrace();
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
   }
  }
}
