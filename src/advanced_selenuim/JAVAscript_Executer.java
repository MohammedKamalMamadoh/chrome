package advanced_selenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVAscript_Executer {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
	    WebElement submit= driver.findElement(By.id("philadelphia-field-submit"));
	    JavascriptExecutor js= ((JavascriptExecutor) driver);
       //        scroll with java script command
       //	     js.executeScript("arguments[0].scrollIntoView(true);", submit);
	    //        scroll with java script command to specific point 
	    //        js.executeScript("scrollBy(0,2000)")  
       //        click with java script command
	    
    	js.executeScript("history.go(0)");
	   // js.executeScript("arguments[0].click();", submit);

}
}