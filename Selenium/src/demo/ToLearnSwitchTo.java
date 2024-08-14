package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/8");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds=driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			String url=driver.switchTo().window(id).getCurrentUrl();
			System.out.println(url);
		}

	}

}
