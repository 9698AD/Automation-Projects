package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoWebShop {
	
@Test
public void AssignmentonDemoWebshop() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ElectronicsLink = driver.findElement(By.partialLinkText("ELECTRONICS"));
	Actions act=new Actions(driver);
	act.moveToElement(ElectronicsLink).perform();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Cell phones")).click();
}

}
