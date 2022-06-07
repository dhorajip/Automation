package automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		// Instantiate a Chrome class driver
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		// Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
	}

}
