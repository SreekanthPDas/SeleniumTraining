package seleniumCodes;


import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class countofLinks {

	public countofLinks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Jars\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options); */
		driver = new ChromeDriver();
		
		driver.get("https://www.manoramaonline.com/");
		
		System.out.println("Page Loaded...");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		
		
		List<WebElement> WebElements = driver.findElements(By.tagName("a"));
		
		System.out.println("Count :" + WebElements.size());
		int linkCount=1;
		for (WebElement link:WebElements) {
			
			System.out.println("Link :" + linkCount);
			System.out.println("Link Name " + link.getText());
			linkCount++;
		}
		
		driver.navigate().to("https://amazon.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Automation\\ScreenShots\\g.jpeg"));
		
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		System.out.println("Iterator :" + it.next());
		
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getTitle());
		
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/app-header/header/div[1]/div[3]/div[1]/div[1]/button"));
		
		//waittt(driver,ele,Duration.ofMillis(20000));
		System.out.println("Is Search Displayed ? " + ele.isDisplayed());
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		driver.findElement(By.xpath("//input[contains(@class,'search-input')]")).sendKeys("Test Search");
		
		driver.findElement(By.xpath("//input[contains(@class,'search-input')]")).sendKeys(Keys.ENTER);
		
		
		System.out.println("Wait over...");
		Actions act = new Actions(driver);
		
		
		
		//act.moveToElement(driver.findElement(By.xpath("//button[contains(@class,'user') and contains(@type,'button')]"))).build().perform();
		
		//driver.findElement(By.xpath("//button[contains(@class,'user') and contains(@type,'button')]")).click();
		
		System.out.println("Button CLicked...!!!");
		
		
		driver.close();		//driver.quit();
		
		//waitTime(driver,driver.findElement(By.tagName("a")),20);
		
		driver.get("//C:/Automation/Browse.html");
		
		driver.findElement(By.id("fileToUpload")).sendKeys("C:\\Automation\\ScreenShots\\g.jpeg");
		
		

	}

	
	public static void waitTime(WebDriver driver,WebElement locator, int i) {
		new WebDriverWait(driver,i).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}
	
	public static void waittt(WebDriver driver, WebElement element, Duration i) {
		WebDriverWait wt = new WebDriverWait(driver,i);
		wt.until(ExpectedConditions.visibilityOf(element));
		wt.until(ExpectedConditions.elementToBeClickable(element));
		
	}
}
