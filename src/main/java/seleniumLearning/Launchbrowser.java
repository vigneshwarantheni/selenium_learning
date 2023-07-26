package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );
		//WebDriver driver=new ChromeDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	/*System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		
		//webdrivermanager-chromedriver
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");*/
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driverr=new FirefoxDriver();
		driverr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("page tittle" +driverr.getTitle());
		System.out.println("page URL"+ driverr.getCurrentUrl());
		System.out.println("page source" +driverr.getPageSource());
		
	
	}
	

}
