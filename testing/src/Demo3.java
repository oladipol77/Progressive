package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.ie.driver","C:\\Users\\Progressive Tech\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		
		
		
	}

}
