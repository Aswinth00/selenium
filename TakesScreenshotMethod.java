package Seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshotMethod {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\aswin\\eclipse-workspace\\Selenium\\ErrorShot\\image.png");
		Files.copy(source, destination);
		driver.quit();
		
	}

}
