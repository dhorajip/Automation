package clickEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		// driver.findElement(By.xpath("//label[text()='Female']")).click();

		System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[text()='Male']")).isSelected());
		// select female radio button
		if (driver.findElement(By.xpath("//label[text()='Female']")).isSelected() == false) {
			driver.findElement(By.xpath("//label[text()='Female']")).click();
		}

	}
}
