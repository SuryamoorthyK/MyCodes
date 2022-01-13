package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		// Locate the element with select tag
		WebElement dd = driver.findElement(By.id("dropdown1"));
		
		// Create the object for Select class
		Select dropdown = new Select(dd);
		
		// Choose the option
		// dropdown.selectByVisibleText("Selenium");
		
		// dropdown.selectByValue("4");
		
		// dropdown.selectByIndex(1);
		
		int size = dropdown.getOptions().size();
		dropdown.selectByIndex(size-3);
		
		
		
	
	}

}
