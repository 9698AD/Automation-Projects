package demo;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Launch {

	public static void main(String[] args) {
//		EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Instagram")) {
			System.out.println("User navigated Successfully");
			
		}
		else {
			System.out.println("User failed to navigate");
		}
		
	}

}
