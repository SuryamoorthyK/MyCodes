package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
        System.out.println("Title of the page:"+driver.getTitle());
        
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
        
        driver.close();
        
	}

}
