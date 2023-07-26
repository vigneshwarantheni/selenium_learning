package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Handle_ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		ele.sendKeys("vijay");
		ele.sendKeys(Keys.ENTER);
		
		/*Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);*/
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,120)");
		
			
		
		


	}

}
