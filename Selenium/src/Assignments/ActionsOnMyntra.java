package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ActionsOnMyntra {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		WebElement men = driver.findElement(By.xpath("//body/div[@id='desktop-headerMount']/div/div/header[@id='desktop-header-cnt']/div[@class='desktop-bound']/nav[@class='desktop-navbar']/div[@class='desktop-navLinks']/div[1]/div[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/myntra" +time+".png");
		FileHandler.copy(temp, dest);
		

	}

}
