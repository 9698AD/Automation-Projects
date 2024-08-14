package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(3000);
		
		String month="December";
		int year=2024;
		int date=10;
		
//		while(true) {
//			try {
//				driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='20']")).click();
//				break;
//
//			} catch (Exception e) {
//				driver.findElement(By.xpath("span[@aria-label='Next Month']")).click();
//			}
//		}
		
		while(true) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;

			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		
		
	}

}
