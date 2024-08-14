package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DDT {

	public static void main(String[] args) throws IOException {
		//step1:create FileInputStream object
		FileInputStream fis=new FileInputStream("./Test Data/common data.properties");
		
		//step:2 create respective file type object
		Properties prop=new Properties();
		
		//step:3 call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		System.out.println(url);
		System.out.println(email);
		

	}

}
