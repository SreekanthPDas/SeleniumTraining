package seleniumCodes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class usePropFile {

	public usePropFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Automation\\Java_Selenium\\Java_Selenium_Learn\\src\\seleniumCodes\\properties");
		
		
		prop.load(fis);
		String name = null ;
		System.out.println("nam "+ prop.getProperty("name"));
	}

}
