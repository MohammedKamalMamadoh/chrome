package advanced_selenuim;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		WebElement link= driver.findElement(By.linkText("Click Here"));
		link.click();
		System.out.println(driver.getCurrentUrl());
		Set <String> ids= driver.getWindowHandles();
		Iterator <String> it= ids.iterator();
		String parentID=it.next();
		String chiledID=it.next();
		driver.switchTo().window(chiledID);
		driver.findElement(By.name("emailid")).sendKeys("kimo ya wad");
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(parentID);
        System.out.println(driver.getCurrentUrl());
	}

}
