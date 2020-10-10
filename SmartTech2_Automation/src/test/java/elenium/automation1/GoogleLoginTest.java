package elenium.automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.id("identifierId")).sendKeys("masudrana031980@gmail.com");
		//.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		//driver.findElement(By)
	}
	
	
	
	
	
	
}
