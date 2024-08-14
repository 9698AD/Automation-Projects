package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentonSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		WebElement allYear = driver.findElement(By.id("year"));
		Select year=new Select(allYear);
		List<WebElement> allOptions = year.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}

	}

}
