package selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.google.com/?hl=ar");
		driver.navigate().to("https://www.youtube.com/watch?v=8S1AXjMSrcI&list=PLJ2FoWouEU2yhXEOO7HFWIQmA32dMCvEB&index=15");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
