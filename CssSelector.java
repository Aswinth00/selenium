package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element =driver.findElement(By.cssSelector("a[class='ico-register']"));
		element.click();
		Thread.sleep(2000);
		WebElement Gender =driver.findElement(By.cssSelector("input[type='radio']"));
		Gender.click();
		Thread.sleep(2000);
		WebElement Firstname =driver.findElement(By.cssSelector("input[class='text-box single-line']"));
		Firstname.sendKeys("Aswinth");
		Thread.sleep(2000);
		WebElement Lastname =driver.findElement(By.cssSelector("input[data-val-required='Last name is required.']"));
		Lastname.sendKeys("R");
		Thread.sleep(2000);
		WebElement Mailid =driver.findElement(By.cssSelector("input[id='Email']"));
		Mailid.sendKeys("ben10@gmail.com");
		Thread.sleep(2000);
		WebElement Password =driver.findElement(By.cssSelector("input[type='password']"));
		Password.sendKeys("123456");
		Thread.sleep(2000);
		WebElement Confirmpassword =driver.findElement(By.cssSelector("input[name='ConfirmPassword']"));
		Confirmpassword.sendKeys("123456");
		Thread.sleep(2000);
		WebElement Register =driver.findElement(By.cssSelector("input[value='Register']"));
		Register.click();
		Thread.sleep(2500);
		driver.quit();
	}
}
