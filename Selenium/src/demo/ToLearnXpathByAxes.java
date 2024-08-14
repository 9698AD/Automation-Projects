package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1:5500/table.html");
		String collection = driver.findElement(By.xpath("//td[contains(text(),'Salaar')]/following-sibling::td[1]")).getText();

		System.out.println(collection);
	}

}
