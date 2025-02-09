package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetLocationfb {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point usernameaxis = driver.findElement(By.cssSelector("input[name='username']")).getLocation();
		int xaxis = usernameaxis .getX();
		int yaxis =usernameaxis .getY();
		System.out.println("XAXIS :"+xaxis);
		System.out.println("YAXIS :"+yaxis);
		Point passwordaxis = driver.findElement(By.cssSelector("input[type='password']")).getLocation();
		int axisx = passwordaxis .getX();
		int axisy =passwordaxis .getY();
		System.out.println("XAXIS :"+axisx);
		System.out.println("YAXIS :"+axisy);
		if(xaxis==axisx) {
			System.out.println("Testcase pass");}
		else {
			System.out.println("Testcase Fail");
		}
		if(yaxis==axisy) {
			System.out.println("Testcase pass");}
		else {
			System.out.println("Testcase Fail");
		}
		driver.quit();
	}

}

