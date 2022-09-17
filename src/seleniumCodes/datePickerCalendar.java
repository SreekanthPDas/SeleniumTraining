package seleniumCodes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickerCalendar {

	public datePickerCalendar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Jars\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options); */
		driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in//");
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Delhi']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("COK");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'pushRight font14 lightGreyText latoBold') and (text()='COK')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(@class,'lbl_input latoBold appendBottom10')]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@aria-label,'Sep 15 2022')]")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();

	}

}
