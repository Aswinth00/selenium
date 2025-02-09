package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CssSelectorLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element =driver.findElement(By.cssSelector("a[class='ico-login']"));
		element.click();
		Thread.sleep(1500);
		WebElement Email =driver.findElement(By.cssSelector("input[autofocus='autofocus']"));
		Email.sendKeys("ben10@gmail.com");
		Thread.sleep(1500);
		WebElement Password =driver.findElement(By.cssSelector("input[name='Password']"));
		Password.sendKeys("123456");
		Thread.sleep(1500);
		WebElement Remember =driver.findElement(By.cssSelector("input[type='checkbox']"));
		Remember.click();
		Thread.sleep(1500);
		WebElement Login =driver.findElement(By.cssSelector("input[value='Log in']"));
		Login.click();
		Thread.sleep(1500);
		driver.quit();
	}

}
