package selectListBox;

import java.time.Duration;
//import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		WebElement ListBox = driver.findElement(By.id("cars"));
		Select PriceList=new Select(ListBox);
		
		List<WebElement> alloptions = PriceList.getOptions();
		System.out.println(alloptions.size());
		
		for(WebElement option:alloptions) {
			System.out.println(option.getText());
		}
		

	}

}
