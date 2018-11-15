package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idanwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://uk.yahoo.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("username")).sendKeys("Oladipol@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		
		
	}
	
	
	
	

}
