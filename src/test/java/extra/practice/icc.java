package extra.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class icc {
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		Thread.sleep(2000);
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		WebElement tabledata=driver.findElement(By.xpath("//div[@class='rankings-block__container full rankings-table']"));
		System.out.println(tabledata.getText());
		Thread.sleep(2000);
		WebElement tr=driver.findElement(By.xpath("//span[text()='India']/../.."));
		System.out.println("SINGLE ROW DATA ");
		System.out.println("****************");
		System.out.println(tr.getText());
		System.out.println("****************");
		System.out.println("TEAM NAME");
		
		List<WebElement> team_name=driver.findElements(By.xpath("//div[@class='rankings-block__container full rankings-table']//tr[*]//td[2]"));
		System.out.println("Team size is :"+team_name.size());
		
		for(WebElement team:team_name)
		{
			System.out.println(team.getText());
		}
		System.out.println("****************");
		
		for(int i=0;i<=1;i++)
		{
			System.out.println(team_name.get(i).getText());
		}	
//	   WebElement table=driver.findElement(By.xpath("//table"));
//	   System.out.println(table.getText());
		
		
		
	}

}
