package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		String month="August";
		String date="25";
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	 WebDriver driver = new ChromeDriver(op);
	 
	 driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	 driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	 
	 
	 while(true) {
		 
	
	String text=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	 
		if(text.equals(month)) {
			break;
			
		}
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}

	}
	 
	 driver.findElement(By.xpath("//a[normalize-space()="+date+"]")).click();
	}
}
