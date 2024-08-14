package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Point position=driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(50, 50));
		Dimension size=driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.manage().window().setSize(new Dimension(750,750));
		String title = driver.getTitle();
		System.out.println(title);

		

	}

}
