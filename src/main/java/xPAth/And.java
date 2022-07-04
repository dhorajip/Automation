package xPAth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class And {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//input[@name='txtUsername' and @id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword' and @id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit' and @id='btnLogin']")).click();
	}

}
