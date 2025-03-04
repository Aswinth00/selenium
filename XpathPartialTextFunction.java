package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPartialTextFunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'computer')]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Jewelry')]")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		Thread.sleep(1500);
		driver.quit();
	}
}
