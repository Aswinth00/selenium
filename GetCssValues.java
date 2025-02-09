package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCssValues {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String result= driver.findElement(By.cssSelector("a[class='ico-register']")).getCssValue("color");
		System.out.println(result);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rgbacolorpicker.com/rgba-to-hex");
		WebElement element1 =driver.findElement(By.cssSelector("input[id='color-r']"));
		element1.clear();
		element1.sendKeys("175");
		Thread.sleep(2000);
		WebElement element2 =driver.findElement(By.cssSelector("input[id='color-g']"));
		element2.clear();
		element2.sendKeys("3");
		Thread.sleep(2000);
		WebElement element3 =driver.findElement(By.cssSelector("input[id='color-b']"));
		element3.clear();
		element3.sendKeys("4");
		Thread.sleep(2000);
		WebElement element4 =driver.findElement(By.cssSelector("input[id='color-a']"));
		element4.clear();
		element4.sendKeys("1");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='cursor-pointer select-all text-xl tracking-wider']")).getText());
		Thread.sleep(2000);
		driver.quit();
	}
}
