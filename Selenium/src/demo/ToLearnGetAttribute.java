package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		String attrvalue = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).getAttribute("value");
		
		System.out.println(attrvalue);

	}

}
