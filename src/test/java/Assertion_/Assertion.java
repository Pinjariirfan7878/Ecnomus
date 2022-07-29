package Assertion_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion{
	@Test
	public void AssertTest() throws Exception
	{

		System.out.println("Open Browser");

		System.out.println("Enter URL");
		String actual_Url="www.facebook.com";
		String Expected_URL="www.facebook.com";
		SoftAssert softassert =new SoftAssert();
		softassert.assertEquals(actual_Url, Expected_URL);

		System.out.println("Login the application");
		String acLoginpage_titile="facebook.login";
		String exLoginpage_titile="facebook.login";
		softassert.assertEquals(acLoginpage_titile, acLoginpage_titile);

		System.out.println("Home page should be displayed");
		String actualHome_title="facebook.home";
		String expectedHome_title="facebook.home";
		Assert.assertEquals(actualHome_title,expectedHome_title);
		softassert.assertAll();


















		//	WebDriverManager.firefoxdriver().setup();
		//	WebDriver driver=new FirefoxDriver();
		//	driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//	driver.get("https://www.facebook.com/");
		//
		//	WebElement usertextbox=driver.findElement(By.xpath("//input[@name='email']"));
		//	usertextbox.sendKeys("pinjariirfan27@gmail.com");
		//	WebElement pwdtextbox=driver.findElement(By.xpath("//input[@name='pass']"));
		//	pwdtextbox.sendKeys("Aleena@8866");
		//	WebElement loginbtn=driver.findElement(By.xpath("//button"));
		//	loginbtn.click();


	}
}