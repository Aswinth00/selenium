package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(1000);
	//	js.executeScript("arguments[0].scrollIntoview(true)",driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")));
	     js.executeScript("window.scrollTo(0,500);");
	
	}
	

}
