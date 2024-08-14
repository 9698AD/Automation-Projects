package AssignmentOnPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\PARTHA\\eclipse-workspace\\Selenium\\Resumes\\Question paper.pdf");
		
		

	}

}
