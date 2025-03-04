package Seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProgram1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		String title = driver.getTitle();
		if(title.contains("Digital downloads")) {
			WebElement element =driver.findElement(By.xpath("//select[@id='products-orderby']"));
			Select s =new Select(element);
		//	s.selectByIndex(2);
			Thread.sleep(1000);
		//	s.selectByIndex(4);
			List<WebElement> option =s.getOptions();
			System.out.println(option.size());
    		for(WebElement e : option) {
				System.out.println(e.getText());
  		}
			WebElement element1 =driver.findElement(By.xpath("//select[@id='products-pagesize']"));
			Select s1 =new Select(element1);
			s1.selectByVisibleText("12");
		}
	}
}

