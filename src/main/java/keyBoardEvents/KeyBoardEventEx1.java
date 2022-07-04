package keyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventEx1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		Actions a1 = new Actions(driver);

		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.click();
		a1.keyDown(username, Keys.SHIFT).sendKeys("admin").keyUp(username, Keys.SHIFT).build().perform();

		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		// password.click();
		a1.moveToElement(password).keyDown(password, Keys.SHIFT).sendKeys("admin123").keyUp(password, Keys.SHIFT)
				.build().perform();

		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
