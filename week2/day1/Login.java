package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		// Setup the Driver
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		// Setup the Driver manually
		// System.setProperty("webdriver.chrome.driver", "D:\\Testleaf - Selenium files\\chromedriver_win32\\chromedriver.exe");
		
		// Setup the Drivers manually by using project folder
		// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		// Launch the Browser
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Minimize the browser
		// driver.manage().window().minimize();
		
		// Get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		// Enter the Username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Enter the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRMSFA hyperlink
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Close the browser
		// driver.close();
		

	}

}
