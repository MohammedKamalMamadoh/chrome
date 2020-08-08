package advanced_selenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement fram= driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		//driver.switchTo().frame("a077aa5e");
		driver.switchTo().frame(fram);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		

	}

}
