package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element =driver.findElement(By.linkText("Register"));
		element.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if
		(title.contains("Register")) {
			System.out.println("test case pass"+"-----"+("REGISTER"));
		}
		else
		{
			System.out.println("test case fail");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Log in")).click();
		String titl = driver.getTitle();
		if
		(titl.contains("Login")) {
			System.out.println("test case pass"+"-----"+("LOGIN"));
		}
		else
		{
			System.out.println("test case fail");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Shopping cart")).click();
		String tit = driver.getTitle();
		if
		(tit.contains("Cart")) {
			System.out.println("test case pass"+"-----"+("CART"));
		}
		else
		{
			System.out.println("test case fail");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Wishlist")).click();
		String ti = driver.getTitle();
		if
		(ti.contains("Wishlist")) {
			System.out.println("test case pass"+"------"+("WHISLIST"));
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.quit();
	}
}
		
			
	


