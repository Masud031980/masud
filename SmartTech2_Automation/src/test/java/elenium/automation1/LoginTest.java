package elenium.automation1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	
	//What is a Webdriver
	//Ans:It is a interface.
	
	//1. we need selenium dependencies
	//2. browser extensions
	//3. WebDriver variable
	
	static WebDriver drive;
	//if you want to yoursalf System.setproperty
	//public static void main(String[] args) {
		
		//System. setProperty("webdriver.chrome.driver", "C:\\Users\\masud\\eclipse-workspace\\SmartTech2_Automation\\Driver\\chromedriver.exe"); // Initialize browser. 
	//WebDriver driver=new ChromeDriver(); 
		
		//driver.get("https://login.yahoo.com/");
	
	public static void main(String[] args) {
		
	
		
		// Set the driver path System. setProperty("webdriver. edge. driver", "C:\Users\Public\Desktop"); // Start Edge Session WebDriver driver = new EdgeDriver();
		//WebDriver driver=new EdgeDriver();
		//driver.get("https://www.yahoo.com");
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.zoopla.co.uk/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
	driver.findElement(By.xpath("(//*[@class=\"css-fa8dvy e11d441i1\"])[4]")).click();
	
	driver.findElement(By.id("signin_email")).sendKeys("masudrana031980@gmail.com");
	driver.findElement(By.id("signin_password")).sendKeys("19959798");
	driver.findElement(By.id("signin_submit")).click();
	
	System.out.println(driver.getTitle());
	
	

	//driver.quit();
		
	}
	
		
	}


