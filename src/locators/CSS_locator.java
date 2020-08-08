package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		driver.manage().window().maximize();
	    //driver.findElement(By.cssSelector("input[class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-1inuy60 r-utggzx r-vmopo1 r-1w50u8q r-1lrr6ok r-1dz5y72 r-1ttztb7 r-13qz1uu']")).sendKeys("kimooo");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("kimo");
		//driver.findElement(By.cssSelector("#email")).sendKeys("kimo");
		//driver.findElement(By.cssSelector("input.input__input")).sendKeys("test");
		driver.findElement(By.cssSelector("input[id*='u_0_']")).click();
		
		/* css sentax
		 * tagename[arrtibute='value']
		 * another sentax if the attribute is ID
		 * tagname#ID
		 * #ID
		 * another sentax for class
		 * tagename.classValue
		 * OR .classvalue
		 * */
	}

}
