package Seleniumpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		Dimension UsernameSize = driver.findElement(By.cssSelector("input[type='text']")).getSize();
		int Usernameheight = UsernameSize.getHeight();
		int Usernamewidth = UsernameSize.getWidth();
		System.out.println("HEIGHT :"+Usernameheight);
		System.out.println("WIDTH :"+Usernamewidth);
		Dimension PasswordSize = driver.findElement(By.cssSelector("input[type='password']")).getSize();
		int Passwordheight = PasswordSize.getHeight();
		int Passwordwidth = PasswordSize.getWidth();
		System.out.println("HEIGHT :"+Passwordheight);
		System.out.println("WIDTH :"+Passwordwidth);
		Thread.sleep(1500);
		Point usernameaxis = driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d _ap35']")).getLocation();
		int xaxis = usernameaxis.getX();
		int yaxis =usernameaxis.getY();
		System.out.println("XAXIS :"+xaxis);
		System.out.println("YAXIS :"+yaxis);
		Point passwordaxis = driver.findElement(By.cssSelector("input[aria-label='Password']")).getLocation();
		int axisx = passwordaxis.getX();
		int axisy =passwordaxis.getY();
		System.out.println("XAXIS :"+axisx);
		System.out.println("YAXIS :"+axisy);
		Thread.sleep(2500);
		driver.quit();
	}
}
