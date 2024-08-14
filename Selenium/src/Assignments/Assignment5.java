package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		usernameTF.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='admin']")).sendKeys("PARTHASARATHI");
		Thread.sleep(2000);
		WebElement passwordTF = driver.findElement(By.name("password"));
		passwordTF.clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		String Errormsg = driver.findElement(By.xpath("//span[@id='validationMessage']")).getText();
		System.out.println(Errormsg);
		if(Errormsg.contains("Invalid credentials")) {
			System.out.println("Error message is displayed");
		}
		else {
			System.out.println("Error message is not displayed");
		}

	}

}
