package insureme.capstone_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By.ByCssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws InterruptedException
	    {
	                
	        //System.setProperty("webdriver.chrome.driver", "C:\\Prathap\\Azure\\Bootcamp-TCS\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        
		    WebDriverManager.chromedriver().setup();
		    
	        ChromeOptions chromeoptions = new ChromeOptions();
	        chromeoptions.addArguments("--headless");
	        
	        WebDriver driver = new ChromeDriver(chromeoptions);
	        
	        System.out.println("Script Execution Started...");
	        
	        driver.get("http://3.94.123.218:8085/contact.html");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        
	        //driver.findElement(By.className("nav-click")).click();
	        
	        //driver.findElement(By.cssSelector("a[id^='nav-click']")).click();
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputName")).sendKeys("Prathap G");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputNumber")).sendKeys("8889991111");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputMail")).sendKeys("admin@xyz.com");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputMessage")).sendKeys("I am interested");
	        
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.id("my-button")).click();
	        
	        //driver.findElement(By.className("btn-box")).click();
	                          
	       	Thread.sleep(3000);
	        
	        System.out.println("Sent - Execution Completed");
	        
	        driver.quit();
	    }
}

