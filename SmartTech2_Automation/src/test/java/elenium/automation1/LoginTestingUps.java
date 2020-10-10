package elenium.automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestingUps {
	
  static WebDriver drive;

public static void main(String[] args) {
   System. setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // Initialize browser. 
	  WebDriver driver=new ChromeDriver(); 
	  driver.get("https://www.ups.com/us/en/Home.page");
	  //maximize window
	  
	  driver.manage().window().maximize();
	  //click on sing up/ log in button
	  driver.findElement(By.xpath("//a[text()='Sign up / Log in']")).click();
	  driver.manage().deleteAllCookies();
	  driver.findElement(By.xpath("//a[@class='ups-link']")).click();
	  driver.findElement(By.id("email")).sendKeys("masudrana031980@gmail.com");
	  driver.findElement(By.id("pwd")).sendKeys("m19959798$");
	  driver.findElement(By.id("submitBtn")).click();
	  System.out.println(driver.getTitle());
	  
	
}
	
	
}
