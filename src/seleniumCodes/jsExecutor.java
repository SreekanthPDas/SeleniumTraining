package seleniumCodes;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jsExecutor {

	public jsExecutor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Jars\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, options); */
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart"+ ".com/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		System.out.println("Implicit Wait Starts " );
		sysTime();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("After Implicit Wait" );
		sysTime();
		try {
		WebElement webE = new WebDriverWait(driver,Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.name("ss")));
		}catch(Exception e) {
			System.out.println("Explicit Done " );
			sysTime();
			System.out.println("Exception : "+ e.getMessage());
		}
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.name("q"));
		System.out.println("Calling method...");
		
		genAlert(driver,"Alert Test check method");
		Thread.sleep(1000);
		
		driver.switchTo().alert();
		
		Alert al = driver.switchTo().alert();
		
		System.out.println("Alert :" + al.getText());
		System.out.println("Accepting alret");
		al.accept();
		clickJS(driver,driver.findElement(By.xpath("//a[contains(@class,'_1_3w1N')]")));
		
		//drawBoarder(ele,driver);
	}

	public static void drawBoarder(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("argument[0].style.boarder='3px solid red'", element);
		
			
	}
	
	public static void genAlert(WebDriver driver, String message) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("alert('" + message + "')");
	}
	public static void clickJS(WebDriver driver, WebElement ele) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		//js.executeScript("arguments[0].click();",ele);
		
		System.out.println("title :" + js.executeScript("return document.title;").toString());
		
		System.out.println("Page COntent :" + js.executeScript("return document.documentElement.innerText;").toString());
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void sysTime() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	}
}
