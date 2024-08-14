package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDiseasesAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='map-instance-82215']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='g' and @id='montana']")).click();

	}

}
