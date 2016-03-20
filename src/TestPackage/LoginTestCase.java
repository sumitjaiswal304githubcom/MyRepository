package TestPackage;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.selenesedriver.SendKeys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginTestCase {
	
      WebDriver driver = new FirefoxDriver();
	
	@Test
	public void Action1()
	{
		
    //System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
	driver.get("http://www.koha.com/");
	
	//cron.WriteLog("C:\\log.txt", "User launched application successfully");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit waits
  
	//driver.manage().window().maximize();                             // maximise window
	driver.navigate().refresh();                                     // refresh the window
	
	//driver.switchTo().window("Google");
	}

}
