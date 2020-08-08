package advanced_selenuim;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckAllBrokenLinks
{
	WebDriver driver;

	@BeforeMethod
	public void initiate()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.navigate().to("https://the-internet.herokuapp.com/");
	}
	@Test
   public void Brokenlinks()
   {
   List<WebElement> links= driver.findElements(By.tagName("a"));
   int linksNumber= links.size();
   System.out.println(linksNumber);
   for (int i = 0; i < linksNumber; i++)
   {
	   WebElement element= links.get(i);
	   String url= element.getAttribute("href");
	   verifylinks(url);
   }
   
}
public static void verifylinks(String url)
{
	try {
		URL link= new URL(url);
		HttpURLConnection httpconnection = (HttpURLConnection) link.openConnection();
		httpconnection.setConnectTimeout(2000);
		httpconnection.connect();
		int response= httpconnection.getResponseCode();
		if (response==200)
		{
			System.out.println(url +"___"+httpconnection.getResponseMessage());
			
		}
		if (response==400) 
		{
			System.out.println(url +"____"+httpconnection.getResponseMessage());
		}
		
		
	} catch (MalformedURLException e)
	{
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}