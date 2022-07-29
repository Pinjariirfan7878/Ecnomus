package extent_Report;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Report {
	
	@Test
	public void createReport() throws IOException {
		
		//to add path,titile,themes etc.
		ExtentSparkReporter reporter;
		
		//atteched report manual details
		ExtentReports reports;
		
		// to create enrties in reports
		ExtentTest test;
	
		reporter= new ExtentSparkReporter("D:\\KCSM13\\SDET2\\Report\\ORG1.html");
		reporter.config().setDocumentTitle("TYSS");
		reporter.config().setTheme(Theme.STANDARD);
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Tester", "MR.Irfan");
		reports.setSystemInfo("browser", "Firefox");
		reports.setSystemInfo("browser_version", "104.00");
		reports.setSystemInfo("Environment", "QA");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://facebook.com");

		test=reports.createTest("ORGANIZATION TEST");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		String path="D:\\KCSM13\\SDET2\\Screenshot\\Org1.PNG";
		File dsn=new File(path);
		Files.copy(scr, dsn);
		
		test.addScreenCaptureFromPath(path);
		reports.flush();
	}
	

}
