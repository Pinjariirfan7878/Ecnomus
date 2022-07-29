package com.testNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class priorityTest {

	@Test(priority = 1)
	public void wayToResto()
	{
		Assert.fail();
		System.out.println("Reached Restro");
	}

	@Test(priority = 2,dependsOnMethods = "wayToResto",alwaysRun = true,invocationCount = 1)
	public void orderFood()
	{
		System.out.println("Order given");

	}

	@Test(priority = 3, dependsOnMethods = "orderFood")
	public void ateFood()
	{
		System.out.println("Food finished");
	}

	@Test(priority = 4,enabled = false)
	public void Billpayment()
	{
		System.out.println("payment done");
	}

	@Test(priority = 5,enabled = true,invocationCount = 1)
	public void cameOutRestro() throws Exception
	{
		System.out.println("Going Home");
		throw new SkipException("skip Info");
	}
}
