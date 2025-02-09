package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element= driver.findElement(By.cssSelector("input[id='small-searchterms']"));
		element.sendKeys("mobiles");
		WebElement SubmitButton= driver.findElement(By.cssSelector("input[type='submit']"));
		SubmitButton.click();
		Thread.sleep(1000);
		WebElement Searchbutton= driver.findElement(By.cssSelector("input[name='Q']"));
		Searchbutton.clear();
		Searchbutton.sendKeys("computer");
		driver.quit();
		
	}
}
