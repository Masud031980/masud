package elenium.automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogingTest {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]")).click();
	
	}
	
	
}
