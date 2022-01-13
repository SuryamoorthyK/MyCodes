package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExcercise {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
	
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
				
				
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				
		driver.findElement(By.className("decorativeSubmit")).click();
				
				
		driver.findElement(By.linkText("CRM/SFA")).click();
				
				
		driver.findElement(By.linkText("Leads")).click();
				
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dropdown = new Select(dd);
		
		//dropdown.selectByVisibleText("Cold Call");
		
		//dropdown.selectByValue("LEAD_CONFERENCE");
		
		//dropdown.selectByIndex(1);
		
		int size = dropdown.getOptions().size();
		dropdown.selectByIndex(size-4);
		
		
		
		
	}

}
