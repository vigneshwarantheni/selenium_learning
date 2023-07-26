package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleAutoCompleteDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.google.com/maps/@9.9178296,78.0527823,12z");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement input=driver.findElement(By.id("searchboxinput"));
		
		input.sendKeys("madurai");
		String text;
		
		do {
			input.sendKeys(Keys.ARROW_DOWN);
			text=input.getAttribute("value");
			if(text.equals("Madurai Meenakshi Amman Temple Road, Dharmathupatti, Tamil Nadu")) {
				
				input.sendKeys(Keys.ENTER);
				break;
				
			}
			
		}
		while(!text.isEmpty());
			
		
			
		
		
		
	}

}
