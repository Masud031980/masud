package elenium.automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	
	static WebDriver drive;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		drive=new ChromeDriver();
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		drive.findElement(By.id("email")).sendKeys("6462035734");
		drive.findElement(By.id("pass")).sendKeys("199598");
		drive.findElement(By.id("u_0_b")).click();
		
		System.out.println(drive.getTitle());
		//driver.close();
		
	}
	
}