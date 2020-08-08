package selenuimWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://echoecho.com/javascript4.htm");
		driver.manage().window().maximize();
        WebElement alert= driver.findElement(By.xpath("//input[@value='prompt box']"));
        alert.click();
        //System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Text");
        
	}

}
