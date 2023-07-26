package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementvsFindElements {

	public static void main(String[] args) {
		
		
		WebDriverManager .chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		List<WebElement> element=driver.findElements(By.xpath("//*[@id=\"demo-page\"]/body/div[7]/footer/div[1]/div//a"));
		
		for(WebElement link:element) {
		System.out.println(link.getText());
		}
		
		driver.close();

	}

}
