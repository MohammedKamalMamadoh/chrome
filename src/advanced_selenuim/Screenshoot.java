package advanced_selenuim;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Screenshoot {
	WebDriver driver;
	@Test
	public void searc(String name) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\courses_resources\\eclipse&JDK\\5-web_driver\\chromedriver.exe");
	    driver= new ChromeDriver();
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File("C:\\Users\\huawei\\eclipse-workspace\\Chrome\\screenshoots\\"+name+".png"));
	}
	

	@BeforeMethod
    public void teardown(ITestResult result, String name) throws IOException
    {
		if (ITestResult.FAILURE==result.getStatus()) 
		{
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("C:\\Users\\huawei\\eclipse-workspace\\Chrome\\screenshoots\\"+name+".png"));
			
		}
		
    }
}
