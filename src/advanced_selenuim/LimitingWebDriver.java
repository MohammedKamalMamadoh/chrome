package advanced_selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
       
		WebElement language=driver.findElement(By.className("ws-languages__list"));
		System.out.println(language.findElements(By.tagName("a")).size());
		
	}

}
