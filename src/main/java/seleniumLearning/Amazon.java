package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver dr= new ChromeDriver(op);
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		
		dr.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		
		WebElement mobile = dr.findElement(By.xpath("//div[normalize-space()='Mobiles, Computers']"));
		mobile.click();
		
		dr.findElement(By.xpath("//a[normalize-space()='All Mobile Phones']")).click();
		
		dr.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[10]/ul/li/span/a/div/label/i")).click();
		
		
		
		
	}

}
