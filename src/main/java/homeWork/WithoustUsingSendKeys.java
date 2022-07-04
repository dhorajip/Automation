package homeWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoustUsingSendKeys {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		js.executeScript("document.getElementById('btnLogin').click()");

	}
}
