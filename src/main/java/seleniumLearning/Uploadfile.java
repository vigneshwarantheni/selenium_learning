package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfile {

	
		// TODO Auto-generated method stub
		public static void main(String[] args)  {

			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(op);
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/upload/");
			WebElement uploadelement=driver.findElement(By.id("uploadfile_0"));
			uploadelement.sendKeys("C:\\Users\\USER\\Desktop\\vicky.txt");
			driver.findElement(By.id("terms")).click();
			driver.findElement(By.name("send")).click();
			
			driver.navigate().to("https://demoqa.com/upload-download");
			
						
	}
}


