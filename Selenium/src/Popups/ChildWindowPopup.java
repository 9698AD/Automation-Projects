package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/15");
		//String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver,"amazon");
		driver.close();
		switchToWindow(driver,"shoppersstack");
		driver.close();
	}
		
		public static void switchToWindow(WebDriver driver,String expUrl) {
			Set<String> allWindowids = driver.getWindowHandles();
			for(String id:allWindowids) {
				String url = driver.switchTo().window(id).getCurrentUrl();
				if(url.contains("amazon")) {
					break;
				}
			}
			
		}
		
		
		
		

	}




