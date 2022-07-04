package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement source = driver.findElement(By.id("box1"));

		WebElement target = driver.findElement(By.id("box103"));

		WebElement source1 = driver.findElement(By.xpath("//div[@id='box5']"));

		WebElement target1 = driver.findElement(By.xpath("//div[@id='box104']"));

		Actions act = new Actions(driver);

		act.clickAndHold(source).moveToElement(target).release().build().perform();

		act.clickAndHold(source1).moveToElement(target1).release().build().perform();

		// act.dragAndDrop(source, target).build().perform();

	}
}
