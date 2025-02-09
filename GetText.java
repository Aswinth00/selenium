package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element= driver.findElement(By.cssSelector("a[class='ico-register']"));
		String text =element.getText();
		System.out.println(text);
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("Ben10gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		String text1 =driver.findElement(By.cssSelector("")).getText();
		if(text1.contains("Ben10gmail.com")) {
			System.out.println("Test case pass");
		}
		else
		{
			System.err.println("Test case fail");
		}
		driver.quit();
		}
	}
