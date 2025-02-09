package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetSizefb {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension UsernameSize = driver.findElement(By.cssSelector("input[id='email']")).getSize();
		int Usernameheight = UsernameSize.getHeight();
		int Usernamewidth = UsernameSize.getWidth();
		System.out.println("HEIGHT :"+Usernameheight);
		System.out.println("WIDTH :"+Usernamewidth);
		Dimension PasswordSize = driver.findElement(By.cssSelector("div[id='passContainer']")).getSize();
		int Passwordheight = PasswordSize.getHeight();
		int Passwordwidth = PasswordSize.getWidth();
		System.out.println("HEIGHT :"+Passwordheight);
		System.out.println("WIDTH :"+Passwordwidth);
		if(Usernameheight==Passwordheight) {
			System.out.println("Testcase pass");}
		else {
			System.out.println("Testcase Fail");
		}
		if(Usernamewidth==Passwordwidth) {
			System.out.println("Testcase pass");}
		else {
			System.out.println("Testcase Fail");
		}
		driver.quit();
	}
}



