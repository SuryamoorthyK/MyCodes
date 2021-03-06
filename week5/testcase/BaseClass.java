package week5.testcase;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;
	  public String fileName;
	  
	  @Parameters({"url", "userName", "password"})
	  @BeforeMethod
	  public void beforeMethod(String url, String userName, String password) {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
	  }
	  @AfterMethod
	  public void afterMethod() {
			driver.close();
	  }
	  @DataProvider (name= "fetchData")
	  public String[][] sendData() throws IOException {
			return ReadExcel.readExcel(fileName);

	}

}
