package Group_Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Group {
	@Parameters("UserName")
	@Test(groups = "smoke")
	public void run1(String username)
	{
		System.out.println(username);
		System.out.println("Run1 Method");
	}

	@Test(groups = "regression")
	public void run2()
	{
		System.out.println("Run1 Method");
	}

	@Test(groups = {"smoke","regression"})
	public void run3()
	{
		System.out.println("Run1 Method");
	}
}
