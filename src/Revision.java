import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revision {

	public static void main(String[] args) 
	{
      WebDriverManager.chromedriver().setup();
      ChromeOptions option= new ChromeOptions();
      ChromeDriver driver = new ChromeDriver(option);
      option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
      option.addArguments("--incognito");
     
      driver.get("https://web.facebook.com/?_rdc=1&_rdr");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      //                  from now all is examples
      WebElement day =driver.findElement(By.id("day"));
      Select S= new Select(day);
      S.selectByValue("15");
      
     List <WebElement> id= driver.findElements(By.id(""));
     id.size();
     id.get(3);
     driver.switchTo().alert().accept();
     driver.switchTo().alert().getText();
     Actions action = new Actions (driver);
     
  
      
      
		

	}

}
