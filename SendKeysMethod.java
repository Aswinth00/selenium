package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element= driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		element.sendKeys("mobiles");
		Thread.sleep(1500);
		element.clear();
		Thread.sleep(1500);
		element.sendKeys("computer");
	}
}
