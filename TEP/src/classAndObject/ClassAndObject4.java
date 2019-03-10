package classAndObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassAndObject4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();          //opening browser
        driver.get("https://www.facebook.com/");        // opening facebook
        System.out.println(driver.getTitle());
        String s=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2")).getText();
    	System.out.println(s);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);   //wait for upload
        

	}

}
