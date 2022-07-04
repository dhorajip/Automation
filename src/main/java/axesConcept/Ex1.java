package axesConcept;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='Admin']")).click();

		// self
		String text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/self::a")).getText();
		System.out.println("Self : " + text);

		// parent
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/parent::td")).getText();
		System.out.println("Parent : " + text);

		// child
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/child::td[2]")).getText();
		System.out.println("Child : " + text);

		// Ancestor
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr")).getText();
		System.out.println("Ancestor : " + text);

		// Descendant
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/descendant::td[2]"))
				.getText();
		System.out.println("Descendant : " + text);

		// Descendant - selects all Descendants(children, grandchildren, etc.)
		List<WebElement> descendants = driver
				.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes : " + descendants.size());

		// Following
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/following::tr[1]"))
				.getText();
		System.out.println("Following : " + text);

		// Following - selects everything in the document after the closing tag of the
		// current node
		List<WebElement> Following = driver
				.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/following::tr"));
		System.out.println("Number of Following nodes : " + Following.size());

		// Following-siblings
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/following-sibling::tr[1]"))
				.getText();
		System.out.println("Following-siblings : " + text);

		// Following-siblings - selects all siblings after the current node
		List<WebElement> followingsiblings = driver
				.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of Following-siblings nodes : " + followingsiblings.size());

		// Preceding
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/preceding::tr[1]"))
				.getText();
		System.out.println("Preceding : " + text);

		// Preceding - selects all nodes that are appear before the current node in the
		// document
		List<WebElement> Preceding = driver
				.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of Preceding nodes : " + Preceding.size());

		// Preceding-siblings
		text = driver.findElement(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/preceding-sibling::tr[1]"))
				.getText();
		System.out.println("Preceding-sibling  : " + text);

		// Preceding-siblings - selects all siblings before the current node in the
		// document
		List<WebElement> Precedingsibling = driver
				.findElements(By.xpath("//a[contains(text(),'Garry.White')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of Preceding-sibling nodes : " + Precedingsibling.size());

	}
}
