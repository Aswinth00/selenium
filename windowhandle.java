package Seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowhandle
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String address = driver.getWindowHandle();
		System.out.println(address);
		driver.close();
	}
}
