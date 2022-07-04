package mouseEvents;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");

		Actions act = new Actions(driver);

		act.doubleClick(username).contextClick(username).build().perform();
		//driver.quit();
	}
}
