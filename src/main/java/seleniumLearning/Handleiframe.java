package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handleiframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("mytext1")).sendKeys("vicky");
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("computer science");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		driver.findElement(By.name("mytext3")).sendKeys("details");
		WebElement innerframe=driver.findElement(By.xpath("/html/body/center/iframe"));
		driver.switchTo().frame(innerframe);
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(3);
		driver.findElement(By.name("mytext4")).sendKeys("testing");
		
		
	}

}
