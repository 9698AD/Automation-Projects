package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String source=driver.getPageSource();
		System.out.println(source);

	}

}
