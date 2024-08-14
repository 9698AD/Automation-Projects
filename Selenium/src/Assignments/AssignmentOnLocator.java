package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnLocator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Parthasarathi");
		driver.findElement(By.name("LastName")).sendKeys("Das");
		driver.findElement(By.name("Email")).sendKeys("parthasarathi.das@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Partha@1234");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Partha@1234");
		driver.findElement(By.name("register-button")).click();
		
		

	}

}
