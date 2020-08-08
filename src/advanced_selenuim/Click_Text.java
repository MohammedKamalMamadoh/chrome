package advanced_selenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_Text {

	public static void main(String[] args) 
	{
        ChromeOptions option = new ChromeOptions();
        option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        option.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.bbc.com/");
		//driver.findElement(By.xpath("//*[text()='News']")).click();
	
		driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
	
		
		// ("//*[contains(text(),'sign')]")
		
	}

}
