package mouseEvents;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		Actions act = new Actions(driver);

		WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement userManage = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));

		act.moveToElement(admin).build().perform();
		act.moveToElement(userManage).build().perform();
		act.moveToElement(users).click().build().perform();

	}
}
