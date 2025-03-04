package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement Button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions a = new Actions(driver);
		a.moveToElement(Button).contextClick().perform();
		Thread.sleep(2000);
		WebElement Button1 = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
        a.doubleClick(Button1).perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.quit();
	}

}
