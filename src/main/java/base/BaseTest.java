package base;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	

	
	String repName;
	public ExtentSparkReporter sparkReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	@BeforeTest
	public void beforetestmethod() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName = "Stc TV's Extent Test Report - " + timeStamp + ".html";

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

	@BeforeMethod
	@Parameters("browser")
	public void beforemethodmethod(String browser, Method testMethod) {
		logger = extent.createTest(testMethod.getName());
		setupdriver(browser);
		driver.manage().window().maximize();
		System.out.println(utils.BaseConstants.url);
		driver.get(utils.BaseConstants.url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void aftermethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Testcase Failed", ExtentColor.RED));
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getThrowable() + " Testcase Failed", ExtentColor.RED));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.FAIL,
					MarkupHelper.createLabel(result.getName() + " Testcase Skipped", ExtentColor.ORANGE));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Testcase Passed", ExtentColor.GREEN));
		}
		driver.quit();
	}

	public static void setupdriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	@AfterTest
	public void AfterTest() {
		extent.flush();
	}

}
