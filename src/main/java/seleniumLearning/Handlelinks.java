package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Handlelinks {

	
	public static void main(String[] args) {
		WebDriver driver;
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe" );
		
	// 	 driver=new ChromeDriver();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement link=driver.findElement(By.linkText("Mobiles"));
		link.click();
		
		//linkText


		
		//partiallink text
		
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//caputre all links
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("getlist" +list.size());;
		
		for(int i = 0;i<list.size();i++) {
			
			String a=list.get(i).getText();
			System.out.println(a);
			
		}
		
	}

}
