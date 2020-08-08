package selenuimWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skyscanner.net/");
		WebElement text1=driver.findElement(By.id("fsc-origin-search"));
		Actions action= new Actions(driver);
		text1.clear();
		action.moveToElement(text1).click().sendKeys("Cairo").build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		//WebElement text2= driver.findElement(By.id("fsc-destination-search"));
		//text2.clear();
		//action.moveToElement(text2).click().sendKeys("Amsterdam").build().perform();
		//WebElement search=driver.findElement(By.xpath("//button[@type='submit']"));
		//search.click();
		action.sendKeys("Amsterdam").build().perform();
		for (int i = 0; i < 5; i++)
		{
		action.sendKeys(Keys.TAB).build().perform();
		}
		action.sendKeys(Keys.ENTER).build().perform();
		

	}

}
