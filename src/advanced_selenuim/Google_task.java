package advanced_selenuim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_task {
// not working
	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("irbid");
		WebElement elements =driver.findElement(By.xpath("//ul[@role='listbox']"));
		
		List <WebElement> results= elements.findElements(By.cssSelector(".sbl1"));
		
		
		for(int i=0;i<results.size(); i++)
		{
		System.out.println(results.get(i).getText());
		
		
	    }
	}

}
