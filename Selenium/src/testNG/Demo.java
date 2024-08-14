package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void sample() {
		Reporter.log("Welcome to Advance Selenium",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("demo testcase is executed",true);
		driver.get("https://demowebshop.tricentis.com/");
	}
	

}
