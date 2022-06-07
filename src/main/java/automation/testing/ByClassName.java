package automation.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		// Instantiate a Chrome class driver
		WebDriver driver = new ChromeDriver();

		// Launch Website
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		// Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		int buttons = driver.findElements(By.className("quickLinkText")).size();
		
		System.out.println(buttons);

	}

}
