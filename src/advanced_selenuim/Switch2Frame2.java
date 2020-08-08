package advanced_selenuim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch2Frame2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*       1 frame
		driver.get("https://jqueryui.com/droppable/"); 
		List<WebElement> frame =driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		driver.switchTo().frame(0);
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop =driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		*/
		driver.get("http://demo.guru99.com/test/guru99home/");
		int frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
		
//		for (int i = 0; i < frame; i++) 
//		{
//		driver.switchTo().frame(i);
//		int image =	driver.findElements(By.cssSelector("img[src='Jmeter720.png']")).size();
//		driver.switchTo().defaultContent();
//		System.out.println(image);
//		
//		}
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("img[src='Jmeter720.png']")).click();
		driver.quit();
		
		
		
	}

}
