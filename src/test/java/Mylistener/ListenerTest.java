package Mylistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(listener.class)
public class ListenerTest {

	public static WebDriver driver;

	@Test()
	public void ListenerTest_1()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		String actual_Url=driver.getCurrentUrl();
		String Expected_Url="https://www.flipkart.com/";
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actual_Url, Expected_Url);
		softassert.assertAll();
	}

	@Test(retryAnalyzer = Retry_Analyzer.RetryAnalyzerGenClass.class)
	public void ListenerTest_2()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String actual_Url=driver.getCurrentUrl();
		String Expected_Url="https://www.google.com";
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actual_Url, Expected_Url);
		softassert.assertAll();
	}

}
