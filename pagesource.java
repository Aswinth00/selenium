package Seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class pagesource 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		driver.close();
	}

}
