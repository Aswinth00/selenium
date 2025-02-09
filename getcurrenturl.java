package Seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getcurrenturl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		if
		(url.equals("https://www.instagram.com/")){
			System.out.println("test case pass ");
		}
		else
		{
			System.out.println("test case fail ");
		}
	}
}


