package Seleniumpractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class gettitle
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		if
		(title.equalsIgnoreCase("instagram")){
			System.out.println("test case pass ");
		}
		else
		{
			System.out.println("test case fail ");
		}
	}
}
