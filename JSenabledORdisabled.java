package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JSenabledORdisabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledElement = driver.findElement(By.xpath("//input[@class='form-control']"));
		boolean before = disabledElement.isEnabled();
		System.out.println(before);
		if(before = false) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].removeAttribute('disabled')",disabledElement);
		}
		boolean after = disabledElement.isEnabled();
		System.out.println(after);
		if(after) {
			disabledElement.sendKeys("selenium");
		}
		else {
			System.out.println("Element is disabled");
		}
		driver.quit();
		}
	}

