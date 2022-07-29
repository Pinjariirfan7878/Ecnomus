package auto_IT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadTest {
	
	@Test
	public void uploadFileTest() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freepdfconvert.com/");
		driver.findElement(By.xpath("//a[@class='btn-wrapper upload-btn']")).click();
		Runtime.getRuntime().exec("C:/Program Files (x86)/AutoIt3/FileUpload2.exe");
		
	}

}
