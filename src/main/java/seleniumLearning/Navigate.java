package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().back();
		System.out.println(driver.getTitle()); ;
		driver.navigate().forward();
		 System.out.println(driver.getTitle()); ;
		driver.navigate().refresh();
		
	}

}
