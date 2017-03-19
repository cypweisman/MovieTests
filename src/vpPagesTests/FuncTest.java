package vpPagesTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FuncTest {
	
	protected static WebDriver driver; 
	
	@BeforeClass 
	public static void setUp(){ 
		System.setProperty("webdriver.gecko.driver", "/Users/cyweisman/Documents/workspace/AutoTest/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanUp(){
        driver.manage().deleteAllCookies();
    }
	
	@AfterClass
	public static void tearDown(){
        driver.quit();
    }

}
