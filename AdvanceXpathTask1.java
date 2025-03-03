package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathTask1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[5]")).click();
		driver.findElement(By.xpath("//div[@class='product-grid']/child::div[2]/child::div[1]/child::div[2]/child::div/child::div[2]/child::input")).click();
		
	}

}
