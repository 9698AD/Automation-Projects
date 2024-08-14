package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnSendKeys {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://myntra.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("shirts",Keys.ENTER);
	}

}
