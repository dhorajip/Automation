package automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		// Instantiate a Chrome class driver
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		// Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("txtUsername")).sendKeys("Admin");
		driver.findElement(By.linkText("txtPassword")).sendKeys("admin123");
		driver.findElement(By.linkText("Submit")).click();		

	}

}
