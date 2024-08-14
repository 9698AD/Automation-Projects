package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersiFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		 WebElement element = driver.findElement(By.id("//iframe[@class=\"w-full h-96\"]"));
		 driver.switchTo().frame(element);
		 driver.findElement(By.id("email")).sendKeys("wefw@gmail.com");
		 driver.switchTo().defaultContent();
		 
		 

	}

}
