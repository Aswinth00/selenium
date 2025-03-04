package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		WebElement Mobile =driver.findElement(By.xpath("(//div[@class='draggable'])[1]"));
		WebElement Accesories =driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));

		a.clickAndHold(Mobile).release(Accesories).perform();
	//	a.dragAndDrop(Mobile, Accesories).perform();
		driver.quit();
	}
}
