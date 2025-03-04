package Seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotParticularWebElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element =driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File source =element.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\aswin\\eclipse-workspace\\Selenium\\ErrorShot\\image.png");
		Files.copy(source, destination);
		driver.quit();
	}

}
