package Seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSProgram {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement textfield = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='computer'",textfield);
		js.executeScript("arguments[0].click()",searchbutton);
		js.executeScript("document.getElementById('small-searchterms').value='computer'");
		js.executeScript("document.getElementsByClassName('submit').type='submit'");
		driver.quit();
	}
}
