package practice.AmazonDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObject.HomePage;

public class Base {
	
	
	
public WebDriver driver;
public Properties prop;
public HomePage homePageData;


public WebDriver initializeDriver() throws IOException {
	
	prop=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\Goks\\eclipse-workspace\\AmazonDemo\\src\\main\\java\\practice\\AmazonDemo\\config.properties");
	prop.load(file);
	
	String browser=prop.getProperty("browserName");
	
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Goks\\eclipse-workspace\\chromedriver.exe");

		driver = new ChromeDriver();

	}
	
	else if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Goks\\eclipse-workspace\\chromedriver.exe");

		driver = new FirefoxDriver();

	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
}

}
