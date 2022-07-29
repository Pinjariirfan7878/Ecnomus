package com.SDET.order;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment_1 {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 13",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		WebElement price=driver.findElement(By.xpath("//div[.='₹73,999']"));
	    System.out.println("Price of iphone 13 is :"+price.getText());
	    String WH1=driver.getWindowHandle();
	    Set<String> allWH =driver.getWindowHandles();
	     for(String Wh:allWH)
	     {
	    	 if(!WH1.equals(Wh))
	    	 {
	    		 driver.switchTo().window(Wh);
	    	 }
	     }
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[local-name()='svg' and @class='_1KOMV2']")).click();
	    
	    
	    WebElement ele=driver.findElement(By.xpath("//button[@class='_23FHuj']/.."));
	    Point loc=ele.getLocation();
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy"+loc);
	    driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='+']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='+']")).click();
	    WebElement tprice=driver.findElement(By.xpath("(//span[contains(text(),' ₹')])[3]"));
	    System.out.println("Total price of all product : "+tprice.getText());
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}
