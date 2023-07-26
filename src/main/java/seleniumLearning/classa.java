package seleniumLearning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class classa {
public static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
		
		driver.get("https://demo.nopcommerce.com/");
		WebElement computer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		 Actions ac=new Actions(driver);
		 
		 ac.moveToElement(computer).build().perform();
		 
		 Robot ro=new Robot();
		 ro.keyPress(KeyEvent.VK_DOWN);
		 
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")).click()
;		 
		 ro.keyPress(KeyEvent.VK_ENTER);
		 ro.keyRelease(KeyEvent.VK_ENTER);
		
		 

	}
	

}
