package advanced_selenuim;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
//import org.openqa.selenium.support.pagefactory.ByAll;
//import org.openqa.selenium.support.pagefactory.ByChained;

public class ByALL_ByChainedID {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ar-ar.facebook.com/");
		//driver.findElement( new ByAll(By.id("email"),By.name("email"))).sendKeys("test");
		//driver.findElement(new ByChained(By.id("loginbutton"),By.tagName("input"))).click();
		driver.findElement(new ByIdOrName("email")).sendKeys("kimo");
		
			}

}
