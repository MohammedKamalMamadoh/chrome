package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.facebook.com" );
		driver.findElement(By.name("email")).sendKeys("Email is");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		
	}

}
