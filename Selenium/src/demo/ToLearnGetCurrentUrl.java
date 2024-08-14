package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.google.com/")) {
			System.out.println("User navigated successfully");
			
		}
		else {
			System.out.println("User failed to navigate");
		}

	}

}
