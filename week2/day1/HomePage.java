package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {

	public static void main(String[] args) {
		
		// Setup the Driver
		WebDriverManager.chromedriver().setup();
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Open the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Open the Lead link
		driver.findElement(By.linkText("Leads")).click();
		
		// Open the Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter the CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SK Information Technology");
		
		// Enter the FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suryamoorthy");
		
		// Enter the LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthikeyan");
		
		// Enter the CreateLead Button
		driver.findElement(By.className("smallSubmit")).click();
		
		// Close the Browser
		driver.close();
				

	}

}
