package clickEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='Recruitment']")).click();

		Select jobTitle = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']")));
		jobTitle.selectByIndex(1);
		Thread.sleep(2000);

		Select application = new Select(
				driver.findElement(By.xpath("//select[@id='candidateSearch_modeOfApplication']")));
		application.selectByVisibleText("Manual");
		Thread.sleep(2000);

		Select status = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_status']")));
		status.selectByValue("HIRED");
	}
}
