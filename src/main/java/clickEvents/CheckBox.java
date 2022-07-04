package clickEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='69']")).click();
		driver.findElement(By.xpath("//input[@value='12']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='27']")).click();
		driver.findElement(By.xpath("//input[@value='43']")).click();
		driver.findElement(By.xpath("//input[@value='8']")).click();

	}
}
