package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		w.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//input[@id='small-searchterms']")),"id","small-searchterms"));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		driver.quit();
	}
}
