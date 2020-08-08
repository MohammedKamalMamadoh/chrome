package selenuimWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		//WebElement emailvalue = driver.findElement(By.id("email"));
		//emailvalue.sendKeys("kimo email");
		
		//******************** Drop down list *******************
		WebElement day = driver.findElement(By.id("day"));
		WebElement month= driver.findElement(By.id("month"));
		WebElement year= driver.findElement(By.id("year"));
		Select yearvalue =new Select(year);
		Select monthvalue=new Select(month);
		Select dayvalue =new Select(day);
		dayvalue.selectByIndex(23);
		dayvalue.selectByValue("30");
		dayvalue.selectByVisibleText("20");
		monthvalue.selectByVisibleText("Jul");
		yearvalue.selectByValue("1992");
		

	}

}
