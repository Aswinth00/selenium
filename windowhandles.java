package Seleniumpractice;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		Set<String> alladdress = driver.getWindowHandles();
		System.out.println(alladdress);
	}
}
