package seleniumCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchText {

	public googleSearchText() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Jars\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options); */
		driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in//");
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.name("q")).sendKeys("Testing");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Smart watch");
		
		Thread.sleep(2000);
		
		///ul[contains(@role,'listbox') and contains(@class,'erkvQe')]//li//div[contains(@class,'ClJ9Yb')]
		
		List<WebElement> list = driver.findElements(By.xpath("//li[contains(@role,'presentation')]//descendant::div[contains(@class,'wM6W7d')]"));
		System.out.println("List Size :" + list.size());
		
		//list = driver.findElements(By.xpath("//div[contains(@class,'s-suggestion s-suggestion-ellipsis-direction')]"));
		//System.out.println("List Size 2:" + list.size());
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("tech")) {
				
				list.get(i).click();
				break;
			}
		}
		


	}

}
