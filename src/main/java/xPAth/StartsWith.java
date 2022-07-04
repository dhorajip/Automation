package xPAth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//input[starts-with(@name,'txtUs')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[starts-with(@name,'txtPa')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
	}
}
