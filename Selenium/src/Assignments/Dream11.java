package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		driver.findElement(By.id("regEmail")).sendKeys("1234567899");
		driver.findElement(By.id("regUser")).click();
		String text = driver.findElement(By.id("errorMob")).getText();
		System.out.println(text);

	}

}
