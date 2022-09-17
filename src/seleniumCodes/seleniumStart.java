package seleniumCodes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumStart {

	public seleniumStart() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Jars\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options); */
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		/*driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("sreekanthpdas89@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Sree@1234");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		*/
		Robot robot = new Robot();
		// Creates the delay of 5 sec so that you can open notepad before
		// Robot start writting
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Alert dismissed...!!!");
		
		try {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Add-ons"))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Zero Cancellation"))).build().perform();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		action.click().build().perform();
		}catch(Exception e) {
			
			System.out.println("Exception : " + e.getMessage());
		}
		
		System.out.println("Closing Browser");
		
		//driver.quit();
		
		//driver.close();
		

	}

}
