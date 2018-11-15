package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Progressive Tech\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		

	}

}
