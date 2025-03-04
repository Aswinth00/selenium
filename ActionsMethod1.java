package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
		WebElement searchtext = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement button = driver.findElement(By.xpath("//input[@value='Search']"));
		Actions a = new Actions(driver);
		a.moveToElement(element).moveToElement(searchtext).pause(Duration.ofSeconds(2)).sendKeys(searchtext,"computer").pause(Duration.ofSeconds(2)).click(button).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
