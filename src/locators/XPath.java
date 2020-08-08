package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
	/*	
        //driver.get("https://www.booking.com/index.ar.html?label=gen173nr-1DCAEoggI46AdIM1gEaEOIAQGYAQG4ARfIAQzYAQPoAQGIAgGoAgO4ApyFpPcFwAIB0gIkNWMyZjA1N2EtYmI5ZC00YjM3LTkwOTYtODczYzlhZGJlZmY02AIE4AIB;sid=53d9fb8a4b4ed94538dfad014441c738;keep_landing=1&sb_price_type=total&");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();
    	//	driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();
        //in case the id is alpha numeric and we only have the id in this case we will 
		//use xpath but with contain
        //tagename[contains(@attribute,'value')]
 */
		driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input")).sendKeys("kimo");
		//driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/form/table/tbody/tr/td[2]/input")).sendKeys("pass");
		driver.findElement(By.xpath("(//body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input)[2]")).sendKeys("kimo");
	}

}
