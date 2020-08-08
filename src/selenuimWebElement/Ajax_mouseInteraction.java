package selenuimWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajax_mouseInteraction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	WebElement electronics=	driver.findElement(By.linkText("Electronics"));
	WebElement Samsung= driver.findElement(By.linkText("Samsung"));
	Actions action1= new Actions (driver);
	action1.moveToElement(electronics).keyDown(Keys.CONTROL).click(Samsung).build().perform();
	//   

	/*
	WebElement search= driver.findElement(By.id("gh-ac"));
	Actions searchAction = new Actions(driver);
	//searchAction.moveToElement(search).build().perform();
    //search.sendKeys("kimo");
    searchAction.moveToElement(search).click().sendKeys("test").doubleClick().build().perform();
    
    WebElement fashion = driver.findElement(By.linkText("Fashion"));
    Actions action2= new Actions(driver);
    action2.moveToElement(fashion).contextClick().build().perform();
    */
	}

}
