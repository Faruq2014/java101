package classAndObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public static void main(String[] args) {
		
		Webdriver gecko = new Webdriver();
		gecko.firefox();
		
	}

}

class Webdriver {
	 WebDriver	 driver;
	public void firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
	  	driver = new FirefoxDriver();                                         //opening browser
		driver.get("https://www.facebook.com"); 
	}
}