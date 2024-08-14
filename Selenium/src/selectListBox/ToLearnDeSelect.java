package selectListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDeSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListBox = driver.findElement(By.id("cars"));
		 Select priceSelect=new Select(priceListBox);
		 priceSelect.selectByIndex(0);
		 priceSelect.selectByIndex(1);
		 priceSelect.selectByIndex(2);
		 
//		WebElement firstSelected = priceSelect.getFirstSelectedOption();
//		 System.out.println(firstSelected);
//		 System.out.println(firstSelected.getText());
		 
		List<WebElement> allSelectedOptions = priceSelect.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		
		for(WebElement option:allSelectedOptions) {
			System.out.println(option.getText());
		}
		
		

	}

}
