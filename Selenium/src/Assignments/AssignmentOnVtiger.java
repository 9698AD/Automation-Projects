package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentOnVtiger {

	public static void main(String[] args) throws InterruptedException, IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		Iterator<String> it = allWindowIds.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		driver.findElement(By.id("loginspan")).click();
		driver.findElement(By.name("username")).sendKeys("PARTHASARATHI@GMAIL.COM");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		 String CaptureText = driver.findElement(By.id("com-form-login-error")).getText();
		 String TextColor = driver.findElement(By.id("com-form-login-error")).getCssValue("color");
		 
		 System.out.println(CaptureText);
		 if(CaptureText.contains("Invalid credentials")) {
				System.out.println("errormsg is displayed");
			}
			else {
				System.out.println("errormsg is not displayed");
			}
		 System.out.println(TextColor);
		 
		 TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/ChildPage" +time+".png");
			FileHandler.copy(temp, dest);
			Thread.sleep(2000);
			
			driver.switchTo().window(parentId);
			Thread.sleep(2000);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();
			Thread.sleep(2000);
			
			TakesScreenshot TS=(TakesScreenshot) driver;
			File temps = TS.getScreenshotAs(OutputType.FILE);
			File dests = new File("./screenshot/ParentPage" +time+".png");
			FileHandler.copy(temps, dests);
			Thread.sleep(2000);
			driver.quit();
			
			
		

	}

}
