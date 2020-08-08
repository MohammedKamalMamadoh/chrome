package advanced_selenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ar.hotels.com/");	
	    WebElement calender=	driver.findElement(By.name("q-localised-check-in"));
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('value','"+"2020/07/25"+"');",calender) ;
		

	}

}
