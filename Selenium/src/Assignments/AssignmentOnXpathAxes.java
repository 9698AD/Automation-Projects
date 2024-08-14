package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnXpathAxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(3000);
		String collection = driver.findElement(By.xpath("//th[text()='Levis Shirt']/following-sibling::td[3]")).getText();
		System.out.println(collection);

	}

}
