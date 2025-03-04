package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.xpath("//input[@id='simple']")).click();
		Thread.sleep(1000);
		Alert alt =driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		Thread.sleep(1000);
		Alert alt1 =driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.dismiss();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Thread.sleep(1000);
		Alert alt2 =driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.sendKeys("Aswinth");
		alt2.accept();
		System.out.println(driver.findElement(By.xpath("//div[@id='prompt_demo']")).getText());
		driver.quit();
	}
}
