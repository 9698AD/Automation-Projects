package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Thread.sleep(2000);
//		WebElement bottomWear = driver.findElement(By.xpath("//div[@class='_16rZTH']//a[1]"));
//		Thread.sleep(2000);
//		WebElement trousers = driver.findElement(By.xpath("//div[@class='_31z7R_']//a[1]"));
//		Thread.sleep(2000);		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		//act.moveToElement(fashion).moveToElement(bottomWear).moveToElement(trousers).click().perform();
		act.moveToElement(fashion).click().perform();

	}

}
