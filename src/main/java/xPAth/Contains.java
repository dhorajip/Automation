package xPAth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//input[contains(@name,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name,'txtPassword')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}
}
