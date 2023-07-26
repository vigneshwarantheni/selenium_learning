package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/usidix/1");
		
		driver .findElement(By.xpath("/html/body/input")).click();
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
