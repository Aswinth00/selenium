package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndexingConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@class,'button')])[4]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
