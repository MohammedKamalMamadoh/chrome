package advanced_selenuim;

import java.io.IOException;
import java.util.List;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class CheckAllBrokenImages {
	WebDriver driver;
	
	@BeforeMethod
	public void initiate()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
	    driver= new ChromeDriver();
	   // driver.navigate().to("https://the-internet.herokuapp.com/broken_images");
	    driver.get("http://google.com");
	}
	
	@Test
	public void brokenimages()
	{
		
//	}
//	public static void verifyBRokenImages(WebElement image)
//	{
//	HttpClient client= HttpClientBuilder.create().build();
//	HttpGet request =new HttpGet(image.getAttribute("src"));
//	try {
//		HttpResponse response= client.execute(request);
//		if (response.getCode()!=200)
//		{
//			
//		}
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
		int invalidImageCount = 0; 

		 
		

		List<WebElement> imagesList = driver.findElements(By.tagName("img")); 
		System.out.println("Total no. of images are " + imagesList.size()); 

		for (WebElement imgElement : imagesList) { 
		 if (imgElement != null) { 
		  try { 
		   HttpClient client = HttpClientBuilder.create().build(); 
		   HttpGet request = new HttpGet(imgElement.getAttribute("src")); 
		   HttpResponse response = client.execute(request); 

		   // verifying response code he HttpStatus should be 200 if not, 
		   // increment as invalid images count 

		   if (response.getStatusLine().getStatusCode() != 200) 
		     invalidImageCount++; 
		   } catch (Exception e) { 
		     e.printStackTrace(); 
		   }
		  } 
		 } 

		System.out.println("Total no. of invalid images are " + invalidImageCount);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
