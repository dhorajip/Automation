package xPAth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByDynamicXpath {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// xpath with OR
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' or @name='p']")).sendKeys("javatpoint");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gNO89b' or @name='btK']")).click();
	}
}
