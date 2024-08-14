package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11Assignments {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		WebElement newElement = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(newElement);
		driver.findElement(By.id("regEmail")).sendKeys("1234566");
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.id("hamburger")).click();

	}

}
