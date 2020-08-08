package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		//driver.findElement(By.linkText("Forgot password?")).click();
		//  to click on link text with part of link text value 
		//driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.className("form__label--floating")).sendKeys("hatem");
		

	}

}
