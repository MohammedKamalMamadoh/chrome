package selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_size {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.google.com/?hl=ar");
	//	driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println(driver.getWindowHandle());
	}

}
