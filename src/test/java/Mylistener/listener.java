package Mylistener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Test Success");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Test Failure");
		
		TakesScreenshot ts = (TakesScreenshot)ListenerTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="D:\\KCSM13\\SDET2\\Screenshot\\"+result.getMethod().getMethodName()+".png";
		File dst=new File(path);
		try {
			Files.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"Test Skipped");

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");

	}



}
