package selenuimWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_RadioButtons {

	public static void main(String[] args) {
		/*		
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement option1 =driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		option1.click();
		System.out.println(option1.isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
       */
		//////////////////////////////////  webElements    ////////////////////////////
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		List <WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
		//checkboxes.get(2).click();
		//System.out.println(checkboxes.size());
		int count= checkboxes.size();
		for (int i = 0; i < count; i++)
		{
			checkboxes.get(i).click();
			
		}
	}

}
