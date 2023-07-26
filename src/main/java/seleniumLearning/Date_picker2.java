package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Date_picker2 {

	public static void main(String[] args) throws InterruptedException {
	
		String month="June 2023";
		String date="25";
		 
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	 WebDriver driver = new ChromeDriver(op);
	 
	 driver.get("https://www.abhibus.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	 
	 while(true) {
		 
	
	 String txt = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
   System.out.println(txt);
   
   if(txt.equals(month)) {
	   break;
	   
   }else {
	   driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
   }
   
	}
	 List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody"));
	 
	 for(WebElement ele:findElements) {
		 
		 String text = ele.getText();
		 
		 
		 if(text.equals(date)) {
			 ele.click();
			 break;}
	 }
	 
	}
}
