package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.linkText("Register"));
		element.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if
		(title.contains("Register")) {
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
			driver.quit();
		}
	}
}




