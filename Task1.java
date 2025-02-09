package seleniumassignment;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String i =driver.getCurrentUrl();
		System.out.println(i);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		String f =driver.getCurrentUrl();
		System.out.println(f);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.meesho.com/");
		String m =driver.getCurrentUrl();
		System.out.println(m);
		Set<String> alladdress = driver.getWindowHandles();
		System.out.println(alladdress);
		for(String s1 :alladdress) {
			//system.out.println(s);
			driver.switchTo().window(s1);
			if(driver.getCurrentUrl().contains(m)) {
				System.out.println(driver.getCurrentUrl()+"---"+driver.getTitle());
			//	driver.close();
			}
			else if(driver.getCurrentUrl().contains(i)){
				System.out.println(driver.getTitle());
			//	driver.close();	
			}
			else {
				System.out.println(driver.getCurrentUrl());
			//	driver.close();
			}
		}
		driver.quit();
	}

}

