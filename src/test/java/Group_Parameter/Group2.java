package Group_Parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Group2
{
	WebDriver driver;
	//	@Test(groups = "regression")
	//	public void run1()
	//	{
	//		System.out.println("Run11 Method");
	//	}
	//	
	//	@Test(groups = "smoke")
	//	public void run2()
	//	{
	//		System.out.println("Run12 Method");
	//	}
	//	
	//	@Test(groups = {"smoke","regression"})
	//	public void run3()
	//	{
	//		System.out.println("Run13 Method");
	//	}
	@Parameters("Browser")
	@Test(groups = {"smoke","regression"})
	public void configBC(String browser)
	{
		System.out.println("browser");
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.close();
	}


}
