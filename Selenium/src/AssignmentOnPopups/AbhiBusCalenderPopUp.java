package AssignmentOnPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbhiBusCalenderPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gad_source=1&gclid=CjwKCAjwkJm0BhBxEiwAwT1AXBTL0pxDiltBUZIgoshc1rhHD24E3ZIY7Q1ZsSS05RKs9c4RJJwChBoCH-MQAvD_BwE");
		WebElement datePicker = driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']"));
		Actions act=new Actions(driver);
		act.moveToElement(datePicker).click().perform(); 

	}

}
