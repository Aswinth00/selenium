package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("madurai"+Keys.ENTER);
		Thread.sleep(2500);
		driver.findElement(By.xpath("//div[contains(@class,'recaptch')]")).click();
		Thread.sleep(2500);
		driver.quit();
	}
}
