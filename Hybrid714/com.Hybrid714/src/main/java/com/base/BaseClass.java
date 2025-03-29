package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertiesUtils;

public class BaseClass {

	public static WebDriver driver = null;
	public static ExtentReports report= null;
	public static ExtentSparkReporter spark = null;
	public static ExtentTest test = null;
	public static Logger log = Logger.getLogger("BaseClass");
	
	public static void initialization() {
		log.info("Reading property file for browser");
		System.out.println("Reading property file for browser");
		String browserName= PropertiesUtils.readproperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readproperty("url"));
	}
	
	public void reportInit() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");
		report.attachReporter(spark);
		
	}
	
//	  @BeforeClass
//	    public void setUp() {
//	        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--headless");
//	        webDriver = new ChromeDriver(options);
//	        webDriver.get(baseUrl);
//	        webDriver.manage().window().maximize();
//	    }
}
