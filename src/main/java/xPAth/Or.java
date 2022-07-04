package xPAth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Or {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//input[@name='txtUsername' or @id='txtUname']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword' or @id='txassrd']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit' or @id='bogin']")).click();
	}
}
