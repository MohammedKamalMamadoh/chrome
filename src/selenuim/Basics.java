package selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.get("https://www.google.com/?hl=ar" );
		String currentURL=driver. getCurrentUrl();
		if (currentURL.contentEquals("https://www.google.com/?hl=ar"))
		{
		System.out.println("pass");	
		}
		else
		{
			System.out.println("faild");
		}
		String CurrentTitle =driver.getTitle();
		if (CurrentTitle.contentEquals("Google"))
		{
		System.out.println("pass");	
		}
		else
		{
			System.out.println("faild");
		}
		System.out.println(CurrentTitle);
		
	}
}
