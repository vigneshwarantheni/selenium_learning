package seleniumLearning;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Newtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vigneshwaransonaimuthu@gmail.com");
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("Vicky#95");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
	}

}
