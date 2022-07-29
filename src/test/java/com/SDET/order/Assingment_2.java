package com.SDET.order;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung s20 fe 5g",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String parentWH=driver.getWindowHandle();
		Set<String>allWH=driver.getWindowHandles();
		for(String WH:allWH)
		{
			if(!parentWH.equals(WH))
			{
				driver.switchTo().window(WH);
			}
		}
		Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		System.out.println("***************************");
		System.out.println("flipkart price is : "+price.getText());
		String A=price.getText();
		A=A.replaceAll("[^\\d]", "");
		int flipkart=Integer.parseInt(A);
		System.out.println(flipkart);
		System.out.println("***************************");
		driver.close();
		driver.switchTo().window(parentWH);
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung s20 fe 5g",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		String AparentWH=driver.getWindowHandle();
		Set<String> AallWH=driver.getWindowHandles();
		for(String AWH:AallWH)
		{
			if(!AparentWH.equals(AWH))
			{
				driver.switchTo().window(AWH);
			}
		}
		Thread.sleep(3000);
		WebElement Aprice=driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']"));
		System.out.println("*****************************");
		System.out.println("Amazon price is : "+Aprice.getText());
		String B=Aprice.getText();
	    String B2=B.replaceAll("₹", "");
		String B3=B2.replaceFirst(",", "");
		float amazon=Float.parseFloat(B3);
		driver.quit();
		
		
		if(flipkart<amazon)
		{
			System.out.println("Flipkar price is cheap compare to amazon "+flipkart);
		}
		else if(flipkart>amazon)
		{
			System.out.println("Amazon price is cheap compare to flipkart "+amazon);
		}
		else 
		{
			System.out.println("Both are providing same price");
		}
				
	}

}
