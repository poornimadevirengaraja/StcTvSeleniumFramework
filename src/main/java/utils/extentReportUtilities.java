package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseTest;

public class extentReportUtilities implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	String repName;

	public void onStart(ITestContext testContext) {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName = "Test Report - " + timeStamp + ".html";

		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);

		sparkReporter.config().setDocumentTitle("Selenium Java Automation - Stc TV Project");
		sparkReporter.config().setReportName("Stc TV Automation Reports");
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "Stc TV Web Application");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "Poornima Devi");

	}

	public void onTestSuccess(ITestResult result) {

		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.PASS, result.getName());
		

	}

	public void onTestFailure(ITestResult result) {

		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.FAIL, "Test Failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());
		
		
		  String filename = System.getProperty("user.dir") + File.separator +
		  "screenshots" + File.separator + result.getMethod().getMethodName();
		  System.out.println(filename); File srcfile = ((TakesScreenshot)
		  BaseTest.driver).getScreenshotAs(OutputType.FILE); 
		  File destfile = new File(filename + ".png"); 
		  try { FileUtils.copyFile(srcfile, destfile); } 
		  catch(IOException e) 
		  { 
			  // TODO Auto-generated catch block e.printStackTrace();
		
		  } 

	}

	public void onTestSkipped(ITestResult result) {

		test = extent.createTest(result.getName());
		test.createNode(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, "Test Skipped");
		test.log(Status.SKIP,  result.getThrowable().getMessage());

	}

	public void onFinish(ITestContext testcontext) {

		extent.flush();

	}

	
//	  public  void transform(
//		      ITestAnnotation annotation, 
//		      Class testClass,
//		      Constructor testConstructor,
//		      Method testMethod,
//		      Class<?> occurringClazz) {
//		  
//		  annotation.setRetryAnalyzer(RetryAnalyser.class);
//		  
//		  }
}
