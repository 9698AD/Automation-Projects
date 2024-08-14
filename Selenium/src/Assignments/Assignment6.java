package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement radiobtn = driver.findElement(By.id("pollanswers-3"));
		System.out.println(radiobtn.isDisplayed());
		radiobtn.click();
		System.out.println("====After clicking====");
		System.out.println(radiobtn.isSelected());
		
		
		

	}

}
