package classAndObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassAndObject5 {

	public static void main(String[] args) {
		initialization init = new initialization();
		init.chrome();
		init.gecko();
		
		}

}


 

class initialization{
	 public  WebDriver driver;
	 
	public  void chrome() {
			 
				System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe" );
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.get("https://www.facebook.com");
			    driver.quit();
			}
			 
		public  void gecko() {
				System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriver\\geckodriver.exe");
				driver= new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("https://www.facebook.com");
		        driver.quit();
			}
		

							}
		
			
			
		
