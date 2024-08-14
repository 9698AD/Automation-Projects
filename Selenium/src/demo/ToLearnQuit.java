package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
