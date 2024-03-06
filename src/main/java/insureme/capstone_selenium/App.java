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
	                       
		    WebDriverManager.chromedriver().setup();
		    
	        ChromeOptions chromeoptions = new ChromeOptions();
	        chromeoptions.addArguments("--headless");
	        
	        WebDriver driver = new ChromeDriver(chromeoptions);
	        
	        System.out.println(" Execution Started...");
	        
	        driver.get("http://18.118.213.148:8081/contact.html");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputName")).sendKeys("Vajrala");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputNumber")).sendKeys("8889991111");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputMail")).sendKeys("vaj@xyz.com");
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.id("inputMessage")).sendKeys("allow me");
	        
	        Thread.sleep(1000);
	        
	        
	        driver.findElement(By.id("my-button")).click();
	        
	                                  
	       	Thread.sleep(3000);
	        
	        System.out.println("msg Sent");
	        
	        driver.quit();
	    }
}

