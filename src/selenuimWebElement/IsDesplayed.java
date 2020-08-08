package selenuimWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDesplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.expedia.com/?pwaLob=wizard-hotel-pwa-v2");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Flights")).click();
		System.out.println(driver.findElement(By.cssSelector("#d2-btn")).isDisplayed());
		driver.findElement(By.linkText("One-way")).click();
		System.out.println(driver.findElement(By.cssSelector("#d2-btn")).isDisplayed());

	}

}
