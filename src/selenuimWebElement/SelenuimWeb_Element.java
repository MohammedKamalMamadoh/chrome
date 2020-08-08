package selenuimWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenuimWeb_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		WebElement emailvalue = driver.findElement(By.id("email"));
		emailvalue.sendKeys("kimo email");
		
	}

}
