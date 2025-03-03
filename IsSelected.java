package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement element =driver.findElement(By.cssSelector("a[class='ico-register']"));
		element.click();
		WebElement male =driver.findElement(By.cssSelector("input[value='M']"));
		male.click();
		WebElement checkedElement =driver.findElement(By.cssSelector("input[id='gender-male']"));
		WebElement uncheckedElement =driver.findElement(By.cssSelector("input[id='gender-female']"));
		boolean status1 = checkedElement.isSelected();
		boolean status2 = uncheckedElement.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		WebElement enabledElement =driver.findElement(By.cssSelector("input[id='gender-male']"));
		boolean disabledElement=enabledElement.isEnabled();
		System.out.println(disabledElement);
		WebElement displayedElement =driver.findElement(By.cssSelector("input[id='gender-male']"));
		boolean NotdisplayedElement=displayedElement.isDisplayed();
		System.out.println(NotdisplayedElement);
		driver.quit();
	}
}
